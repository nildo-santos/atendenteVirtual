package principal;

import controllers.AtendimentoController;

public class Main {

	public static void main(String[] args) {
		
		//Criando um objeto da classe de controle:
		var atendimentoController = new AtendimentoController();

		try {
			//executando o atendimento
			atendimentoController.realizarAtendimento();
			
			System.out.println("\nAtendimento realizado com sucesso!");
		}
		catch(Exception e) {
			System.out.println("\nErro ao realizar atendimento: " + e.getMessage());
		}
	}
}
