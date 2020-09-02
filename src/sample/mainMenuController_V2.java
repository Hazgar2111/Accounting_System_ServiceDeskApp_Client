package sample;

import com.sun.javafx.logging.PlatformLogger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.*;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Logger;


public class mainMenuController_V2 implements Initializable {

    @FXML
    private Label profileLbl;

    @FXML
    private Label profileLbl1;
    @FXML
    private Button btnVydacha;

    @FXML
    private Button btnPrinyatie;

    @FXML
    private Button btnSpisok;
    @FXML
    private Button notificationsButton;

    @FXML
    private ComboBox<?> dropdownMenuTable;
    @FXML
    private Button btnNastroyiki;

    @FXML
    private Button btnVyhod;

    @FXML
    private GridPane gpVydacha;

    @FXML
    private GridPane gpPrinyat;

    @FXML
    private GridPane gpNastroyiki;

    @FXML
    private GridPane gpSpisok;

    @FXML
    private GridPane gpNotifications;
    @FXML
    private GridPane gpNotifications1;
    @FXML
    private AnchorPane gpVydacha1;

    @FXML
    private GridPane gpPrinyat1;

    @FXML
    private GridPane gpNastroyiki1;

    @FXML
    private StackPane gpSpisok1;

    @FXML
    private ImageView imageProfile;


    @FXML
    private GridPane gpTable;

    @FXML
    private GridPane gpPustyshka;

    @FXML
    private Label lblPrinyatName;


    //для меню выдачи
    @FXML
    private TextField invTextField;

    //для меню выдачи
    @FXML
    private TextField nameTextField;

    //для меню выдачи
    @FXML
    private TextField snTextField;

    //для меню выдачи
    @FXML
    private TextField peremechenTextField;

    //для меню выдачи
    @FXML
    private TextField gorodTextField;

    //для меню выдачи
    @FXML
    private TextField zayavka1CTextField;

    //для меню выдачи
    @FXML
    private TextField nomerNakl1CTextField;

    //для меню выдачи
    @FXML
    private TextField ktoVydalTextField;

    //для меню выдачи
    @FXML
    private TextField REQTextField;

    //для меню выдачи
    @FXML
    private TextField nomerTransportTextField;

    //для меню выдачи
    @FXML
    private TextField commentsTextField;

    //для меню выдачи
    @FXML
    private TextField MacAddresField;

    @FXML
    private DatePicker dateField;


    @FXML
    private Button vydatOborudBtn;

    @FXML
    public Label ktoVydalLbl;

    @FXML
    private Label lblPrinyatName1;


    @FXML
    private TableView<Inventory> tableSpisok;

    @FXML
    private TableColumn<?, ?> invNumber1;

    @FXML
    private TableColumn<?, ?> SN;

    @FXML
    private TableColumn<?, ?> name;

    @FXML
    private TableColumn<?, ?> recieved;

    @FXML
    private TableColumn<?, ?> location;

    @FXML
    private TableColumn<?, ?> date;

    @FXML
    private TableColumn<?, ?> peremech_1C;

    @FXML
    private TableColumn<?, ?> nakl_1C;

    @FXML
    private TableColumn<?, ?> kto_vydal;

    @FXML
    private TableColumn<?, ?> REQ;

    @FXML
    private TableColumn<?, ?> transportNakl;

    @FXML
    private TableColumn<?, ?> MAC;

    @FXML
    private TableColumn<?, ?> desc;

    //для поиска оборудования в СПИСОК
    @FXML
    private TextField inputSpisokTextField;

    @FXML
    private ComboBox<String> typeObSpisokComboBx;

    @FXML
    private ComboBox<String> kritSpisokComboBx;


    @FXML
    private Button btnPoiskTable;

    //для поиска оборудования в выдаче на панеле поиска

    @FXML
    private GridPane paneBuVydacha;
    @FXML
    private GridPane paneNewVydacha;

    @FXML
    private GridPane panePustyshVydacha;

    @FXML
    private Button vydachaVyborPanelPoikaBtnNew;

    @FXML
    private Button vydachaVyborPanelPoikaBtnBu;

    @FXML
    private TableView<InventoryBU> tableVydachaBU;

    @FXML
    private TableColumn<?, ?> colBUInv;

    @FXML
    private TableColumn<?, ?> colBUISN;

    @FXML
    private TableColumn<?, ?> colBUName;

    @FXML
    private TableColumn<?, ?> colBUPrinyal;

    @FXML
    private TableColumn<?, ?> colBUSdal;

    @FXML
    private TableColumn<?, ?> colBUMAC;


    @FXML
    private TableView<NewInventory> tablePoisk;

    @FXML
    private TableColumn<?, ?> colInv;

    @FXML
    private TableColumn<?, ?> colSN;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colMac;

    @FXML
    private Button poiskObBtn;

    @FXML
    private ComboBox<String> typeObPanelPoiskaComboBx;

    @FXML
    private TextField invPoiskTextField;


    //для меню ПРИНЯТЬ

    @FXML
    private CheckBox checkBxPrinyat;

    @FXML
    private TextField invNumber;

    @FXML
    private Button poiskBtn;

    @FXML
    private Label promptLbl;
    @FXML
    private Button prinyatObBtn;

    @FXML
    private TableView<Inventory> tableSpisok1;

    @FXML
    private TableColumn<?, ?> prnColInv;

    @FXML
    private TableColumn<?, ?> prnColSN;

    @FXML
    private TableColumn<?, ?> prnColName;

    @FXML
    private TableColumn<?, ?> prnColRecieved;

    @FXML
    private TableColumn<?, ?> prnColLocation;

    @FXML
    private TableColumn<?, ?> prnColDate;

    @FXML
    private TableColumn<?, ?> prnColPeremechenie;

    @FXML
    private TableColumn<?, ?> prnColNakl;

    @FXML
    private TableColumn<?, ?> prnColKto_vydald;

    @FXML
    private TableColumn<?, ?> prnColREQ;

    @FXML
    private TableColumn<?, ?> prnColTransport;

    @FXML
    private TableColumn<?, ?> prnColMAC;

    @FXML
    private TableColumn<?, ?> prnColDesc1;


    @FXML
    private GridPane gpSpisokINV;
    @FXML
    private GridPane gpSpisokBU;

    @FXML
    private TableView<InventoryBU> tableSpisokBU;

    @FXML
    private TableColumn<?, ?> invBUSpisok;

    @FXML
    private TableColumn<?, ?> SNBUSpisok;

    @FXML
    private TableColumn<?, ?> nameBUSpisok;

    @FXML
    private TableColumn<?, ?> prinaylBUSpisok;

    @FXML
    private TableColumn<?, ?> sdalBUSpisok;

    @FXML
    private TableColumn<?, ?> macBUSpisok;


    @FXML
    private TableColumn<?, ?> invNumberColNot;

    @FXML
    private TableColumn<?, ?> SNColNot;

    @FXML
    private TableColumn<?, ?> nameColNot;

    @FXML
    private TableColumn<?, ?> recievedColNot;

    @FXML
    private TableColumn<?, ?> locationColNot;

    @FXML
    private TableColumn<?, ?> dateColNot;

    @FXML
    private TableColumn<?, ?> peremech_1CColNot;

    @FXML
    private TableColumn<?, ?> nakl_1CColNot;

