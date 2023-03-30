module com.jlrm.mazebank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens com.jlrm.mazebank to javafx.fxml;
    exports com.jlrm.mazebank;
    exports com.jlrm.mazebank.controllers;
    exports com.jlrm.mazebank.controllers.admin;
    exports com.jlrm.mazebank.controllers.client;
    exports com.jlrm.mazebank.models;
    exports com.jlrm.mazebank.views;
}