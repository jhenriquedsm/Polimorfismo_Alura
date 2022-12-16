public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(int agencia, int numero){
        super(agencia, numero);
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
}
