void main() {
    Scanner userInput = new Scanner(System.in);

    //Entrada do usúario.
    System.out.println("Digite um número inteiro: ");
    int user = userInput.nextInt();

    //Verificando se é positivo ou negativo
    if (user >= 0) {
        System.out.println("Positivo.");
    } else {
        System.out.println("Negativo.");
    }
}
