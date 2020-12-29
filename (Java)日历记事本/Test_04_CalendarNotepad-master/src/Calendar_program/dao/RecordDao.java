package Calendar_program.dao;

import Calendar_program.entity.Record;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RecordDao extends BaseDao {

    public boolean addContent(Record record){

        String sql = "insert into calendar values(?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, record.getContent());
            preparedStatement.setString(2, record.getData());
            if(preparedStatement.executeUpdate() > 0) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean deleteContent(String data){

        String sql = "delete from calendar where data=?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, data);
            if(preparedStatement.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean isExistContent(String data){

        String sql = "select * from calendar where data=?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, data);
            ResultSet executeQuery = preparedStatement.executeQuery();
            if (executeQuery.next()){
                return true;
            }
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean updateContent(Record record){

        String sql = "update calendar set content=? where data=?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, record.getContent());
            preparedStatement.setString(2, record.getData());
            if(preparedStatement.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public String getContent(String data){

        String sql = "select * from calendar where data=?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, data);
            ResultSet executeQuery = preparedStatement.executeQuery();
            if (executeQuery.next()){
                Record record = new Record();
                String content = executeQuery.getString("content");
                return content;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "当前时间段无日志内容！";
    }


}
