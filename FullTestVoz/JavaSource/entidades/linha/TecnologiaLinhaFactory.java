package entidades.linha;

import model.linha.LinhaServicoInterface;
import model.linha.LinhaSipServico;

public class TecnologiaLinhaFactory {

	public static final String ImsSip = "IMS-SIP";
	public static final String V5 = "V5";
	
	
	public Linha create(String tecnologia) throws Exception{
		
		if(tecnologia.equalsIgnoreCase(TecnologiaLinhaFactory.ImsSip)){
			return new LinhaSip();
		//}else if(tecnologia.equalsIgnoreCase(TecnologiaLinhaFactory.V5)){
			
		}else{
			throw new Exception("Técnologia de Central não permitida!");
		}
		
		//return null;
	}
	
	public LinhaServicoInterface createService(String tecnologia) throws Exception{
		
		if(tecnologia.equalsIgnoreCase(TecnologiaLinhaFactory.ImsSip)){
			return new LinhaSipServico();
		//}//else if(tecnologia.equalsIgnoreCase(TecnologiaLinhaFactory.V5)){
			
		}else{
			throw new Exception("Técnologia de Central não permitida!");
		}
		
		//return null;
	}	
	
	
	
	
}
