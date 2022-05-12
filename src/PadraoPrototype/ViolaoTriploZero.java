/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PadraoPrototype;

/**
 *
 * @author Rafael de Souza Costa
 */
public class ViolaoTriploZero extends ViolaoPrototype{
    private String nome = "Violão Triplo Zero";
    private String description = "Esses tipos de violões são categorizados como "
            + "\nParlor, com estruturas menores e sendo mais indicado para uso "
            + "\ncasual e não tanto profissional. Entre os três tipos, o violão "
            + "\nzero é o menor, com uma estrutura confortável para tocar por"
            + " \nbastante tempo. Já o duplo zero é um pouco maior, apresentando "
            + "\numa boa sonoridade e sendo indicado para técnicas de fingerstyle."
            + " \nO triplo zero possui tamanho intermediário e gera um timbre mais peculiar.";
    
    public ViolaoTriploZero(){
        this.valorCompra = 0;
    }
    
    private ViolaoTriploZero(ViolaoTriploZero violao){
        this.valorCompra = violao.getValorCompra();
    }

    @Override
    public String getInformacoes() {
        return(this.nome + " Valor: R$ " + getValorCompra() + "\n" + description);
    }

    @Override
    public ViolaoPrototype clonar() {
        return(new ViolaoTriploZero(this));
    }

    @Override
    public String getnome() {
        return this.nome;
    }
    
    
}
