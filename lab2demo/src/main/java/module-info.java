module com.example.lab2demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab2demo to javafx.fxml;
    exports com.example.lab2demo;
}