package com.examplecics.demo.dto;

import br.com.viavarejo.cics.annotation.Cics;
import br.com.viavarejo.cics.annotation.CicsInteger;
import br.com.viavarejo.cics.annotation.CicsLong;
import br.com.viavarejo.cics.annotation.CicsString;
import br.com.viavarejo.cics.book.BookAreaReservadaNegocio;
import br.com.viavarejo.cics.dto.DtoNegocioCics;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Cics(nameContainer = "S8I0216@ENTRADA")
public class CancelamentoSTDEntradaDTO implements DtoNegocioCics {
    private static final long serialVersionUID = -7238602007303042386L;

    // Book da area reservada de negocio (ARN)
    private final List<BookAreaReservadaNegocio> bookAreaReservadaNegocio = new ArrayList<>();

    //S8WI216E-CD-TIPO      PIC X(0001) TIPO DE AÇÃO I = INCLUSÃO DE CANCELAMENTO DE STD. E = EFETIVAÇÃO DO CANCELAMENTO DE STD. C = CONSULTA LOG DE CANCELAMENTO DE STD.
    @CicsString(fieldLenght = 1, fieldSequence =  1)
    private String codigoTipoOperacao;

    //S8WD216E-CD-EMPGCB	PIC 9(0004)	Númerico Código que identifica a empresa do Grupo Casas Bahia emitente.
    @CicsInteger(fieldLenght = 4, fieldSequence = 2)
    private Integer codigoEmpresaGrupoCasasBahia;

    //S8WD216E-CD-FIL		PIC 9(0004)	Númerico Código que identifica a filial de uma empresa do Grupo Casas Bahia emitente.
    @CicsInteger(fieldLenght = 4, fieldSequence = 3)
    private Integer codigoFilial;

    //S8WD216E-CD-TAFIL  	PIC	X(001)	Texto	Código que identifica o tipo de atividade da Filial do Grupo Casas Bahia.
    @CicsString(fieldLenght = 1, fieldSequence =  4)
    private String codigoTipoAtividade;

    //S8WD216E-CD-IPCNO     PIC 9(0010) Numérico CODIGO DO PEDIDO DE VENDA ONLINE
    @CicsLong(fieldLenght = 10, fieldSequence = 5)
    private Long codigoPedidoVendaOnline;

    //S8WD216E-CD-IPCNO-SEQ	PIC 9(0004) Numérico CODIGO DA SEQUENCIA PEDIDO DE VENDA ONLINE
    @CicsInteger(fieldLenght = 4, fieldSequence =  6)
    private Integer codigoSequenciaPedidoVenda;

    //S8WD216E-CD-ICPCNO	PIC 9(0018)	Numérico CODIGO DA ENTREGA PEDIDO DE VENDA ONLINE
    @CicsLong(fieldLenght = 18, fieldSequence = 7)
    private Long codigoEntregaPedido;

    //S8WD216E-CD-EMPGCB-FUN	PIC	9(004)	Númerico	Código que identifica a empresa do funcionario do Grupo Casas Bahia emitente.
    @CicsInteger(fieldLenght = 4, fieldSequence = 8)
    private Integer codigoEmpresaFuncionario;

    //S8WD216E-CD-FUN	PIC	9(009)	Númerico	Código que identifica a empresa do Grupo Casas Bahia emitente.
    @CicsLong(fieldLenght = 9, fieldSequence = 9)
    private Long codigoFuncionario;

    //S8WD216E-FILLER      	PIC	X(050)	Texto	Campo em branco
    @CicsString(fieldLenght = 50, fieldSequence = 10)
    private String filler;

}
