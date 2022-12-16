public class TesteContas {
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(11, 5025);
        cc.deposita(500.0);

        ContaPoupanca cp = new ContaPoupanca(11, 4050);
        cp.deposita(250.0);

        cc.transfere(250.0, cp); // saca da conta o valor + a taxa e deposita na outra conta o valor de transferencia.

        System.out.println("Saldo CC: " + cc.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());
    }
}
