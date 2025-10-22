package repositories;

import java.io.PrintWriter;

import entities.Atendimento;
import interfaces.AtendimentoRepository;

public class AtendimentoRepositoryXml implements AtendimentoRepository {

	@Override
	public void exportarAtendimento(Atendimento atendimento) throws Exception {
		
		var printWriter = new PrintWriter("c:\\temp\\atendimento_" + atendimento.getId() + ".xml");
		
		printWriter.write("<?xml version='1.0' encoding='UTF-8'?>");
		
		printWriter.write("<atendimento>");
			printWriter.write("<id>" + atendimento.getId() + "</id>");
			printWriter.write("<nomeUsuario>" + atendimento.getNomeUsuario() + "</nomeUsuario>");
			printWriter.write("<data>" + atendimento.getDataHora() + "</data>");
			printWriter.write("<pergunta>" + atendimento.getPergunta() + "</pergunta>");
			printWriter.write("<resposta>" + atendimento.getResposta() + "</resposta>");
		printWriter.write("</atendimento>");
		
		printWriter.close();
	}	
}
