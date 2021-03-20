package Sistema.alunos.geisimara.git;
import java.util.ArrayList;


public class ListaDisciplinas {
	
    private static ArrayList<Disciplinas> ListaD = new ArrayList<>();
    
    public static void Cadastrar(Disciplinas disciplina){
        ListaD.add(disciplina);
    }
    
    public static void Consultar(){
        int cont = 1;
        for(Disciplinas x: ListaD){
        	System.out.println(" =================================== ");
        	System.out.println("|           DISCIPLINA Nº "+ (cont++) + "           |");                     
        	System.out.println(" ====================================");
            x.Exibir();
        }
    }
    
    public static void Atualizar(String entarcomnome,String nome,String cargahoraria,double nota){
    	for(Disciplinas x: ListaD){
    		if(x.getNome().equals(entarcomnome)) {
    		   x.setNome(nome);
    		   x.setCargahoraria(cargahoraria);
    		   x.setNota(nota);   		
    		   System.out.println("  DISCIPLINA ATUALIZADA COM SUCESSO !! ");
			   System.out.println("\n");
            }
    		
         }
    }
    
    public static boolean Remover(String nome){       
        if(ListaD.size() == 0){
            return false;
        }
        else{
           for(Disciplinas x: ListaD){
              if(x.getNome().equals(nome)) {
                  ListaD.remove(x);
                  x.setNome("Disciplina Removida");
                  x.setCargahoraria(null);
                  x.setNota(0); 
                  System.out.println("  DISCIPLINA REMOVIDA COM SUCESSO !! ");
   			      System.out.println("\n");
                  return true;
                
              }             
           }
           return true;
        }      
    }

    public static ArrayList<Disciplinas> getListaD() {
        return ListaD;
    }

    public static void setListaD(ArrayList<Disciplinas> aListaD) {
        ListaD = aListaD;
    }

}
