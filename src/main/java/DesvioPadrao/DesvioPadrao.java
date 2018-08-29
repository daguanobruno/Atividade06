package DesvioPadrao;

import Exception.MensagemException;
import Media.Media;

public class DesvioPadrao {

    public strictfp Double getDesvioPadrao(double[] v) throws MensagemException {
        double media = 0;
        Media m = new Media();

        media = m.getMedia(v);

        int tam = v.length;

        Double desvPadrao = 0D;
        for (Double vlr : v) {
            Double aux = vlr - media;
            desvPadrao += aux * aux;
        }
        return Math.sqrt(desvPadrao / tam);
    }

}
