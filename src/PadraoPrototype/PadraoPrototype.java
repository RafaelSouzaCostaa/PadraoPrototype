/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package PadraoPrototype;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael de Souza Costa
 */
public class PadraoPrototype {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ViolaoPrototype> prototypesViolaos = new ArrayList<>();
        ArrayList<ViolaoPrototype> bancoDados = new ArrayList<>();
        
        ViolaoPrototype prototype = new ViolaoClassico();
        ViolaoPrototype prototypeFolk = new ViolaoFolk();
        ViolaoPrototype prototypeFlet = new ViolaoFlet();
        ViolaoPrototype prototypeJumbo = new ViolaoJumbo();
        ViolaoPrototype prototype7Cordas = new Violao7Cordas();
        ViolaoPrototype prototype12Cordas = new Violao12Cordas();
        ViolaoPrototype prototypeZero = new ViolaoZero();
        ViolaoPrototype prototypeDuploZero = new ViolaoDuploZero();
        ViolaoPrototype prototypeTriploZero = new ViolaoTriploZero();
        
        
        prototypesViolaos.add(prototype);        
        prototypesViolaos.add(prototypeFolk);
        prototypesViolaos.add(prototypeFlet);
        prototypesViolaos.add(prototypeJumbo);
        prototypesViolaos.add(prototype7Cordas);
        prototypesViolaos.add(prototype12Cordas);
        prototypesViolaos.add(prototypeZero);
        prototypesViolaos.add(prototypeDuploZero);
        prototypesViolaos.add(prototypeTriploZero);
 
        boolean chaveMenu = true; 
        while(chaveMenu){
            String indexEscolhido = JOptionPane.showInputDialog("1 - Criar Violão\n2 - Ver Violão Criados\n3 - Ver Feedback\n4 - Sair");
            if(indexEscolhido == ""){
                return;
            }
            switch(indexEscolhido){
                case "1":
                    String tipos = "";
                    for(int i = 0; i< prototypesViolaos.size(); i++){
                        tipos +=  i + " - " + prototypesViolaos.get(i).getnome() + "\n";
                    }
                    
                    int tamanhoListMaisUm = (prototypesViolaos.size() + 1);
                    String indexEscolhidoTipo = JOptionPane.showInputDialog(tipos + "\n" + tamanhoListMaisUm + " - Sair" );
                    
                    if(tamanhoListMaisUm == Integer.parseInt(indexEscolhidoTipo) || indexEscolhidoTipo == ""){
                        break;
                    }
                    
                    ViolaoPrototype violaoCriado = prototypesViolaos.get(Integer.parseInt(indexEscolhidoTipo)).clonar();
                    
                    String valor = JOptionPane.showInputDialog("Digite o Valor do Violão Criado: ");
                    
                    violaoCriado.setValorCompra(Double.valueOf(valor));
                    bancoDados.add(violaoCriado);                    
                break;
                case "2":
                    String listViolao = "Escola um violão criado: \n";
                    int tamanhoBancoMaisUm = bancoDados.size() + 1;
                    
                    for(int i = 0; i< bancoDados.size(); i++){
                        listViolao +=  i + " - " + bancoDados.get(i).getnome() + "\n";
                    }
                    
                    String indexEscolhidoViolaoCriado = JOptionPane.showInputDialog(listViolao  + "\n" + tamanhoBancoMaisUm + " - Sair" );
                    
                    if(tamanhoBancoMaisUm == Integer.parseInt(indexEscolhidoViolaoCriado)){
                        break;
                    }
                    
                    ViolaoPrototype violaoEscolhido = bancoDados.get(Integer.parseInt(indexEscolhidoViolaoCriado));
                    
                    String violaoSelectInfo =  violaoEscolhido.getInformacoes();
                    String feedbackDigitado = JOptionPane.showInputDialog(violaoSelectInfo  + "\n\nDeixe seu feedback: ");
                    bancoDados.get(Integer.parseInt(indexEscolhidoViolaoCriado)).setFeedback(feedbackDigitado);
                break;
                case "3":
                    String listDeViolao = "Escola um violão criado: \n";
                    int tamanhoBanco = bancoDados.size() + 1;
                    
                    for(int i = 0; i< bancoDados.size(); i++){
                        listDeViolao +=  i + " - " + bancoDados.get(i).getnome() + "\n";
                    }
                    
                    String indexEscolhidoFeedback = JOptionPane.showInputDialog(listDeViolao  + "\n" + tamanhoBanco + " - Sair" );
                    
                    if(tamanhoBanco == Integer.parseInt(indexEscolhidoFeedback)){
                        break;
                    }
                    
                    ViolaoPrototype violaoEscolhidoFeedback = bancoDados.get(Integer.parseInt(indexEscolhidoFeedback));
                    
                    String feedbacks = "Feedback: \n";
                    ArrayList<String> aux = violaoEscolhidoFeedback.getFeedback();
                    
                    for (int i = 0; i < aux.size(); i++) {
                        feedbacks += "#" + (i+1) + " - " + aux.get(i) + "\n\n";
                    }
                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), feedbacks);
                break;
                case "4":
                    chaveMenu = false;
                break;
            }
        }
    }
}
