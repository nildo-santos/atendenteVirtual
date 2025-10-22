package repositories;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import entities.Atendimento;
import interfaces.AtendimentoRepository;

public class AtendimentoRepositoryJson implements AtendimentoRepository {

	@Override
	public void exportarAtendimento(Atendimento atendimento) throws Exception {

		// Definindo o arquivo que será criado
		var file = new File("c:\\temp\\atendimento_" + atendimento.getId() + ".json");

		// Exportar os dados para um arquivo JSON
		var objectMapper = new ObjectMapper();
		objectMapper.writeValue(file, atendimento);

	}
}