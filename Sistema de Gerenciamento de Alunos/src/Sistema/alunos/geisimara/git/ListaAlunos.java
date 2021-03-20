package Sistema.alunos.geisimara.git;
import java.util.ArrayList;

public class ListaAlunos{
    
    private static ArrayList<Alunos>ListaA = new ArrayList<>();
    
    public static void Cadastrar(Alunos aluno){
        ListaA.add(aluno);
    }
    
    public static void Consultar(){
        int cont = 1;
        for(Alunos x : ListaA) {
            System.out.println(" =================================== ");
            System.out.println("|           ALUNO Nº "+ (cont++) + "              |");                   
            System.out.println(" ====================================");
            x.Exibir();
        }
    }
    
    public static void Atualizar(String entrarcomnome,String nome,int idade,String cpf, String endereco,Cursos curso){
    	for(Alunos x: ListaA){
    		if(x.getNome().equals(entrarcomnome)) {
    			
	    		x.setNome(nome);
	    		x.setIdade(idade);
	    		x.setCpf(cpf);
	    		x.setEndereco(endereco);
	    		x.setCurso(curso);
    		
	    		System.out.println("  ALUNO ATUALIZADO COM SUCESSO !! ");
				System.out.println("\n");
           }    		
        }
    }
    
    public static boolean Remover(String nome, String curso){
        if(ListaA.size() == 0){      	
            return false;
        }
        else{
           for(Alunos x: ListaA){
              if(x.getNome().equals(nome)) {
                  ListaA.remove(x); 
                   
				  System.out.println("  ALUNO REMOVIDO COM SUCESSO !! ");
				  System.out.println("\n");					
                  return true;
              }            
           }     
           ListaCursos.Remover(nome, curso);
           return true;
        }
        
    }
    
	public static ArrayList<Alunos> getListaA() {
		return ListaA;
	}

	public static void setListaA(ArrayList<Alunos> listaA) {
		ListaA = listaA;
	}
}