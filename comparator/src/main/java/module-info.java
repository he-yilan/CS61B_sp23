module com.example.comparator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comparator to javafx.fxml;
    exports com.example.comparator;
}