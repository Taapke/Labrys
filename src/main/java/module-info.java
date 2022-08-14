module Labrys {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens Labrys.controller to javafx.fxml;
    exports Labrys;
}
