package Sistema.alunos.geisimara.git;
import java.util.ArrayList;

public class ListaCursos {
    
    private static ArrayList<Cursos>ListaC = new ArrayList<>();
  
    
    public static void Cadastrar(Cursos curso){
        ListaC.add(curso);
    }
    
    public static void Consultar(){      
        int cont = 1;
       for(Cursos x: ListaC) {
        	System.out.println(" =================================== ");
            System.out.println("|           CURSO Nº "+ (cont++) + "              |");                     
            System.out.println(" ====================================");
        	x.Exibir();
        }
    }
    
    public static void Atualizar(String entrarnome,String nome,String turno,String duracao){
    	for(Cursos x: ListaC){
    	    if(x.getNome().equals(entrarnome)) {
    	    x.setNome(nome);	
    	    x.setTurno(turno);
    	    x.setDuracao(duracao);
    	    System.out.println("  CURSO ATUALIZADO COM SUCESSO !! ");
			System.out.println("\n");
           }   	    
        }
    } 
    

    public static boolean Remover(String nome,String aluno){
    	if(ListaC.size() == 0){
            return false;
        }
        else{
           for(Cursos x: ListaC){
              if(x.getNome().equals(nome)) {
                 ListaC.remove(x);
                 System.out.println("  CURSO REMOVIDO COM SUCESSO !! ");
     			 System.out.println("\n");
                 return true;                  
              }
              
           }
           ListaAlunos.Remover(aluno,nome);
           return true;
        }
    	 
    }  
     
    public static ArrayList<Cursos> getListaC() {
        return ListaC;
    }

    public static void setListaC(ArrayList<Cursos> aListaC) {
        ListaC = aListaC;
    }
}