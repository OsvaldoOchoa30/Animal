package org.osvaldo.prueba.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.osvaldo.prueba.App;

public class AgregarA {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button CrearAveButtom;

    @FXML
    private Button CrearMamiferoButtom;

    @FXML
    private Button CrearReptilButtom;

    Stage allCrearAve = new Stage();
    Stage allCrearMamifero = new Stage();
    Stage allCrearReptil = new Stage();

    //Los OnMouseClickedCrear... sirven para cambiar de interfaz, esta interfaz esta en la interfaz AgregarA.

    @FXML
    void OnMouseClickedCrearAveButtom(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ave-view.fxml")); //Aqui especificamos a la interfaz que nos moveremos.
        Scene scene = new Scene(fxmlLoader.load() );
        allCrearAve.setTitle("Agregar Ave...");
        allCrearAve.setScene(scene);
        allCrearAve.show();

    }

    @FXML
    void OnMouseClickedCrearMamiferoButtom(MouseEvent event) throws IOException {
       App.newStage("mamifero-view","");

    }

    @FXML
    void OnMouseClickedCrearReptilButtom(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("reptil-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load() );
        allCrearReptil.setTitle("Agregar Reptil...");
        allCrearReptil.setScene(scene);
        allCrearReptil.show();
    }


}
