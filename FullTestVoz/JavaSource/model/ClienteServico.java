package model;

import entidades.linha.Linha;
import entidades.linha.LinhaNortel;

public class ClienteServico {

	public ClienteServico() {

	}

	public Linha tipoLinha(String tecnologiaCentral) {

		if(tecnologiaCentral.equals("TDM-H248")){
			return new LinhaNortel();
		} else{
			return new Linha();
		}
	}

}
