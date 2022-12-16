public class TesteFuncionario {
    public static void main(String[] args) {
        
        Gerente henrique = new Gerente();
        henrique.setNome("Henrique");
        henrique.setCpf("123456789-00");
        henrique.setSalario(2500.00);

        System.out.println("Nome: " + henrique.getNome());
        System.out.println("Bonificação: " + henrique.getBonificao());
    }
}
