package entidades.diagnostico;

public class DiagnosticoSip implements Diagnostico{

	private String valor;
	
	private String valorReferencia;
	
	public DiagnosticoSip(String valor, String valorReferencia) {
		this.valor = valor;
		this.valorReferencia = valorReferencia;
	}

	public String getValor() {
		return valor;
	}

	public String getValorReferencia() {
		return valorReferencia;
	}

}
