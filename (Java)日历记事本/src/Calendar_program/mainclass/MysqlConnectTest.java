package Calendar_program.mainclass;


import Calendar_program.util.DbUtil;

import java.sql.Connection;


public class MysqlConnectTest {
    public static void main(String[] args) throws Exception {
        DbUtil dbUtil = new DbUtil();
        if(dbUtil.getCon()!=null){
            System.out.println("数据库连接成功！");
        }
        else
            System.out.println("数据库连接失败！");

        Connection conn2 = dbUtil.getCon();
        dbUtil.closeCon(conn2);
//        conn2.close();
        if(conn2.isClosed()){
            System.out.println("数据库关闭成功！");
        }
        else
            System.out.println("数据库关闭失败!");
    }
}
