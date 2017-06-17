package drivers;

import java.sql.*;	//����sql��ذ�
import com.microsoft.sqlserver.jdbc.*;	//JDBC��Java��������

public class ConnectDatabase {
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	private Connection GetConn(String user,String pwd) {
		try {
			String DriverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";	//JDBC
			String url = "jdbc:sqlserver://localhost:1433;databaseName=StudentsInfo";	//���ʶ˿ڼ����ݱ�
			String sql = "select * from dbo.ClassOne";	//�Ӵ˱����
			
			Class.forName(DriverName);
			conn = DriverManager.getConnection(url, user, pwd);
			stmt = conn.createStatement();	//����һ�� Statement �������� SQL ��䷢�͵����ݿ�
			rs = stmt.executeQuery(sql);	//���ص��� ResultSet ����
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
	
	public boolean TestConn()	//bool���ж��˺������Ƿ���ȷ���˴���й¶��������
	{
		if(GetConn("sa","Sorry, I won't tell you my password!")==null)
			return false;
		else
			return true;
	}
	
}
