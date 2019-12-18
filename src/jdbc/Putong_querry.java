package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
public class Putong_querry {

	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//通过驱动获得链接
		Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root","123456");
		//定义更新sql语句
		Statement yuju=lianjie.createStatement();
		//通过语句对象执行sql
		String sql="select * from tb_user";
		ResultSet rs=yuju.executeQuery(sql);
		System.out.println("id | name | sex");
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String sex=rs.getString("sex");
			System.out.println(id+" | "+name+" |　"+sex);
		}

	}

}
