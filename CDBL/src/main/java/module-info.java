module com.example.CDBL {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens CdblUser to javafx.fxml;
    exports CdblUser;
}