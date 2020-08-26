package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class changePassController {
    @FXML
    private PasswordField oldPass;

    @FXML
    private PasswordField newPass1;

    @FXML
    private PasswordField newPass;

    @FXML
    private Button saveBtn;

    @FXML
    private Label errorLbl;

    @FXML
    public void handleClicks(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == saveBtn)
        {
            String temp = String.valueOf(oldPass.getText().hashCode());
            Admin admin = SaverProfile.getProfile();
            if (temp.equals(admin.getPass()) && newPass.getText().equals(newPass1.getText()))
            {
                String s = String.valueOf(newPass.getText().hashCode());
                admin.setPass(s);
                try {
                    saveBtn.getScene().getWindow().hide();
                }catch (Exception e) {
                    e.printStackTrace();
                }
                Main.updateAdmin(admin);
            }
            else
            {
                errorLbl.setText("Некоректные данные!!!");
            }
        }
    }
}
