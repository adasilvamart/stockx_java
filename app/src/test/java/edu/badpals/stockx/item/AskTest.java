package edu.badpals.stockx.item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
    
public class AskTest {
 
    @Test
    public void testAskConstructor() {
        Ask ask = new Ask("13", 288);
        assertEquals(288, ask.value());
        assertEquals("13", ask.size());
    }
}
    