package pessoasheranca;

public class PessoasHeranca {

    public static void main(String[] args) {
    
        PessoaObjeto[] aluno = new PessoaObjeto[2];
        
        aluno[0] = new Aluno("2222", "TI", "Gerivaldo", 26, "M");
        System.out.println(aluno[0].toString());
        
        aluno[0].fazerAniv();
        
        
    }
    
}
