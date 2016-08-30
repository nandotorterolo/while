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
        datosPruebas.put(2, "y=0-2;");  // Fail
        datosPruebas.put(3, "if (1==1) then x=1; else x=2;");
        datosPruebas.put(4, "if (1==1) then x=1;");
        datosPruebas.put(5, "if (true) then x=1;");
        datosPruebas.put(6, "{if (true==false) then x=1; y=1;}");
        datosPruebas.put(7, "hello = \"hello worl\";");
        datosPruebas.put(8, "if (x=1) + \"hello worl\" then a=true;");
        datosPruebas.put(9, "x=i=1;");
        datosPruebas.put(10, "if (true) then {x=1; y=1;}");
        datosPruebas.put(11, "if (true) then {x=1; y=1;}");
        datosPruebas.put(12, "print(1+2);");
        datosPruebas.put(13, "{y=1; print(y);}");
        datosPruebas.put(14, "{y=\"sadfsa\"; print(length(y));}");
        datosPruebas.put(15, "{y=\"6\"; length(y);}"); // fail
        datosPruebas.put(16, "{y=6; print(defined(y));}");
        datosPruebas.put(17, "{y=defined(y); print(y); print(defined(y));}");
    }

    public void testSingle() {
       try {
            Integer numTest = 17;
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
        datosPruebas.forEach((k,v) -> {
            logger.log(Level.INFO, "test" + k + " : " + v);
            try {
                Object obj = Parse.parse(v);
                logger.log(Level.INFO,obj.toString());
                if (obj instanceof Stmt) {
                    logger.log(Level.INFO, ((Stmt)obj).evaluate(state).toString());
                }
            }catch (Exception e){
                logger.log(Level.SEVERE, e.getMessage(), e.getCause());
            }
        });
    }

}
