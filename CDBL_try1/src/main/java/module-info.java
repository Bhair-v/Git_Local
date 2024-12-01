module com.example.cdbl_try1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cdbl_try1 to javafx.fxml;
    exports com.example.cdbl_try1;
}