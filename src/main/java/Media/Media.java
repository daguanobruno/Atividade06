package Media;

import Exception.MensagemException;

public class Media {

    private double media = 0, soma = 0, menorValor = 0, maiorValor = 0;
    private int aux = 0, j = 0;
    private double[] auxMedia = null;

    public double getMedia(double[] v) throws MensagemException {

        if (v == null || v.length == 0) {
            throw new MensagemException();
        }

        for (int i = 0; i < v.length; i++) {

            soma = soma + v[i];
            aux++;
        }

        return media = soma / aux;
    }

    public double getMenorValor(double[] v) throws MensagemException {

        menorValor = v[0];

        if (v == null || v.length == 0) {
            throw new MensagemException();
        }

        for (int i = 0; i < v.length; i++) {
            if (menorValor > v[i]) {
                menorValor = v[i];
            }
        }
        return menorValor;
    }

    public double getMaiorValor(double[] v) throws MensagemException {

        maiorValor = v[0];

        if (v == null || v.length == 0) {
            throw new MensagemException();
        }

        for (int i = 0; i < v.length; i++) {
            if (maiorValor < v[i]) {
                maiorValor = v[i];
            }
        }
        return maiorValor;
    }

    public double[] abaixoMedia(double[] v) throws MensagemException {

        double[] auxMedia = new double[v.length];

        if (v == null || v.length == 0) {
            throw new MensagemException();
        }

        media = getMedia(v);

        for (int i = 0; i < v.length; i++) {
            if (v[i] < media) {
                auxMedia[j] = v[i];
                j++;
            }
        }

        return auxMedia;
    }

    public double[] acimaMedia(double[] v) throws MensagemException {
        double[] auxMedia = new double[v.length];
        int j = 0;

        if (v == null || v.length == 0) {
            throw new MensagemException();
        }

        media = getMedia(v);

        for (int i = 0; i < v.length; i++) {
            if (v[i] > media) {
                auxMedia[j] = v[i];
                j++;
            }
        }

        return auxMedia;
    }

   
}
