package pessoasheranca;

public class Aluno extends PessoaObjeto{
    
    private String matricula, curso;

    public Aluno(String matricula, String curso, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public void cancelarMatricula() {
        System.out.println("Matricula cancelada");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "matricula "
                + ""
                + "=" + matricula + ", curso =" + curso +'}';
    }

    @Override
    public void fazerAniv() {
        System.out.println("Feliz aniversario Aluno");
    }
 
}
