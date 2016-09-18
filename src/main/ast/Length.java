package ast;

import java.util.Random;

public class Length extends Exp {
	public final Exp expression;

	public Length(Exp expression) {
		this.expression = expression;
	}

	@Override public String unparse() {
		return expression.unparse() +"; ";
	}

	@Override public String toString() {
		return expression.toString() +")";
	}

	@Override public int hashCode() {
		int result = 1;
		result = result * 31 + (this.expression == null ? 0 : this.expression.hashCode());
		return result;
	}

	@Override public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Length other = (Length)obj;
		return (this.expression == null ? other.expression == null : this.expression.equals(other.expression));
	}

	public static Length generate(Random random, int min, int max) {
		String id; AExp expression; 
		id = ""+"abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
		expression = AExp.generate(random, min-1, max-1);
		return new Length(expression);
	}

	@Override
	public Object evaluate(State state) {
		Object eval = expression.evaluate(state);
		if (eval instanceof String) return (double) ((String) eval).length();
		else
		 	throw  new IllegalStateException("Evaluate String");
	}

	String check(Checkstate checkState) {
		String tipo = expression.check(checkState);
		if (!tipo.equals("String"))
            checkState.errores.add("Error" + expression.toString());
        return "Numeral";

	}
}
