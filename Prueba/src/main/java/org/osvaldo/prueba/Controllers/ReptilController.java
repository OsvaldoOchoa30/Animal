package org.osvaldo.prueba.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.osvaldo.prueba.App;
import org.osvaldo.prueba.models.Reptil;

public class ReptilController {

    @FXML
    private Button AgregarReptilButtom;

    @FXML
    private TextField DescripcionReptilText;

    @FXML
    private TextField NameCientificReptlText;

    @FXML
    private TextField NameReptilText;

    @FXML
    private TextField PreguntaReptilText;

    @FXML
    void OnMouseClickedAgregarReptilButtom(MouseEvent event) {
        String nombrex = NameReptilText.getText();
        String nombreC = NameCientificReptlText.getText();
        String descriptions = DescripcionReptilText.getText();
        String pregunta = PreguntaReptilText.getText();
        Reptil reptil = new Reptil(nombrex, nombreC, descriptions, pregunta);
        App.getWiki().addAnimal(reptil);

    }

}
