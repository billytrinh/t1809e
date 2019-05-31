package jv2_assignment5;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.sql.*;

public class Register {
    public TextField txtUsername;
    public TextField txtEmail;
    public PasswordField txtPassword;

    public void register(){
        String username = txtUsername.getText();
        String email = txtEmail.getText();
        String password = txtPassword.getText();

        String sql = "INSERT INTO user (username,email,password) " +
                " VALUES('"+username+"','"+email+"','"+password+"')";
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:8889/T1809E";
            Connection con = DriverManager.getConnection(url,"root","root");

            Statement st = con.createStatement();
            int number = st.executeUpdate(sql);
            if(number>0){
                goToList();
            }
        }catch (Exception e){

        }

    }

    public void home() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }

    public void login() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }

    public void goToList() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }

}
