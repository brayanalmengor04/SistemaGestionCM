
package com.creaccionesmagicas.controllers;

import com.sun.jndi.dns.DnsContextFactory;
import creaccionesmagicas.sisgestion.CreaccionesMagicasSisGestion;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;
import javax.swing.JOptionPane;


public class FXMLCrearCuentaController implements Initializable {
    
  
    
   @FXML 
   private void eventSalir(Event event){
          try {
            loadStageRegreso("/com/creaccionesmagicas/views/FXMLLogin.fxml", event);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
   }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }     
    
    
    private void loadStageRegreso (String url ,Event event) throws IOException{
  
         ((Node)  (event.getSource())).getScene().getWindow().hide(); 
          // Cargamos la nueva escena o el fxml
        Parent root =  FXMLLoader.load(getClass().getResource(url));  
        Scene scene = new Scene(root);   
            Stage newStage = CreaccionesMagicasSisGestion.getStagePrimario();
        newStage.setScene(scene);  
        
        newStage.show();
    
       
    }
    
}
