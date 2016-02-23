package entidades.linha;

import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPOut;

import entidades.diagnosticos.Diagnostico;

public class LinhaSip extends Linha implements LinhaInterface{
	
	private Boolean gpon;
	
	private DiagnosticoSIPOut diagnostico;
	
	
	public LinhaSip() {
		super();
	}

	public Boolean getGpon() {
		return gpon;
	}

	public void setGpon(Boolean gpon) {
		this.gpon = gpon;
	}

	@Override
	public String toString() {
		return "IMS-SIP";
	}

	public void setDiagnostico(DiagnosticoSIPOut diagnostico) {
		this.diagnostico = diagnostico;
	}
}
