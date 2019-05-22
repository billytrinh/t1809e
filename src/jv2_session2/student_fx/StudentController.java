package jv2_session2.student_fx;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.*;

public class StudentController {
    public TextField txtName;
    public DatePicker txtBirth;
    public TextField txtClass;
    public TextField txtMssv;

    public Text txtSuccess;
    public Text txtFail;

    public void submit(){
        boolean stop = false;
        if(txtName.getText().isEmpty() || txtBirth.getValue() == null || txtMssv.getText().isEmpty() || txtClass.getText().isEmpty()){
            stop = true;
            changeNotice(false);
        }
        String str = txtName.getText()+" "+txtBirth.getValue()
                +" "+txtClass.getText()+" "+txtMssv.getText();

        File f = new File("data.txt");

        if(f.canRead() && f.canWrite() && !stop){
            try {
                String output = "";
                FileInputStream fis = new FileInputStream(f);
                DataInputStream dis = new DataInputStream(fis);
                String line;
                while ((line = dis.readLine()) != null){
                    output += line +"\n";
                }
                fis.close();
                dis.close();

                output += str;

                FileOutputStream fos = new FileOutputStream(f);
                DataOutputStream dos = new DataOutputStream(fos);
                dos.writeBytes(output);
                dos.close();
                fos.close();

                txtName.setText("");
                txtBirth.setValue(null);
                txtClass.setText("");
                txtMssv.setText("");

                changeNotice(true);

            }catch (Exception e){
                changeNotice(false);
            }

        }
    }

    public void changeNotice(boolean flag){
        if(flag){
            txtSuccess.setVisible(true);
            txtFail.setVisible(false);
        }else {
            txtSuccess.setVisible(false);
            txtFail.setVisible(true);
        }
    }
}
