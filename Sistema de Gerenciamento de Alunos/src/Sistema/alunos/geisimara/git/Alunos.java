package Sistema.alunos.geisimara.git;

public class Alunos {
    
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private Cursos curso;
   
    public Alunos(){
        
    }
    public Alunos(String nome,int idade,String cpf,String endereco){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
    }
 
    public Alunos(String nome,int idade,String cpf,String endereco,Cursos curso){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.curso = curso;
    }
    
    public void Exibir(){   	    	
    		System.out.println("======= INFORMAÇÕES DO ALUNO ========");
        	System.out.println("");
            System.out.println("Nome: " + this.getNome());
            System.out.println("Idade: " + this.getIdade());
            System.out.println("Cpf: " + this.getCpf());
            System.out.println("Endereço: " + this.getEndereco()); 
            System.out.println("======= INFORMAÇÕES DO CURSO ========");
            curso.Exibir();    	  	   	
    }
    
    
  // GETS E SETS 
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }
}