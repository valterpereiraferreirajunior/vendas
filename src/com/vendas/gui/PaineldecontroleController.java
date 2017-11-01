/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vendas.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author aluno
 */
public class PaineldecontroleController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void InsereProduto(MouseEvent event) {
    }

    @FXML
    private void BtnInsereProduto(ActionEvent event) {
    }

    @FXML
    private void InsereFuncionario(MouseEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("Inserefuncionario"));
        
        PainelControle painelControle = new PainelControle();
        
        Inserefucionario insereFuncionario= new insereFuncionario();
    }

    @FXML
    private void BtnInsereFuncionario(ActionEvent event) {
    }
    
}
