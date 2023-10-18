public class SmartTv {

    boolean ligada = false;
    int volume = 25;
    int canal = 1;

    public void ligar() {
        System.out.println("Televisão foi ligada");
        ligada = true;
    }
    
    public void desligar() {
        System.out.println("Televisão foi desligada");
        ligada = false;
    }

    public int aumentarVolume() {
        System.out.println(++volume);
        return volume;
    }

    public int diminuirVolume() {
        System.out.println(--volume);
        return volume;
    }

    public int canalProximo() {
        System.out.println("Canal alterado para " + ++canal);
        return canal;
    }

    public int canalAnterior() {
         System.out.println("Canal alterado para " + --canal);
        return canal;
    }
    
    public void canalEspecifico(int canalAlvo) {
        System.out.println("Canal alterado para " + canalAlvo);
        canal = canalAlvo;
    }
}

