package ast;

public abstract class Exp {
	abstract public String unparse();
	abstract public Object evaluate(State state);
	abstract public boolean equals(Object obj);
	abstract String check (Checkstate checkState);
}
