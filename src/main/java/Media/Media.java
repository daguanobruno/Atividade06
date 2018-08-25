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
    
    public double getMenorValor(double[] v){
        
        double menorValor = v[0];
        
        for(int i = 0; i < v.length; i++){ 
            if(menorValor > v[i]){
                menorValor = v[i];
            }
        }
        return menorValor;
    }
    
    public double getMaiorValor(double[] v){
        
        double maiorValor = v[0];
        
        for(int i = 0; i < v.length; i++){ 
            if(maiorValor < v[i]){
                maiorValor = v[i];
            }
        }
        return maiorValor;
    }

}
