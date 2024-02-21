package tarefa13;

public class PessoaFisica {
    //Atributos
    private long CPF;
    private String nome;


    //Métodos
    public void informacoes(){
        System.out.println("------------------");
        System.out.println("Nome da Pessoa: " + this.getNome());
        System.out.println("Número do CPF: " + this.getCPF());
        System.out.println("------------------");

    }

    //Métodos Especiais

    public PessoaFisica() {
        this.getNome();
        this.getCPF();
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

