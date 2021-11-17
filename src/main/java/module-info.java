module com.example.grocery {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.grocery to javafx.fxml;
    exports com.example.grocery;

    exports pos;
    opens pos to javafx.fxml;

    exports auth;
    opens auth to javafx.fxml;


}