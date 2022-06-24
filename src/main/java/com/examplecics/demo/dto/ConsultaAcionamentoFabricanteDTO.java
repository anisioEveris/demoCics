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

    //    TS_AAFNE_CRM	PIC	X(0026)
    private String timestampEnvioAcionamentoCRM;
    //    DS_PRAZO	PIC	X(0015).
    private String statusPrazo;
    //    DT_AAFNE_ATD_PRV	PIC	X(0010).
    private String dataPrevisaoAtendimento;
    //    CD_ATDAST	PIC	S9(09)
    private Long codigoAtendimentoTecnico;
    //    CD_AAFNE	PIC	S9(09)
    private Long codigoAAFNE;
    //    NM_FNECRM_GUR	PIC	X(0030).
    private String aliasCRM;
    //    ST_MERC	PIC	X(0001)
    private char statusMercadoria;
    //    CD_CLI	PIC	S9(09)
    private Long codigoCliente;
    //    NM_AACEND_CLI	PIC	X(0030).
    private String nomeCliente;
    //    NM_AACEND_LGR	PIC	X(0030).
    private String logradouroMercadoria;
    //    CD_AACEND_LGR	PIC	X(0005).
    private String numeroLogradouroMercadoria;
    //    CD_AACEND_CPM	PIC	X(0015).
    private String complementoLogradouroMercadoria;
    //    NM_AACEND_BAI	PIC	X(0015).
    private String bairroMercadoria;
    //    DS_AACEND_ROT.	PIC	X(84)
    private String referenciaLogradouroMercadoria;
    //    NM_AACEND_MUN	PIC	X(0015).
    private String municipioMercadoria;
    //    CD_EST_SIG	PIC	X(0002).
    private String ufMercadoria;
    //    CD_AACEND_CEP	PIC	S9(09)
    private Long cepMercadoria;
    //    CD_AACEND_DDD_TEL	PIC	X(0004).
    private String dddCliente;
    //    CD_AACEND_TEL	PIC	X(0009).
    private String telefoneCLiente;
    //    CD_AACEND_DDD_RCD	PIC	X(0004).
    private String dddRecadoCliente;
    //    CD_AACEND_TEL_RCD	PIC	X(0009).
    private String telefoneRecadoCLiente;
    //    CD_AACEND_DDD_CEL	PIC	X(0004).
    private String dddCelularCliente;
    //    CD_AACEND_CEL	PIC	X(0009).
    private String celularCliente;
    //    CD_PVEMCR	PIC	S9(09)
    private Long pedidoVenda;
    //    CD_EMPGCB_EMI	PIC	S9(04)
    private Integer codigoEmpresaEmissora;
    //    CD_FIL_EMI	PIC	S9(04)
    private Integer codigoFilialEmissora;
    //    DT_NVMCR_EMI	PIC	X(0010).
    private String dataNFVenda;
    //    CD_NVMCR	PIC	S9(09)
    private Long serieNFVenda;
    //    CD_EMPGCB	PIC	S9(04)
    private Integer codigoEmpresa;
    //    DT_MOVPDV	PIC	X(10)
    private String dataCupomVenda;
    //    CD_MOVPDV_CFI	PIC	S9(09)
    private Long sequenciaCupomVenda;
    //    CD_MOVPDV_MAQ	PIC	S9(04)
    private Integer codigoMaquinaCupomVenda;
    //    CD_MCR	PIC	S9(09)
    private Long codigoMercadoria;
    //    CD_AAFNE_SEQ	PIC	S9(04)
    private Integer sequenciaMercadoria;
    //    DS_MCR	PIC	X(0050).
    private String descricaoMercadoria;
    //    DT_ATDAST_ETG	PIC	X(10)
    private String dataEntregaMercadoria;
    //    DT_ATDAST	PIC	X(10)
    private String dataAtendimento;
    //    HR_ATDAST	PIC	X(0008).
    private String horaAtendimento;
    //    CD_EMPGCB_PTO_VND	PIC	S9(04)
    private Integer codigoEmpresaPontoVenda;
    //    CD_FIL_PTO_VND	PIC	S9(04)
    private Integer codigoFilialPontoVenda;
    //    CD_TAFIL_PTO_VND	PIC	X(0001).
    private String codigoTipoFilialPontoVenda;
    //    CD_BND	PIC	S9(04)
    private Integer codigoBandeiraFilialPontoVenda;
    //    ST_TROCA	PIC	X(003)
    private String statusTroca;
    //    DS_AAFNE_DFE_001.	PIC	X(84)
    private String descricaoEtapaArvoreA;
    //    DS_AAFNE_DFE_002.	PIC	X(84)
    private String descricaoEtapaArvoreB;
    //    DS_AAFNE_DFE_003.	PIC	X(84)
    private String descricaoEtapaArvoreC;
    //    DS_OSECBA_DFE_MCR.	PIC	X(84)
    private String descricaoReclamacaoCliente;
    //    DS_RTMAST.	PIC	X(84)
    private String descricaoDefeito;
    //    ST_RTMAST_ATM	PIC	X(0001).
    private String origemSAT;
    //    CD_OSECBA	PIC	S9(09)
    private Long ordemServicoCB;
    //    QT_AAFNE_DIA_ATD	PIC	S9(04)
    private Integer quantidadeDiasParaAtendimento;

    // Book da area reservada de negocio (ARN)
    private final List<BookAreaReservadaNegocio> bookAreaReservadaNegocio = new ArrayList<>();

}
