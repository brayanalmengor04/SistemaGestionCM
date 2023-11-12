
package com.creaccionesmagicas.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javax.swing.JOptionPane;


public class FXMLPrincipalController implements Initializable {

      @FXML 
      private VBox sliderMenu; 
      
      @FXML 
      private VBox contenedor__change;
      
      @FXML 
      private void eventSalir(Event event){
          System.exit(0);
      }
      
      // Action MenuBar 
      
      @FXML 
      private void eventMenuUsuario(Event event){
          
          try {
              Parent nuevaEscena = FXMLLoader.load(getClass().getResource 
                ("/com/creaccionesmagicas/views/FXMLUsuario.fxml")); 
              
              
              contenedor__change.getChildren().setAll(nuevaEscena);
          } catch (IOException ex) {
              JOptionPane.showMessageDialog(null, ex.getMessage());
          }
          
      }
      @FXML 
      private void eventMenuTienda(Event event){
                try {
              Parent nuevaEscena = FXMLLoader.load(getClass().getResource 
                ("/com/creaccionesmagicas/views/FXMLProductosServicios.fxml")); 
              
              
              contenedor__change.getChildren().setAll(nuevaEscena);
          } catch (IOException ex) {
              JOptionPane.showMessageDialog(null, ex.getMessage());
          }
          
      }
      @FXML 
      private void eventMenuFactura(Event event){
                try {
              Parent nuevaEscena = FXMLLoader.load(getClass().getResource 
                ("/com/creaccionesmagicas/views/FXMLFacturacion.fxml")); 
              
              
              contenedor__change.getChildren().setAll(nuevaEscena);
          } catch (IOException ex) {
              JOptionPane.showMessageDialog(null, ex.getMessage());
          }
          
      }
      @FXML 
      private void eventMenuResenia(Event event){
                try {
              Parent nuevaEscena = FXMLLoader.load(getClass().getResource 
                ("/com/creaccionesmagicas/views/FXMLResenias.fxml")); 
              
              
              contenedor__change.getChildren().setAll(nuevaEscena);
          } catch (IOException ex) {
              JOptionPane.showMessageDialog(null, ex.getMessage());
          }
          
      }
      @FXML 
      private void eventMenuInicio(Event event){
                try {
              Parent nuevaEscena = FXMLLoader.load(getClass().getResource 
                ("/com/creaccionesmagicas/views/FXMLPrincipalInicio.fxml")); 
              
              
              contenedor__change.getChildren().setAll(nuevaEscena);
          } catch (IOException ex) {
              JOptionPane.showMessageDialog(null, ex.getMessage());
          }
          
      }
      
      
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO  
        hoverOnOut();
      
    }    
    
    private void hoverOnOut(){
        sliderMenu.setOnMouseEntered(event -> {
            sliderMenu.setPrefWidth(115);
        });
        
        sliderMenu.setOnMouseExited(evenet ->{
            sliderMenu.setPrefWidth(61);
        });
    }
    
}
