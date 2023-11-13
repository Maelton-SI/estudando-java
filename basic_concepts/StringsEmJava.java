public class StringsEmJava {
    
    public static void main(String[] args) {

        StringBuffer nome = new StringBuffer("Albert Einstein");
        StringBuffer nome2 = nome;

        nome.append(" (instancia alterada)");

        System.out.println("nome -> " + nome);
        System.out.println("nome2 -> " + nome2);

        
    }
}