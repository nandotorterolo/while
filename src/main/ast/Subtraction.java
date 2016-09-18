package ast;

import java.util.*;

/** Representación de restas.
*/
public class Subtraction extends AExp {
	public final Exp left;
	public final Exp right;

	public Subtraction(Exp left, Exp right) {
		this.left = left;
		this.right = right;
	}

	@Override public String unparse() {
		return "("+ left.unparse() +" - "+ right.unparse() +")";
	}

	@Override public String toString() {
		return "Subtraction("+ left +", "+ right +")";
	}

	@Override public int hashCode() {
		int result = 1;
		result = result * 31 + (this.left == null ? 0 : this.left.hashCode());
		result = result * 31 + (this.right == null ? 0 : this.right.hashCode());
		return result;
	}

	@Override public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Subtraction other = (Subtraction)obj;
		return (this.left == null ? other.left == null : this.left.equals(other.left))
			&& (this.right == null ? other.right == null : this.right.equals(other.right));
	}

	public static Subtraction generate(Random random, int min, int max) {
		AExp left; AExp right; 
		left = AExp.generate(random, min-1, max-1);
		right = AExp.generate(random, min-1, max-1);
		return new Subtraction(left, right);
	}

	@Override
	public Object evaluate(State state) {
		Object left; Object right;
		left =this.left.evaluate(state);
		right =this.right.evaluate(state);
		if (left instanceof Double && right instanceof Double){
			return (Double) left - (Double) right;
		} else {
			throw new IllegalStateException(this.unparse());
		}
	}

	@Override
	String check(Checkstate checkState) {
		String tLeft = left.check(checkState);
		String tRight = right.check(checkState);
		if (tLeft.equals(tRight) && tLeft.equals("Numeral"))
		{
			return tLeft;
		}
		else
		{
			checkState.errores.add("Error al restar, los timpos deben ser numerales " + this.toString());
			return "Numeral";
		}
	}
}
