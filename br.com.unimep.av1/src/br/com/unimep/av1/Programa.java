package br.com.unimep.av1;

import java.util.Scanner;
import br.com.unimep.av1.Animal;
import br.com.unimep.av1.Gato;

public class Programa {
	public static void main(String[] args) {
		
		Animal gato1 = (Gato) new Gato("Kuro");
		
		gato1.setQuantPatas(4);
		gato1.setTipoAnimal("Mam�fero");
		gato1.setSexo("Macho");
		((Gato) gato1).setCorPelo("Preto");
		((Gato) gato1).setCorDosOlhos("Castanho");
		((Gato) gato1).setRaca("Persa");
		
		Scanner op = new Scanner(System.in);
		
		System.out.printf("Voc� ganho um novo Gatinho! Deseja conh�ce-lo? Sim(1) - N�o(2): ");
		int res = op.nextInt();

		
		if (res == 1) {
			System.out.println("1 - Qual � o nome dele?\n2 - Qual � a ra�a dele?\n3 - Qual � o sexo dele?\n"+
			"4 - Qual � cor dos Pelos dele?\n5 - Qual � cor dos olhos dele?\n0 - Sair");			
					
			int esc = -1;
			
			//Rodar o jogo em forma de loop at� o usu�rio selecionar a op��o 0 de sair
			while (!(esc == 0)) {
				System.out.printf("Selecione o que voc� deseja saber dele: ");
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
					System.out.println("N�o entendi!");
					break;
				}
			}
			
			System.out.println("\n1 - Durma.\n2 - Coma alguma coisa\n3 - Acorde\n"+
					"4 - D� uma volta\n5 - Miar\n6 - AtivarGarras\n7 - Verificar Sa�de\n0 - Sair");			
				
				//Reinicializar a variavel pois o esc at� chegar aqui ele saiu do evento anterior 3 no loop de baixo j� 
				// vir 
				esc = -1;
					
					while (!(esc == 0)) {
						System.out.printf("\nSelecione o que voc� deseja que ele fa�a: ");
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
							System.out.println("N�o entendi!");
							break;
						}
					}
					
					System.out.println("Parab�ns voc� conheceu seu gatinho.. At� Mais!");
					op.close();	
			 
		}
		else if (res == 2)
		 System.out.println("Tudo bem, seu gatinho ficar� te esperando!");
		else {
			System.out.println("N�o entendi o que voc� quis dizer :\\");
		}
		
	}
}
