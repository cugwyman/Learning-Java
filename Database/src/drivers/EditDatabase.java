package drivers;  
      
    import java.sql.Connection;  
    import java.sql.ResultSet;  
    import java.sql.Statement;  
      
    import drivers.ConnectDatabase;  
      
    public class EditDatabase extends ConnectDatabase{  
        Connection con = null;  
        Statement s = null;  
        ResultSet rs=null;  
        /** 
         * ִ�в�ѯ 
         */  
        public void seach(){  
            try {  
                con=getConnection();  
                s = con.createStatement();// ����SQL������  
                rs=s.executeQuery("select * from employee");    // ��ѯԱ����Ϣ  
                while (rs.next()) {  
                    System.out.println("��ţ�"+rs.getInt("ID")+"��������"+rs.getString("name")+"�����䣺"+rs.getInt("age")+"����ְ���ڣ�"+rs.getDate("entryDate"));  
                }  
                System.out.println("__________ִ�����___________ ");  
            } catch (Exception e) {  
                e.printStackTrace();  
            } finally {  
                CloseConnection(con, rs, s);  
            }  
        }  
          
        /** 
         * ִ������ 
         */  
        public void add(){  
            try {  
                int result=0;  
                con=getConnection();  
                s = con.createStatement();// ����SQL������  
                result=s.executeUpdate("insert into employee(id,name,age,entryDate) values('9','����','19','2012-11-2')");  
                if (result>0) {  
                    System.out.println("����ɹ�");   
                }  
            } catch (Exception e) {  
                e.printStackTrace();  
            } finally {  
                CloseConnection(con, rs, s);  
            }  
            seach();  
        }  
          
        /** 
         * ִ���޸� 
         */  
        public void updata(){  
            try {  
                int result=0;  
                con=getConnection();  
                s = con.createStatement();// ����SQL������  
                result=s.executeUpdate("update employee set age=20 where id=6");  
                if (result>0) {  
                    System.out.println("���³ɹ�");  
                }  
            } catch (Exception e) {  
                e.printStackTrace();  
            } finally {  
                CloseConnection(con, rs, s);  
            }  
            seach();  
        }  
          
        /** 
         * ִ��ɾ�� 
         */  
        public void delete(){  
            try {  
                int result=0;  
                con=getConnection();  
                s = con.createStatement();// ����SQL������  
                result=s.executeUpdate("delete from employee where id=6");  
                if (result>0) {  
                    System.out.println("ɾ���ɹ�");  
                }  
            } catch (Exception e) {  
                e.printStackTrace();  
            } finally {  
                CloseConnection(con, rs, s);  
            }  
            seach();  
        }  
        public static void main(String[] args) {  
            EditDatabase t=new EditDatabase();  
            t.seach();  
    //      t.add();      
    //      t.updata();  
    //      t.delete();  
        }  
    }  
