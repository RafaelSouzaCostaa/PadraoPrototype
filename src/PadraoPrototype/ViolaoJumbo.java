/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PadraoPrototype;

/**
 *
 * @author Rafael de Souza Costa
 */
public class ViolaoJumbo extends ViolaoPrototype{
    
    private String nome = "Violão Jumbo";
    private String description = "O violão jumbo ficou famoso nas mãos de Elvis "
            + "\nPresley, mas, apesar de ser bem parecido com o tipo clássico, a "
            + "\ngrande diferença está em seu corpo mais largo e na base mais "
            + "\narredondada. É mais fácil de encontrar modelos eletroacústicos "
            + "\ne com cordas de aço. O som gerado pelo violão jumbo é mais grave "
            + "\ne encorpado.";
    
    public ViolaoJumbo(){
        this.valorCompra = 0;
    }
    
    private ViolaoJumbo(ViolaoJumbo violao){
        this.valorCompra = violao.getValorCompra();
    }

    @Override
    public String getInformacoes() {
        return(this.nome + " Valor: R$ "+getValorCompra() + "\n" + description);
    }

    @Override
    public ViolaoPrototype clonar() {
        return(new ViolaoJumbo(this));
    }
    
    @Override
    public String getnome() {
        return this.nome;
    }
}
