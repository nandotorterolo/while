package ast;

import java.util.*;

/** Representación de conjunciones booleanas (AND).
*/
public class Conjunction extends BExp {
	public final Exp left;
	public final Exp right;

	public Conjunction(Exp left, Exp right) {
		this.left = left;
		this.right = right;
	}

	@Override public String unparse() {
		return "("+ left.unparse() +" and "+ right.unparse() +")";
	}

	@Override public String toString() {
		return "Conjunction("+ left +", "+ right +")";
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
		Conjunction other = (Conjunction)obj;
		return (this.left == null ? other.left == null : this.left.equals(other.left))
			&& (this.right == null ? other.right == null : this.right.equals(other.right));
	}

	public static Conjunction generate(Random random, int min, int max) {
		BExp left; BExp right; 
		left = BExp.generate(random, min-1, max-1);
		right = BExp.generate(random, min-1, max-1);
		return new Conjunction(left, right);
	}

	@Override
	public Object evaluate(State state) {
		Object left; Object right;
		left =this.left.evaluate(state);
		right =this.right.evaluate(state);
		if (left instanceof Boolean && right instanceof Boolean){
			return (Boolean) left && (Boolean) right;
		} else {
			throw new IllegalStateException(this.unparse());
		}
	}

	@Override
	String check(Checkstate checkState) {
		String tLeft = left.check(checkState);
		String tRight = right.check(checkState);
		if (tLeft.equals(tRight) && tLeft.equals("TruthValue"))
		{
			return tLeft;
		}
		else
		{
			checkState.errores.add("Error al comparar, los tipos deben ser TruthValue" + this.toString());
			return "Numeral";
		}
	}

}
