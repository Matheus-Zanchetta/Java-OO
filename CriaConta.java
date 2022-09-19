public class CriaConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1337, 2569);
        conta1.depositar(1000);
        conta1.sacar(500.50);

    }
}