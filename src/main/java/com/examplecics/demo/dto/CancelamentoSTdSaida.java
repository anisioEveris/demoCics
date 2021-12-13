package com.examplecics.demo.dto;

import br.com.viavarejo.cics.annotation.Cics;
import br.com.viavarejo.cics.annotation.CicsInteger;
import br.com.viavarejo.cics.annotation.CicsString;
import br.com.viavarejo.cics.dto.DTOCicsI;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Cics
public class CancelamentoSTdSaida implements DTOCicsI {

    private static final long serialVersionUID = 6723271295446261848L;

    //S8WI216S-SC-RET   PIC 9(0005)	Númerico	Código de retorno SQLCODE
    @CicsInteger(fieldLenght = 5, fieldSequence = 1)
    private Integer codigoRetornoSQLCode;

    //S8WI216S-CD-RET   PIC X(0004)	Texto	Código de erro de validações
    @CicsString(fieldLenght = 4, fieldSequence = 2)
    private String codigoErroValidacao;

    //S8WI216S-DS-MSG   PIC X(0100)	Texto	Mensagem de Aviso ou ErroS
    @CicsString(fieldLenght = 100, fieldSequence = 3)
    private String mensagem;

    @Override
    public String toString() {
        return "EncerramentoSTDSaidaDTO [codigoRetornoSQLCode=" + codigoRetornoSQLCode + ", codigoErroValidacao="
                + codigoErroValidacao + ", mensagem=" + mensagem + "]";
    }
}
