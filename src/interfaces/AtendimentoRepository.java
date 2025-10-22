package interfaces;

import entities.Atendimento;

public interface AtendimentoRepository {

	/*
	 * Métodos abstratos
	 */
	public void exportarAtendimento(Atendimento atendimento) throws Exception;
	
}
