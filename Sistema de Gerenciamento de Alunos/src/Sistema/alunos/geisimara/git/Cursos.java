package Sistema.alunos.geisimara.git;
import java.util.ArrayList;
import java.util.List;

public class Cursos {
    
	    private String nome;
	    private String turno;
	    private String duracao; 
	    protected List<Disciplinas> disciplinas;
	    
	    
		public Cursos(){
	    	
	    }   
		
	    public Cursos(String nome,String turno,String duracao){
	        this.nome = nome;
	        this.turno = turno;
	        this.duracao = duracao;
	        disciplinas = new ArrayList<Disciplinas>();
	    }

	    public void Exibir(){	    	
	    		System.out.println("Nome: " + this.nome);
		        System.out.println("Turno: " + this.turno);
		        System.out.println("Duracao: " + this.duracao);
		        ExibirCursoDisciplina();		              
	    }
	    

	    // LISTA DE DISCIPLINAS DENTRO DO CURSO
	    public void ExibirCursoDisciplina(){
	    	int contd = 1;
	    	for(Disciplinas d: disciplinas) {
	    		System.out.println("========== DISCIPLINAS Nº " + (contd++) + " ========== ");
	    	    System.out.println("Nome: " + d.getNome());
	            System.out.println("Carga Horaria: " + d.getCargahoraria());
	            System.out.println("Nota: " + d.getNota());
	    	}
	    }
	    
	    // GETS E SETS 
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getTurno() {
	        return turno;
	    }

	    public void setTurno(String turno) {
	        this.turno = turno;
	    }

	    public String getDuracao() {
	        return duracao;
	    }

	    public void setDuracao(String duracao) {
	        this.duracao = duracao;
	    }

		public List<Disciplinas> getDisciplinas() {
			return disciplinas;
		}
		public void setDisciplinas(List<Disciplinas> disciplinas) {
			this.disciplinas = disciplinas;
		}	  
}