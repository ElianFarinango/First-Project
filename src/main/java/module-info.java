module com.example.helloword {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helloword to javafx.fxml;
    exports com.example.helloword;
}