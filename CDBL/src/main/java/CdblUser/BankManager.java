package CdblUser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;


public class BankManager {
    @javafx.fxml.FXML
    private Button AssignRelationshipOfficerButton;
    @javafx.fxml.FXML
    private TextField BankTextField;
    @javafx.fxml.FXML
    private Button openBOaccountButton;
    @javafx.fxml.FXML
    private TextField BankManagerIDTextField;
    @javafx.fxml.FXML
    private Button generateTaxReportButton;
    @javafx.fxml.FXML
    private Button GenarateComplianceReportButton;
    @javafx.fxml.FXML
    private TextField BankBranchTextField;
    @javafx.fxml.FXML
    private Button updateClientInfoButton;
    @javafx.fxml.FXML
    private Button RespondToInquiryButton;
    @javafx.fxml.FXML
    private Button TransferSecuritiesButton;
    @javafx.fxml.FXML
    private AnchorPane mainPane;


    @javafx.fxml.FXML
    public void onActionTransferSecuritiesButtonClick(ActionEvent actionEvent) {
        loadFXML("TransferSecurities.fxml");
    }

    @javafx.fxml.FXML
    public void onActionOpenBOaccountButtonClick(ActionEvent actionEvent) {
        loadFXML("CreateBOAccount.fxml");
    }

    private void loadFXML(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            AnchorPane pane = loader.load();
            mainPane.getChildren().setAll(pane); // Replace the content of the mainPane with the loaded FXML
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void onActiongenerateTaxReportButtonClick(ActionEvent actionEvent) {
        loadFXML("GenerateTaxReport.fxml");
    }

    @javafx.fxml.FXML
    public void onActionAssignRelationshipOfficerButtonClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onActionRespondToInquiryButtonClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onActionGenarateComplianceReportButtonClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onActionupdateClientInfoButtonClick(ActionEvent actionEvent) {
    }
}
