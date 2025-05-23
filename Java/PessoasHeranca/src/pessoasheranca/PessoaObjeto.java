package pessoasheranca;

public abstract class PessoaObjeto {

    private String nome;
    private int idade;
    private String sexo;

    public PessoaObjeto(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
//  Procedimento / Procedure / Sem retorno
//  Abstrata / Obrigatoria / 
    public abstract void fazerAniv();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "PessoaObjeto{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
}
