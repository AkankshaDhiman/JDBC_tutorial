package com.example;
import org.postgresql.*;
import javax.xml.stream.events.Comment;
import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/university";
        String user = "postgres";
        String password = "Akshi2004@";
        Connection conn = DriverManager.getConnection(url,user,password);
        Statement stmt = conn.createStatement();

        Scanner in = new Scanner(System.in);


//        String insertQuery= "INSERT INTO students(student_id,first_name,last_name,major,email,course_id) VALUES(?,?,?,?,?,?)";
//        try(PreparedStatement pstmt = conn.prepareStatement(insertQuery)){
//            System.out.print("Enter student ID : ");
//            int id = in.nextInt();
//            pstmt.setInt(1,id);
//            System.out.print("Enter student First_name : ");
//            String first_name = in.next();
//            pstmt.setString(2,first_name);
//            System.out.print("Enter student Last_name : ");
//            String last_name = in.next();
//            pstmt.setString(3,last_name);
//            System.out.print("Enter major : ");
//            String major = in.next();
//            pstmt.setString(4,major);
//            System.out.print("Enter student Email : ");
//            String email = in.next();
//            pstmt.setString(5,email);
//            System.out.print("Enter course_id : ");
//            int course_id = in.nextInt();
//            pstmt.setInt(6,course_id);
//            int check =pstmt.executeUpdate();
//            if(check>0){
//                System.out.println("Student Added Successfully");
//            }else {
//                System.out.println("Insertion Failed");
//            }
//        }
//        catch(SQLException e){
//            System.out.println(e);
//        }

        Statement stmt2 = conn.createStatement();
        String query = "SELECT * FROM students";
        ResultSet rs = stmt2.executeQuery(query);
        while(rs.next()){
            System.out.print("\n"+rs.getInt("student_id")+" \t"+rs.getString
                    ("first_name")+"\t"+rs.getString("last_name")
                    +"\t"+rs.getString("major")+'\t'+rs.getString
                    ("email")+"\t"+rs.getInt("course_id"));

        }
        in.close();
    }
}
