/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author Usuario
 */
public class Verificacao {
 
    public void verificação(double[] v) throws MensagemException{
           if (v == null || v.length == 0) {
           throw new MensagemException();
        }
    }
    
}
