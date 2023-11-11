class Carro {
    String cor = "rosa";
    float combustivel = 28.9F;

    public void abastecer(float litros) {
        combustivel += litros;
    }

    public float getCombustivel() {
        return combustivel;
    }
}

public class GerenciamentoDeMemoria {

    public static void main(String[] args) {

        int aux = 1;

        Carro celta = new Carro();

        celta.abastecer(10F);

        float combustivelAtual = celta.getCombustivel();
    }
}