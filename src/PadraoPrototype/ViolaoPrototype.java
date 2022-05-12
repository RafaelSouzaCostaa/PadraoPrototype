/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PadraoPrototype;

import java.util.ArrayList;

/**
 * @author Rafael de Souza Costa
 **/
public abstract class ViolaoPrototype {
    
    protected double valorCompra;
    private ArrayList<String> feedback = new ArrayList<>();
    
    public abstract String getInformacoes();
    public abstract ViolaoPrototype clonar();
    public abstract String getnome();
    
    public double getValorCompra(){
        return this.valorCompra;
    }
    
    public void setValorCompra(double valorCompra){
        this.valorCompra = valorCompra;
    }
    
    public ArrayList<String> getFeedback(){
        if(this.feedback == null){
            this.feedback = new ArrayList<>();
        }
        return this.feedback;
    }
    
    public void setFeedback(String feedback){
        
        if(feedback.isEmpty()){
            return;
        }
        this.feedback.add(feedback);
    }
}
