public abstract class Funcionario { // classes abstratas n podem ser instanciadas
    
    private String nome;
    private String cpf;
    private double salario;
    
    public abstract double getBonificao(); // a implementação está nas classes filhas
        
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
