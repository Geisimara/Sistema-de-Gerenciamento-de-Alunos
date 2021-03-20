package Sistema.alunos.geisimara.git;

import java.util.Scanner;

public class program {
	
	static Scanner ler = new Scanner(System.in);
	
	 Cursos curso1 = new Cursos("Sistemas de Informação","noite","4 anos");
     Cursos curso2 = new Cursos("Analise e Desenvolvimento de Sistemas ","noite","2 anos");
     Cursos curso3 = new Cursos("Ciencias da Computação","manhã","3 anos");
     Cursos curso4 = new Cursos("Engenharia da Computação","tarde"," 5 anos");
	
	Disciplinas disciplina1 = new Disciplinas("Programação","120 horas",80.0);
    Disciplinas disciplina2 = new Disciplinas("Banco de Dados","100 horas",75.0);
    Disciplinas disciplina3 = new Disciplinas("Estatistica","80 horas",60.5);
    Disciplinas disciplina4 = new Disciplinas("Logica de Programação","100 horas",70.0);
    Disciplinas disciplina5 = new Disciplinas("Sistemas Operacionais","80 horas",90.0);
    Disciplinas disciplina6 = new Disciplinas("Designe de Interação","100 horas",65.0);
   				        
	 
	 Alunos aluno1 = new Alunos("Maria de Souza",20,"123.456.789-87 ","Rua Oliveira nº 109 ");
     Alunos aluno2 = new Alunos("Caio Fernades",26,"212.435.777-98 ","Rua A nº 1008");
     Alunos aluno3 = new Alunos("Jonatan da Silva",27,"542.098.876-09 ","Rua dos Anjos nº 43 ");
     Alunos aluno4 = new Alunos("Sofia da Luz",21,"221.432.624-01 ","Av. Afonso Pena nº 2020");
	
