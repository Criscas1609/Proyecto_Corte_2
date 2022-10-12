package com.example.laboratorio.controller;

import java.net.URL;
import java.util.ResourceBundle;
import com.example.laboratorio.model.Element;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert;

import javafx.stage.Stage;


public class ElementViewController implements Initializable {

    private Stage stage;
    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        stage = stage;
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;*/
    @FXML
    private TableColumn colEstadoEle;

    @FXML
    private TableColumn colIdElem;

    @FXML
    private TableColumn colNombreEle;

    @FXML
    private TableColumn colPrecioElem;

    @FXML
    private TableColumn colTipoEle;

    @FXML
    private TableColumn colUbiEle;

    @FXML
    private TableColumn colUsoEle;

    @FXML
    private TableColumn conlCantiEle;

    @FXML
    private ChoiceBox<?> cantidadElemen;
    @FXML
    private ChoiceBox<?> estadoElemen;
    @FXML
    private TextField idElemen;

    @FXML
    private TextField nombreElemen;

    @FXML
    private TextField precioElemen;

    @FXML
    private ChoiceBox<?> tipoElemen;
    @FXML
    private ChoiceBox<?> ubiElemen;

    @FXML
    private ChoiceBox<?> usoElemen;
    /* private Alert alert;*/

    @FXML
    void buscarElemen(ActionEvent event) {

    }

    @FXML
    void cantidadElemen(MouseEvent event) {

    }

    @FXML
    void crearElemen(ActionEvent event) {

        try {
            String nombre = this.nombreElemen.getText();
            String tipo = String.valueOf(this.tipoElemen.getSelectionModel().selectedIndexProperty());
            String cantidad = String.valueOf(this.cantidadElemen.getSelectionModel().selectedIndexProperty());
            String uso = String.valueOf(this.usoElemen.getSelectionModel().selectedIndexProperty());
            String ubicacion = String.valueOf(this.ubiElemen.getSelectionModel().selectedIndexProperty());
            String estado = String.valueOf(this.estadoElemen.getSelectionModel().selectedIndexProperty());
            String id = this.idElemen.getText();
            int precio = Integer.parseInt(this.precioElemen.getText());

            Element element = new Element(nombre, tipo, cantidad, uso, ubicacion, estado, id, precio);

            if (!this.elements.contains(element)) {
                this.elements.add(element);
                this.tblElement.setItems(elements);
            } else {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("El elemento existe");
                alert.showAndWait();
            }
        } catch (NumberFormatException e) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Formato incorrecto");
            alert.showAndWait();
        }
    }


    @FXML
    void editarElemen(ActionEvent event) {

    }

    @FXML
    void eliminarElemen(ActionEvent event) {

    }

    @FXML
    void estadoElemen(MouseEvent event) {

    }

    @FXML
    void idElemen(ActionEvent event) {

    }

    @FXML
    void nombreElemen(ActionEvent event) {

    }

    @FXML
    void precioElemen(ActionEvent event) {

    }

    @FXML
    void tipoElemen(MouseEvent event) {

    }

    @FXML
    void ubiElemen(MouseEvent event) {

    }

    @FXML
    void usoElemen(MouseEvent event) {

    }

}

