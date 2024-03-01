package org.osvaldo.prueba.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.osvaldo.prueba.App;
import org.osvaldo.prueba.models.Mamifero;

public class MamiferoController {

    @FXML
    private Button AgregarMamiferoButtom;

    @FXML
    private TextField DescripcionMamiferoText;

    @FXML
    private TextField NombreCMamiferoText;

    @FXML
    private TextField NombreMamiferoText;

    @FXML
    private TextField QuestionMamiferoText;

    @FXML
    void OnMouseClickedAgregarMamiferoButtom(MouseEvent event) {

        String nombres = NombreMamiferoText.getText();
        String nombre = NombreCMamiferoText.getText();
        String descrip = DescripcionMamiferoText.getText();
        String questi = QuestionMamiferoText.getText();
        Mamifero mamifero = new Mamifero(nombres, nombre, descrip, questi);
        App.getWiki().addAnimal(mamifero);



    }

}
