package jv2_session9;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ConvertController {

    public static boolean flag = true;// true : VN ; false: US

    public static final double rate = 23340;

    public Text txtLabel;
    public TextField txtMoney;
    public RadioButton rbVN;
    public RadioButton rbUS;
    public TextArea txtValue;
    public Button btnSubmit;

    public RadioButton rbEN;
    public RadioButton rbVI;

    public void convertVN(){
        rbVN.setSelected(true);
        rbUS.setSelected(false);
        flag = true;
    }

    public void convertUS(){
        rbVN.setSelected(false);
        rbUS.setSelected(true);
        flag = false;
    }

    public void convert(){
        try{
            double money = Double.parseDouble(txtMoney.getText());
            String result;
            if(flag){
                double n = money/rate;
                NumberFormat nf = NumberFormat.
                        getCurrencyInstance(Locale.US);
                result = nf.format(n);
            }else {
                double n = money*rate;
                NumberFormat nf = NumberFormat.
                        getCurrencyInstance(new Locale("vi","VN"));
                result = nf.format(n);
            }
            txtValue.setText(result);
        }catch (Exception e){
            txtValue.setText("Không thể chuyển giá trị");
        }

    }

    public void changeEN(){
        rbVI.setSelected(false);
        rbEN.setSelected(true);
        ResourceBundle rb = ResourceBundle.
                getBundle("jv2_session9.session9",Locale.US);
        txtLabel.setText(rb.getString("label"));
        txtMoney.setPromptText(rb.getString("txtMoney"));
        txtValue.setPromptText(rb.getString("txtValue"));
        btnSubmit.setText(rb.getString("btnSubmit"));
    }

    public void changeVI(){
        rbVI.setSelected(true);
        rbEN.setSelected(false);
        ResourceBundle rb = ResourceBundle.
                getBundle("jv2_session9.session9",new Locale("vi","VN"));
        txtLabel.setText(rb.getString("label"));
        txtMoney.setPromptText(rb.getString("txtMoney"));
        txtValue.setPromptText(rb.getString("txtValue"));
        btnSubmit.setText(rb.getString("btnSubmit"));
    }

}
