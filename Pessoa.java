package tarefa13;

public class Pessoa {
    public static void main(String[] args) {
        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Paulo");
        p1.setCPF(222222222);
        p1.informacoes();

        PessoaJuridica p2 = new PessoaJuridica();
        p2.setCNPJ(545896548);
        p2.setNomeEmpresa("PaulosaInc");
        p2.informacoesEmpresa();




    }
}