    @FXML
    private TableColumn<?, ?> kto_vydalColNot;

    @FXML
    private TableColumn<?, ?> REQColNot;

    @FXML
    private TableColumn<?, ?> transportNaklColNot;

    @FXML
    private TableColumn<?, ?> descColNot;

    @FXML
    private TableColumn<?, ?> MACColNot;

    @FXML
    private TableView<Inventory> tableNotifications;


    @FXML
    private Label successNoteLbl;



    @FXML
    private Pane panePustyshkaNote;

    @FXML
    private TextField invTextFieldNote;

    @FXML
    private TextField nameTextFieldNote;

    @FXML
    private TextField snTextFieldNote;

    @FXML
    private TextField peremechenTextFieldNote;

    @FXML
    private TextField gorodTextFieldNote;

    @FXML
    private TextField zayavka1CTextFieldNote;

    @FXML
    private TextField REQTextFieldNote;

    @FXML
    private TextField nomerTransportTextFieldNote;

    @FXML
    private TextField commentsTextFieldNote;

    @FXML
    private Label dateFieldNote;

    @FXML
    private Label ktoVydalLblNote;

    @FXML
    private TextField MacAddresFieldNote;

    @FXML
    private CheckBox checkBxNote;

    @FXML
    private Button saveBtnNote;

    @FXML
    private TextField nomerNakl1CTextFieldNote;

    @FXML
    private Pane paneEditNote;

    @FXML
    private Button helpBtnNote;

    @FXML
    private Pane paneSpravka;

    @FXML
    private Button vyborBtnNote1;

    @FXML
    private Label lblVydachaError;
    @FXML
    private Label ErrorNoteLbl;

    @FXML
    private CheckBox chckBxVydacha;

    @FXML
    private Button changePassBtn;







    @FXML
    private GridPane gpAdd;

    @FXML
    private AnchorPane gpAdd1;

    @FXML
    private Button btnAdd;

    @FXML
    private ComboBox<String> comboBxVyborAdd;

    @FXML
    private Button btnVyborAdd;

    @FXML
    private Label lblAddError;

    @FXML
    private Label lblAddError1;

    @FXML
    private TextField textLoginAdd;

    @FXML
    private TextField textNameAdd;

    @FXML
    private TextField textSurnameAdd;

    @FXML
    private ComboBox<String> groupCmbXAdd;

    @FXML
    private Button btnDobAddAdmin;

    @FXML
    private Label lblSuccessAddSotr;




    @FXML
    private AnchorPane sotrudnkAddAP;

    @FXML
    private AnchorPane oborudAddAP;

    @FXML
    private AnchorPane editObBUAP;

    @FXML
    private AnchorPane editObVydannoeAP;

    @FXML
    private AnchorPane editObSkladAP;

    @FXML
    private AnchorPane editSotrAP;

    @FXML
    private AnchorPane deleteObSkladAP;

    @FXML
    private AnchorPane deleteSotrAP;



    @FXML
    private AnchorPane apEdit;

    @FXML
    private AnchorPane apPustyshka;
    @FXML
    private AnchorPane APustyshkaRedaktor;

    @FXML
    private TextField poiskLoginEditStr;

    @FXML
    private Button poiskBtnEditStr;

    @FXML
    private TextField EditSotrTextLogin;

    @FXML
    private TextField EditSotrTextName;

    @FXML
    private TextField EditSotrTextSurname;

    @FXML
    private ComboBox<String> EditSotrCmbBxGroup;

    @FXML
    private Button btnEditSotr;

    @FXML
    private Label EditSotrLblSuccess;

    @FXML
    private CheckBox EditSotrCheckResetPass;



    @FXML
    private TextField textMacAdd1;

    @FXML
    private TextField textNamePrAdd;

    @FXML
    private TextField textInvAdd;

    @FXML
    private TextField textSNAdd;

    @FXML
    private Button btnDobAddOborud;

    @FXML
    private Label lblAddErrorOb;

    @FXML
    private Label lblSuccessAddOb;

    @FXML
    private Label  EditSotrLblError;

    @FXML
    private Label EditSotrLblErrorPoisk;




    @FXML
    private ComboBox<String> comboBxDeleteSotr;

    @FXML
    private Label lblSuccessDeleteSotr;

    @FXML
    private Label labelErrorDeleteSotr;

    @FXML
    private Button btnDeleteSotr;

    @FXML
    private CheckBox chckBxDeleteSotr;

    @FXML
    private Button fileBtn;

    static private Admin admin;
    public static Inventory tempDelete;


    public void eraseAllLabel()
    {
        EditSotrLblErrorPoisk.setText("");
        EditSotrLblSuccess.setText("");
        EditSotrLblError.setText("");
        lblSuccessAddSotr.setText("");
        lblAddErrorOb.setText("");
        lblAddError.setText("");
        ErrorNoteLbl.setText("");
        lblAddError1.setText("");
        lblSuccessAddOb.setText("");
        lblVydachaError.setText("");
        promptLbl.setText("");
        poiskLoginEditStr.setText("");
        lblSuccessDeleteSotr.setText("");
        labelErrorDeleteSotr.setText("");

    }


