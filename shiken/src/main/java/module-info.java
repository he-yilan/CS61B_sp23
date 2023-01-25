module com.example.shiken {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.shiken to javafx.fxml;
    exports com.example.shiken;
}