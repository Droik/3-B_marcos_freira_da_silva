/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifro.edu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import  javafx.fxml.FXMLLoader ;
import  javafx.stage.Stage ;
import  java.io.IOException; 

/**
 *
 * @author 04046001232
 */
public class MenuPrincipalController implements Initializable {
    
    @FXML
    private TextField txtn1, txtn2, txtresult;
    @FXML
    private Button btnsoma;
    @FXML
    private Label label;
    @FXML
    private void soma (ActionEvent event) {
     Double num1 = Double.parseDouble(txtn1.getText());
     Double num2 = Double.parseDouble(txtn2.getText());
     Double result = num1 + num2;
     
     txtresult.setText(result.toString());


    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
     @FXML
    private void AbrirCadastroAluno (ActionEvent event) {
            try{
    FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
    Scene scene = new Scene(fxmlLoader.load(),900,682);
    Stage stage = new Stage();
    stage.setTitle("Cadastrar Cliente");
    stage.setScene(scene);
    stage.show();
}
catch(IOException e){

}
    }
    @FXML
    private void FecharProjeto (ActionEvent event) {
        
    }
}
