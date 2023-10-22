package edu.vitor.candidatura;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        selecaoCandidatos();
        // imprimirSelecionados();
        System.out.println(atender());
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidato: candidatos){
            contatar(candidato);
        }
    }
    static boolean atender(){
        Random gerador = new Random();
        return gerador.nextInt(3)==1;
    }

    static boolean contatar(String candidato){
        int tentativas = 0;
        boolean atendeu = false;
        do { 
            atendeu = atender();
            if(atendeu) {
                System.out.println("Candidato " + candidato + " contatado com sucesso na " + (tentativas+1) + " tentativa.");
                return true;
            } else {
                tentativas++;
            }
        } while(tentativas < 3 && atendeu == false);
            System.out.println("Não foi possível conseguir contato com o candidato " + candidato + ".");
            return false;
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO","MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            candidatoAtual++;
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou " + salarioPretendido + ".");
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o índice de elementos");
        for(int i=0; i < candidatos.length; i++)
            System.out.println("O candidato de índice " + (i + 1) + " é " + candidatos[i] + ".");
        for(String candidato: candidatos)
            System.out.println("O candidato selecionado foi " + candidato);
    }

    public static double valorPretendido() {
        Random gerador = new Random();
        return gerador.nextDouble(1800, 2200);
    }

    public static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if( salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }            
    }
}
