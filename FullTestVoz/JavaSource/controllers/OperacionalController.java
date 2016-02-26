package controllers;


import java.rmi.RemoteException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.gvt.www.uraservices.GetSwitchInfoOut;

import entidades.Cliente;
import entidades.diagnostico.Diagnostico;
import exception.ossturbonet.oss.gvt.com.DataNotFoundException;
import exception.ossturbonet.oss.gvt.com.OSSTurbonetException;
import model.CadastroServico;
import model.linha.LinhaServico;
import model.linha.LinhaServicoInterface;
import util.JSFUtil;

@ManagedBean
@ViewScoped
public class OperacionalController{

	private Cliente cliente;

	private CadastroServico servicoCadastro;

	private LinhaServicoInterface servicoLinha;

	public OperacionalController(){
		this.cliente = new Cliente();
		this.servicoCadastro = new CadastroServico();
	}

	/**
	 * Método acionado pelo Usuário na página inicial (index.xhtml);
	 * @return 
	 * 
	 */
	public void consultar(){		
		
		this.consultarCadastro();
		this.consultarVoz();
		this.diagnostico();
		
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
	
	public void consultarVoz(){
		
		try {
			LinhaServico consulta = new LinhaServico();
			GetSwitchInfoOut info = consulta.getInfoSwitch(this.cliente.getInstancia());
			this.cliente.setLinha(consulta.create(info.getResultMessage()));
			this.servicoLinha = consulta.createService(info.getResultMessage());
		} catch (RemoteException e) {
			JSFUtil.addErrorMessage("Erro ao consultar instância! " + e.getMessage());
		} catch (Exception e) {
			JSFUtil.addErrorMessage(e.getMessage());
		}
		
	}
	
	public void diagnostico(){
		
		try {
			
			List<Diagnostico> diagnostico = this.servicoLinha.diagnostico(this.cliente);
			
			this.cliente.getLinha().setDiagnostico(diagnostico);
			
			
		} catch (RemoteException e) {
			JSFUtil.addErrorMessage("Erro ao realizar diagnostico: " + e.getMessage());
		}
	}
	

	public CadastroServico getServicoCadastro() {
		return servicoCadastro;
	}


	public void setServicoCadastro(CadastroServico servicoCadastro) {
		this.servicoCadastro = servicoCadastro;
	}

	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
