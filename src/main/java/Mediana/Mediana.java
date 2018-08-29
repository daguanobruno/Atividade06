package Mediana;

import Exception.MensagemException;

public class Mediana {

    private double mediana = 0;
    private int aux = 0;

    public double getMediana(double[] v) throws MensagemException{

        if(v == null || v.length == 0){
            throw new MensagemException();
        }
        
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
