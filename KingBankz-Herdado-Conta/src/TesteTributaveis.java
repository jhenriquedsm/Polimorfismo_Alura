public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 4444);
        cc.deposita(100);

        SeguroVida seguro = new SeguroVida();

        CalculadorImposto calc = new CalculadorImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.println("Total de impostos: " + calc.getTotalImposto());
    }
}
