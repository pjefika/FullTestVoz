package entidades.linha;

import java.util.List;

import entidades.diagnostico.Diagnostico;


public interface Linha {

	List<Diagnostico> getDiagnostico();
	
	void setDiagnostico(List<Diagnostico> diagnostico);
}
