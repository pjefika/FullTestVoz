package entidades;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.RadiusInfo;
import entidades.linha.Linha;

public class Cliente {
	
	@NotEmpty
	@Length(min=10, max=12, message="Instância inválida!")
	private String instancia;
	
	private String designador;
	
	private GetInfoOut cadastro;
	
	private RadiusInfo radius;
	
	private Linha linha;
	
		
	public Cliente() {
		
	}

	public String getInstancia() {
		return instancia;
	}
	
	public void setInstancia(String instancia) {
		this.instancia = instancia;
	}

	public String getDesignador() {
		return designador;
	}

	public void setDesignador(String designador) {
		this.designador = designador;
	}

	public GetInfoOut getCadastro() {
		return cadastro;
	}

	public void setCadastro(GetInfoOut cadastro) {
		this.cadastro = cadastro;
	}

	public RadiusInfo getRadius() {
		return radius;
	}

	public void setRadius(RadiusInfo radius) {
		this.radius = radius;
	}

	public Linha getLinha() {
		return linha;
	}

	public void setLinha(Linha linha) {
		this.linha = linha;
	}

}
