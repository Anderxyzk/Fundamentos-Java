void main() {

    Scanner userInput = new Scanner(System.in);

    System.out.println("Digite um valor inteiro: ");
    int userValue = userInput.nextInt();

    if (userValue % 2 == 0) {
        System.out.println("Par!");
    } else {
        System.out.println("Impar!");
    }
}
