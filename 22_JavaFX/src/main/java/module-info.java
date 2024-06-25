module com.example._javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._javafx to javafx.fxml;
    exports com.example._javafx;
}