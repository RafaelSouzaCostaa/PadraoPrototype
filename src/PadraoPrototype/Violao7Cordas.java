/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PadraoPrototype;

import java.util.ArrayList;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Violao7Cordas extends ViolaoPrototype{
    
    private String nome = "Violão 7 Cordas";
    private String description = "Conhecido como o violão brasileiro, já que é "
            + "\nindicado para acompanhar gêneros como o choro e o samba, esse "
            + "\ntipo de violão não apresenta diferenças na sua estrutura quando "
            + "\ncomparado ao violão clássico. Porém seu diferencial está na sétima "
            + "\ncorda, que costuma ser afinada de maneira mais grave que as outras "
            + "\nseis. Isso exige um conhecimento do músico que for tocá-lo.";
    
    public Violao7Cordas(){
        this.valorCompra = 0;
    }
    
    private Violao7Cordas(Violao7Cordas violao){
        this.valorCompra = violao.getValorCompra();
    }

    @Override
    public String getInformacoes() {
        return(this.nome + " Valor: R$ "+getValorCompra() + "\n" + description);
    }

    @Override
    public ViolaoPrototype clonar() {
        return(new Violao7Cordas(this));
    }
    
    @Override
    public String getnome() {
        return this.nome;
    }
}
