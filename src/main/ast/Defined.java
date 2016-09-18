package ast;

import java.util.Random;

public class Defined extends Exp {
	public final String id;

	public Defined(String id) {
		this.id=id;
	}

	@Override public String unparse() {
		return id +"; ";
	}

	@Override public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Defined other = (Defined)obj;
		return (this.id== null ? other.id== null : this.id.equals(other.id));
	}

	//todo
	public static Defined generate(Random random, int min, int max) {
		String id;
		AExp expression;
		id = ""+"abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
		expression = AExp.generate(random, min-1, max-1);
		return new Defined(id);
	}

	// las expresiones devuelven un valor,
	@Override
	public Object evaluate(State state) {
		return state.mapa.containsKey(id);
	}

	String check(Checkstate checkState) {
		String tipo = checkState.getTypeOf(id);
		if (tipo == null){
			checkState.errores.add("Variable no definida");
			return  "TruthValue";
		} else {
			return tipo;
		}
	}
}
