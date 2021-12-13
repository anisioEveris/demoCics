package com.examplecics.demo.config;

import br.com.viavarejo.cics.config.ConfigCicsI;
import br.com.viavarejo.cics.dto.DTOCicsI;
import br.com.viavarejo.cics.enumerator.EnumClasseSegurancaServico;
import com.examplecics.demo.dto.CancelamentoSTdSaida;

public enum ConfigCics implements ConfigCicsI {

    CANCELAR_STD("S8I0216", CancelamentoSTdSaida.class, "S8I0216@SAIDA", "O", "01", 10, "S8E9");

    private String programa;
    private Class<? extends DTOCicsI> classeDtoSaida;
    private String containerSaida;
    private String containerErro = "UTILITY#ERRO";
    private String canal = "UTILITY@CHANNEL";
    private String contextoCodigoAcao;
    private String contextoCodigoOpcaoAcao;
    private Integer quantidadeRegistrosPagina;
    private EnumClasseSegurancaServico enumClasseSegurancaServico = EnumClasseSegurancaServico.LIVRE;
    private String transacaoCics;
    private boolean controleTransacional = false;

    private ConfigCics(
            final String programa, final Class<? extends DTOCicsI> classeDtoSaida, final String containerSaida,
            final String contextoCodigoAcao, final String contextoCodigoOpcaoAcao, final Integer quantidadeRegistrosPagina,
            final String transacaoCics) {
        this.programa = programa;
        this.classeDtoSaida = classeDtoSaida;
        this.containerSaida = containerSaida;
        this.contextoCodigoAcao = contextoCodigoAcao;
        this.contextoCodigoOpcaoAcao = contextoCodigoOpcaoAcao;
        this.quantidadeRegistrosPagina = quantidadeRegistrosPagina;
        this.transacaoCics = transacaoCics;
    }

    @Override
    public String getPrograma() {
        return programa;
    }

    @Override
    public String getContainerSaida() {
        return containerSaida;
    }

    @Override
    public String getContainerErro() {
        return containerErro;
    }

    @Override
    public String getCanal() {
        return canal;
    }

    @Override
    public EnumClasseSegurancaServico getClasseSegurancaServico() {
        return enumClasseSegurancaServico;
    }

    @Override
    public Class<? extends DTOCicsI> getClasseDtoSaida() {
        return classeDtoSaida;
    }

    @Override
    public String getContextoCodigoOpcaoAcao() {
        return contextoCodigoOpcaoAcao;
    }

    @Override
    public String getContextoCodigoAcao() {
        return contextoCodigoAcao;
    }

    @Override
    public Integer getQuantidadeRegistrosPagina() {
        return quantidadeRegistrosPagina;
    }

    @Override
    public String getTransacaoCics() {
        return transacaoCics;
    }

    @Override
    public boolean isControleTransacional() {
        return controleTransacional;
    }
}
