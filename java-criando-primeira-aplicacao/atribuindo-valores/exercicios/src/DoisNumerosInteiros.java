void main() {

    Scanner userInput = new Scanner(System.in);

    System.out.println("Insira o primeiro número: ");
    int n1 = userInput.nextInt();

    System.out.println("Insira o segundo número: ");
    int n2 = userInput.nextInt();

    if (n1 == n2) {
        System.out.println("Números iguais.");
    } else if (n1 < n2) {
        System.out.printf("Números diferentes! %d é menor que %d", n1, n2);
    } else {
        System.out.printf("Números diferentes! %d é maior que %d", n1, n2);
    }
}
