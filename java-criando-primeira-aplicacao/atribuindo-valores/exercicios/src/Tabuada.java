void main() {

    Scanner userInput = new Scanner(System.in);

    System.out.println("Insira um valor inteiro para saber sua tabuada: ");
    int tabuada = userInput.nextInt();

    int multiplicador = 0;

    for (int i = 0; i < 10; i++) {
        multiplicador++;
        int resultado = tabuada * multiplicador;
        System.out.printf("%d x %d = %d\n", tabuada, multiplicador, resultado);
    }
}
