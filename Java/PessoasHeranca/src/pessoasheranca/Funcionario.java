package pessoasheranca;

public class Funcionario extends PessoaObjeto {

    private String setor;
    private boolean trabalhando;

    public Funcionario(String setor, boolean trabalhando, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho() {
        System.out.println("Trabalho mudado com sucesso");
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    @Override
    public String toString() {
        return super.toString() + "setor=" + setor + ", trabalhando=" + trabalhando + '}';
    }

    @Override
    public void fazerAniv() {
        System.out.println("Feliz aniversario funcionario");
    }
    
}
