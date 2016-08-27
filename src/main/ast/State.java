package ast;

import java.util.HashMap;
import java.util.Map;

public class State {
    public Map <String,Object> mapa = new HashMap<String,Object>();

    public String toString(){
        String rest="";
        for (Map.Entry<String, Object> entry : mapa.entrySet())
        {
            rest += (entry.getKey() + " = " + entry.getValue()+"\n");
        }

        return rest;
    }
}