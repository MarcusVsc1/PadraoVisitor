package br.ufjf.visitor;

import br.ufjf.interfaces.Disco;
import br.ufjf.interfaces.Visitor;
import br.ufjf.model.BluRay;
import br.ufjf.model.CD;
import br.ufjf.model.DVD;

public class DiscoVisitor implements Visitor {

    public String exibir(Disco disco){
        return disco.aceitar(this);
    }

    @Override
    public String exibirCD(CD cd) {
        return "CD:{" +
                "Artista="+cd.getNomeArtista()+
                ",Ano de lançamento="+cd.getAnoLancamento()+
                ",Estilo="+cd.getEstilo()+"}";
    }

    @Override
    public String exibirDVD(DVD dvd) {
        return "DVD:{" +
                "Nome do Filme="+dvd.getNomeFilme()+
                ",Ano de lançamento="+dvd.getAnoLancamento()+
                ",Gênero="+dvd.getGenero()+"}";
    }

    @Override
    public String exibirBluRay(BluRay bluRay) {
        return "BluRay:{" +
                "Nome do Jogo="+bluRay.getNomeJogo()+
                ",Ano de lançamento="+bluRay.getAnoLancamento()+
                ",Produtora="+bluRay.getProdutora()+"}";
    }
}
