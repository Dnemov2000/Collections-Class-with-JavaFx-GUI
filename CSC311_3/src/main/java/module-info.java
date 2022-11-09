module com.mycompany.csc311_3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.csc311_3 to javafx.fxml;
    exports com.mycompany.csc311_3;
}
