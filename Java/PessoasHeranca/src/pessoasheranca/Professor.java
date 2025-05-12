package pessoasheranca;

public class Professor extends PessoaObjeto{

    private String especialidade;
    private double salario;

    public Professor(String especialidade, double salario, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }
    
    public void aumento(){
        System.out.println("15.000,00");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "especialidade=" + especialidade + ", salario=" + salario + '}';
    }
    
    

    @Override
    public void fazerAniv() {
        System.out.println("Feliz aniversario professor");
    }
    
}
