package ucu;


import java_cup.runtime.DefaultSymbolFactory;
import java_cup.runtime.Symbol;

import java.io.CharArrayReader;
import java.io.Reader;

public class Parse {

    static Reader reader;
    static Lexer scanner = new Lexer(null);
    static Parser parser = new Parser(scanner, new DefaultSymbolFactory());
    static Symbol symbol;

    public static Object parse(String val) {

        reader = new CharArrayReader(val.toCharArray());
        scanner.yyreset(reader);
        parser.setScanner(scanner);

        try {
            symbol = parser.parse();
            return symbol.value;
        } catch (Exception e) {
            e.printStackTrace();
            // throw new IllegalStateException("parsing" + val, e);
            return new IllegalStateException("parsing" + val, e);
        }
    }
}
