package model.linha;

import java.rmi.RemoteException;

import com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagementProxy;
import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPIn;
import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPOut;

/**
 * 
 * @author G0042204
 * Instância de exemplo: 4133280564
 */
public class LinhaSipServico extends LinhaServico implements DiagnosticoLinha{
	
	private ConfiguradorOnlineDeviceManagementProxy diagSrvc;
	
	private DiagnosticoSIPOut diagnostico;
	
	public LinhaSipServico() {
		super();
		this.diagSrvc = new ConfiguradorOnlineDeviceManagementProxy();
	}

	@Override
	public void executarDiagnostico(String instancia, String designador) throws RemoteException {
		
		DiagnosticoSIPIn diagnosticoSIPIn = new DiagnosticoSIPIn();
		diagnosticoSIPIn.setCredencial(this.credenciais());
		diagnosticoSIPIn.setInstancia(instancia);
		diagnosticoSIPIn.setDesignadorTurbonet(designador);

		this.diagSrvc.executarDiagnosticoSIP(diagnosticoSIPIn);
		
	}

	public DiagnosticoSIPOut getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(DiagnosticoSIPOut diagnostico) {
		this.diagnostico = diagnostico;
	}

}
