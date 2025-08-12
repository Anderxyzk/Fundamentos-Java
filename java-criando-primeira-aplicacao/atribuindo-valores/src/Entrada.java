import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String movie = entrada.nextLine();

        System.out.println("Ano de lançamento: ");
        int yearlaunch = entrada.nextInt();

        System.out.println("Avaliação do Filme: ");
        double moviegrade = entrada.nextDouble();

        System.out.println(movie);
        System.out.println(yearlaunch);
        System.out.println(moviegrade);
    }
}
