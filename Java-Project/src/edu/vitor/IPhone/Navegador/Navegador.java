package edu.vitor.IPhone.Navegador;

public class Navegador {
    public String endereço;

    public void acessarEndereço(){
        System.out.println("Acessando endereço indicado");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página atual");
    }

    public void retornarAtras(){
        System.out.println("Retornando a página anterior");
    }

    public void retornarAFrente(){
        System.out.println("Retornado a página posterior");
    }

    public void listarFavoritos(){
        System.out.println("Listando favoritos");
    }
}
