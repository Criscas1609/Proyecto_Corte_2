module com.example {
    requires javafx.controls;
    requires javafx.fxml;



    exports com.example.laboratorio to javafx;
    exports com.example.laboratorio.controller to javafx.fxml;
    opens com.example.laboratorio.controller to javafx.fxml;




    opens com.example.laboratorio to javafx.graphics;


}