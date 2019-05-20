package sample;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Ucln {

    public TextField txtSTN;
    public TextField txtSTH;
    public TextArea txtKQ;


    public void submit(){
        try{
            int no1 = Integer.parseInt(txtSTN.getText());
            int no2 = Integer.parseInt(txtSTH.getText());
            int ucln = 1;
            for (int i=1;i< Math.min(no1,no2);i++){
                if(no1%i==0 && no2%i==0){
                    ucln = i;
                }
            }

            txtKQ.setText(""+ucln);
        }catch (Exception e){
            //txtKQ.setText(e.getMessage());
            txtKQ.setText("Invalid number");
        }


    }

}
