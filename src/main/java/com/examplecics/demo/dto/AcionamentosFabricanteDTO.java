package com.examplecics.demo.dto;

import br.com.viavarejo.cics.annotation.Cics;
import br.com.viavarejo.cics.annotation.CicsInteger;
import br.com.viavarejo.cics.annotation.CicsList;
import br.com.viavarejo.cics.annotation.CicsString;
import br.com.viavarejo.cics.book.BookAreaReservadaNegocio;
import br.com.viavarejo.cics.dto.DtoNegocioCics;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

/**
 * @author : anisioSilva
 * @created : 27/05/2022, sexta-feira
 **/

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Cics
public class AcionamentosFabricanteDTO implements DtoNegocioCics {

    private static final long serialVersionUID = -7308557665791313264L;


    @Override
    public List<BookAreaReservadaNegocio> getBookAreaReservadaNegocio() {
        return Collections.emptyList();
    }

    @CicsList(classeImplementacaoItemLista = AcionamentoFabricanteDTO.class, ocorrencias = 0, fieldSequence = 1, isIgnorarLinhasBrancosZeros = true)
    List<AcionamentoFabricanteDTO> acionamentosList;
}
