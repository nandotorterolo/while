package ucu;

import ast.State;
import ast.Stmt;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by fernando on 25/06/15.
 *
 * Valores simples expresados con palabras reservadas:
 */
public class TestWhileLanguage extends TestCase {

    Logger logger;
    State state;
    Map<Integer,String> datosPruebas = new HashMap<Integer,String>();

    protected void setUp() {
        logger = Logger.getAnonymousLogger();
        state = new State();
        loadData();
    }

    protected void loadData(){
        datosPruebas.put(1, "y=2;");
        datosPruebas.put(2, "y=(-2);");  // Fail
        datosPruebas.put(3, "if (1==1) then x=1; else x=2;");
        datosPruebas.put(4, "if (1==1) then x=1;");
        datosPruebas.put(5, "if (true) then x=1;");
        datosPruebas.put(6, "if (true==false) then x=1;");
        datosPruebas.put(7, "hello = \"hello worl\";");
        datosPruebas.put(8, "if (x=1) + \"hello worl\" then a=true;");
        datosPruebas.put(9, "x=i=1;"); // Fail
    }

    public void testSingle() {
       try {
            Integer numTest = 2;
            Object obj = Parse.parse(datosPruebas.get(numTest));
            logger.log(Level.INFO,obj.toString());
            if (obj instanceof Stmt) {
                logger.log(Level.INFO, ((Stmt)obj).evaluate(state).toString());
            }
        }catch (Exception e){
            logger.log(Level.SEVERE, e.getMessage(), e.getCause());
        }
    }

    public void testAll() {

        try {
            datosPruebas.forEach((k,v) -> {
                logger.log(Level.INFO, "test" + k + " : " + v);
                Object obj = Parse.parse(v);
                logger.log(Level.INFO,obj.toString());
                if (obj instanceof Stmt) {
                    logger.log(Level.INFO, ((Stmt)obj).evaluate(state).toString());
                }
            });
        }catch (Exception e){
            logger.log(Level.SEVERE, e.getMessage(), e.getCause());
        }
    }



}
