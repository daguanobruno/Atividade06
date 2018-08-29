package MedianaTest;

import DesvioPadrao.DesvioPadrao;
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
    public void teste_acima_abaixo_media() throws MensagemException {

        double[] v = {5, 4, 2, 3, 1};

        Media m = new Media();

        double[] res1 = {};
        double[] res2 = {};

        try {
            res1 = m.abaixoMedia(v);
            res2 = m.acimaMedia(v);
        } catch (MensagemException e) {
        }

        assertEquals(2, res1[0], 0.01);
        assertEquals(1, res1[1], 0.01);

        assertEquals(5, res2[0], 0.01);
        assertEquals(4, res2[1], 0.01);
    }

    @Test
    public void DesvioPadrao() {

        double[] v = {5, 4, 2, 3, 1};

        DesvioPadrao d = new DesvioPadrao();
        double res = 0;

        try {
            res = d.getDesvioPadrao(v);
        } catch (MensagemException e) {

        }

        assertEquals(1.4142135623730951, res, 0.01);

    }

       @Test
    public void NMaior_NMenor() {

        double[] v = {5, 4, 2, 3, 1};

        
        Media m = new Media();
        double res = 0, res2 = 0;

        try {
            res = m.NMaior(v, 4);
            res2 = m.NMenor(v, 2);
        } catch (MensagemException e) {

        }

        assertEquals(5, res, 0.01);
        assertEquals(1, res2, 0.01);

    }
    
}
