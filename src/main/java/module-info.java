module io.setud.se_newspaper {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.rometools.rome;
    requires java.xml;

    opens io.setud.se_newspaper to javafx.fxml;
    exports io.setud.se_newspaper;
}