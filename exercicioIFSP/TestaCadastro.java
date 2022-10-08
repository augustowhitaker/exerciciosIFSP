package exercicioIFSP;

public class TestaCadastro {
    public static void main(String[] args) {
        
        Cliente cliente  = new Cliente("Fia", new Data(20, 01, 2018), 10);

        Funcionario funcionario = new Funcionario("Ginger", new Data(12, 4, 2020), 1300);

        Gerente gerente = new Gerente("Downy", new Data(03, 05, 2018), 3200, "comercial");
        
        CadastroPessoas cadastro = new CadastroPessoas();

        cadastro.cadastraPessoa(gerente);
        cadastro.cadastraPessoa(funcionario);
        cadastro.cadastraPessoa(cliente);

        cadastro.imprimeCadastro(gerente);
        cadastro.imprimeCadastro(funcionario);
        cadastro.imprimeCadastro(cliente);


        System.out.println("Existem atualmente " + cadastro.qtdAtual + " cadastros no sistema");
    }
}
