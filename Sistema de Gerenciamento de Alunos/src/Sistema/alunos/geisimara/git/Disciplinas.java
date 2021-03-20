package Sistema.alunos.geisimara.git;


public class Disciplinas {
    
    private String nome;
    private String cargahoraria;
    private double nota;

    
    public Disciplinas(){
        
    }
    
    public Disciplinas(String nome,String cargahoraria,double nota){
        this.nome = nome;
        this.cargahoraria = cargahoraria;
        this.nota = nota;
    }
    
    public void Exibir(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Carga Horaria: " + this.getCargahoraria());
        System.out.println("Nota: " + this.getNota());
        System.out.println("\n");
    }
  
    
    // GETS E SETS 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(String cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
