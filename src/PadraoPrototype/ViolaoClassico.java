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
public class ViolaoClassico extends ViolaoPrototype{
    
    private String nome = "Violão Classico";
    private String description = "O violão clássico é um modelo acústico e funciona "
            + "\ncom seis cordas (na maioria das vezes, feitas de nylon). Além da "
            + "\nfacilidade em encontrar esse modelo, ele possui um custo mais baixo "
            + "\nquando comparado aos outros tipos, e também é indicado para iniciantes "
            + "\ngraças à sua leveza e maciez.";
    
    public ViolaoClassico(){
        this.valorCompra = 0;
    }
    
    private ViolaoClassico(ViolaoClassico violao){
        this.valorCompra = violao.getValorCompra();
    }
    
    @Override
    public String getInformacoes() {
        return(this.nome + " Valor: R$ "+getValorCompra() + "\n" + description);
    }

    @Override
    public ViolaoPrototype clonar() {
        return(new ViolaoClassico(this));
    }
    
    @Override
    public String getnome() {
        return this.nome;
    }

}
