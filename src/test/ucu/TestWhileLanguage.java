package ucu;

import ast.State;
import ast.Stmt;
import junit.framework.TestCase;
import org.javatuples.Pair;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 * Created by fernando on 25/06/15.
 *
 * Valores simples expresados con palabras reservadas:
 */
public class TestWhileLanguage extends TestCase {

    Logger logger;
    State state;
    Map<Integer,String> datosPruebas = new HashMap<Integer,String>();
    Map<Integer,Pair<String,Map<String,Object>>> datosPruebas2 = new HashMap<Integer,Pair<String,Map<String,Object>>>();

    protected void setUp() {
        logger = Logger.getAnonymousLogger();
        state = new State();
        loadData1();
        loadData2();
    }

    /**
     * states should be a variable arguments of <String,Object>
     * @param states: If string to be parsed is "y=2;" then states = Pair.with("y",2.0)
     * @return
     */
    protected Map<String,Object> createMap(Pair... states) {
        Map<String,Object> map = new HashMap<String,Object>();
        Stream<Pair<String,Object>> stream = Stream.of (states);
        stream.forEach(in -> map.put(in.getValue0(),in.getValue1()));
        return map;
    }

    protected void loadData1(){
        datosPruebas.put(1, "y=2;");
        datosPruebas.put(2, "y=0-2;");
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
        datosPruebas.put(15, "{y=\"6\"; print(length(y));}");
        datosPruebas.put(16, "{y=6; print(defined(y));}");
        datosPruebas.put(17, "{y=defined(y); print(y); print(defined(y));}");
    }

    /**
     * datosPruebas2 (numTestCase, String to be parsed, Map of values xxpected)
     */
    protected void loadData2(){
        datosPruebas2.put(1, Pair.with("y=2;", createMap(Pair.with("y",2.0))));
        datosPruebas2.put(2, Pair.with("y=0-2;", createMap(Pair.with("y",-2.0))));
        datosPruebas2.put(3, Pair.with("if (1==2) then x=1; else x=2;", createMap(Pair.with("x",2.0))));
        datosPruebas2.put(4, Pair.with("if (1==1) then x=1;", createMap(Pair.with("x",1.0))));
        datosPruebas2.put(5, Pair.with("{y=defined(y); print(y); print(defined(y));}", createMap(Pair.with("y",false))));
        datosPruebas2.put(6, Pair.with("{i=0; while (i <= 3) do i=i+1;}", createMap(Pair.with("i",4.0))));
        datosPruebas2.put(7, Pair.with("{i=true; while i do {print(i); i=false;} print(i);}", createMap(Pair.with("i",false))));
        datosPruebas2.put(8, Pair.with("{i=1*8; j=i*8;}", createMap(Pair.with("i",8.0),Pair.with("j",64.0))));
    }

    public void testData1() {
       try {
            Integer numTest = 15;
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

    public void testData2() {
        try {
            Integer numTest = 8;
            Pair<String,Map<String,Object>> pair = datosPruebas2.get(numTest);
            Object obj = Parse.parse(pair.getValue0());
            logger.log(Level.INFO,obj.toString());
            if (obj instanceof Stmt) {
                logger.log(Level.INFO, ((Stmt)obj).evaluate(state).toString());
                Assert.assertEquals("Los estados no cumple", pair.getValue1(), state.mapa);
            }
        }catch (Exception e){
            logger.log(Level.SEVERE, e.getMessage(), e.getCause());
        }
    }

    public void testAllData2() {
        datosPruebas2.forEach((k,v) -> {
            try {
                state.mapa.clear();
                Pair<String,Map<String,Object>> pair = datosPruebas2.get(k);
                Object obj = Parse.parse(pair.getValue0());
                logger.log(Level.INFO,obj.toString());
                if (obj instanceof Stmt) {
                    logger.log(Level.INFO, ((Stmt)obj).evaluate(state).toString());
                    Assert.assertEquals("Los estados no cumple", pair.getValue1(), state.mapa);
                }
            }catch (Exception e){
                logger.log(Level.SEVERE, e.getMessage(), e.getCause());
            }
        });
    }

}
