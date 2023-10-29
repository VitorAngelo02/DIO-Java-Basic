package edu.vitor.IPhone;

class IPhone {
    private String nome, email, telefone;

    public void iPhone(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public void ligar(){
        System.out.println("Ligando iPhone");
    }  
    
    public void desligar(){
        System.out.println("Desligando iPhone");
    }

    public void abrirApp(String nomeApp){
        System.out.println("Abrindo app " + nomeApp);
    }

    public void fecharApp(String nomeApp){
        System.out.println("Fechando app " + nomeApp);
    }

    public static void main(String[] args) {
        
    }
}