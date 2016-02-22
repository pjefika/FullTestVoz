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
import model.linha.LinhaServico;
import util.JSFUtil;


@ManagedBean
@ViewScoped
public class ConsultaCadastro{

	private Cliente cliente;

	private CadastroServico servicoCadastro;

	private LinhaServico servicoLinha;

	private ClienteServico servicoCliente;

	public ConsultaCadastro(){
		
		this.cliente = new Cliente();
		this.servicoCadastro = new CadastroServico();
		this.servicoLinha = new LinhaServico();
		this.servicoCliente = new ClienteServico();
	}
	
	
	public void consultar(){
		
		this.consultaCadastro();
		this.consultaLinha();
		
	}
	


	public void consultaCadastro(){

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
	
	public void consultaLinha(){

		try {

			GetSwitchInfoOut infoSwitch = this.servicoLinha.getInfoSwitch(this.cliente.getInstancia());
			
			this.cliente.getLinha().setTipoCentral((infoSwitch.getResultMessage()));

		} catch (RemoteException e) {
			JSFUtil.addErrorMessage(e.getMessage());
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
