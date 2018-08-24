package Mediana;

public class Mediana {

    public double getMediana(double[] v) {

        double mediana = 0;
        int aux = 0;
        
        for (int i = 0; i < v.length; i++) {
            aux++;
        }
        
        if (aux % 2 == 1) {
            mediana = v [v.length/2];
        }else{
            aux = aux / 2;
            mediana = v[aux] + v[aux-1];
            
            mediana = mediana / 2;
        }

        return mediana;
    }

}
