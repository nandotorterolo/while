package ast;

import java.util.*;

public class Checkstate {

    private class Pair<T, U> {
        final T lhs;
        final U rhs;

        Pair(final T lhs, final U rhs) {
            this.lhs = lhs;
            this.rhs = rhs;
        }
    }

    private final Map<String, Pair<String, Boolean>> map;
    public List<String> errores;

    public Checkstate() {
        this.map = new HashMap<String, Pair<String, Boolean>>();
        this.errores = new ArrayList<String>();
    }

    static public Checkstate intersect(final Checkstate first, final Checkstate second) {
        Checkstate result = new Checkstate();
        for (String id : first.map.keySet()) {
            Pair<String, Boolean> firstEntry = first.map.get(id);
            Pair<String, Boolean> secondEntry = second.map.get(id);

            boolean sameType = firstEntry.lhs.equals(secondEntry.lhs);
            boolean bothDefined = firstEntry.rhs.equals(secondEntry.rhs);

            if (sameType && bothDefined) {
                result.map.put(id, firstEntry);
            }
        }
        return result;
    }

    public Checkstate intersectWith(final Checkstate other) {
        return Checkstate.intersect(this, other);
    }

    public void defineVariable(final String id, final String type) {
        Pair<String, Boolean> entry = new Pair<String, Boolean>(type, new Boolean(true));
        this.map.put(id, entry);
    }

    public String getTypeOf(final String id) {
        Pair<String, Boolean> entry = this.map.get(id);
        if (entry != null) {
            return entry.lhs;
        }
        return null;
    }

    public boolean isDefined(final String id) {
        Pair<String, Boolean> entry = this.map.get(id);
        if (entry != null) {
            return entry.rhs;
        }
        return false;
    }
}