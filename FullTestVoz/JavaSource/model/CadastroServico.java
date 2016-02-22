package model;

import java.rmi.RemoteException;

import com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetProxy;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.RadiusInfo;
import entidades.Cliente;
import exception.ossturbonet.oss.gvt.com.DataNotFoundException;
import exception.ossturbonet.oss.gvt.com.OSSTurbonetException;

public class CadastroServico {

	private OSSTurbonetProxy webservice;

	public CadastroServico(){
		this.webservice = new OSSTurbonetProxy();
	}

	public String consultaDesignador(String instancia) throws DataNotFoundException, OSSTurbonetException, RemoteException{

		return this.webservice.getDesignatorByAccessDesignator(instancia);
	}

	public RadiusInfo consultaRadius(String designador) throws DataNotFoundException, OSSTurbonetException, RemoteException{

		return this.webservice.getRadiusInfo(designador);
	}

	public GetInfoOut consultaCadastro(Cliente cliente) throws DataNotFoundException, OSSTurbonetException, RemoteException{

		return this.webservice.getInfo(cliente.getDesignador(),
				cliente.getDesignador(), "wise", "wise",
				cliente.getInstancia(), "wise", 
				cliente.getRadius().getDownload(),
				cliente.getRadius().getUpload());
	}

	public OSSTurbonetProxy getWebservice() {
		return webservice;
	}

	public void setWebservice(OSSTurbonetProxy webservice) {
		this.webservice = webservice;
	}

}
