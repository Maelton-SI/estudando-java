import enums.Automovel;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Automovel cgTitan160 = Automovel.Motocicleta;
        Automovel celtaSedan = Automovel.valueOf("Carro");

        System.out.println(cgTitan160.name());
        System.out.println(cgTitan160.getClass().getName());
        System.out.println(cgTitan160.getClass().getSuperclass());
        System.out.println(Arrays.stream(Automovel.values()).toList());
        System.out.println(celtaSedan.getPreco());
        }
}