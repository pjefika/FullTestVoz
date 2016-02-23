package model.linha;

import java.rmi.RemoteException;

import com.gvt.www.metaData.smarttool.Credenciais;
import com.gvt.www.uraservices.GetSwitchInfoOut;
import com.gvt.www.uraservices.UraServicesProxy;
import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPOut;

import entidades.linha.Linha;
import entidades.linha.LinhaInterface;
import entidades.linha.LinhaSip;

public class LinhaServico implements DiagnosticoLinha{

	private UraServicesProxy uraServices;

	public LinhaServico() {
		this.uraServices = new UraServicesProxy();
	}

	public GetSwitchInfoOut getInfoSwitch(String instancia) throws RemoteException{
		
		GetSwitchInfoOut info = this.uraServices.getInfoSwitch(instancia);
		
		return info;
	}

	public Linha tipoCentral(GetSwitchInfoOut infoSwitch){

		if(infoSwitch.getResultMessage().equals("IMS-SIP")){
			Linha sip = new LinhaSip();
			((LinhaSip) sip).setGpon(infoSwitch.isGpon());
			return sip;
		}

		return new Linha();
	}

	public void consultar(){

	}
	
	public Credenciais credenciais(){
		
		Credenciais credenciais = new Credenciais();
		credenciais.setLogin("URA");
		credenciais.setUsername("URA");
		credenciais.setSistemaOrigem("URA");
		
		return credenciais;
	}

	@Override
	public void executarDiagnostico(String instancia, String designador) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DiagnosticoSIPOut getDiagnostico() {
		// TODO Auto-generated method stub
		return null;
	}
}
