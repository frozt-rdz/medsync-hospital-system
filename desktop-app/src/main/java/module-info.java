module com.medsync.desktop.app {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.medsync.desktop.app to javafx.fxml;
    exports com.medsync.desktop.app;
}
