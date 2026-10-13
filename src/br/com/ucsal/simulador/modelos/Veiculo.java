package br.com.ucsal.simulador.modelos;

import java.util.Random;

public class Veiculo {
    private int distancia, velocidade, velocidadeSorteada;

    public Veiculo() {
        this.velocidade = 0;
        this.distancia = 0;
        this.velocidadeSorteada = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getVelocidadeSorteada() {
        return velocidadeSorteada;
    }

    public int getDistancia() {
        return distancia;
    }

    public void andar() {
        Random r = new Random();
        this.velocidadeSorteada = r.nextInt(1,4);

        this.distancia += velocidadeSorteada;
    }
}
