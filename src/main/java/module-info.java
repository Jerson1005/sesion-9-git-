module org.example.sesion9git {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.sesion9git to javafx.fxml;
    exports org.example.sesion9git;
}