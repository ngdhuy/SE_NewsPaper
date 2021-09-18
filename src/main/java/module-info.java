module io.setud.se_newspaper {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.rometools.rome;
    requires java.xml;
    requires java.logging;

    opens io.setud.se_newspaper to javafx.fxml;
    exports io.setud.se_newspaper;
    exports io.setud.se_newspaper.controllers;
    opens io.setud.se_newspaper.controllers to javafx.fxml;
}