package br.com.ucsal.simulador.modelos;

import java.util.concurrent.ThreadLocalRandom;

public class Veiculo {
    private int distancia, velocidade, velocidadeSorteada;

    public Veiculo() {
        this.velocidade = 0;
        this.distancia = 0;
        this.velocidadeSorteada = 0;
    }

    //Getter
    public int getVelocidade() {
        return velocidade;
    }

    public int getVelocidadeSorteada() {
        return velocidadeSorteada;
    }

    public int getDistancia() {
        return distancia;
    }

    //Metódo
    public void andar() {
        this.velocidadeSorteada = ThreadLocalRandom.current().nextInt(1, 4);

        this.distancia += velocidadeSorteada;
    }
}
