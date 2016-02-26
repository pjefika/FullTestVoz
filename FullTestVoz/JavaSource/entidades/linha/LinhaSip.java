package entidades.linha;

import java.util.List;

import entidades.diagnostico.Diagnostico;

public class LinhaSip implements Linha{
	
	private List<Diagnostico> diagnostico;
	
	
	public LinhaSip() {

	}

	@Override
	public String toString() {
		return "IMS-SIP";
	}

	@Override
	public List<Diagnostico> getDiagnostico() {
		// TODO Auto-generated method stub
		return this.diagnostico;
	}

	@Override
	public void setDiagnostico(List<Diagnostico> diagnostico) {
		this.diagnostico = diagnostico;
	}
}
