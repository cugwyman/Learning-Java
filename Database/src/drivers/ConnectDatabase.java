    package drivers;  
      
    import java.sql.Connection;  
    import java.sql.DriverManager;  
    import java.sql.ResultSet;  
    import java.sql.SQLException;  
    import java.sql.Statement;  
      
    /** 
     * ��������Դ 
     */  
    public class ConnectDatabase {  
        Connection con = null;  
        Statement s = null;  
        ResultSet rs=null;  
          
        // �õ�����  
        public Connection getConnection(){  
            try {  
                // ����JDBC-ODBC����������  
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
                  
                // ��ʽһ  ͨ����������  
                //con=DriverManager.getConnection("jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=D:\\Technology\\Access2007\\MyAccessDB.mdb; pwd=liurenkui");  
                // ��ʽ�� ͨ������Դ�����ݿ⽨������  
                  con = DriverManager.getConnection("jdbc:odbc:cug");  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
            return con;  
        }  
          
        /** 
         * �ر�����Դ 
         */  
        public void CloseConnection(Connection con,ResultSet rs,Statement s){  
            try {  
                if (rs!=null) {  
                    rs.close();  
                }  
                if (s!=null) {  
                    s.close();  
                }  
                if (con!=null) {  
                    con.close();      
                }  
            } catch (SQLException e) {  
                e.printStackTrace();  
            }  
        }  
    }  