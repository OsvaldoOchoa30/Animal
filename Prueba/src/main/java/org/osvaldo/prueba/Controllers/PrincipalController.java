package org.osvaldo.prueba.Controllers;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.osvaldo.prueba.App;
import org.osvaldo.prueba.models.Wikipedia;

import java.io.IOException;
import java.util.ArrayList;

public class PrincipalController {


    @FXML
    private Button AddButtom;
    @FXML
    private Button watchButton;
    @FXML
    private Button EditButtom;

    Stage alladd = new Stage();

    Stage allwatch = new Stage();

    Stage alledit = new Stage();
    private Wikipedia wikipedia; //Inicializar un objeto para establecer datos.

    @FXML
    void onMouseClickAddButton(MouseEvent event) throws IOException { //Moverme a la interfaz de "Agregar Animales".

        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("agregarA-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load() );
        alladd.setTitle("Agregar Animal :)");
        alladd.setScene(scene);
        alladd.show();


    }

    @FXML
    void OnMouseClickedWatchButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("verA-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load() );
        allwatch.setTitle("Ver Animales :)");
        allwatch.setScene(scene);
        allwatch.show();
    }

    @FXML
    void OnMouseClickedEditButtom(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("EliminarA-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load() );
        alledit.setTitle("Modificar :)");
        alledit.setScene(scene);
        alledit.show();

    }

    public void init(Stage stageRoot) {
    }
}
