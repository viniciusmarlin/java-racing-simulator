package br.com.ucsal.simulador;

import br.com.ucsal.simulador.modelos.Corrida;
import br.com.ucsal.simulador.modelos.Veiculo;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PREPARANDO A CORRIDA ===");

        Veiculo carro1 = new Veiculo();
        Veiculo carro2 = new Veiculo();

        Corrida corrida = new Corrida(50, carro1, carro2);

        System.out.println("=== LARGADA! ===");

        corrida.iniciar();
    }
}