package drivers;

import java.sql.*;	//导入sql相关包
import com.microsoft.sqlserver.jdbc.*;	//JDBC纯Java连接驱动

public class ConnectDatabase {
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	private Connection GetConn(String user,String pwd) {
		try {
			String DriverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";	//JDBC
			String url = "jdbc:sqlserver://localhost:1433;databaseName=StudentsInfo";	//访问端口及数据表
			String sql = "select * from dbo.ClassOne";	//从此表检索
			
			Class.forName(DriverName);
			conn = DriverManager.getConnection(url, user, pwd);
			stmt = conn.createStatement();	//创建一个 Statement 对象来将 SQL 语句发送到数据库
			rs = stmt.executeQuery(sql);	//返回单个 ResultSet 对象
			while(rs.next()){
				String name = rs.getString("Name");
				int id = rs.getInt("ID");
				short age = rs.getShort("Age");
				int tel = rs.getInt("Tel");
				String course = rs.getString("Course");
				short score = rs.getShort("Score");
				System.out.println("StudentsInfo:" + name + "\tID:" + id + "\tAge:" + age + "\t Tel:" + tel + "\tCourse:" + course + "\tScore:" + score);
			}
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return conn;
	}
	
	public boolean TestConn()	//bool型判断账号密码是否正确，此处不泄露我密码了
	{
		if(GetConn("sa","Sorry, I won't tell you my password!")==null)
			return false;
		else
			return true;
	}
	
}
