package sqlContact;

import classType.infoType.Course;
import util.StringUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/*
 * @author:何翔
 * @date:2020/11/20 9:27
 * @description:课程类信息，与数据库打交道
 /*
 
 */

public class CourseContact extends BaseContact {
    public boolean addCourse(Course course){
        /*
         * @author: 何翔
         * @param: [course]
         * @return: boolean
         * @date: 2020/11/20 9:27
         * @description：课程类信息添加
         */
        String sql = "insert into s_course_new values(?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, course.getCourse_id());
            preparedStatement.setString(2, course.getCourse_name());
            if(preparedStatement.executeUpdate() > 0) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean isExistCourse(String courseName){
        /*
         * @author: 何翔
         * @param: [courseName]
         * @return: boolean
         * @date: 2020/11/20 9:27
         * @description：判断是否存在此课程
         */
        String sql = "select * from s_course_new where course_name=?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, courseName);
            ResultSet executeQuery = preparedStatement.executeQuery();
            if (executeQuery.next()){
                return true;
            }
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return false;
    }
    public List<Course> getCourseList(Course course){
        /*
         * @author: 何翔
         * @param: [course]
         * @return: java.util.List<achieveModule.infoType.Course>
         * @date: 2020/11/20 9:27
         * @description：获取课程信息列表
         */
        List<Course> retList = new ArrayList<>();
        String sqlString = "select * from s_course_new";
        if(StringUtil.isEmpty(course.getCourse_name())&&course.getCourse_id()==-1){

        }
        else
            sqlString += " where course_name like '%"+course.getCourse_name()+"%'";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sqlString);
            ResultSet executeQuery = preparedStatement.executeQuery();
            while(executeQuery.next()){
                Course co = new Course();
                co.setCourse_id(executeQuery.getInt("course_id"));
                co.setCourse_name(executeQuery.getString("course_name"));
                retList.add(co);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retList;
    }

    public boolean update(Course co, int courseID){
        /*
         * @author: 何翔
         * @param: [co, courseID]
         * @return: boolean
         * @date: 2020/11/20 9:28
         * @description：更新课程信息
         */
        String sql = "update s_course_new set course_name=? where course_id=?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, co.getCourse_name());
            preparedStatement.setInt(2 ,courseID);
            if(preparedStatement.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean delete(int id){
        /*
         * @author: 何翔
         * @param: [id]
         * @return: boolean
         * @date: 2020/11/20 9:28
         * @description：删除课程信息
         */
        String sql = "delete from s_course_new where course_id=?";
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

}
