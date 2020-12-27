package crawler_model.dao;

import java.sql.Connection;
import java.sql.SQLException;
/*
 * @author:何翔
 * @date:2020/10/14 22:11
 * @description: 创建数据库连接对象，使得整个项目与数据库打交道都用这一个对象.
 /*

 */

public class BaseDao {

    public Connection con = new DBUtil().getConnection();

    public void CloseConnection() {
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库关闭异常!请保存文件后重新操作！");
        }
    }
}