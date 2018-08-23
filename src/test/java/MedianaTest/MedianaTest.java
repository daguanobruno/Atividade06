package MedianaTest;

import Mediana.Mediana;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MedianaTest {
    
    public MedianaTest() {
    }
    
    @Test
    public void testeVetorOrdenadoImpar(){
        double[] v = {1,2,3,4,5};
        
        Mediana m = new Mediana();
        
        double res = m.getMediana(v);
        assertEquals(3, res, 0.01);
    }
    
    @Test
    public void testeVetorOrdenadoPar(){
        
        double[] v = {1,2,4,5};
        
        Mediana m = new Mediana();
        
        double res = m.getMediana(v);
        assertEquals(2.5, res, 0.01);
        
    }
    
    
}
