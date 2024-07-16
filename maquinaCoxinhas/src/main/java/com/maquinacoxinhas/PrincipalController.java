package com.maquinacoxinhas;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class PrincipalController {
    
    @FXML
    private TextField campoEstoque;
    private TextField campoAbastecer;
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
        campoAbastecer.setText(String.valueOf(maquina.getEstoque()));
    }
    
    
    @FXML
    private void retirar(){
        if(maquina.getEstoque() == 0){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Não há coxinhas para retirar");
            alert.show();
            return; 
        }
        maquina.venderCoxinha();
        campoEstoque.setText(String.valueOf(maquina.getEstoque()));
    }
    
    @FXML
    private void retirarUma(){   
        int aux = Integer.parseInt(campoRetirar.getText()); 
        if(aux > 0){
            aux -= 1;
            campoRetirar.setText(String.valueOf(aux));
        }
    }
    
    
    @FXML
    private void sair(){
        Platform.exit();
        System.exit(0);
    }
    
}
