import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

Cachorro cachorro = new Cachorro();
Gato gato = new Gato();

        System.out.println("Som do Cachorro: "+ Arrays.toString(cachorro.emitirSom()) );
        System.out.println("Som do Gato: "+ Arrays.toString(gato.emitirSom()));

    }

  }