package br.com.ucsal.simulador.modelos;

public class Corrida {
    private int distanciaMaxima;
    private Veiculo veiculo1;
    private Veiculo veiculo2;

    public Corrida(int distanciaMaxima, Veiculo veiculo1, Veiculo veiculo2){
        this.distanciaMaxima = distanciaMaxima;
        this.veiculo1 = veiculo1;
        this.veiculo2 = veiculo2;
    }

    public void iniciar() {

    while ((veiculo1.getDistancia() < distanciaMaxima) && (veiculo2.getDistancia() < distanciaMaxima)) {
        imprimirPista();

        veiculo1.andar();
        veiculo2.andar();
    }

    imprimirPista();
    
    int dist1 = veiculo1.getDistancia();
    int dist2 = veiculo2.getDistancia();

    if (dist1 >= distanciaMaxima && dist2 >= distanciaMaxima) {
        if (dist1 > dist2) {
            System.out.println("O carro 1 venceu a corrida!");
        } else if (dist2 > dist1) {
            System.out.println("O carro 2 venceu a corrida!");
        } else {
            System.out.println("A corrida terminou em empate!");
        }
    } else if (dist1 >= distanciaMaxima) {
        System.out.println("O carro 1 venceu a corrida!");
    } else {
        System.out.println("O carro 2 venceu a corrida!");
    }
}

    private void imprimirPista() {
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < veiculo1.getDistancia(); i++) {
            System.out.print(" ");
        }
        System.out.println("#");

        for (int i = 0; i < veiculo2.getDistancia(); i++) {
            System.out.print(" ");
        }
        System.out.println("#");

        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }

    public int getDistanciaMaxima() {
        return distanciaMaxima;
    }
}