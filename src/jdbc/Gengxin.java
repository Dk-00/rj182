package jdbc;

import java.sql.Connection;
import java.sql.*;


public class Gengxin {

	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//通过驱动获得链接
		Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root","123456");
		//定义更新sql语句
		Statement yuju=lianjie.createStatement();
		//通过语句对象执行sql
		String sql="UPDATE tb_user SET email='jack@163.com' WHERE id=1 ";
		yuju.execute(sql);
	}

}
