package connector;

import java.sql.*;
public class Connector {

    private static final String Driver = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:8889/T1809E";
    private static final String DB_User = "root";
    private static final String DB_Password = "root";

    public Connection connection;

    private static Connector instance;

    private Connector(){
        try {
            Class.forName(Driver);
            this.connection = DriverManager.getConnection(DB_URL,DB_User,DB_Password);
        }catch (Exception e){

        }
    }

    public static Connector getInstance(){
        if(instance == null){
            instance = new Connector();
        }
        return instance;
    }

    public ResultSet getQuery(String sql) throws Exception{
        Statement st = connection.createStatement();
        return st.executeQuery(sql);
    }

    public int updateQuery(String sql) throws Exception{
        Statement st = connection.createStatement();
        return st.executeUpdate(sql);
    }

}
