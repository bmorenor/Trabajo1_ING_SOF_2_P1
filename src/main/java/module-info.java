module com.example.trabajo1_ing_sof_2_p1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.trabajo1_ing_sof_2_p1 to javafx.fxml;
    exports com.example.trabajo1_ing_sof_2_p1;
}