/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.com.fatec.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author ronya
 */
public class CadastroClientes_ViewController implements Initializable {

    @FXML
    private Label lblCadastroDeClientes;
    @FXML
    private Label lblCpf;
    @FXML
    private Label lblNome;
    @FXML
    private Label lblDataNasc;
    @FXML
    private Label lblEmail;
    @FXML
    private Label lblTelefone;
    @FXML
    private Label lblSenha;
    @FXML
    private Label lblConfirmSenha;
    @FXML
    private CheckBox chkVizualizarSenha;
    @FXML
    private Button btnCadastrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
