package jv2_session5;

// Buoc 1: import package
import java.sql.*;

public class Main {
    public static void main(String args[]){
        try {
            // Buoc 2: khai bao driver + them driver
            Class.forName("com.mysql.jdbc.Driver");

            //Buoc 3: ket noi CSDL
            String url = "jdbc:mysql://localhost:8889/T1809E";
            Connection con = DriverManager.getConnection(url,"root","root");

            // Buoc 4: truy van CSDL
            String sql = "SELECT * FROM student";

            String add_student = "INSERT INTO student (name,mssv,age)" +
                    " VALUES('Nguyen van anh','vananh1234',20)";

            Statement st = con.createStatement();

            int number = st.executeUpdate(add_student);
            if(number > 0 ){
                System.out.println("them thanh cong");
            }

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                System.out.println("ID: "+rs.getInt("id"));
                System.out.println("Name: "+rs.getString("name"));
                System.out.println("Mssv: "+rs.getString("mssv"));
                System.out.println("Age: "+rs.getInt("age"));

                System.out.println("----------------------");
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
