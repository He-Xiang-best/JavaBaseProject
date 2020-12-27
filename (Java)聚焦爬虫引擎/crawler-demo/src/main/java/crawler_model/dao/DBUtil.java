package crawler_model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
/*
 * @author:何翔
 * @date:2020/11/20 9:37
 * @description:加载数据库，创建连接
 /*

 */

public class DBUtil {
    // 加载数据库驱动
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    // 获取mysql连接地址
    private static final String url = "jdbc:mysql://localhost/crawler?&useSSL=false&serverTimezone=UTC";
    // 数据名称
    private static final String username = "root";
    // 数据库密码
    private static final String password = "hxnb";

    //数据库连接
    public Connection getConnection()  {
        //获取一个数据的连接
        Connection conn = null;
        try {
            Class.forName(driver);
            //getConnection()方法，连接MySQL数据库！
            conn= DriverManager.getConnection(url,username,password);
        }catch (Exception e){
            e.printStackTrace();
        }

        return conn;
    }

    //数据库关闭
    public void closeConnection(Connection conn) throws Exception {
        if(conn!=null){
            conn.close();
        }
    }
}
