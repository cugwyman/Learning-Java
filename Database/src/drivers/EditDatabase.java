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
         * 执行查询 
         */  
        public void seach(){  
            try {  
                con=getConnection();  
                s = con.createStatement();// 创建SQL语句对象  
                rs=s.executeQuery("select * from employee");    // 查询员工信息  
                while (rs.next()) {  
                    System.out.println("编号："+rs.getInt("ID")+"，姓名："+rs.getString("name")+"，年龄："+rs.getInt("age")+"，入职日期："+rs.getDate("entryDate"));  
                }  
                System.out.println("__________执行完毕___________ ");  
            } catch (Exception e) {  
                e.printStackTrace();  
            } finally {  
                CloseConnection(con, rs, s);  
            }  
        }  
          
        /** 
         * 执行增加 
         */  
        public void add(){  
            try {  
                int result=0;  
                con=getConnection();  
                s = con.createStatement();// 创建SQL语句对象  
                result=s.executeUpdate("insert into employee(id,name,age,entryDate) values('9','芳芳','19','2012-11-2')");  
                if (result>0) {  
                    System.out.println("插入成功");   
                }  
            } catch (Exception e) {  
                e.printStackTrace();  
            } finally {  
                CloseConnection(con, rs, s);  
            }  
            seach();  
        }  
          
        /** 
         * 执行修改 
         */  
        public void updata(){  
            try {  
                int result=0;  
                con=getConnection();  
                s = con.createStatement();// 创建SQL语句对象  
                result=s.executeUpdate("update employee set age=20 where id=6");  
                if (result>0) {  
                    System.out.println("更新成功");  
                }  
            } catch (Exception e) {  
                e.printStackTrace();  
            } finally {  
                CloseConnection(con, rs, s);  
            }  
            seach();  
        }  
          
        /** 
         * 执行删除 
         */  
        public void delete(){  
            try {  
                int result=0;  
                con=getConnection();  
                s = con.createStatement();// 创建SQL语句对象  
                result=s.executeUpdate("delete from employee where id=6");  
                if (result>0) {  
                    System.out.println("删除成功");  
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
