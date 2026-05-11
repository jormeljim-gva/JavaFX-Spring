module org.example.javafx_spring {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javafx_spring to javafx.fxml;
    exports org.example.javafx_spring;
}