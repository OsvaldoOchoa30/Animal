package org.osvaldo.prueba.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import org.osvaldo.prueba.App;
import org.osvaldo.prueba.models.Animal;
import org.osvaldo.prueba.models.Ave;
import org.osvaldo.prueba.models.Wikipedia;

public class VerAView {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button VerButoom;

    @FXML
    private ListView<String> mostrarAnimales;

    @FXML
    void OnMOuseClickedVerButtom(MouseEvent event) { //Muestra los animales agregados.
        Wikipedia animals = App.getWiki(); //Creamos un objeto de la clase Wikipedia.
        for (Animal imprimir1 : animals.getListAnimal()){
            mostrarAnimales.getItems().add(imprimir1.toString());
        }

    }

    @FXML
    void OnMouseClicked(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert VerButoom != null : "fx:id=\"VerButoom\" was not injected: check your FXML file 'verA-view.fxml'.";
        assert mostrarAnimales != null : "fx:id=\"mostrarAnimales\" was not injected: check your FXML file 'verA-view.fxml'.";

    }

}