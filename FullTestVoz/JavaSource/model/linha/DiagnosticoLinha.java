package model.linha;

import java.rmi.RemoteException;

import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPOut;

public interface DiagnosticoLinha {
	
	void executarDiagnostico(String instancia, String designador) throws RemoteException;

	DiagnosticoSIPOut getDiagnostico();

	
}
