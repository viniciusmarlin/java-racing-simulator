package br.com.ucsal.simulador.modelos;

import java.util.Random;

public class Veiculo {
    private int distancia, velocidade;

    public Veiculo() {
        this.velocidade = 0;
        this.distancia = 0;
    }

    //Getter
    public int getVelocidade() {
        return velocidade;
    }

    public int getDistancia() {
        return distancia;
    }

    //Metódo
    public void andar() {
        Random r = new Random();
        int velocidadeSorteada = r.nextInt(1,3);

        distancia += velocidadeSorteada;
    }
}
