package tarefa13;

public class PessoaJuridica {
   private long CNPJ;
   private String nomeEmpresa;

    //Métodos
    public void informacoesEmpresa(){
        System.out.println("------------------");
        System.out.println("Nome da Empresa: " + this.getNomeEmpresa());
        System.out.println("Número do CNPJ: " + this.getCNPJ());
        System.out.println("------------------");

    }

    public void abrirEmpresa(String t){


    }

    //Métodos Especiais

    public PessoaJuridica() {
        this.getNomeEmpresa();
        this.getCNPJ();

    }

    public long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(long CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
}