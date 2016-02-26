package model.linha;

import java.rmi.RemoteException;
import com.gvt.www.uraservices.GetSwitchInfoOut;
import com.gvt.www.uraservices.UraServicesProxy;

import entidades.linha.Linha;
import entidades.linha.TecnologiaLinhaFactory;


public class LinhaServico{

	private UraServicesProxy uraServices;

	public LinhaServico() {
		this.uraServices = new UraServicesProxy();
	}

	public GetSwitchInfoOut getInfoSwitch(String instancia) throws RemoteException{
		
		GetSwitchInfoOut info = this.uraServices.getInfoSwitch(instancia);
		
		return info;
	}

	public Linha create(String tecnologia) throws Exception{
		
		TecnologiaLinhaFactory factory = new TecnologiaLinhaFactory();
		return factory.create(tecnologia);
	}
	
	public LinhaServicoInterface createService(String tecnologia) throws Exception{
		TecnologiaLinhaFactory factory = new TecnologiaLinhaFactory();
		return factory.createService(tecnologia);
	}
}
