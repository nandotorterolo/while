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
//        String value = "y=2;"; // Assignment(y, Numeral(2.0))
//        String value = "y=2 * (x=2);"; // Assignment(y, Multiplication(Numeral(2.0), Assignment(x, Numeral(2.0))))
//        String value = "if (1==1) then x=1; else x=2;"; // IfThenElse(CompareEqual(Numeral(1.0), Numeral(1.0)), Assignment(x, Numeral(1.0)), Assignment(x, Numeral(2.0)))
//        String value = "if (1==1) then x=1;"; // IfThen(CompareEqual(Numeral(1.0), Numeral(1.0)), Assignment(x, Numeral(1.0)))
//        String value = "if (true) then x=1;"; // IfThen(TruthValue(true), Assignment(x, Numeral(1.0)))
//        String value = "if (true==false) then x=1;"; // IfThen(CompareEqual(TruthValue(true), TruthValue(false)), Assignment(x, Numeral(1.0)))
//        String value = "hello = \"hello worl\";"; // Assignment(hello, String(hello worl))
//        String value = "if (x=1) + \"hello worl\" then a=true;"; // IfThen(Addition(Assignment(x, Numeral(1.0)), String(hello worl)), Assignment(a, TruthValue(true)))
        String value = "x=i=1;"; // IfThen(Addition(Assignment(x, Numeral(1.0)), String(hello worl)), Assignment(a, TruthValue(true)))


        try {
            Object obj = Parse.parse(value);
            logger.log(Level.INFO,obj.toString());
        }catch (Exception e){
            logger.log(Level.SEVERE, e.getMessage(), e.getCause());
        }
    }



}
