/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PadraoPrototype;

/**
 *
 * @author Rafael de Souza Costa
 */
public class ViolaoFolk extends ViolaoPrototype{
    
    private String nome = "Violão Folk";
    private String description = "Com o corpo maior e mais “acinturado”, os "
            + "\nviolões do tipo folk também são bastante populares entre os "
            + "\nmúsicos. A maioria dos modelos desse tipo de violão funciona "
            + "\ncom a utilização de cordas de aço, podendo ser elétricos ou "
            + "\neletroacústicos. Esse tipo de violão é o mais indicado para "
            + "\ngêneros como pop e rock, já que gera um som mais encorpado, "
            + "\ncom timbre diferenciado.";
    
    public ViolaoFolk(){
        this.valorCompra = 0;
    }
    
    private ViolaoFolk(ViolaoFolk violao){
        this.valorCompra = violao.getValorCompra();
    }

    @Override
    public String getInformacoes() {
        return(this.nome + " Valor: R$ "+getValorCompra() + "\n" + description);
    }

    @Override
    public ViolaoPrototype clonar() {
        return(new ViolaoFolk(this));
    }
    
    @Override
    public String getnome() {
        return this.nome;
    }
}
