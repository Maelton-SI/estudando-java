package enums;

public enum Automovel {
    Motocicleta(1000), Carro(2000);

     final double preco;

    Automovel(double preco)
    {
       this.preco = preco;
    }

    public double getPreco()
    {
        return this.preco;
    }
}
