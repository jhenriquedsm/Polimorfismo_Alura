public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario f){ // polimorfismo -> todas as classes filhas de funcionario se encaixam aqui
        double boni = f.getBonificao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }
}
