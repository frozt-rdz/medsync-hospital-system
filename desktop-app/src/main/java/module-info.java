module com.medsync.desktop.app {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    
    
    opens com.medsync.desktop.app to javafx.fxml;
    exports com.medsync.desktop.app;
}
