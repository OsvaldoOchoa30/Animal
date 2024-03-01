module org.osvaldo.prueba {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;
    requires com.gluonhq.attach.display;

    opens org.osvaldo.prueba to javafx.fxml;
    exports org.osvaldo.prueba;
    exports org.osvaldo.prueba.Controllers;
    opens org.osvaldo.prueba.Controllers to javafx.fxml;
}