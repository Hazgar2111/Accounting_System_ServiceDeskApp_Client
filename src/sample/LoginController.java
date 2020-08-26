package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


import java.io.IOException;
import java.util.ArrayList;


public class LoginController {

    @FXML
    private Button signin_button;
    @FXML
    private TextField login_field;

    @FXML
    private PasswordField pass_field;

    @FXML
    private Button showPassBtn;


    public LoginController() {
    }


    ArrayList<Admin> admins = new ArrayList<>();

    @FXML
    private String password;


    void show1()
    {
        try {
            signin_button.getScene().getWindow().hide();
            Parent root = FXMLLoader.load(getClass().getResource("mainMenuV2.fxml"));
            Stage main_menu = new Stage();
            main_menu.setTitle("Hazgar's Application CO");
            main_menu.setScene(new Scene(root, 1565, 756)); // размеры нового окна
            main_menu.show();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    void initialize() {
        admins = Main.getAdminsMethod();


        showPassBtn.addEventFilter(MouseEvent.MOUSE_PRESSED, e -> {
            password = pass_field.getText();
            pass_field.clear();
            pass_field.setPromptText(password);
        });
        showPassBtn.addEventFilter(MouseEvent.MOUSE_RELEASED, e -> {
            pass_field.setText(password);
            pass_field.setPromptText("Password");
        });


        signin_button.setOnAction(event ->
        {
            String pass_f = String.valueOf(pass_field.getText().trim().hashCode());
            String login_f = String.valueOf(login_field.getText());
            int check = 0;
            for (Admin admin : admins) {
                if (admin.getLogin().equals(login_f) && admin.getPass().equals(pass_f)) {
                    SaverProfile.saveProfile(admin);
                    check = 1;
                    break;
                }
            }
            if (check == 1) {
                String temp1 = String.valueOf("1234".hashCode());
                Admin admin1 = SaverProfile.getProfile();
                if (admin1.getPass().equals(temp1))
                {
                    System.out.println(admin1.getLogin());
                    try {
                        show1();
                        Parent changePass = FXMLLoader.load(this.getClass().getResource("changePass.fxml"));
                        Scene settingsScene = new Scene(changePass);
                        Stage popup = new Stage();
                        popup.setScene(settingsScene);
                        popup.setTitle("Смена пароля");
                        popup.initModality(Modality.WINDOW_MODAL);
                        popup.initStyle(StageStyle.TRANSPARENT); //Чтобы не было закрыть свернуть и полный экран
                        popup.initOwner(signin_button.getScene().getWindow());
                        popup.show();
                        //show1();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else
                    show1();

            } else {
                signin_button.getScene().getWindow().hide();

                try {
                    Parent root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
                    Stage main_menu = new Stage();
                    main_menu.setTitle("Hazgar's Application CO");
                    main_menu.setScene(new Scene(root, 763, 487)); // размеры нового окна
                    main_menu.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

}

