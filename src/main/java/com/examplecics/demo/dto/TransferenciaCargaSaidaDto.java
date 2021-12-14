package com.examplecics.demo.dto;

import br.com.viavarejo.cics.annotation.Cics;
import br.com.viavarejo.cics.annotation.CicsInteger;
import br.com.viavarejo.cics.dto.DTOCicsI;

@Cics
public class TransferenciaCargaSaidaDto implements DTOCicsI {
	
	private static final long serialVersionUID = -2022972662060718281L;

	//  CD-RETORNO
	@CicsInteger(fieldLenght = 2, fieldSequence = 1)
	private Integer codigoRetorno;

	public Integer getCodigoRetorno() {
		return codigoRetorno;
	}

	public void setCodigoRetorno(Integer codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}

	@Override
	public String toString() {
		return "TransferenciaCargaSaidaDto [codigoRetorno=" + codigoRetorno + "]";
	}
	
}
