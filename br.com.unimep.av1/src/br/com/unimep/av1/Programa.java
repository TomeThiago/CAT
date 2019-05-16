package br.com.unimep.av1;

import java.util.Scanner;
import br.com.unimep.av1.Animal;
import br.com.unimep.av1.Gato;

public class Programa {
	public static void main(String[] args) {
		
		Animal gato1 = (Gato) new Gato("Kuro");
		
		gato1.setQuantPatas(4);
		gato1.setTipoAnimal("Mamífero");
		gato1.setSexo("Macho");
		((Gato) gato1).setCorPelo("Preto");
		((Gato) gato1).setCorDosOlhos("Castanho");
		((Gato) gato1).setRaca("Persa");
		
		Scanner op = new Scanner(System.in);
		
		System.out.printf("Você ganho um novo Gatinho! Deseja conhêce-lo? Sim(1) - Não(2): ");
		int res = op.nextInt();

		
		if (res == 1) {
			System.out.println("1 - Qual é o nome dele?\n2 - Qual é a raça dele?\n3 - Qual é o sexo dele?\n"+
			"4 - Qual é cor dos Pelos dele?\n5 - Qual é cor dos olhos dele?\n0 - Sair");			
					
			int esc = -1;
			
			//Rodar o jogo em forma de loop até o usuário selecionar a opção 0 de sair
			while (!(esc == 0)) {
				System.out.printf("Selecione o que você deseja saber dele: ");
				esc = op.nextInt();
				 
				switch (esc) {
				case 1:
					System.out.println(gato1.getNome());
					break;
				case 2:
					System.out.println(((Gato) gato1).getRaca());
					break;
				case 3:
					System.out.println(gato1.getSexo());
					break;
				case 4:
					System.out.println(((Gato) gato1).getCorPelo());
					break;
				case 5:
					System.out.println(((Gato) gato1).getCorDosOlhos());
					break;
	
				default:
					System.out.println("Não entendi!");
					break;
				}
			}
			
			System.out.println("\n1 - Durma.\n2 - Coma alguma coisa\n3 - Acorde\n"+
					"4 - Dê uma volta\n5 - Miar\n6 - AtivarGarras\n7 - Verificar Saúde\n0 - Sair");			
				
				//Reinicializar a variavel pois o esc até chegar aqui ele saiu do evento anterior 3 no loop de baixo já 
				// vir 
				esc = -1;
					
					while (!(esc == 0)) {
						System.out.printf("\nSelecione o que você deseja que ele faça: ");
						 esc = op.nextInt();
						 
						switch (esc) {
						case 1:
							gato1.dormir();
							break;
						case 2:
							gato1.comer();
							break;
						case 3:
							gato1.acordar();
							break;
						case 4:
							((Gato) gato1).andar();
							break;
						case 5:
							((Gato) gato1).miar();
							break;
						case 6:
							((Gato) gato1).ativarGarras();
							break;
						case 7:
							System.out.println("Status: " + gato1.verificarSaude());
							break;
			
						default:
							System.out.println("Não entendi!");
							break;
						}
					}
					
					System.out.println("Parabéns você conheceu seu gatinho.. Até Mais!");
					op.close();	
			 
		}
		else if (res == 2)
		 System.out.println("Tudo bem, seu gatinho ficará te esperando!");
		else {
			System.out.println("Não entendi o que você quis dizer :\\");
		}
		
	}
}
