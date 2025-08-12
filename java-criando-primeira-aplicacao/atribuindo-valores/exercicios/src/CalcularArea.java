void main() {
    Scanner userInput = new Scanner(System.in);

    System.out.println("""
            Qual tipo de operação você deseja?
            [1] - Calcular area do quadrado
            [2] - Calcular area do circulo
            """);
    int choose = userInput.nextInt();

    switch (choose) {
        case 1:
            System.out.println("Informe o lado desse quadrado: ");
            int side = userInput.nextInt();
            int square = side * side;

            System.out.printf("A area desse quadrado é: %d", square);
            break;

        case 2:
            System.out.println("Informe o raio: ");
            int radius = userInput.nextInt();
            double areaCirculo = Math.PI * radius * radius;

            System.out.printf("Area desse circulo: %d", (int) areaCirculo);
    }
}
