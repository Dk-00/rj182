package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Shiliinput {

	public static void main(String[] args) throws Exception {
		 FileInputStream fin=new FileInputStream("shili.xlsx");
		 XSSFWorkbook workbook=new XSSFWorkbook(fin);
		 XSSFSheet sheet=workbook.getSheet("sheet1");
		 int rows=sheet.getLastRowNum();
		 for(int i=0;i<rows;i++) {
			 
			 XSSFRow row=sheet.getRow(i);
		 XSSFCell cell=row.getCell(3);
		 //读取这个单元格的值
		 String xuehao=cell.getStringCellValue();
		 //System.out.println(xuehao);
		 //找到第十六个单元格
		 XSSFCell cell16=row.getCell(15);
		 //读取这个单元个的值
		 String zuo_shili=cell16.getStringCellValue();
		 // System.out.println(you_shili);
		 XSSFCell cell17=row.getCell(16);
		 //读取这个单元个的值
		 String you_shili=cell17.getStringCellValue();
		// System.out.println(you_shili);
		 //注册驱动
		 Class.forName("com.mysql.jdbc.Driver");
			//通过驱动获得链接
	Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root","123456");
			//定义更新sql语句
		//Statement yuju=lianjie.createStatement();
			//通过语句对象执行sql
//创建
PreparedStatement ydy_yuju=lianjie.prepareStatement("UPDATE 18rj2 SET `左眼裸眼视力`=?,`右眼裸眼视力`=? WHERE `学号`=?");
		ydy_yuju.setString(1, zuo_shili);
		ydy_yuju.setString(2, you_shili);
		ydy_yuju.setString(3, xuehao);
		
		//ydy_yuju.executeUpdate();
		 }
	}

}
