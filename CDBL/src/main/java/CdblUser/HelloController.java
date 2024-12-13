package CdblUser;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.awt.event.ActionEvent;
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
        String UserType, id, Password;
        UserType = UserTypeComboBox.getValue();
        id = UserIDField.getText();
        Password = passwordField.getText();
        if (UserType == "Bank Manager" ) {
            for (BankManager bankManager : bankManagerArrayList) {

            }

        }
        else if (UserType == "Individual Investor" ) {
            for (IndividualInvestor investor : individualInvestorArrayList) {
                if (User.loginVR(id, Password));
            }

        }
        else if (id.length() == 5) {

        }

    }

    @Deprecated
    public void onActionUserTypeComboBoxClick(ActionEvent actionEvent) {
    }
}


