package br.ufjf.model;

import br.ufjf.interfaces.Disco;
import br.ufjf.interfaces.Visitor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CD implements Disco {

    private String nomeArtista;
    private Integer anoLancamento;
    private String estilo;

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirCD(this);
    }
}