	public void Menu() {
		
    int opcao = 0;
		
		do {
			System.out.println("\n\n###  - SISTEMA DE GERENCIAMENTO DE ALUNOS DA FACULDADE ###");
			System.out.println("                  ================================");
			System.out.println("                  |    1- GERENCIAR ALUNOS       |");
			System.out.println("                  |    2- GERENCIAR DISCIPLINAS  |");
			System.out.println("                  |    3- GERENCIAR CURSOS       |");
			System.out.println("                  |    4- SAIR                   |");
			System.out.println("                  ================================\n");
			
			opcao = ler.nextInt();
			System.out.print("\n");
			switch (opcao) {
			
			case 1:
				int opcao1 = 0;
			 do {
				System.out.println(" 1- GERENCIAR ALUNOS");
				
				System.out.println("                  ================================");
				System.out.println("                  |    1- CADASTRAR ALUNOS       |");
				System.out.println("                  |    2- CONSULTAR ALUNO        |");
				System.out.println("                  |    3- REMOVER ALUNO          |");
				System.out.println("                  |    4- ATUALIZAR ALUNO        |");
				System.out.println("                  |    5- VOLTAR AO MENU INICIAL |");
				System.out.println("                  ================================\n");
			 }while (opcao1 !=0);
			 
			    opcao1 = ler.nextInt();
				System.out.print("\n");
				
				switch (opcao1) {
				
				case 1 :
					System.out.println("                  =======================================");
					System.out.println("                  |   ALUNOS CADASTRADOS COM SUCESSO !! |");
					System.out.println("                  =======================================");
					System.out.println("\n");
					
									    						    				     
				    aluno1.setCurso(curso3);
				    aluno2.setCurso(curso1);
				    aluno3.setCurso(curso3);
				    aluno4.setCurso(curso2);
				    
				     ListaAlunos.Cadastrar(aluno1);
				     ListaAlunos.Cadastrar(aluno2);
				     ListaAlunos.Cadastrar(aluno3);
				     ListaAlunos.Cadastrar(aluno4);
				    
				     
					break;	
					
				case 2 :
					System.out.println("                  =======================================");
					System.out.println("                  |          CONSULTAR ALUNOS           |");
					System.out.println("                  =======================================");
					System.out.println("\n");
					
					ListaAlunos.Consultar();
					
					break;
					
				case 3 :
					System.out.println("                  =======================================");
					System.out.println("                  |          REMOVER ALUNO              |");
					System.out.println("                  =======================================");
					System.out.println("\n");
					
					
					ListaAlunos.Remover("Jonatan da Silva", "Ciencias da Computação");
					
					break;
				case 4 : 
					System.out.println("                  =======================================");
					System.out.println("                  |          ATUALIZADO ALUNO           |");
					System.out.println("                  =======================================");
					System.out.println("\n");
					
					ListaAlunos.Atualizar("Maria de Souza", "Maria de Souza", 22, "123.456.789-87 ", "Rua Oliveira n� 109 ", curso1);
					break;
					
				default:
					System.out.println("                  =======================================");
					System.out.println("                  |         VOLTAR AO MENU INICIAL      |");
					System.out.println("                  =======================================");
					System.out.println("\n");
					Menu();
					break;
					
				}			  
				break; // termina case 1 
				
			
				
			case 2:
				
				int opcao2 = 0;
				 do {
					System.out.println(" 1- GERENCIAR DISCIPLINAS");
					
					System.out.println("                  ================================");
					System.out.println("                  |    1- CADASTRAR DISCIPLINAS  |");
					System.out.println("                  |    2- CONSULTAR DISCIPLINAS  |");
					System.out.println("                  |    3- REMOVER DISCIPLINAS    |");
					System.out.println("                  |    4- ATUALIZAR DISCIPLINAS  |");
					System.out.println("                  |    5- VOLTAR AO MENU INICIAL |");
					System.out.println("                  ================================\n");
					
				 }while (opcao2 !=0);
				 
				    opcao2 = ler.nextInt();
					System.out.print("\n");
					
					switch (opcao2) {
					
					case 1 :
						System.out.println("                  =======================================");
						System.out.println("                  | DISCIPLINAS CADASTRADAS COM SUCESSO!!|");
						System.out.println("                  =======================================");
						System.out.println("\n");
						
						
						ListaDisciplinas.Cadastrar(disciplina1);
				        ListaDisciplinas.Cadastrar(disciplina2);
				        ListaDisciplinas.Cadastrar(disciplina3);
				        ListaDisciplinas.Cadastrar(disciplina4);
				        ListaDisciplinas.Cadastrar(disciplina5);
				        ListaDisciplinas.Cadastrar(disciplina6);			    			       
				       			        
				        
						break;	
						
					case 2 :
						System.out.println("                  =======================================");
						System.out.println("                  |        CONSULTAR DISCIPLINAS        |");
						System.out.println("                  =======================================");
						System.out.println("\n");
						
						ListaDisciplinas.Consultar();

						break;
						
					case 3 :
						
						
						ListaDisciplinas.Remover("Estatistica");
						break;
					case 4 : 
						System.out.println("                  =======================================");
						System.out.println("                  | DISCIPLINA ATUALIZADA COM SUCESSO !!|");
						System.out.println("                  =======================================");
						System.out.println("\n");
						
						ListaDisciplinas.Atualizar("Designe de Interação", "Designe de Interação","80 horas",65.0);
						
						break;
						
					default:
						
						
						System.out.println("                  =======================================");
						System.out.println("                  |         VOLTAR AO MENU INICIAL      |");
						System.out.println("                  =======================================");
						System.out.println("\n");
						Menu();
						break;
					}
				
				break; // termina case 2
		
				
				
				
				
				
			case 3:
				
				int opcao3 = 0;
				
				 do {
					System.out.println(" 1- GERENCIAR CURSOS");
					
					System.out.println("                  ================================");
					System.out.println("                  |    1- CADASTRAR CURSOS       |");
					System.out.println("                  |    2- CONSULTAR CURSOS       |");
					System.out.println("                  |    3- REMOVER CURSOS         |");
					System.out.println("                  |    4- ATUALIZAR CURSOS       |");
					System.out.println("                  |    5- VOLTAR AO MENU INICIAL |");
					System.out.println("                  ================================\n");
					
				 }while (opcao3 !=0);
				 
				    opcao3 = ler.nextInt();
					System.out.print("\n");
					
				
				
				switch (opcao3) {
					
					case 1 :
						System.out.println("                  =======================================");
						System.out.println("                  |  CURSOS CADASTRADOS COM SUCESSO !!  |");
						System.out.println("                  =======================================");
						System.out.println("\n");
						
						
					     
					     ListaCursos.Cadastrar(curso1);
					     ListaCursos.Cadastrar(curso2);
					     ListaCursos.Cadastrar(curso3);
					     ListaCursos.Cadastrar(curso4);
					     
					     
					        curso1.disciplinas.add(disciplina1);						
					        curso1.disciplinas.add(disciplina2);
					        curso1.disciplinas.add(disciplina3);				
					        curso1.disciplinas.add(disciplina4);
					        
					        curso2.disciplinas.add(disciplina1);
					        curso2.disciplinas.add(disciplina3);
					        curso2.disciplinas.add(disciplina5);				
					        curso2.disciplinas.add(disciplina6);
					        
					        curso3.disciplinas.add(disciplina1);
					        curso3.disciplinas.add(disciplina3);
					        curso3.disciplinas.add(disciplina5);
					     
					     					     
						break;	
						
					case 2 :
						System.out.println("  2- CONSULTAR CURSOS    ");
						System.out.print("\n");
						
						ListaCursos.Consultar();
						
						break;
						
					case 3 :
						System.out.println("                  =======================================");
						System.out.println("                  |    CURSO REMOVIDO COM SUCESSO !!    |");
						System.out.println("                  =======================================");
						System.out.println("\n");
						
						ListaCursos.Remover("Engenharia da Computação", null);
						
						break;
					case 4 : 
						System.out.println("                  =======================================");
						System.out.println("                  |   CURSO ATUALIZADO COM SUCESSO !!   |");
						System.out.println("                  =======================================");
						System.out.println("\n");
						
						ListaCursos.Atualizar("Ciencias da Computação", "Ciencias da Computação", "manhã", "4 anos");
						
						break;
						
					default:
						System.out.println("                  =======================================");
						System.out.println("                  |         VOLTAR AO MENU INICIAL      |");
						System.out.println("                  =======================================");
						System.out.println("\n");
						Menu();
						
						break;
					}
				break; // termina case 3
				
			case 4:
				System.out.println("                  =======================================");
				System.out.println("                  |                  SAIR               |");
				System.out.println("                  =======================================");
				System.out.println("\n");
				Menu();
				break;
				
			default:
				System.out.println("OPÇÃO INVALIDA !!");
				break;
			}
			
			
		}while (opcao != 0);
	}

	public static void main(String[] args) {
		
		program x = new program();
		x.Menu();
				
		

	}

}
