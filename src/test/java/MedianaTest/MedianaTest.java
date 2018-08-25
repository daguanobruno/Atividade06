package MedianaTest;

import Media.Media;
import Mediana.Mediana;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MedianaTest {

    public MedianaTest() {
    }

    @Test
    public void testeVetorOrdenadoImpar() {
        double[] v = {1, 2, 3, 4, 5, 6, 7};

        Mediana m = new Mediana();

        double res = m.getMediana(v);
        assertEquals(4, res, 0.01);
    }

    @Test
    public void testeVetorOrdenadoPar() {

        double[] v = {1, 4, 4, 5, 6, 7, 7, 7};

        Mediana m = new Mediana();

        double res = m.getMediana(v);
        assertEquals(5.5, res, 0.01);

    }

    @Test
    public void testeMedia() {

        double[] v = {5, 5, 5, 5, 5};

        Media m = new Media();

        double res = m.getMedia(v);
        assertEquals(5, res, 0.01);

    }

    @Test
    public void testeMediaMenor_e_MaiorValor() {

        double[] v = {1,2,3,4,5};

        Media m = new Media();

        double menorValor = m.getMenorValor(v);
        double maiorValor = m.getMaiorValor(v);
        
        assertEquals(1, menorValor, 0.01);
        assertEquals(5, maiorValor, 0.01);

    }
    
}
