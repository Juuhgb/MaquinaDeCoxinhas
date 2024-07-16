module com.maquinacoxinhas {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.maquinacoxinhas to javafx.fxml;
    exports com.maquinacoxinhas;
}
