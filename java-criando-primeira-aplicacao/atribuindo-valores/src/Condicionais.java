void main() {
    int yearlaunch = 2021;
    boolean planinclue = true;
    double moviegrade = 8.1;
    String plan = "plus";

    if (yearlaunch >= 2021) {
        System.out.println("Filme novo!");
    } else {
        System.out.println("Filme antigo!");
    }

    if (planinclue && plan.equals("plus")) {
        System.out.println("Filme liberado!");
    } else {
        System.out.println("Filme não está disponivel");
    }
}
