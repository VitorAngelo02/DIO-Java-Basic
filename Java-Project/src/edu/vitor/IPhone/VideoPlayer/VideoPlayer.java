package edu.vitor.IPhone.VideoPlayer;

public class VideoPlayer {
    public void tocar(String faixa){
        System.out.println("Tocando video " + faixa);
    }

    public void pausar(){
        System.out.println("Pausando video atual");
    }

    public void videoAnterior(){
        System.out.println("Retornando ao video anterior");
    }

    public void videoProximo(){
        System.out.println("Avançando para o próximo video");
    }

    public void listarVideos(){
        System.out.println("Listando vídeos na biblioteca");
    }
}
