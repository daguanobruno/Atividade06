package Media;


public class Media {
    
    public double getMedia(double[] v){
        
        double media = 0;
        double soma = 0;
        int aux = 0;
        
        for(int i = 0; i < v.length; i++){
            soma = soma + v[i];
            aux ++;
        }
        
        media = soma / aux;
        
        return media;
    }
    
}
