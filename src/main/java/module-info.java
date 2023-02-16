module com.benaventi.kodigo.heapsort {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.benaventi.kodigo.heapsort to javafx.fxml;
    exports com.benaventi.kodigo.heapsort;
}