package com.maquinacoxinhas;

public class MaquinaCoxinhas {
    private int estoque;
    
    public MaquinaCoxinhas(){
        estoque = 0;
    }
    
    public MaquinaCoxinhas(int quantidade){
        this.estoque = quantidade;
    }
    
    public int getEstoque(){
        return estoque;
    }
    
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
    
    public void abastecer(int quantidade){
        if(quantidade > 0){
            estoque = quantidade;
        }
    }
    
    public void venderCoxinha(){
        if(estoque != 0){
            estoque--;
        }
    }
    
    public void venderCoxinha(int quantidade){
        if(quantidade < estoque){
            estoque = estoque - quantidade;
        }
    }
    
    public void zerarMaquina(){
        estoque = 0;
    }
}
