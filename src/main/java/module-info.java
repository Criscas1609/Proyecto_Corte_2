module com.example.laboratorio {
    requires javafx.controls;
    requires javafx.fxml;




    exports com.example.laboratorio;
    opens com.example.laboratorio to javafx.fxml;
}