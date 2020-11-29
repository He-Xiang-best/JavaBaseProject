package crawler_model.controller;

import crawler_model.dao.DBUtil;

import java.sql.Connection;
/*
 * @author:何翔
 * @date:2020/11/29 15:40
 * @description:测试数据库是否成功连接
 /*
 
 */

public class Test_4_mysqlConnection {
    public static void main(String[] args) throws Exception {
        DBUtil dbUtil = new DBUtil();
        if(dbUtil.getConnection()!=null){
            System.out.println("数据库连接成功！");
        }
        else
            System.out.println("数据库连接失败！");

        Connection conn2 = dbUtil.getConnection();
        dbUtil.closeConnection(conn2);
//        conn2.close();
        if(conn2.isClosed()){
            System.out.println("数据库关闭成功！");
        }
        else
            System.out.println("数据库关闭失败!");
    }
}
