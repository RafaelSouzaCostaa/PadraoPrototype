/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PadraoPrototype;

/**
 *
 * @author Rafael de Souza Costa
 */
public class ViolaoFlet extends ViolaoPrototype{
    
    private String nome = "Violão Flet";
    private String description = "A palavra flat, do inglês, pode significar “plano” "
            + "\nou “liso”. É justamente essa a principal característica desse "
            + "\ntipo de violão: sua caixa acústica é bastante fina! O violão "
            + "\nflet é muito utilizado por músicos profissionais e na maioria "
            + "\ndos casos é tocado com cordas de nylon. O timbre gerado por "
            + "\nesse tipo de violão é mais suave. Vale lembrar que, por ser "
            + "\nencontrado quase sempre em modelos elétricos, precisa de amplificação.";
    
    public ViolaoFlet(){
        this.valorCompra = 0;
    }
    
    private ViolaoFlet(ViolaoFlet violao){
        this.valorCompra = violao.getValorCompra();        
    }
    
    @Override
    public String getInformacoes() {
        return(this.nome + " Valor: R$ "+getValorCompra() + "\n" + description);
    }

    @Override
    public ViolaoPrototype clonar() {
        return(new ViolaoFlet(this));
    }
    
    @Override
    public String getnome() {
        return this.nome;
    }
}
