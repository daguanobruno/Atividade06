package Mediana;

import Exception.MensagemException;
import Exception.Verificacao;

public class Mediana {

    private double mediana = 0;
    private int aux = 0;

    Verificacao ve = new Verificacao();

    public double getMediana(double[] v) throws MensagemException {

        ve.verificação(v);

        for (int i = 0; i < v.length; i++) {
            aux++;
        }

        if (aux % 2 == 1) {

            mediana = v[v.length / 2];

        } else {

            aux = aux / 2;
            mediana = v[aux] + v[aux - 1];

            mediana = mediana / 2;
        }

        return mediana;
    }
}
