public class Gerente extends Funcionario implements Autenticavel{

    private Autenticador autenticador;

    public Gerente(){
        this.autenticador = new Autenticador();
    }

    public double getBonificao(){
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
    
}
