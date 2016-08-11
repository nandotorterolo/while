package ucu;

import junit.framework.TestCase;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by fernando on 25/06/15.
 *
 * Valores simples expresados con palabras reservadas:
 */
public class TestWhileLanguage extends TestCase {

    Logger logger;

    protected void setUp() {
        logger = Logger.getAnonymousLogger();
    }

    public void testAssignment() {
        String value = "y=2;";

        try {
            Object obj = Parse.parse(value);
            logger.log(Level.INFO,obj.toString());
        }catch (Exception e){
            logger.log(Level.SEVERE, e.getMessage(), e.getCause());
        }
    }



}
