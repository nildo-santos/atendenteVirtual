package controllers;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

import entities.Atendimento;

public class AtendimentoController {
	
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
		
		scanner.close();
	}
}
