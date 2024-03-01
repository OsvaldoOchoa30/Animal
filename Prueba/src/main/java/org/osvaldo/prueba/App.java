package org.osvaldo.prueba;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;
import org.osvaldo.prueba.Controllers.PrincipalController;
import org.osvaldo.prueba.models.Animal;
import org.osvaldo.prueba.models.Wikipedia;

import java.io.IOException;

public class App extends Application {

    private static Wikipedia wiki = new Wikipedia(); //Generalizar en otras clases
    public static Wikipedia getWiki(){return wiki;
    }
    public static void setWiki(Wikipedia newWiki){
        wiki = newWiki;
    }
    private static Stage stageView;
    private static Stage stageRoot;
    @Override
    public void start(Stage stage) throws IOException { //Iniciar la interfaz principal
        stageRoot = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("principal-view.fxml"));
        Parent root = fxmlLoader.load();
        PrincipalController menuController = fxmlLoader.getController();
        menuController.init(stageRoot);

        Scene scene = new Scene(root);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        stage.setTitle("Wikipedia - Home");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static void newStage(String fxml, String title) { //Poder abir otras interfaces.
        stageView = new Stage();
        Scene scene = null;
        try {
            scene = new Scene(loadFXML(fxml));
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
            stageView.setTitle(title);
            stageView.setScene(scene);
            stageView.centerOnScreen();
            stageView.initOwner(stageRoot);
            stageView.initModality(Modality.APPLICATION_MODAL);
            stageView.showAndWait();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Parent loadFXML(String fxml) throws IOException {  //Mandar a llamar las interfaces
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static Stage getStageView() {
        return stageView;
    }
}