public class TesteGerente {
    public static void main(String[] args) {

        Autenticavel referencia = new Gerente();
        referencia.setSenha(2222);
        
        Gerente g1 = new Gerente();
        g1.setNome("Lorenzo");
        g1.setCpf("123456789-11");
        g1.setSalario(5000);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(2280);
        boolean autenticou = g1.autentica(2280); 

        System.out.println(autenticou);
        System.out.println(g1.getBonificao()); 
    }
}
