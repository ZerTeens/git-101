module ku.cs.git101 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ku.cs.git101 to javafx.fxml;
    exports ku.cs.git101;
    exports ku.cs.controllers;
    opens ku.cs.controllers to javafx.fxml;
}