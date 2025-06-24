public class HelloWorldParametros {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello World " + String.join(" ", args));
        } else {
            System.out.println("Hello World (sem parâmetros)");
        }
    }
}
