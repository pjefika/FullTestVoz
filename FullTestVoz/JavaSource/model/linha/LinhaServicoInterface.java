package model.linha;

import java.rmi.RemoteException;
import java.util.List;

import entidades.Cliente;
import entidades.diagnostico.Diagnostico;

public interface LinhaServicoInterface {
	
	List<Diagnostico> diagnostico(Cliente cliente) throws RemoteException;
	
}
