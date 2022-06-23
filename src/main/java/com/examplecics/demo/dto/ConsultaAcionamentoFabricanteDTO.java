package com.examplecics.demo.dto;

import br.com.viavarejo.cics.annotation.Cics;
import br.com.viavarejo.cics.annotation.CicsInteger;
import br.com.viavarejo.cics.annotation.CicsString;
import br.com.viavarejo.cics.book.BookAreaReservadaNegocio;
import br.com.viavarejo.cics.dto.DtoNegocioCics;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : anisioSilva
 * @created : 27/05/2022, sexta-feira
 **/
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Cics(nameContainer = "S8I0067@ENTRADA")
public class ConsultaAcionamentoFabricanteDTO implements DtoNegocioCics {
    private static final long serialVersionUID = 688485502588965077L;

    //03 LK-OPCAO PIC X(002).
    @CicsString(fieldLenght = 2, fieldSequence = 1)
    private String opcao;

    //03 LK-DATA-CHAMADA PIC X(010).
    @CicsString(fieldLenght = 10, fieldSequence = 2)
    private String dataChamada;

    //03 LK-HORA-CHAMADA PIC X(008).
    @CicsString(fieldLenght = 8, fieldSequence = 3)
    private String horaChamada;

    //03 LK-LOTE-CRM PIC 9(004).
    @CicsInteger(fieldLenght = 4, fieldSequence = 4)
    private Integer codigoChamada;

    //03 LK-LOTE-CRM-X REDEFINES LK-LOTE-CRM PIC X(004).
    @CicsString(fieldLenght = 4, fieldSequence = 5)
    private String lote;

    //03 LK-DATA-LOTE-CRM PIC X(010).
    @CicsString(fieldLenght = 10, fieldSequence = 6)
    private String dataLote;

    //03 LK-HORA-LOTE-CRM PIC X(008).
    @CicsString(fieldLenght = 8, fieldSequence = 7)
    private String horaLote;

    // Book da area reservada de negocio (ARN)
    private final List<BookAreaReservadaNegocio> bookAreaReservadaNegocio = new ArrayList<>();

}
