public class TestaBanco {
    public static void main(String[] args) {
        Cliente matheus = new Cliente();
        matheus.setNome("Matheus");
        matheus.setCPF("01362001066");
        matheus.setProfissao("Programador");

        Conta contaDoMatheus = new Conta(1337, 25483);
        contaDoMatheus.depositar(1000);
        contaDoMatheus.sacar(300);

        //associa matheus a contaDoMatheus
        contaDoMatheus.setTitular(matheus);
        System.out.println(contaDoMatheus.getTitular().getNome());




    }

}
