module com.example.lesson1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson1 to javafx.fxml;
    exports com.example.lesson1;
}