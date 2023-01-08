package br.ufjf.interfaces;

import br.ufjf.model.BluRay;
import br.ufjf.model.CD;
import br.ufjf.model.DVD;

public interface Visitor {
    public String exibirCD(CD cd);
    public String exibirDVD(DVD dvd);
    public String exibirBluRay(BluRay bluRay);
}
