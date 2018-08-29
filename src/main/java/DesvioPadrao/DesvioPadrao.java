/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesvioPadrao;

import Exception.MensagemException;
import Media.Media;

/**
 *
 * @author Usuario
 */
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
