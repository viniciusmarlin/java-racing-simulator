package br.com.ucsal.simulador.modelos;

import java.util.Random;

public class Veiculo {
private int distancia, velocidade;

public Veiculo() {
this.velocidade = 0;
this.distancia = 0;
}

public int getVelocidade() {
return velocidade;
}

public int getDistancia() {
return distancia;
}

public void andar() {
Random r = new Random();
this.velocidade = r.nextInt(1,4);

this.distancia += velocidade;
}
}