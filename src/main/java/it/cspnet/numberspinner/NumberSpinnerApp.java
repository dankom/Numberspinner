package it.cspnet.numberspinner;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class NumberSpinnerApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        NumberSpinner spinner = new NumberSpinner();
        spinner.setMinValue(1);
        spinner.setMaxValue(5);
        spinner.setValue(3);
        spinner.setStepWidth(1);
        spinner.setPrefSize(100, 27);
        spinner.setMaxSize(100, 27);
        spinner.setMinSize(100, 27);
        BorderPane pane = new BorderPane();
//        pane.getChildren().add(spinner);
        pane.setCenter(spinner);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("Number spinner Control");
        stage.setWidth(300);
        stage.setHeight(200);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
