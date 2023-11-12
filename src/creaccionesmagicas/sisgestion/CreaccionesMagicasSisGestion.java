
package creaccionesmagicas.sisgestion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CreaccionesMagicasSisGestion extends Application {
    
    public static Stage stagePrimario;
    
    @Override
    public void start(Stage stage) throws Exception { 
        stage.initStyle(StageStyle.UNDECORATED);
        Parent root = FXMLLoader.load(getClass().getResource("/com/creaccionesmagicas/views/FXMLLogin.fxml"));
       Scene scene = new Scene (root);
        stage.setScene(scene);
        setStagePrimario(stage); 
        stage.show();
    }

    public static Stage getStagePrimario() {
        return stagePrimario;
    }

    public static void setStagePrimario(Stage stagePrimario) {
        CreaccionesMagicasSisGestion.stagePrimario = stagePrimario;
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
