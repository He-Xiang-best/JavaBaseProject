package sqlContact;

import classType.userType.Admin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
 * @author:何翔
 * @date:2020/11/20 2:09
 * @description: 管理员登入实现
 /*
 */

public class AdminContact extends BaseContact {

public Admin login(Admin admin){
    /*
     * @author: 何翔
     * @param: [admin]
     * @return: achieveModule.userType.Admin
     * @date: 2020/11/20 8:56
     * @description：查询传入密码信息，姓名
     */
    String sql = "select * from s_admin where name=? and password=?";
    Admin adminRst = null;
    try {
        PreparedStatement preparedStatement = con.prepareStatement(sql);//把sql语句传给数据库操作对象
        preparedStatement.setString(1, admin.getName());
        preparedStatement.setString(2, admin.getPassword());
        ResultSet executeQuery = preparedStatement.executeQuery();
        if(executeQuery.next()){
            adminRst = new Admin();
            adminRst.setId(executeQuery.getString("id"));
            adminRst.setName(executeQuery.getString("name"));
            adminRst.setPassword(executeQuery.getString("password"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return adminRst;
}
    public String editPassword(Admin admin,String newPassword){
    /*
     * @author: 何翔
     * @param: [admin, newPassword]
     * @return: java.lang.String
     * @date: 2020/11/20 9:22
     * @description：修改密码
     */
        String sql = "select * from s_admin where id=? and password=?";
        PreparedStatement preparedStatement;
        String id = null;
        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, admin.getId());
            preparedStatement.setString(2, admin.getPassword());
            ResultSet executeQuery = preparedStatement.executeQuery();
            if(!executeQuery.next()){
                return "旧密码错误!";
            }
             id = executeQuery.getString("id");
        } catch (SQLException e1) {
            e1.printStackTrace();
        }//把sql语句传给数据库操作对象
        String retString = "修改失败!";
        String sqlString = "update s_admin set password = ? where id = ?";
        try {
            preparedStatement = con.prepareStatement(sqlString);
            preparedStatement.setString(1, newPassword);
            preparedStatement.setString(2, id);
            int rst = preparedStatement.executeUpdate();
            if(rst > 0){
                retString = "密码修改成功！";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }//把sql语句传给数据库操作对象
        return retString;
    }
}
