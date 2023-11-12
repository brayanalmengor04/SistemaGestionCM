
package com.creaccionesmagicas.controllers;


import  creaccionesmagicas.sisgestion.CreaccionesMagicasSisGestion;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;



public class FXMLLoginController implements Initializable {
    
    @FXML 
    private Label btnCloseLogin;  
    
    @FXML 
    private Button btnCrearCuenta;  
    
    
    @FXML 
    private void nuevaCuenta(Event event){
        try {
            loadStageCrearCuenta("/com/creaccionesmagicas/views/FXMLCrearCuenta.fxml", event);
        } catch (IOException ex) {
            Logger.getLogger(FXMLLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML 
    private void logearCuenta (Event event){
        try {
            loadStageCrearCuenta("/com/creaccionesmagicas/views/FXMLPrincipal.fxml", event);
        } catch (IOException ex) {
            Logger.getLogger(FXMLLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML 
    private void cerrarVentana (MouseEvent event){
        System.exit(0);
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private void loadStageCrearCuenta (String url, Event event) throws IOException{    
        // Codigo simplificado 
        //Convirtiendo evento a tipo nodo luego obtenemos la scena y luego la ventana y luego cierra.
         ((Node)  (event.getSource())).getScene().getWindow().hide(); 
          // Cargamos la nueva escena o el fxml
        Parent root =  FXMLLoader.load(getClass().getResource(url)); 
        Scene scene = new Scene(root);   
        
        Stage newStage = CreaccionesMagicasSisGestion.getStagePrimario();
    
        newStage.setScene(scene); 
        newStage.show();
    } 
     private void loadStageIniciarCuenta (String url, Event event) throws IOException{    
        // Codigo simplificado 
        //Convirtiendo evento a tipo nodo luego obtenemos la scena y luego la ventana y luego cierra.
         ((Node)  (event.getSource())).getScene().getWindow().hide(); 
          // Cargamos la nueva escena o el fxml
        Parent root =  FXMLLoader.load(getClass().getResource(url)); 
        Scene scene = new Scene(root);   
        
        Stage newStage = CreaccionesMagicasSisGestion.getStagePrimario();
    
        newStage.setScene(scene); 
        newStage.show();
    }
    
  
}
