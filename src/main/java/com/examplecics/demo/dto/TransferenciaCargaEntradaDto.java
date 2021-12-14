package com.examplecics.demo.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.viavarejo.cics.annotation.Cics;
import br.com.viavarejo.cics.annotation.CicsInteger;
import br.com.viavarejo.cics.annotation.CicsString;
import br.com.viavarejo.cics.book.BookAreaReservadaNegocio;
import br.com.viavarejo.cics.dto.DtoNegocioCics;

@Cics(nameContainer = "S9N0301@ENTRADA")
public class TransferenciaCargaEntradaDto implements DtoNegocioCics {
	
	private static final long serialVersionUID = -4455081904877385874L;
	
	private List<BookAreaReservadaNegocio> bookAreaReservadaNegocio = new ArrayList<>();

	public void setBookAreaReservadaNegocio(List<BookAreaReservadaNegocio> bookAreaReservadaNegocio) {
		this.bookAreaReservadaNegocio = bookAreaReservadaNegocio;
	}
	
	@Override
	public List<BookAreaReservadaNegocio> getBookAreaReservadaNegocio() {
		return bookAreaReservadaNegocio;
	}

	// WK-ST-SOLIC-ENT
    @CicsString(fieldLenght = 1, fieldSequence = 1, trimRetorno = true)
	private String solicitacao;
	
    // WK-ST-OPER-ENT
    @CicsString(fieldLenght = 1, fieldSequence = 2, trimRetorno = true)
	private String operacao;
    
    // WK-CD-MOT-ENT
    @CicsInteger(fieldLenght = 3, fieldSequence = 3)
	private Integer motivo;
    
    // WK-CD-ETG-ORI-ENT
    @CicsInteger(fieldLenght = 8, fieldSequence = 4)
	private Integer cargaOrigem;
    
    // WK-CD-ETG-DST-ENT
    @CicsInteger(fieldLenght = 8, fieldSequence = 5)
	private Integer cargaDestino;
	
    // WK-ST-DOC-ENT
    @CicsString(fieldLenght = 3, fieldSequence = 6, trimRetorno = true)
	private String statusDocumento;
	
    // WK-CD-DOC-ENT
    @CicsInteger(fieldLenght = 9, fieldSequence = 7)
	private Integer documento;
	
    // WK-CD-DSM-ENT
    @CicsInteger(fieldLenght = 2, fieldSequence = 8)
    private Integer complementoDocumento;
	
    // WK-CD-EMP-FUN-ENT
    @CicsInteger(fieldLenght = 2, fieldSequence = 9)
    private Integer empresaFuncionario;
    
    // WK-CD-FUN-ENT
    @CicsInteger(fieldLenght = 8, fieldSequence = 10)
	private Integer codigoFuncionario;

	public String getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(String solicitacao) {
		this.solicitacao = solicitacao;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public Integer getMotivo() {
		return motivo;
	}

	public void setMotivo(Integer motivo) {
		this.motivo = motivo;
	}

	public Integer getCargaOrigem() {
		return cargaOrigem;
	}

	public void setCargaOrigem(Integer cargaOrigem) {
		this.cargaOrigem = cargaOrigem;
	}

	public Integer getCargaDestino() {
		return cargaDestino;
	}

	public void setCargaDestino(Integer cargaDestino) {
		this.cargaDestino = cargaDestino;
	}

	public String getStatusDocumento() {
		return statusDocumento;
	}

	public void setStatusDocumento(String statusDocumento) {
		this.statusDocumento = statusDocumento;
	}

	public Integer getDocumento() {
		return documento;
	}

	public void setDocumento(Integer documento) {
		this.documento = documento;
	}

	public Integer getComplementoDocumento() {
		return complementoDocumento;
	}

	public void setComplementoDocumento(Integer complementoDocumento) {
		this.complementoDocumento = complementoDocumento;
	}

	public Integer getEmpresaFuncionario() {
		return empresaFuncionario;
	}

	public void setEmpresaFuncionario(Integer empresaFuncionario) {
		this.empresaFuncionario = empresaFuncionario;
	}

	public Integer getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(Integer codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	@Override
	public String toString() {
		return "TransferenciaCargaEntradaDto [bookAreaReservadaNegocio=" + bookAreaReservadaNegocio + ", solicitacao="
				+ solicitacao + ", operacao=" + operacao + ", motivo=" + motivo + ", cargaOrigem=" + cargaOrigem
				+ ", cargaDestino=" + cargaDestino + ", statusDocumento=" + statusDocumento + ", documento=" + documento
				+ ", complementoDocumento=" + complementoDocumento + ", empresaFuncionario=" + empresaFuncionario
				+ ", codigoFuncionario=" + codigoFuncionario + "]";
	}
    
    
}
