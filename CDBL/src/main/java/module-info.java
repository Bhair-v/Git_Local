module com.example.CDBL {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.CDBL to javafx.fxml;
    exports com.example.CDBL;
}