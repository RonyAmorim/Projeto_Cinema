/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.com.fatec.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
    @FXML
    private TextField txtCpf;
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtDataNasc;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtTelefone;
    @FXML
    private TextField txtSenha;
    @FXML
    private TextField txtConfirmSenha;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnCadastrar_Click(ActionEvent event) {
    }

    @FXML
    private void chkVizualizarSenha_Check(ActionEvent event) {
    }
    
}
