package ucu;

import ast.State;
import ast.Stmt;
import java.io.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("> ");
			State state = new State();
			for (String line; (line = in.readLine()) != null ;) {
				line = line.trim();
				try {
					if (line.length() > 0) {
						Stmt stmt = (Stmt)(Parser.parse(line).value);
						System.out.print("\t"+ stmt +"\n> ");
						System.out.print("\t" + stmt.evaluate(state) + "\n> ");
					}
				} catch (Exception err) {
					System.err.print(err);
					err.printStackTrace();
				}
			}
	}
}