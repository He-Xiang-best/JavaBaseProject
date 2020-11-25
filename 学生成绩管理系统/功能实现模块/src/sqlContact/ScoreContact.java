package sqlContact;

import classType.infoType.ClassScore;
import classType.infoType.Score;
import util.StringUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/*
 * @author:何翔
 * @date:2020/11/20 9:29
 * @description:成绩管理类信息，与数据库打交道
 /*
 
 */

public class ScoreContact extends BaseContact {
    public boolean addScore(Score sc){
        /*
         * @author: 何翔
         * @param: [sc]
         * @return: boolean
         * @date: 2020/11/20 9:30
         * @description：添加某课程分数
         */
        String sql = "insert into s_score_new values(?,?,?,?,?)";
        try {

            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, sc.getStu_id());
            preparedStatement.setInt(2, sc.getClass_id());
            preparedStatement.setFloat(3, sc.getGrade());
            preparedStatement.setString(4, sc.getStu_name());
            preparedStatement.setString(5, sc.getCourse_name());
            if(preparedStatement.executeUpdate() > 0)return true;
        } catch (SQLException e) {
        }
        return false;
    }
    public boolean update(Score score){
        /*
         * @author: 何翔
         * @param: [score]
         * @return: boolean
         * @date: 2020/11/20 9:36
         * @description：更新学生成绩信息
         */
        String sql = "update s_score_new set grade=? where stu_id=? and class_id=? and stu_name=? and course_name=?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setFloat(1, score.getGrade());
            preparedStatement.setInt(2, score.getStu_id());
            preparedStatement.setInt(3, score.getClass_id());
            preparedStatement.setString(4, score.getStu_name());
            preparedStatement.setString(5, score.getCourse_name());
            if(preparedStatement.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean delete(Score score){
        /*
         * @author: 何翔
         * @param: [score]
         * @return: boolean
         * @date: 2020/11/20 9:36
         * @description：删除学生成绩
         */
        String sql = "delete from s_score_new where stu_id=? and class_id=? and stu_name=? and course_name=? and " +
                "grade=?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, score.getStu_id());
            preparedStatement.setInt(2, score.getClass_id());
            preparedStatement.setString(3, score.getStu_name());
            preparedStatement.setString(4, score.getCourse_name());
            preparedStatement.setFloat(5, score.getGrade());
            if(preparedStatement.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Score> getScoreList(Score score){
        /*
         * @author: 何翔
         * @param: [score]
         * @return: java.util.List<achieveModule.infoType.Score>
         * @date: 2020/11/20 9:30
         * @description：获取课程成绩信息列表
         */
        List<Score> retList = new ArrayList<Score>();
        StringBuffer sqlString = new StringBuffer("select * from s_score_new");
        if(!StringUtil.isEmpty(score.getCourse_name())){
            sqlString.append(" where course_name ='"+score.getCourse_name()+"'");
        }
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sqlString.toString());
            ResultSet executeQuery = preparedStatement.executeQuery();
            while(executeQuery.next()){
                Score s = new Score();
                s.setStu_id(executeQuery.getInt("stu_id"));
                s.setClass_id(executeQuery.getInt("class_id"));
                s.setCourse_name(executeQuery.getString("course_name"));
                s.setStu_name(executeQuery.getString("stu_name"));
                s.setGrade(executeQuery.getFloat("grade"));
                retList.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retList;
    }

public float getM(String sql){
        /*
         * @author:何翔
         * @param: [sql]
         * @return: float
         * @date: 2020/11/20 9:31
         * @description：获取课程成绩的最大值和最小值
         */
    try {
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        ResultSet executeQuery = preparedStatement.executeQuery();
        float grade;
        while(executeQuery.next()){
            grade = (executeQuery.getFloat("mScore"));
            return grade;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 0;

}
    public List<Score> getScoreList2(Score score,int flag){
        /*
         * @author: 何翔
         * @param: [score, flag]
         * @return: java.util.List<achieveModule.infoType.Score>
         * @date: 2020/11/20 9:32
         * @description：获取最值成绩，总分，平均分信息列表
         */
        List<Score> retList = new ArrayList<Score>();
        String sqlString = null;
        if (flag==1){
            sqlString = "select *,max(grade) as mScore from s_score_new";
        }
        if (flag == 2) {
            sqlString = "select *,min(grade) as mScore from s_score_new";
        }
        if(!StringUtil.isEmpty(score.getCourse_name())&&sqlString!=null){
            sqlString+=" where course_name ='"+score.getCourse_name()+"'";
            float grade = getM(sqlString);
            sqlString ="select * from s_score_new where grade ="+grade+" and course_name ='"+score.getCourse_name()+"'";
        }
        if(flag==3){
            sqlString = "select *,sum(grade) as newGrade from s_score_new group by stu_id ORDER BY newGrade DESC";
        }
        if (flag==4){
            sqlString = "select *,avg(grade) as newGrade from s_score_new group by stu_id ORDER BY newGrade DESC";
        }
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sqlString);
            ResultSet executeQuery = preparedStatement.executeQuery();
            while(executeQuery.next()){
                Score s = new Score();
                s.setStu_id(executeQuery.getInt("stu_id"));
                s.setClass_id(executeQuery.getInt("class_id"));
                s.setCourse_name(executeQuery.getString("course_name"));
                s.setStu_name(executeQuery.getString("stu_name"));
                if (flag==3||flag==4) s.setGrade(executeQuery.getFloat("newGrade"));
                else s.setGrade(executeQuery.getFloat("grade"));
                retList.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retList;
    }

    public List<ClassScore> getScoreList3(){
        /*
         * @author: 何翔
         * @param: []
         * @return: java.util.List<achieveModule.infoType.ClassScore>
         * @date: 2020/11/20 9:32
         * @description：获取课程总人数，优秀人数，不及格人数信息列表
         */
        List<ClassScore> retList = new ArrayList<>();
        String sqlString = "select class_id,count(stu_id) as all_stu from s_score_new  group by class_id ORDER BY class_id";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sqlString);
            ResultSet executeQuery = preparedStatement.executeQuery();
            int temp;
            while(executeQuery.next()) {
                ClassScore s = new ClassScore();
                temp = executeQuery.getInt("class_id");
                s.setClassId(temp);
                s.setAllNum(executeQuery.getInt("all_stu"));
                s.setGoodNum(getGoodStu(temp));
                s.setBadNum(getBadStu(temp));
                retList.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retList;
    }

    public int getGoodStu(int classID) {
        /*
         * @author: 何翔
         * @param: [classID]
         * @return: int
         * @date: 2020/11/20 9:33
         * @description：获取给定班级查询到的优秀学生人数
         */
        String sqlString = "select class_id,count(stu_id) as good_stu from s_score_new where grade>=90 and " +
                "class_id = "+classID;
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sqlString);
            ResultSet executeQuery = preparedStatement.executeQuery();
            if(executeQuery.next()){
            return executeQuery.getInt("good_stu");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int getBadStu(int classID) {
        /*
         * @author: 何翔
         * @param: [classID]
         * @return: int
         * @date: 2020/11/20 9:34
         * @description：获取给定班级查询到的不及格学生人数
         */
        String sqlString = "select class_id,count(stu_id) as bad_stu from s_score_new where grade<60 and " +
                "class_id = "+classID;
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sqlString);
            ResultSet executeQuery = preparedStatement.executeQuery();
            if(executeQuery.next()){
                return executeQuery.getInt("bad_stu");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
