public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;


    public Conta(int agencia, int numero){
        total ++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Seu saldo após o depósito é de: " + this.saldo + " R$");
    }

    public boolean sacar(double valor) {

        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Seu saldo após o saque é de: " + this.saldo + " R$");
            return true;
        } else {
            System.out.println("Você não tem dinheiro sufiente par está operação!");
            return false;
        }
    }

    public boolean transferir(double valor, Conta destino) {
        if (this.saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Seu saldo após a transferência é de: " + this.saldo + " R$");
            return true;
        } else {
            System.out.println("Você não tem dinheiro sufiente par está operação!");
            return false;
        }

    }

    public double getSaldo() {
        System.out.println(this.saldo);
        return this.saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

}

