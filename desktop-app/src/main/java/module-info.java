module com.medsync.desktop.app {

    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.base;

    opens com.medsync.desktop.app to javafx.fxml;
    opens com.medsync.controllers to javafx.fxml;
    
    opens com.medsync.models to javafx.base;

    exports com.medsync.desktop.app;
    exports com.medsync.controllers;
}
