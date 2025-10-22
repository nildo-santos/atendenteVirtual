package controllers;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

import entities.Atendimento;
import interfaces.AtendimentoRepository;
import repositories.AtendimentoRepositoryJson;
import repositories.AtendimentoRepositoryXml;

public class AtendimentoController {
	
	//Atributo
	private AtendimentoRepository repository;
	
	/*
	 * Método para realizar um atendimento
	 */
	public void realizarAtendimento() throws Exception{
		
		var scanner = new Scanner(System.in);
		
		System.out.println("\nSEJA BEM VINDO AO ATENDENTE VIRTUAL!\n");
		System.out.println("Tire suas dúvidas de suporte de TI:\n");
		
		var atendimento = new Atendimento(); //instanciando a classe atendimento
		
		atendimento.setId(UUID.randomUUID()); //gerando um ID para o atendimento
		atendimento.setDataHora(new Date()); //gerando a data e hora atual
		
		System.out.print("Informe o seu nome........: ");
		atendimento.setNomeUsuario(scanner.nextLine());
		
		System.out.print("Escreva a sua pergunta....: ");
		atendimento.setPergunta(scanner.nextLine());
		
		System.out.print("Como deseja gravar este atendimento? (1) JSON ou (2)XML? ");
		var opcao = Integer.parseInt(scanner.nextLine());
		
		switch(opcao) {
		case 1: repository = new AtendimentoRepositoryJson(); break; //Polimorfismo
		case 2: repository = new AtendimentoRepositoryXml(); break; //Polimorfismo
		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		if(repository != null) {			
			//exportando o atendimento
			repository.exportarAtendimento(atendimento);
		}
		
		scanner.close();
	}
}