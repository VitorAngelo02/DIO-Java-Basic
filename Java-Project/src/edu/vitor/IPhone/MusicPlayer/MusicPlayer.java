package edu.vitor.IPhone.MusicPlayer;

public class MusicPlayer {
    public void tocar(String faixa){
        System.out.println("Tocando música " + faixa);
    }

    public void pausar(){
        System.out.println("Pausando música atual");
    }

    public void musicaAnterior(){
        System.out.println("Retornando à música anterior");
    }

    public void musicaProxima(){
        System.out.println("Avançando para a próxima música");
    }

    public void listarCantores(){
        System.out.println("Listando todos os cantores da biblioteca");
    }

    public void listarAlbuns(){
        System.out.println("Listando albuns da biblioteca");
    }

    public void atribuirNota(int nota){
        System.out.println("Atribuido nota " + nota + " a música atual");
    }
}
