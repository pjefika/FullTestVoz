package controllers;


import java.rmi.RemoteException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.gvt.www.uraservices.GetSwitchInfoOut;

import entidades.Cliente;
import exception.ossturbonet.oss.gvt.com.DataNotFoundException;
import exception.ossturbonet.oss.gvt.com.OSSTurbonetException;
import model.CadastroServico;
import model.ClienteServico;
import model.FullTestVoz;
import model.linha.LinhaServico;
import model.linha.LinhaSipServico;
import util.JSFUtil;

@ManagedBean
@ViewScoped
public class ConsultaInstancia implements FullTestVoz{

	private Cliente cliente;

	private CadastroServico servicoCadastro;

	private LinhaServico servicoLinha;

	private ClienteServico servicoCliente;

	public ConsultaInstancia(){

		this.cliente = new Cliente();
		this.servicoCadastro = new CadastroServico();
		this.servicoCliente = new ClienteServico();
		
	}


	/**
	 * Método acionado pelo Usuário na página inicial (index.xhtml);
	 * @return 
	 * 
	 */
	public Cliente consultar(){

		this.consultarCadastro();
		this.consultarLinha();
		this.consultarServico();
		
		//this.diagnostico();
		
		return this.cliente;
	}



	public void consultarCadastro(){

		try {		

			this.cliente.setDesignador(this.servicoCadastro.consultaDesignador(this.cliente.getInstancia()));
			this.cliente.setRadius(this.servicoCadastro.consultaRadius(this.cliente.getDesignador()));
			this.cliente.setCadastro(this.servicoCadastro.consultaCadastro(this.cliente));

		} catch (DataNotFoundException e) {
			JSFUtil.addErrorMessage("Cadastro não encontrado!");
		} catch (OSSTurbonetException e) {
			JSFUtil.addErrorMessage("Cadastro não encontrado!");
		} catch (RemoteException e) {
			JSFUtil.addErrorMessage("Cadastro não encontrado!");
		}	
	}

	public void consultarLinha(){

		try {

			GetSwitchInfoOut infoSwitch = this.servicoLinha.getInfoSwitch(this.cliente.getInstancia());
			

			
		} catch (RemoteException e) {
			JSFUtil.addErrorMessage(e.getMessage());
		}
	}

	public void diagnostico() {

		try {
			this.servicoLinha.executarDiagnostico(this.cliente.getInstancia(), this.cliente.getDesignador());
		} catch (RemoteException e) {
			JSFUtil.addErrorMessage(e.getMessage());
		}

	}

	public void consultarServico(){

		if(this.cliente.getLinha().toString().equals("IMS-SIP")){
			this.servicoLinha = new LinhaSipServico();
		}

	}

	public CadastroServico getServicoCadastro() {
		return servicoCadastro;
	}


	public void setServicoCadastro(CadastroServico servicoCadastro) {
		this.servicoCadastro = servicoCadastro;
	}


	public LinhaServico getServicoLinha() {
		return servicoLinha;
	}


	public void setServicoLinha(LinhaServico servicoLinha) {
		this.servicoLinha = servicoLinha;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public ClienteServico getServicoCliente() {
		return servicoCliente;
	}


	public void setServicoCliente(ClienteServico servicoCliente) {
		this.servicoCliente = servicoCliente;
	}
}
