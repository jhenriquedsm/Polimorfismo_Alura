public class ContaCorrente extends Conta implements Tributavel{
    
    public ContaCorrente(int agencia, int numero){ //Construtores não são herdados
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) { // assinatura deve ser igual a da classe mãe
        double valorASacar = valor + 0.2; // taxa de 20 centavos
        return super.saca(valorASacar); // está sacando o valor + 20 centavos;
    }

    @Override
    public boolean deposita(double valor) {
        if(valor <= 0) {
			return false;
		} else {
			super.saldo += valor;
			return true;
		}
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
