package model.linha;

import java.rmi.RemoteException;


import com.gvt.www.uraservices.GetSwitchInfoOut;
import com.gvt.www.uraservices.UraServicesProxy;

import entidades.linha.Linha;
import entidades.linha.LinhaRetail;

public class LinhaServico implements LinhaRetail{

	private UraServicesProxy webservice;
	
	private Linha linha;
	
	public LinhaServico() {
		this.webservice = new UraServicesProxy();
	}

	public GetSwitchInfoOut getInfoSwitch(String instancia) throws RemoteException{

		return this.webservice.getInfoSwitch(instancia);
	}
	
	public void consultar(){
		
		
	}

	public Linha getLinha() {
		return linha;
	}

	public void setLinha(Linha linha) {
		this.linha = linha;
	}

}
