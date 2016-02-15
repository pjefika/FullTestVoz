package controller;

import java.rmi.RemoteException;

import javax.faces.bean.ManagedBean;

import com.gvt.www.uraservices.GetSwitchInfoOut;
import com.gvt.www.uraservices.UraServicesProxy;

@ManagedBean
public class ConsultaInstancia {
	
	private UraServicesProxy webservice;
	
	public ConsultaInstancia() {
		this.webservice = new UraServicesProxy();
	}

	public String getInfoSwitch(String instancia){
				
		try {
			GetSwitchInfoOut oi = this.webservice.getInfoSwitch(instancia);
			if (oi.isSip()) {
				return "é GPON";
			}else{
				return "não é GPON";
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Erro!";
		}
	}
	
	public UraServicesProxy getWebservice() {
		return webservice;
	}

	public void setWebservice(UraServicesProxy webservice) {
		this.webservice = webservice;
	}
}
