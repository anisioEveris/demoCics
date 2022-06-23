package com.examplecics.demo.dto;

import br.com.viavarejo.cics.annotation.Cics;
import br.com.viavarejo.cics.annotation.CicsInteger;
import br.com.viavarejo.cics.annotation.CicsString;
import br.com.viavarejo.cics.dto.DTOCicsI;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : anisioSilva
 * @created : 27/05/2022, sexta-feira
 **/

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Cics
public class AcionamentoFabricanteDTO implements DTOCicsI {

    private static final long serialVersionUID = 6234347695995865661L;

    //77 CD-AAFNE PIC S9(09) COMP.
    @CicsInteger(fieldLenght = 9, fieldSequence = 1)
    private Long codigoAcionamento;

    //77 CD-MCR PIC S9(09) COMP.
    @CicsInteger(fieldLenght = 9, fieldSequence = 2)
    private Long codigoMercadoria;

    //77 CD-AAFNE-SEQ PIC S9(04) COMP.
    @CicsInteger(fieldLenght = 4, fieldSequence = 3)
    private Integer sequencialMercadoria;

    //77 ST-AAFNE-ORI PIC X(0003).
    @CicsString(fieldLenght = 3, fieldSequence = 4)
    private String origemAtendimento;

    //77 ST-AAFNE PIC X(0001).
    @CicsString(fieldLenght = 1, fieldSequence = 5)
    private String statusprocessamento;

    //77 CD-EMPGCB PIC S9(04) COMP.
    @CicsInteger(fieldLenght = 4, fieldSequence = 6)
    private Integer codigoEmpresa;

    //77 DT-AAFNE-PRC PIC X(0010).
    @CicsString(fieldLenght = 10, fieldSequence = 7)
    private String dataProcessamento;

    //77 CD-FNE PIC S9(09) COMP.
    @CicsInteger(fieldLenght = 9, fieldSequence = 8)
    private Long codigoFornecedor;

    //77 CD-AAFNE-RSM PIC S9(04) COMP.
    @CicsInteger(fieldLenght = 4, fieldSequence = 9)
    private Integer codigoResumoAtendimento;

    //77 CD-AAFNE-RSM-PGN PIC S9(04) COMP.
    @CicsInteger(fieldLenght = 4, fieldSequence = 10)
    private Integer numeroPaginaSolicitacao;

    //77 CD-AAFNE-RSM-PGN-ANT PIC S9(04) COMP.
    @CicsInteger(fieldLenght = 4, fieldSequence = 11)
    private Integer numeroPaginaSolicitacaoAnterior;

    //77 CD-PNCRM PIC S9(04) COMP.
    @CicsInteger(fieldLenght = 4, fieldSequence = 12)
    private Integer numeroLoteCRM;

    //77 CD-AAFNE-CRM PIC S9(04) COMP.
    @CicsInteger(fieldLenght = 4, fieldSequence = 13)
    private Integer sequencialArquivoTransmitido;

    //77 TS-AAFNE-CRM PIC X(0026).
    @CicsString(fieldLenght = 10, fieldSequence = 14)
    private String dataTransmissao;

    @CicsString(fieldLenght = 10, fieldSequence = 15)
    //77 DT-AAFNE-ATD-PRV PIC X(0010).
    private String dataPrevisaoAtendimento;

    //77 ST-AAFNE-MCR PIC X(0001).
    @CicsString(fieldLenght = 1, fieldSequence = 16)
    private String statusMercadoria;

    //77 DT-AAFNE-EMI-NFI PIC X(0010).
    @CicsString(fieldLenght = 10, fieldSequence = 17)
    private String dataEmissaoNotaFiscal;

    //77 DS-AAFNE-DFE-001 PIC X(0080)
    @CicsString(fieldLenght = 80, fieldSequence = 18)
    private String descricaoArvoreDefeitoUm;

    //77 DS-AAFNE-DFE-002	PIC X(0080)
    @CicsString(fieldLenght = 80, fieldSequence = 19)
    private String descricaoArvoreDefeitoDois;

    //77 DS-AAFNE-DFE-003 PIC X(0080)
    @CicsString(fieldLenght = 80, fieldSequence = 20)
    private String descricaoArvoreDefeitoTres;

    //77 QT-AAFNE-DIA-ATD PIC S9(04) COMP.
    @CicsInteger(fieldLenght = 4, fieldSequence = 21)
    private Integer diasUteisParaAtendimento;

    //77 CD-OSECBA PIC S9(09) COMP.
    @CicsInteger(fieldLenght = 9, fieldSequence = 22)
    private Long ordemServico;


}
