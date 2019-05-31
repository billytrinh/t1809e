package jv2_assignment5;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

import java.sql.*;

public class List implements Initializable {
    public TableView<User> tbView;

    public TableColumn<User,Integer> colId;
    public TableColumn<User,String> colUsername;
    public TableColumn<User,String> colEmail;
    public TableColumn<User,String> colPassword;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colUsername.setCellValueFactory(new PropertyValueFactory<>("username"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colPassword.setCellValueFactory(new PropertyValueFactory<>("password"));

        String sql = "SELECT * FROM user";
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:8889/T1809E";
            Connection con = DriverManager.getConnection(url,"root","root");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            ObservableList<User> list = FXCollections.observableArrayList();

            while (rs.next()){
                Integer id = rs.getInt("id");
                String username = rs.getString("username");
                String email = rs.getString("email");
                String password = rs.getString("password");

                User u = new User(id,username,email,password);
                list.add(u);
            }

            tbView.setItems(list);

        }catch (Exception e){

        }
    }

    public void home()throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }

    public void register() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }
}
