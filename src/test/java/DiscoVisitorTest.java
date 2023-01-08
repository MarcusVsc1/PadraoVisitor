import br.ufjf.model.BluRay;
import br.ufjf.model.CD;
import br.ufjf.model.DVD;
import br.ufjf.visitor.DiscoVisitor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscoVisitorTest {

    @Test
    public void CDTest() {
       CD cd = new CD("Djavan", 1982, "MPB");

       DiscoVisitor visitor = new DiscoVisitor();

       assertEquals("CD:{Artista=Djavan,Ano de lançamento=1982,Estilo=MPB}",visitor.exibir(cd));
    }

    @Test
    public void DVDTest() {
        DVD dvd = new DVD("IT", 2017, "Terror");

        DiscoVisitor visitor = new DiscoVisitor();

        assertEquals("DVD:{Nome do Filme=IT,Ano de lançamento=2017,Gênero=Terror}",visitor.exibir(dvd));
    }

    @Test
    public void BluRayTest() {
        BluRay bluRay = new BluRay("Marvel vs Capcom Infinite", 2017, "Capcom");

        DiscoVisitor visitor = new DiscoVisitor();

        assertEquals("BluRay:{Nome do Jogo=Marvel vs Capcom Infinite,Ano de lançamento=2017,Produtora=Capcom}",visitor.exibir(bluRay));
    }
}
