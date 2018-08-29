
package Exception;


public class Verificacao {
 
    public void verificação(double[] v) throws MensagemException{
           if (v == null || v.length == 0) {
           throw new MensagemException();
        }
    }
    
}
