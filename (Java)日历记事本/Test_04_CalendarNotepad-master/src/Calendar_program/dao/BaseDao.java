package Calendar_program.dao;

import Calendar_program.util.DbUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class BaseDao {
    public Connection con = new DbUtil().getCon();

    public void CloseCon() {
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库关闭异常!请保存文件后重新操作！");
        }
    }
}
