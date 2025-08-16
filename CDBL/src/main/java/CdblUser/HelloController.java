package CdblUser;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;

public class HelloController {

    @FXML
    private Label idField;
    @FXML
    private Button loginButton;
    @FXML
    private Button frgtpaswrdButton;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField UserIDField;
    @FXML
    private Label idField1;
    @FXML
    private ComboBox<String> UserTypeComboBox;

    ArrayList<BankManager> bankManagerArrayList;
    ArrayList<IndividualInvestor> individualInvestorArrayList;
    @FXML
    private AnchorPane mainPane;
    private String s;

    @FXML
    public void initialize() {
        UserTypeComboBox.getItems().addAll("Bank Manager", "Individual Investor");
    }

    @FXML
    void onfrgtpaswrdButtonClick(ActionEvent event) {

    }

    @FXML
    void onloginButtonClick(ActionEvent event) {


    }

    public void onfrgtpaswrdButtonClick(javafx.event.ActionEvent actionEvent) {
    }

    public void onloginButtonClick(javafx.event.ActionEvent actionEvent) {
        loadFXML("CdblUser/BankManagerDashboard.fxml");
    }
    private void loadFXML(String s) {

        try {


            FXMLLoader loader = new FXMLLoader(getClass().getResource("BankManagerDashboard.fxml"));
            AnchorPane pane = loader.load();
            mainPane.getChildren().setAll(pane); // Replace the content of the mainPane with the loaded FXML
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
