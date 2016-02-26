package model.linha;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagementProxy;
import com.gvt.www.metaData.smarttool.Credenciais;
import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPIn;
import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPOut;

import entidades.Cliente;
import entidades.diagnostico.Diagnostico;
import entidades.diagnostico.DiagnosticoSip;

/**
 * 
 * @author G0042204
 * Instância de exemplo: 4133280564
 */
public class LinhaSipServico extends LinhaServico implements LinhaServicoInterface{

	private ConfiguradorOnlineDeviceManagementProxy diagSrvc;

	public LinhaSipServico() {
		this.diagSrvc = new ConfiguradorOnlineDeviceManagementProxy();
	}


	public DiagnosticoSIPOut executarDiagnosticoSIP(String instancia, String designador) throws RemoteException {

		DiagnosticoSIPIn diagnosticoSIPIn = new DiagnosticoSIPIn();
		diagnosticoSIPIn.setCredencial(this.credenciais());
		diagnosticoSIPIn.setInstancia(instancia);
		diagnosticoSIPIn.setDesignadorTurbonet(designador);
		return this.diagSrvc.executarDiagnosticoSIP(diagnosticoSIPIn);
	}

	@Override
	public List<Diagnostico> diagnostico(Cliente cliente) throws RemoteException {

		DiagnosticoSIPOut teste = this.executarDiagnosticoSIP(cliente.getInstancia(), cliente.getDesignador());

		List<Diagnostico> lista = new ArrayList<Diagnostico>();
		
		DiagnosticoSip diag1 = new DiagnosticoSip("Serial Number: ", teste.getHomegateway().getSerialNumber());
		DiagnosticoSip diag2 = new DiagnosticoSip("Mac Address: ", teste.getHomegateway().getMacAddress());
		DiagnosticoSip diag3 = new DiagnosticoSip("CPE: ", teste.getHomegateway().getStatusCPE());
		
		lista.add(diag1);
		lista.add(diag2);
		lista.add(diag3);

		return lista;
	}

	public Credenciais credenciais(){

		Credenciais credenciais = new Credenciais();
		credenciais.setLogin("URA");
		credenciais.setUsername("URA");
		credenciais.setSistemaOrigem("URA");

		return credenciais;
	}

}
