package Media;

public class Media {

    private double media = 0, soma = 0;
    private int aux = 0;

    public double getMedia(double[] v) {

        for (int i = 0; i < v.length; i++) {
            soma = soma + v[i];
            aux++;
        }

        return media = soma / aux;
    }

}
