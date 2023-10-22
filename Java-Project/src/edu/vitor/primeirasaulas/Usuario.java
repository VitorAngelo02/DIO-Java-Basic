package edu.vitor.primeirasaulas;

public class Usuario {
    
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
    
        smartTv.ligar();

        System.out.println("Tv ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.canalProximo();
        smartTv.canalAnterior();
        smartTv.canalEspecifico(6);
    }
}
