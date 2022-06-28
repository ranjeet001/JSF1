import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	 public static List<User> getAllUser(){  
	        List<User> list=new ArrayList<User>();  
	          
	        try{  
	            //Connection con=EmpDao.getConnection(); 
	            Connection con = DbConnection.initializeDatabase(); 
	            PreparedStatement ps=con.prepareStatement("select * from userdetail");  
	            ResultSet rs=ps.executeQuery();  
	            while(rs.next()){  
	                User e=new User();  
	                e.setId(rs.getInt(1));  
	               e.setName(rs.getString(2));  
	                e.setUsername(rs.getString(3));
	                e.setPassword(rs.getString(4));  
	                e.setGender(rs.getString(5));
	                e.setProgrammingskill(rs.getString(6));
	                e.setContact(rs.getString(7));
	                e.setEmail(rs.getString(8));
	                e.setCollege(rs.getString(9));
	                e.setSkills2(rs.getString(10));
	                e.setSkills3(rs.getString(11));
	                e.setSkills4(rs.getString(12));
//	                int id = rs.getInt(1);
//	                String name = rs.getString(2);
//	                list.add(new User(id,name));
	               list.add(e);  
	            }  
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return list;  
	    }  
}
