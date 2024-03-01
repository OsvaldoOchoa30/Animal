package org.osvaldo.prueba.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.osvaldo.prueba.App;
import org.osvaldo.prueba.models.Ave;
import org.osvaldo.prueba.models.Wikipedia;

public class AveControllers {

    @FXML
    private Button AgregarAveButtom;

    @FXML
    private TextField DescripcionAveText;

    @FXML
    private TextField NameAveText;

    @FXML
    private TextField NameCAveText;

    @FXML
    private TextField PreguntaAverText;

    @FXML
    void OnMouseClickedAgregarAveButtom(MouseEvent event) { //Al dar click en este boton guardara los datos que ingreso el usuario en el formulario.

        String name = NameAveText.getText();
        String nameC = NameCAveText.getText();
        String descrp = DescripcionAveText.getText();
        String vuela = PreguntaAverText.getText();

        Ave ave = new Ave(name, nameC , descrp, vuela); //Creamos un objeto de la clase Ave y le asignamos los parametros anteriores.
        App.getWiki().addAnimal(ave); //Utilizamos el metodo que generalizamos para agregarlo a mi lista de animales, en este controlador agregara solo datos de la clase. Ave


    }

}