    public void deleteSotrComboBx()
    {
        ArrayList<Admin> admins1 = Main.getAdminsMethod();
        ArrayList<String> tempStr = new ArrayList<>();
        for (Admin value : admins1) {
            tempStr.add(value.getLogin());
        }
        ObservableList<String> deleteSotr = FXCollections.observableArrayList(tempStr);
        comboBxDeleteSotr.setValue(deleteSotr.get(0));
        comboBxDeleteSotr.setItems(deleteSotr);
    }
    @FXML
    public void handleClicks(javafx.event.ActionEvent event) throws ParseException {
        if (event.getSource() == vydatOborudBtn)
        {
            eraseAllLabel();
            if (chckBxVydacha.isSelected())
            {
                lblVydachaError.setText("");
                dateField.setValue(LocalDate.now());
                if (invTextField.getText().trim().isEmpty() || snTextField.getText().trim().isEmpty() ||
                        nameTextField.getText().trim().isEmpty() || ktoVydalLbl.getText().trim().isEmpty() ||
                        peremechenTextField.getText().trim().isEmpty() || gorodTextField.getText().trim().isEmpty()) {
                    lblVydachaError.setText("[!!!] Заполните все обязательные поля [!!!]");
                }
                else {

                    DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");

                    String inputText = dateField.getValue().toString();
                    Date date = inputFormat.parse(inputText);
                    String outputText = inputFormat.format(date);
                    Inventory inventory = new Inventory(invTextField.getText(), snTextField.getText(),
                            nameTextField.getText(), ktoVydalLbl.getText(), peremechenTextField.getText(), gorodTextField.getText(),
                            outputText, zayavka1CTextField.getText(), nomerNakl1CTextField.getText(),
                            REQTextField.getText(), nomerTransportTextField.getText(),
                            commentsTextField.getText(), MacAddresField.getText());


                    if (typeObPanelPoiskaComboBx.getValue().equals("Склад")) {
                        Main.addInventory(inventory);
                        Main.deleteNewInventory(inventory.getIdInventory());
                        invTextField.setText("");
                        snTextField.setText("");
                        nameTextField.setText("");
                        ktoVydalLbl.setText("");
                        peremechenTextField.setText("");
                        gorodTextField.setText("");
                        REQTextField.setText("");
                        nomerTransportTextField.setText("");
                        commentsTextField.setText("");
                        MacAddresField.setText("");
                    }
                    else if (typeObPanelPoiskaComboBx.getValue().equals("Б/У")) {
                        Main.addInventory(inventory);
                        Main.deleteInventoryBU(inventory.getIdInventory());
                        invTextField.setText("");
                        snTextField.setText("");
                        nameTextField.setText("");
                        ktoVydalLbl.setText("");
                        peremechenTextField.setText("");
                        gorodTextField.setText("");
                        REQTextField.setText("");
                        nomerTransportTextField.setText("");
                        commentsTextField.setText("");
                        MacAddresField.setText("");
                    }
                    lblVydachaError.setText("[+++] Оборудование успешно выданно [+++]");
                }
            }
        }
        else if (event.getSource() == btnPrinyatie) {
            eraseAllLabel();
            gpPrinyat1.toFront();
            gpPrinyat.toFront();
            gpTable.toBack();
        }
        else if (event.getSource() == btnVydacha) {
            eraseAllLabel();
            gpVydacha1.toFront();
            gpVydacha.toFront();
            gpTable.toBack();
        }
        else if (event.getSource() == btnSpisok) {
            eraseAllLabel();
            gpSpisok1.toFront();
            gpSpisok.toFront();
            gpSpisokINV.toFront();
            ArrayList<Inventory> inventories = Main.getInventoryMethod();
            ObservableList<Inventory> observableList1 = FXCollections.observableList(
                    inventories
            );
            invNumber1.setCellValueFactory(new PropertyValueFactory<>("idInventory"));
            SN.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
            name.setCellValueFactory(new PropertyValueFactory<>("product_name"));
            recieved.setCellValueFactory(new PropertyValueFactory<>("recieved"));
            location.setCellValueFactory(new PropertyValueFactory<>("location"));
            date.setCellValueFactory(new PropertyValueFactory<>("date_of_issue"));
            peremech_1C.setCellValueFactory(new PropertyValueFactory<>("peremechenie_1C"));
            nakl_1C.setCellValueFactory(new PropertyValueFactory<>("nakladnaya_1C"));
            kto_vydal.setCellValueFactory(new PropertyValueFactory<>("kto_vydal"));
            REQ.setCellValueFactory(new PropertyValueFactory<>("REQ_number"));
            transportNakl.setCellValueFactory(new PropertyValueFactory<>("transport_nakladnaya"));
            MAC.setCellValueFactory(new PropertyValueFactory<>("macAddress"));
            desc.setCellValueFactory(new PropertyValueFactory<>("description"));

            tableSpisok.setItems(observableList1);


        }
        else if (event.getSource() == btnNastroyiki) {
            eraseAllLabel();
            gpNastroyiki.toFront();
            gpTable.toBack();
        }
        else if (event.getSource() == btnVyhod) {

            lblSuccessAddSotr.setText("");
            btnVyhod.getScene().getWindow().hide();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
                Stage main_menu = new Stage();
                main_menu.setTitle("Hazgar's Application CO");
                main_menu.setScene(new Scene(root, 763, 487)); // размеры нового окна
                main_menu.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (event.getSource() == btnAdd) {
            eraseAllLabel();
            gpAdd1.toFront();
            gpAdd.toFront();
            gpTable.toBack();
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dateField.setValue(LocalDate.now());
        admin = SaverProfile.getProfile();
        ktoVydalLbl.setText(admin.getSurname() + " " + admin.getName());
        profileLbl.setText(admin.getSurname() + " " + admin.getName());
        lblPrinyatName1.setText(admin.getSurname() + " " + admin.getName());
        ObservableList<String> spisok = FXCollections.observableArrayList("Б/У", "Склад");
        typeObPanelPoiskaComboBx.setValue("Склад");
        typeObPanelPoiskaComboBx.setItems(spisok);
        ObservableList<String> spisok1 = FXCollections.observableArrayList("Б/У", "Склад", "Выданное оборудование");
        typeObSpisokComboBx.setValue("Склад");
        typeObSpisokComboBx.setItems(spisok1);
        ObservableList<String> spisok2 = FXCollections.observableArrayList("ИНВ №", "S/N", "Наименование");
        kritSpisokComboBx.setValue("ИНВ №");
        kritSpisokComboBx.setItems(spisok2);


        ObservableList<String> spisokAction =
                FXCollections.observableArrayList(
                        "Добавить сотрудника",
                        "Редактировать сотрудника",
                        "Удалить сотрудника",
                        "Добавить оборудование(склад)");

        /*
         "Редактировать оборудование(склад)",
                        "Удалить оборудование(склад)",
                        "Редактировать оборудование(Б/У)",
                        "Редактировать оборудование(Выданное)"
         */
        comboBxVyborAdd.setValue("Добавить сотрудника");
        comboBxVyborAdd.setItems(spisokAction);
        ObservableList<String> spisokAddUser = FXCollections.observableArrayList("engineer", "admin", "trainei");
        groupCmbXAdd.setValue("engineer");
        groupCmbXAdd.setItems(spisokAddUser);


        ObservableList<String> spisokEditUser = FXCollections.observableArrayList("engineer", "admin", "trainei");
        EditSotrCmbBxGroup.setValue("engineer");
        EditSotrCmbBxGroup.setItems(spisokEditUser);



    }

    private static Admin adminAdd;

    private final Desktop desktop = Desktop.getDesktop();
    private void openFile(File file) {
        try {
            desktop.open(file);
        } catch (IOException ex) {

        }
    }
    @FXML
    public void handleAdd(javafx.event.ActionEvent event)
    {

        if (event.getSource() == btnVyborAdd) {
            Admin admin = SaverProfile.getProfile();
            lblAddErrorOb.setText("");
            String cmb = comboBxVyborAdd.getValue();
            switch (cmb) {
                case "Добавить сотрудника":
                    lblAddError1.setText("");
                    if (admin.getGroup().equals("admin")) {
                        sotrudnkAddAP.toFront();
                        lblAddError.setText("");
                    } else {
                        lblAddError.setText("Недостаточно прав !!!");
                    }
                    break;
                case "Редактировать сотрудника":
                    lblAddError1.setText("");
                    lblAddError.setText("");
                    editSotrAP.toFront();
                    break;
                case "Удалить сотрудника":
                    deleteSotrComboBx();
                    lblAddError1.setText("");
                    lblAddError.setText("");
                    deleteSotrAP.toFront();
                    break;
                case "Добавить оборудование(склад)":
                    lblAddError1.setText("");
                    lblAddError.setText("");
                    oborudAddAP.toFront();
                    break;
                case "Редактировать оборудование(склад)":
                    lblAddError1.setText("");
                    lblAddError.setText("");
                    editObSkladAP.toFront();
                    break;
                case "Удалить оборудование(склад)":
                    lblAddError1.setText("");
                    lblAddError.setText("");
                    deleteObSkladAP.toFront();
                    break;
                case "Редактировать оборудование(Б/У)":
                    lblAddError1.setText("");
                    lblAddError.setText("");
                    editObBUAP.toFront();
                    break;
                case "Редактировать оборудование(Выданное)":
                    lblAddError1.setText("");
                    lblAddError.setText("");
                    editObVydannoeAP.toFront();
                    break;
            }

        }
        else if (event.getSource() == btnDobAddAdmin)
        {
            lblSuccessAddSotr.setText("");
            lblAddErrorOb.setText("");
            if (admin.getGroup().equals("admin")) {
                if (!textLoginAdd.getText().isEmpty() && !textNameAdd.getText().isEmpty() && !textSurnameAdd.getText().isEmpty()) {
                    String pass = String.valueOf("1234".hashCode());
                    Admin adminTemp = new Admin(textLoginAdd.getText(),pass,textNameAdd.getText(),textSurnameAdd.getText(),groupCmbXAdd.getValue());
                    Main.addAdmin(adminTemp);
                    lblSuccessAddSotr.setText("Новый сотрудник успешно добавлен !!!");
                    lblAddErrorOb.setText("");
                    textLoginAdd.setText("");
                    textNameAdd.setText("");
                    textSurnameAdd.setText("");
                    lblAddError1.setText("");
                }
                else {
                    lblSuccessAddSotr.setText("");
                    lblAddErrorOb.setText("");
                    lblSuccessAddOb.setText("");
                    lblAddError1.setText("Заполните все поля !!!");
                }
            }

        }
        else if (event.getSource() == btnDobAddOborud)
        {
            if (admin.getGroup().equals("admin") || admin.getGroup().equals("engineer")) {
                if (!textInvAdd.getText().isEmpty() && !textSNAdd.getText().isEmpty() && !textNamePrAdd.getText().isEmpty() && !textSNAdd.getText().isEmpty())
                {
                    NewInventory newInventory;
                    if (!textMacAdd1.getText().isEmpty())
                    {
                        newInventory = new NewInventory(textInvAdd.getText(), textSNAdd.getText(), textNamePrAdd.getText(), textMacAdd1.getText());
                    }
                    else
                    {
                        newInventory = new NewInventory(textInvAdd.getText(), textSNAdd.getText(), textNamePrAdd.getText(),"-");
                    }
                    textInvAdd.setText("");
                    textSNAdd.setText("");
                    textNamePrAdd.setText("");
                    textMacAdd1.setText("");
                    lblAddErrorOb.setText("");
                    Main.addInventoryNew(newInventory);
                    lblSuccessAddOb.setText("Новое оборудование успешно добавлен !!!");
                }
                else
                {
                    lblSuccessAddOb.setText("");
                    lblAddErrorOb.setText("Заполните все поля !!!");
                }
                }
        }
        else if (event.getSource() == poiskBtnEditStr)
        {
            String s = poiskLoginEditStr.getText();
            ArrayList<Admin> admins = Main.getAdminsMethod();
            int check = 0;
            for (Admin value : admins) {
                if (value.getLogin().equals(s)) {
                    check = 1;
                    adminAdd = value;
                    break;
                }
            }
            if (check == 1)
            {

                apEdit.toFront();
                EditSotrTextLogin.setText(adminAdd.getLogin());
                EditSotrTextName.setText(adminAdd.getName());
                EditSotrTextSurname.setText(adminAdd.getSurname());
                EditSotrCmbBxGroup.setValue(adminAdd.getGroup());


                eraseAllLabel();
            }
            else
            {
                apEdit.toBack();
                EditSotrLblErrorPoisk.setText("Данный пользователь не найден !!!");
            }
        }
        else if (event.getSource() == btnEditSotr)
        {
            String s = String.valueOf("1234".hashCode());
            String a = String.valueOf(EditSotrCmbBxGroup.getValue());
            if (!EditSotrTextLogin.getText().isEmpty() && !EditSotrTextName.getText().isEmpty() && !EditSotrTextSurname.getText().isEmpty())
            {
                if (EditSotrCheckResetPass.isSelected()) {
                    Admin admin11 = new Admin(adminAdd.getId(), EditSotrTextLogin.getText(), s, EditSotrTextName.getText(), EditSotrTextSurname.getText(), a);
                    Main.updateAdmin(admin11);
                }
                else {

                    Admin admin11 = new Admin(adminAdd.getId(), EditSotrTextLogin.getText(), SaverProfile.getProfile().getPass(), EditSotrTextName.getText(), EditSotrTextSurname.getText(), a);
                    Main.updateAdmin(admin11);
                }
                EditSotrTextLogin.setText("");
                EditSotrTextName.setText("");
                EditSotrTextSurname.setText("");
                EditSotrLblSuccess.setText("Успешно обновленно !!!");
                EditSotrLblError.setText("");
            }
            else
            {
                EditSotrLblSuccess.setText("");
                EditSotrLblError.setText("Заполните все поля !!!");
            }
        }
        else if (event.getSource() == btnDeleteSotr)
        {
            Admin adminTemp = SaverProfile.getProfile();
            if (adminTemp.getGroup().equals("admin"))
            {
                if (chckBxDeleteSotr.isSelected())
                {
                    ArrayList <Admin> admins = Main.getAdminsMethod();
                    String id = "0";
                    for (Admin value : admins) {
                        if (comboBxDeleteSotr.getValue().equals(value.getLogin())) {
                            id = String.valueOf(value.getId());
                        }
                    }
                    Main.deleteAdmin(id);
                    lblSuccessDeleteSotr.setText("Успешно удаленно !!!");
                    labelErrorDeleteSotr.setText(" ");
                    deleteSotrComboBx();
                }
                else
                {

                    lblSuccessDeleteSotr.setText(" ");
                    labelErrorDeleteSotr.setText("Проверьте данные !!!");
                }
            }
            else
            {
                labelErrorDeleteSotr.setText("Недостаточно прав !!!");
            }
        }
        else if (event.getSource() == fileBtn)
        {
            final FileChooser fileChooser = new FileChooser();
            File file = fileChooser.showOpenDialog(null);
            if (file != null) {
                Main.addInventoryNewFile(file);
                openFile(file);
            }
        }
    }

    @FXML
    public void changePass(javafx.event.ActionEvent event) throws IOException {
        String temp = String.valueOf("1234".hashCode());
        if(event.getSource() == changePassBtn)
        {
            EditSotrLblSuccess.setText("");
            EditSotrLblError.setText("");
            Admin admin = SaverProfile.getProfile();
            if (admin.getPass().equals(temp))
            {
                Parent settingsParent = FXMLLoader.load(this.getClass().getResource("changePass.fxml"));
                Scene settingsScene = new Scene(settingsParent);
                Stage popup = new Stage();
                popup.setScene(settingsScene);
                popup.setTitle("Смена пароля");
                popup.initModality(Modality.WINDOW_MODAL);
                popup.initStyle(StageStyle.TRANSPARENT); //Чтобы не было закрыть свернуть и полный экран
                popup.initOwner(changePassBtn.getScene().getWindow());
                popup.show();
            }
            else
            {
                Parent settingsParent = FXMLLoader.load(this.getClass().getResource("changePass.fxml"));
                Scene settingsScene = new Scene(settingsParent);
                Stage popup = new Stage();
                popup.setScene(settingsScene);
                popup.setTitle("Смена пароля");
                popup.initModality(Modality.WINDOW_MODAL);
                popup.initOwner(changePassBtn.getScene().getWindow());
                popup.show();
            }
        }
    }


    @FXML
    public void handleNotifications(javafx.event.ActionEvent event) {

        if (event.getSource() == notificationsButton) {
            EditSotrLblSuccess.setText("");
            EditSotrLblError.setText("");
            //panePustyshkaNote.toFront();
            ArrayList<Inventory> inventory11 = Main.getInventoryMethod();
            ArrayList<Inventory> temp1 = new ArrayList<>();
            for (Inventory inventory : inventory11) {
                if (inventory.getKto_vydal().equals(admin.getSurname() + " " + admin.getName())) {
                    if (inventory.getPeremechenie_1C().trim().isEmpty() || inventory.getNakladnaya_1C().trim().isEmpty() ||
                            inventory.getREQ_number().trim().isEmpty() || inventory.getTransport_nakladnaya().trim().isEmpty() ||
                            inventory.getDescription().trim().isEmpty() || inventory.getMacAddress().trim().isEmpty()) {
                        try {
                            temp1.add(inventory);
                        } catch (NullPointerException e) {
                            e.printStackTrace();
                        }
                    }


                }
            }
            if (!temp1.isEmpty()) {
                ObservableList<Inventory> observableList = FXCollections.observableList(
                        temp1
                );
                invNumberColNot.setCellValueFactory(new PropertyValueFactory<>("idInventory"));
                SNColNot.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
                nameColNot.setCellValueFactory(new PropertyValueFactory<>("product_name"));
                recievedColNot.setCellValueFactory(new PropertyValueFactory<>("recieved"));
                locationColNot.setCellValueFactory(new PropertyValueFactory<>("location"));
                dateColNot.setCellValueFactory(new PropertyValueFactory<>("date_of_issue"));
                peremech_1CColNot.setCellValueFactory(new PropertyValueFactory<>("peremechenie_1C"));
                nakl_1CColNot.setCellValueFactory(new PropertyValueFactory<>("nakladnaya_1C"));
                kto_vydalColNot.setCellValueFactory(new PropertyValueFactory<>("kto_vydal"));
                REQColNot.setCellValueFactory(new PropertyValueFactory<>("REQ_number"));
                transportNaklColNot.setCellValueFactory(new PropertyValueFactory<>("transport_nakladnaya"));
                MACColNot.setCellValueFactory(new PropertyValueFactory<>("macAddress"));
                descColNot.setCellValueFactory(new PropertyValueFactory<>("description"));

                try {
                    tableNotifications.setItems(observableList);
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }

            }
            gpNotifications.toFront();
            gpNotifications1.toFront();
            successNoteLbl.setText("");
        }
        else if (event.getSource() == vyborBtnNote1) {
            Inventory tempNote = null;
            tempNote = tableNotifications.getSelectionModel().getSelectedItem();
            if (tempNote != null)
            {
                if (tempNote.getIdInventory() != null) {
                    invTextFieldNote.setText(tempNote.getIdInventory());
                    nameTextFieldNote.setText(tempNote.getProduct_name());
                    snTextFieldNote.setText(tempNote.getSerial_number());
                    peremechenTextFieldNote.setText(tempNote.getRecieved());
                    gorodTextFieldNote.setText(tempNote.getLocation());
                    zayavka1CTextFieldNote.setText(tempNote.getPeremechenie_1C());
                    nomerNakl1CTextFieldNote.setText(tempNote.getNakladnaya_1C());
                    REQTextFieldNote.setText(tempNote.getREQ_number());
                    nomerTransportTextFieldNote.setText(tempNote.getTransport_nakladnaya());
                    commentsTextFieldNote.setText(tempNote.getDescription());
                    dateFieldNote.setText(tempNote.getDate_of_issue());
                    ktoVydalLblNote.setText(tempNote.getKto_vydal());
                    MacAddresFieldNote.setText(tempNote.getMacAddress());
                    paneEditNote.toFront();
                }
            }
        }
        else if (event.getSource() == saveBtnNote) {
            if(checkBxNote.isSelected())
            {
                Inventory temp = new Inventory(invTextFieldNote.getText(), snTextFieldNote.getText(), nameTextFieldNote.getText(),
                        ktoVydalLblNote.getText(), peremechenTextFieldNote.getText(), gorodTextFieldNote.getText(), dateFieldNote.getText(),
                        zayavka1CTextFieldNote.getText(), nomerNakl1CTextFieldNote.getText(), REQTextFieldNote.getText(), nomerTransportTextFieldNote.getText(),
                        commentsTextFieldNote.getText(), MacAddresFieldNote.getText());
                Main.updateInventory(temp);
                paneEditNote.toBack();
                ErrorNoteLbl.setText("");
                successNoteLbl.setText("Информация успешно обновлена");
            }
            else
            {
                ErrorNoteLbl.setText("[!!!]   Заполните всее поля   [!!!]");
            }
        }
        else if (event.getSource() == helpBtnNote)
        {
            paneSpravka.toFront();
        }
    }


    @FXML
    public void handlePoiskInSpisok(javafx.event.ActionEvent event) {
        // панель поиска в меню SPISOK
        if (event.getSource() == btnPoiskTable) {
            String input = inputSpisokTextField.getText();
            String kritSpisok = kritSpisokComboBx.getValue();
            if (typeObSpisokComboBx.getValue().equals("Склад") && !inputSpisokTextField.getText().trim().isEmpty()) {
                ArrayList<NewInventory> newInventories = Main.getNewInventoryMethod();
                if (kritSpisok.equals("ИНВ №")) {
                    gpSpisokINV.toFront();
                    ArrayList<Inventory> temp = new ArrayList<>();
                    int check = 0;
                    for (NewInventory newInventory : newInventories) {
                        if (newInventory.getIdInventory().equals(input) || newInventory.getIdInventory().contains(input)) {
                            Inventory temp2 = new Inventory(newInventory.getIdInventory(), newInventory.getSerial_number(), newInventory.getProduct_name(), null, null, null, null, null, null, null, null, null, newInventory.getMacAddress());
                            temp.add(temp2);
                            check = 1;
                        }
                    }
                    if (check == 1)
                    {
                        ObservableList<Inventory> observableList = FXCollections.observableList(
                                temp
                        );
                        invNumber1.setCellValueFactory(new PropertyValueFactory<>("idInventory"));
                        SN.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
                        name.setCellValueFactory(new PropertyValueFactory<>("product_name"));
                        MAC.setCellValueFactory(new PropertyValueFactory<>("macAddress"));
                        //desc.setCellValueFactory(new PropertyValueFactory<>("description"));

                        tableSpisok.setItems(observableList);
                    }
                }
                else if (kritSpisok.equals("S/N")) {
                    int check = 0;
                    ArrayList<Inventory> temp = new ArrayList<>();
                    for (NewInventory newInventory : newInventories) {
                        if (newInventory.getSerial_number().equals(input) || newInventory.getSerial_number().contains(input)) {
                            Inventory temp2 = new Inventory(newInventory.getIdInventory(), newInventory.getSerial_number(), newInventory.getProduct_name(), null, null, null, null, null, null, null, null, null, newInventory.getMacAddress());
                            temp.add(temp2);
                            check = 1;
                        }
                    }
                    if (check == 1)
                    {
                        ObservableList<Inventory> observableList = FXCollections.observableList(
                                temp
                        );
                        invNumber1.setCellValueFactory(new PropertyValueFactory<>("idInventory"));
                        SN.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
                        name.setCellValueFactory(new PropertyValueFactory<>("product_name"));
                        MAC.setCellValueFactory(new PropertyValueFactory<>("macAddress"));
                        //desc.setCellValueFactory(new PropertyValueFactory<>("description"));

                        tableSpisok.setItems(observableList);
                    }
                }
                else {
                    ArrayList<Inventory> temp = new ArrayList<>();
                    int check = 0;
                    for (NewInventory newInventory : newInventories) {
                        if (newInventory.getProduct_name().equals(input) || newInventory.getProduct_name().contains(input)) {
                            Inventory temp2 = new Inventory(newInventory.getIdInventory(), newInventory.getSerial_number(), newInventory.getProduct_name(), null, null, null, null, null, null, null, null, null, newInventory.getMacAddress());
                            temp.add(temp2);
                            check = 1;
                        }
                    }
                    if (check == 1)
                    {
                        ObservableList<Inventory> observableList = FXCollections.observableList(
                                temp
                        );
                        invNumber1.setCellValueFactory(new PropertyValueFactory<>("idInventory"));
                        SN.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
                        name.setCellValueFactory(new PropertyValueFactory<>("product_name"));
                        MAC.setCellValueFactory(new PropertyValueFactory<>("macAddress"));
                        //desc.setCellValueFactory(new PropertyValueFactory<>("description"));

                        tableSpisok.setItems(observableList);
                    }
                }


            }
            else if (typeObSpisokComboBx.getValue().equals("Б/У") && !inputSpisokTextField.getText().trim().isEmpty()) {
                gpSpisokBU.toFront();
                ArrayList<InventoryBU> inventoryBU1 = Main.getBUInventoryMethod();
                if (kritSpisok.equals("ИНВ №")) {
                    int check = 0;
                    ArrayList<InventoryBU> temp = new ArrayList<>();
                    for (InventoryBU inventory : inventoryBU1) {
                        if (inventory.getIdinventory().equals(input) || inventory.getIdinventory().contains(input)) {
                            temp.add(inventory);
                            check = 1;
                        }
                    }
                    if (check == 1) {
                        ObservableList<InventoryBU> observableList = FXCollections.observableList(
                                temp
                        );

                        invBUSpisok.setCellValueFactory(new PropertyValueFactory<>("idinventory"));
                        SNBUSpisok.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
                        nameBUSpisok.setCellValueFactory(new PropertyValueFactory<>("product_name"));
                        prinaylBUSpisok.setCellValueFactory(new PropertyValueFactory<>("kto_prinayl"));
                        sdalBUSpisok.setCellValueFactory(new PropertyValueFactory<>("kto_sdal"));
                        macBUSpisok.setCellValueFactory(new PropertyValueFactory<>("macAddress"));


                        tableSpisokBU.setItems(observableList);
                    }
                }
                else if (kritSpisok.equals("S/N")) {
                    int check = 0;
                    ArrayList<InventoryBU> temp = new ArrayList<>();
                    for (InventoryBU inventory : inventoryBU1) {

                        if (inventory.getSerial_number().equals(input) || inventory.getSerial_number().contains(input)) {
                            temp.add(inventory);
                            check = 1;
                        }
                    }
                    if (check == 1) {
                        ObservableList<InventoryBU> observableList = FXCollections.observableList(
                                temp
                        );

                        invBUSpisok.setCellValueFactory(new PropertyValueFactory<>("idinventory"));
                        SNBUSpisok.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
                        nameBUSpisok.setCellValueFactory(new PropertyValueFactory<>("product_name"));
                        prinaylBUSpisok.setCellValueFactory(new PropertyValueFactory<>("kto_prinayl"));
                        sdalBUSpisok.setCellValueFactory(new PropertyValueFactory<>("kto_sdal"));
                        macBUSpisok.setCellValueFactory(new PropertyValueFactory<>("macAddress"));

                        tableSpisokBU.setItems(observableList);
                    }
                }
                else {
                    ArrayList<InventoryBU> temp = new ArrayList<>();
                    int check = 0;
                    for (InventoryBU inventory : inventoryBU1) {
                        if (inventory.getProduct_name().equals(input) || inventory.getProduct_name().contains(input)) {
                            temp.add(inventory);
                            check = 1;
                        }
                    }
                    if (check == 1) {
                        ObservableList<InventoryBU> observableList = FXCollections.observableList(
                                temp
                        );

                        invBUSpisok.setCellValueFactory(new PropertyValueFactory<>("idinventory"));
                        SNBUSpisok.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
                        nameBUSpisok.setCellValueFactory(new PropertyValueFactory<>("product_name"));
                        prinaylBUSpisok.setCellValueFactory(new PropertyValueFactory<>("kto_prinayl"));
                        sdalBUSpisok.setCellValueFactory(new PropertyValueFactory<>("kto_sdal"));
                        macBUSpisok.setCellValueFactory(new PropertyValueFactory<>("macAddress"));

                        tableSpisokBU.setItems(observableList);
                    }

                }
            }
            else if (typeObSpisokComboBx.getValue().equals("Выданное оборудование") && !inputSpisokTextField.getText().trim().isEmpty()) {
                gpSpisokINV.toFront();
                ArrayList<Inventory> inventories = Main.getInventoryMethod();
                if (kritSpisok.equals("ИНВ №")) {
                    int check = 0;
                    ArrayList<Inventory> temp = new ArrayList<>();
                    for (Inventory inventory : inventories) {
                        if (inventory.getIdInventory().equals(input) || inventory.getIdInventory().contains(input)) {
                            temp.add(inventory);
                            check = 1;
                        }
                    }
                    if (check == 1)
                    {
                        ObservableList<Inventory> observableList = FXCollections.observableList(
                                temp
                        );

                        invNumber1.setCellValueFactory(new PropertyValueFactory<>("idInventory"));
                        SN.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
                        name.setCellValueFactory(new PropertyValueFactory<>("product_name"));
                        recieved.setCellValueFactory(new PropertyValueFactory<>("recieved"));
                        location.setCellValueFactory(new PropertyValueFactory<>("location"));
                        date.setCellValueFactory(new PropertyValueFactory<>("date_of_issue"));
                        peremech_1C.setCellValueFactory(new PropertyValueFactory<>("peremechenie_1C"));
                        nakl_1C.setCellValueFactory(new PropertyValueFactory<>("nakladnaya_1C"));
                        kto_vydal.setCellValueFactory(new PropertyValueFactory<>("kto_vydal"));
                        REQ.setCellValueFactory(new PropertyValueFactory<>("REQ_number"));
                        transportNakl.setCellValueFactory(new PropertyValueFactory<>("transport_nakladnaya"));
                        MAC.setCellValueFactory(new PropertyValueFactory<>("macAddress"));
                        desc.setCellValueFactory(new PropertyValueFactory<>("description"));

                        tableSpisok.setItems(observableList);
                    }
                }
                else if (kritSpisok.equals("S/N")) {
                    int check = 0;
                    ArrayList<Inventory> temp = new ArrayList<>();
                    for (Inventory inventory : inventories) {
                        if (inventory.getSerial_number().equals(input) || inventory.getSerial_number().contains(input)) {
                            check = 1;
                            temp.add(inventory);
                        }
                    }
                    if (check == 1)
                    {
                        ObservableList<Inventory> observableList = FXCollections.observableList(
                                temp
                        );

                        invNumber1.setCellValueFactory(new PropertyValueFactory<>("idInventory"));
                        SN.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
                        name.setCellValueFactory(new PropertyValueFactory<>("product_name"));
                        recieved.setCellValueFactory(new PropertyValueFactory<>("recieved"));
                        location.setCellValueFactory(new PropertyValueFactory<>("location"));
                        date.setCellValueFactory(new PropertyValueFactory<>("date_of_issue"));
                        peremech_1C.setCellValueFactory(new PropertyValueFactory<>("peremechenie_1C"));
                        nakl_1C.setCellValueFactory(new PropertyValueFactory<>("nakladnaya_1C"));
                        kto_vydal.setCellValueFactory(new PropertyValueFactory<>("kto_vydal"));
                        REQ.setCellValueFactory(new PropertyValueFactory<>("REQ_number"));
                        transportNakl.setCellValueFactory(new PropertyValueFactory<>("transport_nakladnaya"));
                        MAC.setCellValueFactory(new PropertyValueFactory<>("macAddress"));
                        desc.setCellValueFactory(new PropertyValueFactory<>("description"));

                        tableSpisok.setItems(observableList);
                    }
                }
                else {
                    ArrayList<Inventory> temp = new ArrayList<>();
                    int check = 0;
                    for (Inventory inventory : inventories) {
                        if (inventory.getProduct_name().equals(input) || inventory.getProduct_name().contains(input)) {
                            check = 1;
                            temp.add(inventory);
                        }
                    }

                    if (check ==1)
                    {
                        ObservableList<Inventory> observableList = FXCollections.observableList(
                                temp
                        );

                        invNumber1.setCellValueFactory(new PropertyValueFactory<>("idInventory"));
                        SN.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
                        name.setCellValueFactory(new PropertyValueFactory<>("product_name"));
                        recieved.setCellValueFactory(new PropertyValueFactory<>("recieved"));
                        location.setCellValueFactory(new PropertyValueFactory<>("location"));
                        date.setCellValueFactory(new PropertyValueFactory<>("date_of_issue"));
                        peremech_1C.setCellValueFactory(new PropertyValueFactory<>("peremechenie_1C"));
                        nakl_1C.setCellValueFactory(new PropertyValueFactory<>("nakladnaya_1C"));
                        kto_vydal.setCellValueFactory(new PropertyValueFactory<>("kto_vydal"));
                        REQ.setCellValueFactory(new PropertyValueFactory<>("REQ_number"));
                        transportNakl.setCellValueFactory(new PropertyValueFactory<>("transport_nakladnaya"));
                        MAC.setCellValueFactory(new PropertyValueFactory<>("macAddress"));
                        desc.setCellValueFactory(new PropertyValueFactory<>("description"));

                        tableSpisok.setItems(observableList);
                    }
                }
            }


            else if (typeObSpisokComboBx.getValue().equals("Склад")) {
                ArrayList<NewInventory> newInventories = Main.getNewInventoryMethod();

                gpSpisokINV.toFront();
                ArrayList<Inventory> temp = new ArrayList<>();
                for (NewInventory newInventory : newInventories) {
                    Inventory temp2 = new Inventory(newInventory.getIdInventory(), newInventory.getSerial_number(), newInventory.getProduct_name(), null, null, null, null, null, null, null, null, null, newInventory.getMacAddress());
                    temp.add(temp2);
                }
                ObservableList<Inventory> observableList = FXCollections.observableList(
                        temp
                );
                invNumber1.setCellValueFactory(new PropertyValueFactory<>("idInventory"));
                SN.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
                name.setCellValueFactory(new PropertyValueFactory<>("product_name"));
                MAC.setCellValueFactory(new PropertyValueFactory<>("macAddress"));
                //desc.setCellValueFactory(new PropertyValueFactory<>("description"));

                tableSpisok.setItems(observableList);
            }
            else if (typeObSpisokComboBx.getValue().equals("Б/У")) {
                gpSpisokBU.toFront();
                ArrayList<InventoryBU> inventoryBU1 = Main.getBUInventoryMethod();


                ObservableList<InventoryBU> observableList = FXCollections.observableList(
                        inventoryBU1
                );

                invBUSpisok.setCellValueFactory(new PropertyValueFactory<>("idinventory"));
                SNBUSpisok.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
                nameBUSpisok.setCellValueFactory(new PropertyValueFactory<>("product_name"));
                prinaylBUSpisok.setCellValueFactory(new PropertyValueFactory<>("kto_prinayl"));
                sdalBUSpisok.setCellValueFactory(new PropertyValueFactory<>("kto_sdal"));
                macBUSpisok.setCellValueFactory(new PropertyValueFactory<>("macAddress"));


                tableSpisokBU.setItems(observableList);


            }
            else if (typeObSpisokComboBx.getValue().equals("Выданное оборудование")) {
                gpSpisokINV.toFront();
                ArrayList<Inventory> inventories = Main.getInventoryMethod();
                ObservableList<Inventory> observableList = FXCollections.observableList(
                        inventories
                );
                invNumber1.setCellValueFactory(new PropertyValueFactory<>("idInventory"));
                SN.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
                name.setCellValueFactory(new PropertyValueFactory<>("product_name"));
                recieved.setCellValueFactory(new PropertyValueFactory<>("recieved"));
                location.setCellValueFactory(new PropertyValueFactory<>("location"));
                date.setCellValueFactory(new PropertyValueFactory<>("date_of_issue"));
                peremech_1C.setCellValueFactory(new PropertyValueFactory<>("peremechenie_1C"));
                nakl_1C.setCellValueFactory(new PropertyValueFactory<>("nakladnaya_1C"));
                kto_vydal.setCellValueFactory(new PropertyValueFactory<>("kto_vydal"));
                REQ.setCellValueFactory(new PropertyValueFactory<>("REQ_number"));
                transportNakl.setCellValueFactory(new PropertyValueFactory<>("transport_nakladnaya"));
                MAC.setCellValueFactory(new PropertyValueFactory<>("macAddress"));
                desc.setCellValueFactory(new PropertyValueFactory<>("description"));
                tableSpisok.setItems(observableList);

            }
        }
    }


    @FXML
    public void handlePoiskInTable(javafx.event.ActionEvent event) {
        // панель поиска в меню выдачи
        if (event.getSource() == poiskObBtn) {
            if (typeObPanelPoiskaComboBx.getValue().equals("Склад") && !invPoiskTextField.getText().isEmpty()) {
                ArrayList<NewInventory> newInventories = Main.getNewInventoryMethod();
                ArrayList<NewInventory> temp = new ArrayList<>();
                int check = 0;
                for (NewInventory newInventory : newInventories) {
                    if (newInventory.getIdInventory().equals(invPoiskTextField.getText()) || newInventory.getIdInventory().contains(invPoiskTextField.getText())) {
                        temp.add(newInventory);
                        check = 1;
                    }
                }
                if (check == 1)
                {
                    ObservableList<NewInventory> observableListNew = FXCollections.observableList(
                            temp
                    );
                    paneNewVydacha.toFront();
                    colInv.setCellValueFactory(new PropertyValueFactory<>("idInventory"));
                    colSN.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
                    colName.setCellValueFactory(new PropertyValueFactory<>("product_name"));
                    colMac.setCellValueFactory(new PropertyValueFactory<>("macAddress"));

                    tablePoisk.setItems(observableListNew);
                }
            }
            else if (typeObPanelPoiskaComboBx.getValue().equals("Б/У") && !invPoiskTextField.getText().isEmpty()) {

                ArrayList<InventoryBU> newInventories = Main.getBUInventoryMethod();
                ArrayList<InventoryBU> temp = new ArrayList<>();
                int check = 0;
                for (InventoryBU buInventory : newInventories) {
                    if (buInventory.getIdinventory().equals(invPoiskTextField.getText()) || buInventory.getIdinventory().contains(invPoiskTextField.getText())) {
                        check = 1;
                        temp.add(buInventory);
                    }
                }
                if (check == 1)
                {
                    ObservableList<InventoryBU> observableListBU = FXCollections.observableList(
                            temp
                    );
                    paneNewVydacha.toBack();
                    paneBuVydacha.toFront();
                    colBUInv.setCellValueFactory(new PropertyValueFactory<>("idinventory"));
                    colBUISN.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
                    colBUName.setCellValueFactory(new PropertyValueFactory<>("product_name"));
                    colBUPrinyal.setCellValueFactory(new PropertyValueFactory<>("kto_prinayl"));
                    colBUSdal.setCellValueFactory(new PropertyValueFactory<>("kto_sdal"));
                    colBUMAC.setCellValueFactory(new PropertyValueFactory<>("macAddress"));
                    tableVydachaBU.setItems(observableListBU);
                }


            }
            else if (typeObPanelPoiskaComboBx.getValue().equals("Б/У")) {
                ArrayList<InventoryBU> newInventories = Main.getBUInventoryMethod();
                ObservableList<InventoryBU> observableListBU1 = FXCollections.observableList(
                        newInventories
                );
                paneNewVydacha.toBack();
                paneBuVydacha.toFront();
                colBUInv.setCellValueFactory(new PropertyValueFactory<>("idinventory"));
                colBUISN.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
                colBUName.setCellValueFactory(new PropertyValueFactory<>("product_name"));
                colBUPrinyal.setCellValueFactory(new PropertyValueFactory<>("kto_prinayl"));
                colBUSdal.setCellValueFactory(new PropertyValueFactory<>("kto_sdal"));
                colBUMAC.setCellValueFactory(new PropertyValueFactory<>("macAddress"));
                tableVydachaBU.setItems(observableListBU1);
            }
            else if (typeObPanelPoiskaComboBx.getValue().equals("Склад")) {

                ArrayList<NewInventory> newInventories = Main.getNewInventoryMethod();
                ObservableList<NewInventory> observableListNew1 = FXCollections.observableList(
                        newInventories
                );
                paneNewVydacha.toFront();
                colInv.setCellValueFactory(new PropertyValueFactory<>("idInventory"));
                colSN.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
                colName.setCellValueFactory(new PropertyValueFactory<>("product_name"));
                colMac.setCellValueFactory(new PropertyValueFactory<>("macAddress"));
                tablePoisk.setItems(observableListNew1);

            }
        }
        else if (event.getSource() == vydachaVyborPanelPoikaBtnBu)
        {
            InventoryBU tempNote = tableVydachaBU.getSelectionModel().getSelectedItem();
            if(tempNote.getIdinventory()!= null) {
                nameTextField.setText(tempNote.getProduct_name());
                invTextField.setText(tempNote.getIdinventory());
                snTextField.setText(tempNote.getSerial_number());
                tableVydachaBU.getItems().clear();
                panePustyshVydacha.toFront();
            }
        }
        else if (event.getSource() == vydachaVyborPanelPoikaBtnNew) {
            NewInventory tempNote = tablePoisk.getSelectionModel().getSelectedItem();
            if (tempNote.getIdInventory() != null) {

                nameTextField.setText(tempNote.getProduct_name());
                invTextField.setText(tempNote.getIdInventory());
                snTextField.setText(tempNote.getSerial_number());
                tableVydachaBU.getItems().clear();
                panePustyshVydacha.toFront();
            }

        }

    }


    @FXML
    public void handlePoiskInPrinyat(javafx.event.ActionEvent event) {
        //в меню принятия
        //Inventory tempDelete = null;
        String prompt = "[!!!]   Оборудование не найдено   [!!!]";
        int check = 0;
        if (event.getSource() == poiskBtn) {
            ArrayList<Inventory> inventories = Main.getInventoryMethod();
            ArrayList<Inventory> temp = new ArrayList<>();
            for (Inventory inventory : inventories) {
                if (inventory.getIdInventory().equals(invNumber.getText()) || inventory.getIdInventory().contains(invNumber.getText())) {
                    check = 1;
                    temp.add(inventory);
                }

            }

            if (check == 1) {
                promptLbl.setText("");
                gpTable.toFront();
                ObservableList<Inventory> observableList = FXCollections.observableList(
                        temp
                );

                prnColInv.setCellValueFactory(new PropertyValueFactory<>("idInventory"));
                prnColSN.setCellValueFactory(new PropertyValueFactory<>("serial_number"));
                prnColName.setCellValueFactory(new PropertyValueFactory<>("product_name"));
                prnColRecieved.setCellValueFactory(new PropertyValueFactory<>("recieved"));
                prnColLocation.setCellValueFactory(new PropertyValueFactory<>("location"));
                prnColDate.setCellValueFactory(new PropertyValueFactory<>("date_of_issue"));
                prnColPeremechenie.setCellValueFactory(new PropertyValueFactory<>("peremechenie_1C"));
                prnColNakl.setCellValueFactory(new PropertyValueFactory<>("nakladnaya_1C"));
                prnColKto_vydald.setCellValueFactory(new PropertyValueFactory<>("kto_vydal"));
                prnColREQ.setCellValueFactory(new PropertyValueFactory<>("REQ_number"));
                prnColTransport.setCellValueFactory(new PropertyValueFactory<>("transport_nakladnaya"));
                prnColMAC.setCellValueFactory(new PropertyValueFactory<>("macAddress"));
                prnColDesc1.setCellValueFactory(new PropertyValueFactory<>("description"));
                tableSpisok1.setItems(observableList);
            } else {
                // paneLblPrinyat.toFront();
                gpTable.toBack();
                promptLbl.setText(prompt);
            }

        }
        else if (event.getSource() == prinyatObBtn) {
            if (checkBxPrinyat.isSelected()) {
                tempDelete = tableSpisok1.getSelectionModel().getSelectedItem();
                InventoryBU temp = new InventoryBU(tempDelete.getIdInventory(),
                        tempDelete.getSerial_number(), tempDelete.getProduct_name(),
                        lblPrinyatName1.getText(), tempDelete.getRecieved(), tempDelete.getMacAddress());
                Main.deleteInventory(temp.getIdinventory());
                Main.addInventoryBU(temp);
                gpPustyshka.toFront();
            } else {
                checkBxPrinyat.applyCss();
            }

        }

    }

}
