package br.ufjf.model;

import br.ufjf.interfaces.Disco;
import br.ufjf.interfaces.Visitor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BluRay implements Disco {

    private String nomeJogo;
    private Integer anoLancamento;
    private String produtora;

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirBluRay(this);
    }
}
