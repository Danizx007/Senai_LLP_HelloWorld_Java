import java.util.Scanner;

public class HelloWorldInterativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Hello World " + nome);
        entrada.close();
    }
}
