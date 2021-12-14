package com.examplecics.demo.controller;

import br.com.viavarejo.application.service.JornadaCicsService;
import br.com.viavarejo.cics.book.BookContexto;
import com.examplecics.demo.config.ConfigCics;
import com.examplecics.demo.dto.*;
import com.examplecics.demo.exception.FailedException;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequiredArgsConstructor
@RequestMapping(path = "/anisio")
public class DemoController {

    private final JornadaCicsService<?> cicsService;

    @GetMapping("/teste")
    public ResponseEntity<?> execCancelarSTD(){
        var response = new ResponseDTO();
        
        TransferenciaCargaEntradaDto transferenciaCargaEntradaDto = new TransferenciaCargaEntradaDto();
		transferenciaCargaEntradaDto.setSolicitacao("D");
		transferenciaCargaEntradaDto.setOperacao("T");
		transferenciaCargaEntradaDto.setMotivo(222);
		transferenciaCargaEntradaDto.setCargaOrigem(44);
		transferenciaCargaEntradaDto.setCargaDestino(55);		
		transferenciaCargaEntradaDto.setStatusDocumento("std");
		transferenciaCargaEntradaDto.setDocumento(66);
		transferenciaCargaEntradaDto.setComplementoDocumento(77);
		transferenciaCargaEntradaDto.setEmpresaFuncionario(333);
		transferenciaCargaEntradaDto.setCodigoFuncionario(111);
        
        

        CancelamentoSTDEntradaDTO entrada = CancelamentoSTDEntradaDTO.builder()
                .codigoEmpresaGrupoCasasBahia(21)
                .codigoFilial(5001)
                .codigoTipoAtividade("L")
                .codigoPedidoVendaOnline(161416124L)
                .codigoSequenciaPedidoVenda(2)
                .codigoEntregaPedido(16141612404L)
                .codigoEmpresaFuncionario(21)
                .codigoFuncionario(19L)
                .codigoTipoOperacao("I")
                .filler("").build();

        CancelamentoSTdSaida saida = null;
        try {
            saida = cancelarSTD(entrada);

            response.setData( saida );

            if(saida.getCodigoRetornoSQLCode().equals(0)) {

                response.setMessage("STD cancelada com sucesso");
                response.setStatus("SUCESSO");
                response.setCode("0");

                String responseJson= new Gson().toJson(response);
                return new ResponseEntity(response, HttpStatus.OK);
            }else {

                response.setMessage("Falhou");
                response.setStatus("Erro");
                response.setCode("1");

                String responseJson= new Gson().toJson(response);
                return new ResponseEntity(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } catch (Exception e) {
            CancelamentoSTdSaida data = CancelamentoSTdSaida.builder()
                    .mensagem(e.getMessage())
                    .codigoErroValidacao(" ")
                    .codigoRetornoSQLCode(1).build();
            response.setData(data);
            response.setMessage("Falhou");
            response.setCode("1");

            String responseJson= new Gson().toJson(response);
            return new ResponseEntity(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/teste-transf")
    public ResponseEntity<?> tranf(){

        var response = new ResponseDTO();

        TransferenciaCargaEntradaDto transferenciaCargaEntradaDto = new TransferenciaCargaEntradaDto();
        transferenciaCargaEntradaDto.setSolicitacao("D");
        transferenciaCargaEntradaDto.setOperacao("T");
        transferenciaCargaEntradaDto.setMotivo(222);
        transferenciaCargaEntradaDto.setCargaOrigem(44);
        transferenciaCargaEntradaDto.setCargaDestino(55);
        transferenciaCargaEntradaDto.setStatusDocumento("std");
        transferenciaCargaEntradaDto.setDocumento(66);
        transferenciaCargaEntradaDto.setComplementoDocumento(77);
        transferenciaCargaEntradaDto.setEmpresaFuncionario(33);
        transferenciaCargaEntradaDto.setCodigoFuncionario(111);

        TransferenciaCargaSaidaDto saida = null;
        try {
            saida = transfService(transferenciaCargaEntradaDto);

            response.setData( saida );

            if(saida.getCodigoRetorno().equals(0)) {

                response.setMessage("Teste com sucesso");
                response.setStatus("SUCESSO");
                response.setCode("0");

                String responseJson= new Gson().toJson(response);
                return new ResponseEntity(response, HttpStatus.OK);
            }else {

                response.setMessage("Falhou");
                response.setStatus("Erro");
                response.setCode("1");

                String responseJson= new Gson().toJson(response);
                return new ResponseEntity(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } catch (Exception e) {
            CancelamentoSTdSaida data = CancelamentoSTdSaida.builder()
                    .mensagem(e.getMessage())
                    .codigoErroValidacao(" ")
                    .codigoRetornoSQLCode(1).build();
            response.setData(data);
            response.setMessage("Falhou");
            response.setCode("1");

            String responseJson= new Gson().toJson(response);
            return new ResponseEntity(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    public CancelamentoSTdSaida cancelarSTD(CancelamentoSTDEntradaDTO entrada) throws FailedException {
        CancelamentoSTdSaida saida = null;
        try {
            var contexto = new BookContexto();
            saida = (CancelamentoSTdSaida) cicsService.executarChamadaCics(contexto, ConfigCics.CANCELAR_STD, entrada);
            return saida;
        }catch (Exception e) {
            throw new FailedException(e.getMessage(), e);
        }
    }

    public TransferenciaCargaSaidaDto transfService(TransferenciaCargaEntradaDto entrada) throws FailedException {
        TransferenciaCargaSaidaDto saida = null;
        try {
            var contexto = new BookContexto();
            saida = (TransferenciaCargaSaidaDto) cicsService.executarChamadaCics(contexto, ConfigCics.TRANSFERENCIA_CARGA, entrada);
            return saida;
        }catch (Exception e) {
            throw new FailedException(e.getMessage(), e);
        }
    }
}
