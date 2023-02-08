package Herança;

public class TestaFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Guilherme Borges de Assis");
        gerente.setSalario(3000.58);
        gerente.setUsuario("guilherme.borges");
        gerente.setSenha("1997");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maykon Antonio");
        funcionario.setSalario(2500);
        funcionario.calculaBonificacao();

        Telefonista telefonista = new Telefonista();
        telefonista.setNome("Karina Leviana Souza");
        telefonista.setSalario(1700.00);
        telefonista.setEstacaoDeTrabalho(22);

        Secretaria secretaria = new Secretaria();
        secretaria.setNome("Natalia Silva");
        secretaria.setSalario(1400);
        secretaria.setRamal(5);

        System.out.println("##### Gerente #####");
        System.out.println("Nome: "+gerente.getNome());
        System.out.println("Salário: "+gerente.getSalario());
        System.out.println("Usuário: "+gerente.getUsuario());
        System.out.println("Senha: "+gerente.getSenha());
        System.out.println("Bonificação: "+gerente.calculaBonificacao());
        System.out.println("");

        System.out.println("##### Funcionario #####");
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Salário: "+funcionario.getSalario());
        System.out.println("Bonificação: "+funcionario.calculaBonificacao());
        System.out.println("");

        System.out.println("##### Telefonista #####");
        System.out.println("Nome: "+telefonista.getNome());
        System.out.println("Salário: "+telefonista.getSalario());
        System.out.println("Estação de Trabalho: "+telefonista.getEstacaoDeTrabalho());
        System.out.println("Bonificação: "+telefonista.calculaBonificacao());
        System.out.println("");

        System.out.println("##### Secretária #####");
        System.out.println("Nome: "+secretaria.getNome());
        System.out.println("Salário: "+secretaria.getSalario());
        System.out.println("Ramal: "+secretaria.getRamal());
        System.out.println("Bonificação: "+secretaria.calculaBonificacao());
        System.out.println("");
  



    }
}
