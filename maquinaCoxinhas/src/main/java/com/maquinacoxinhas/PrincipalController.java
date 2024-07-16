package com.maquinacoxinhas;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class PrincipalController {
    
    @FXML
    private TextField campoEstoque;
    @FXML
    private TextField campoAbastecer;
    @FXML
    private TextField campoRetirar;
    
    private MaquinaCoxinhas maquina; 
    
    @FXML
    private void initialize(){
        maquina = new MaquinaCoxinhas(); 
        campoEstoque.setText(String.valueOf(maquina.getEstoque()));
    }
    
    @FXML
    private void abastecer(){
        int aux = Integer.parseInt(campoAbastecer.getText());
        maquina.abastecer(aux);
        campoEstoque.setText(String.valueOf(maquina.getEstoque()));
    }
    
    
    @FXML
    private void retirar(){
        int aux = Integer.parseInt(campoRetirar.getText());
        if(maquina.getEstoque() <aux){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Não há coxinhas para retirar");
            alert.show();
            return; 
        }
        
        maquina.venderCoxinha(aux);
        
        campoEstoque.setText(String.valueOf(maquina.getEstoque()));
    }
    
    @FXML
    private void retirarUma(){ 
        if(maquina.getEstoque() > 0){
            maquina.venderCoxinha();
        }
        
        campoEstoque.setText(String.valueOf(maquina.getEstoque()));
    }
    
    
    @FXML
    private void sair(){
        Platform.exit();
        System.exit(0);
    }
    
}
