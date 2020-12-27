package sqlContact;

import classType.infoType.ClassInfo;
import util.StringUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/*
 * @author:何翔
 * @date:2020/11/20 9:23
 * @description:班级类信息，与数据库打交道
 /*
 
 */

public class ClassContact extends BaseContact {

    public boolean addClass(ClassInfo scl){
        /*
         * @author: 何翔
         * @param: [scl]
         * @return: boolean
         * @date: 2020/11/20 9:24
         * @description：添加班级
         */
        String sql = "insert into s_class values(?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, scl.getId());
            preparedStatement.setString(2, scl.getName());
            preparedStatement.setString(3, scl.getInfo());
            if(preparedStatement.executeUpdate() > 0) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean isExistClass(int classId){
        /*
         * @author: 何翔
         * @param: [classId]
         * @return: boolean
         * @date: 2020/11/20 9:25
         * @description：判断班级是否存在
         */
        String sql = "select * from s_class where id=?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, classId);
            ResultSet executeQuery = preparedStatement.executeQuery();
            if (executeQuery.next()){
                return true;
            }
        } catch (SQLException e) {
        }
        return false;
    }

    public List<ClassInfo> getClassList(ClassInfo studentClass){
        /*
         * @author: 何翔
         * @param: [studentClass]
         * @return: java.util.List<achieveModule.infoType.ClassInfo>
         * @date: 2020/11/20 9:25
         * @description：获取班级信息列表
         */
        List<ClassInfo> retList = new ArrayList<>();
        String sqlString = "select * from s_class";
        if(StringUtil.isEmpty(studentClass.getName())&&studentClass.getId()==-1){

        }
        else if(!StringUtil.isEmpty(studentClass.getName())){
            sqlString += " where name like '%"+studentClass.getName()+"%'";
        }
        else {
            sqlString += " where id like '%"+studentClass.getId()+"%'";
        }
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sqlString);
            ResultSet executeQuery = preparedStatement.executeQuery();
            while(executeQuery.next()){
                ClassInfo sc = new ClassInfo();
                sc.setId(executeQuery.getInt("id"));
                sc.setName(executeQuery.getString("name"));
                sc.setInfo(executeQuery.getString("info"));
                retList.add(sc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retList;
    }
    public boolean delete(int id){
        /*
         * @author: 何翔
         * @param: [id]
         * @return: boolean
         * @date: 2020/11/20 9:25
         * @description：删除班级信息
         */
        String sql = "delete from s_class where id=?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            if(preparedStatement.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean updatedID(ClassInfo sc, int editID){
        /*
         * @author: 何翔
         * @param: [sc, editID]
         * @return: boolean
         * @date: 2020/11/20 9:25
         * @description：更新班级信息
         */
        String sql2 = "update s_class set id=? where name=? and info=?";
        try {
            PreparedStatement preparedStatement2 = con.prepareStatement(sql2);
            preparedStatement2.setInt(1, editID);
            preparedStatement2.setString(2, sc.getName());
            preparedStatement2.setString(3, sc.getInfo());
            if(preparedStatement2.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    public boolean update(ClassInfo sc,int editID){
        /*
         * @author: 何翔
         * @param: [sc, editID]
         * @return: boolean
         * @date: 2020/11/20 9:26
         * @description：更新班级信息
         */
        String sql = "update s_class set name=?, info=? where id=?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, sc.getName());
            preparedStatement.setString(2, sc.getInfo());
            preparedStatement.setInt(3, sc.getId());
            if(preparedStatement.executeUpdate() > 0){
                if (editID!=sc.getId()){
                    return updatedID(sc, editID);
                }
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
