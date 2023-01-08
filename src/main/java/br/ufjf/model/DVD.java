package br.ufjf.model;

import br.ufjf.interfaces.Disco;
import br.ufjf.interfaces.Visitor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class DVD implements Disco {

    private String nomeFilme;
    private Integer anoLancamento;
    private String genero;

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirDVD(this);
    }

}
