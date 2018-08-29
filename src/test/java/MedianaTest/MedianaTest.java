package MedianaTest;

import Exception.MensagemException;
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

        double res = 0;

        try {
            res = m.getMediana(v);
        } catch (MensagemException e) {

        }

        assertEquals(4, res, 0.01);
    }

    @Test
    public void testeVetorOrdenadoPar() {

        double[] v = {1, 4, 4, 5, 6, 7, 7, 7};

        Mediana m = new Mediana();

        double res = 0;

        try {
            res = m.getMediana(v);
        } catch (MensagemException e) {

        }
        assertEquals(5.5, res, 0.01);

    }

    @Test
    public void testeMedia() {

        double[] v = {5, 5, 5, 5, 5};

        double res = 0;
        Media m = new Media();

        try {
            res = m.getMedia(v);
        } catch (MensagemException e) {

        }
        assertEquals(5, res, 0.01);

    }

    @Test
    public void testeMediaMenor_e_MaiorValor() {

        double[] v = {5, 0, 1, 3, 2, 4};

        double menorValor = 0, maiorValor = 0;

        Media m = new Media();

        try {
            menorValor = m.getMenorValor(v);
            maiorValor = m.getMaiorValor(v);
        } catch (MensagemException e) {

        }

        assertEquals(0, menorValor, 0.01);
        assertEquals(5, maiorValor, 0.01);

    }

    @Test
    public void testeVetorNulo() throws MensagemException {

        double[] v = null;

        Media m = new Media();

        double res = 0;

        try {
            res = m.getMedia(v);
        } catch (MensagemException e) {
            assertEquals("Erro", e.getMessage());
        }
    }

    @Test
    public void teste_acima_abaixo_media() {

        double[] v = {1, 2, 3, 4, 5};

        Media m = new Media();

        double[] abaixo = {1,2};
        double[] acima = {4,5};
        
        double[] res1 = {};
        double[] res2 = {};

        try {
            res1 = m.abaixoMedia();
            res2 = m.acimaMedia();
        } catch (MensagemException e) {

        }

        assertEquals(res1, abaixo, 0.01);
        assertEquals(res2, acima, 0.01);
    }
}
