module com.example.comparator {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens com.example.comparator to javafx.fxml;
    exports com.example.comparator;
}