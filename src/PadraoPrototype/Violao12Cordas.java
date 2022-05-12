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
public class Violao12Cordas extends ViolaoPrototype {
    
    private String nome = "Violão 12 Cordas";
    private String description = "Outro tipo de violão que também não apresenta "
            + "\ndiferenças na estrutura, o violão 12 cordas traz o dobro de cordas "
            + "\ndo que o clássico. Essas são agrupadas em duplas (metade delas "
            + "\nafinadas com uma oitava acima). Esse tipo apresenta ressonância "
            + "\nplena e exige técnica e prática para poder pressionar duas cordas "
            + "\nsimultaneamente.";

    public Violao12Cordas() {
        this.valorCompra = 0;
    }

    private Violao12Cordas(Violao12Cordas violao) {
        this.valorCompra = violao.getValorCompra();
    }

    @Override
    public String getInformacoes() {
        return (this.nome + " Valor: R$ " + getValorCompra() + "\n" + description);
    }

    @Override
    public ViolaoPrototype clonar() {
        return (new Violao12Cordas(this));
    }

    @Override
    public String getnome() {
        return this.nome;
    }
}
