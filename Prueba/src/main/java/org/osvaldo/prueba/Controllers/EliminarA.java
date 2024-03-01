package org.osvaldo.prueba.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.osvaldo.prueba.App;
import org.osvaldo.prueba.models.Animal;
import org.osvaldo.prueba.models.Wikipedia;

public class EliminarA {

    @FXML
    private ListView<String> AnimalList;

    @FXML
    private TextField BuscarAnimlaText;

    @FXML
    private Button EliminarAnimalButtom;


    @FXML
    private Button ListaNuevaButtom;

    @FXML
    void OnMouseClickedListaNuevaButtom(MouseEvent event) { //Mostrar lista actualizada.
        Wikipedia animals = App.getWiki();
        for (Animal list2 : animals.getListAnimal()){
            AnimalList.getItems().add(list2.toString());
        }

    }


    @FXML
    void OnMouseClickedEliminarAnimalButtom(MouseEvent event) { //Eliminar animal,  cuando coincidan los nombres.
        String  eliminar = BuscarAnimlaText.getText();
        Wikipedia wikipedia = App.getWiki();
       if (wikipedia.eliminarAnimal(eliminar)){

       }
    }

}
