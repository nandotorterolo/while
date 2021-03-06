package ast;

import java.util.*;

/** Representación de las comparaciones por igual.
*/
public class CompareEqual extends BExp {
	public final Exp left;
	public final Exp right;

	public CompareEqual(Exp left, Exp right) {
		this.left = left;
		this.right = right;
	}

	@Override public String unparse() {
		return "("+ left.unparse() +" == "+ right.unparse() +")";
	}

	@Override public String toString() {
		return "CompareEqual("+ left +", "+ right +")";
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
		CompareEqual other = (CompareEqual)obj;
		return (this.left == null ? other.left == null : this.left.equals(other.left))
			&& (this.right == null ? other.right == null : this.right.equals(other.right));
	}

	public static CompareEqual generate(Random random, int min, int max) {
		AExp left; AExp right; 
		left = AExp.generate(random, min-1, max-1);
		right = AExp.generate(random, min-1, max-1);
		return new CompareEqual(left, right);
	}

	@Override
	public Object evaluate(State state) {
		return left.equals(right);
	}

	@Override
	String check(Checkstate checkState) {
		String tLeft = left.check(checkState);
		String tRight = right.check(checkState);
		if (tLeft.equals(tRight) ) // && (tLeft.equals("TruthValue") || tLeft.equals("Numeral"))
		{
			return tLeft;
		}
		else
		{
			checkState.errores.add("Error al comparar, los tipos deben ser TruthValue" + this.toString());
			return "TruthValue";
		}
	}
}
