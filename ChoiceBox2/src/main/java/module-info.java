module com.example.choicebox2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.choicebox2 to javafx.fxml;
    exports com.example.choicebox2;
}