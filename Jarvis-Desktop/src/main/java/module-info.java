module com.range.jarvisdesktop {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.range.jarvisdesktop to javafx.fxml;
    exports com.range.jarvisdesktop;
}