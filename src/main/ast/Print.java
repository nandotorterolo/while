package ast;

import java.util.Random;

public class Print extends Stmt {
	public final Exp expression;

	public Print(Exp expression) {
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
		Print other = (Print)obj;
		return (this.expression == null ? other.expression == null : this.expression.equals(other.expression));
	}

	public static Print generate(Random random, int min, int max) {
		String id; AExp expression; 
		id = ""+"abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
		expression = AExp.generate(random, min-1, max-1);
		return new Print(expression);
	}

	@Override
	public Object evaluate(State state) {
		System.out.println(expression.evaluate(state));
		return state;
	}
}
