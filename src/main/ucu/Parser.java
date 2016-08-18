
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150326 (SVN rev 63)
//----------------------------------------------------

package ucu;

import ast.*;
import java.io.*;
import java.util.*;
import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20150326 (SVN rev 63) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\027\000\002\002\004\000\002\002\006\000\002\002" +
    "\004\000\002\002\005\000\002\002\006\000\002\002\006" +
    "\000\002\002\010\000\002\003\003\000\002\003\003\000" +
    "\002\003\003\000\002\003\005\000\002\003\005\000\002" +
    "\003\005\000\002\003\005\000\002\003\003\000\002\003" +
    "\003\000\002\003\005\000\002\003\005\000\002\003\004" +
    "\000\002\003\005\000\002\003\005\000\002\004\002\000" +
    "\002\004\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\014\005\004\017\006\026\005\027\010\031" +
    "\011\001\002\000\004\021\057\001\002\000\004\016\056" +
    "\001\002\000\016\005\uffec\017\uffec\022\uffec\026\uffec\027" +
    "\uffec\031\uffec\001\002\000\004\002\052\001\002\000\020" +
    "\004\012\005\013\006\021\007\014\012\016\020\015\033" +
    "\017\001\002\000\020\004\012\005\013\006\021\007\014" +
    "\012\016\020\015\033\017\001\002\000\026\010\ufffa\011" +
    "\ufffa\013\ufffa\014\ufffa\015\ufffa\016\ufffa\023\ufffa\024\ufffa" +
    "\025\ufffa\032\ufffa\001\002\000\030\010\ufff8\011\ufff8\013" +
    "\ufff8\014\ufff8\015\ufff8\016\ufff8\021\045\023\ufff8\024\ufff8" +
    "\025\ufff8\032\ufff8\001\002\000\020\004\012\005\013\006" +
    "\021\007\014\012\016\020\015\033\017\001\002\000\026" +
    "\010\ufff3\011\ufff3\013\ufff3\014\ufff3\015\ufff3\016\ufff3\023" +
    "\ufff3\024\ufff3\025\ufff3\032\ufff3\001\002\000\026\010\ufff2" +
    "\011\ufff2\013\ufff2\014\ufff2\015\ufff2\016\ufff2\023\ufff2\024" +
    "\ufff2\025\ufff2\032\ufff2\001\002\000\026\010\ufff9\011\ufff9" +
    "\013\ufff9\014\ufff9\015\ufff9\016\ufff9\023\ufff9\024\ufff9\025" +
    "\ufff9\032\ufff9\001\002\000\020\011\027\013\037\014\024" +
    "\015\023\023\025\024\026\032\030\001\002\000\020\004" +
    "\012\005\013\006\021\007\014\012\016\020\015\033\017" +
    "\001\002\000\026\010\uffef\011\027\013\uffef\014\024\015" +
    "\023\016\uffef\023\025\024\026\025\uffef\032\030\001\002" +
    "\000\020\004\012\005\013\006\021\007\014\012\016\020" +
    "\015\033\017\001\002\000\020\004\012\005\013\006\021" +
    "\007\014\012\016\020\015\033\017\001\002\000\020\004" +
    "\012\005\013\006\021\007\014\012\016\020\015\033\017" +
    "\001\002\000\020\004\012\005\013\006\021\007\014\012" +
    "\016\020\015\033\017\001\002\000\020\004\012\005\013" +
    "\006\021\007\014\012\016\020\015\033\017\001\002\000" +
    "\020\004\012\005\013\006\021\007\014\012\016\020\015" +
    "\033\017\001\002\000\026\010\ufff1\011\ufff1\013\ufff1\014" +
    "\ufff1\015\ufff1\016\ufff1\023\ufff1\024\ufff1\025\ufff1\032\ufff1" +
    "\001\002\000\026\010\ufff7\011\ufff7\013\ufff7\014\024\015" +
    "\023\016\ufff7\023\025\024\026\025\ufff7\032\030\001\002" +
    "\000\026\010\ufff0\011\ufff0\013\ufff0\014\ufff0\015\ufff0\016" +
    "\ufff0\023\ufff0\024\ufff0\025\ufff0\032\ufff0\001\002\000\026" +
    "\010\uffee\011\uffee\013\uffee\014\uffee\015\uffee\016\uffee\023" +
    "\uffee\024\026\025\uffee\032\030\001\002\000\026\010\ufff6" +
    "\011\ufff6\013\ufff6\014\ufff6\015\ufff6\016\ufff6\023\025\024" +
    "\026\025\ufff6\032\030\001\002\000\026\010\ufff5\011\ufff5" +
    "\013\ufff5\014\ufff5\015\ufff5\016\ufff5\023\025\024\026\025" +
    "\ufff5\032\030\001\002\000\014\005\004\017\006\026\005" +
    "\027\010\031\011\001\002\000\022\002\ufffc\005\ufffc\017" +
    "\ufffc\022\ufffc\026\ufffc\027\ufffc\030\041\031\ufffc\001\002" +
    "\000\014\005\004\017\006\026\005\027\010\031\011\001" +
    "\002\000\022\002\ufffb\005\ufffb\017\ufffb\022\ufffb\026\ufffb" +
    "\027\ufffb\030\ufffb\031\ufffb\001\002\000\020\010\044\011" +
    "\027\014\024\015\023\023\025\024\026\032\030\001\002" +
    "\000\026\010\ufff4\011\ufff4\013\ufff4\014\ufff4\015\ufff4\016" +
    "\ufff4\023\ufff4\024\ufff4\025\ufff4\032\ufff4\001\002\000\020" +
    "\004\012\005\013\006\021\007\014\012\016\020\015\033" +
    "\017\001\002\000\026\010\uffed\011\027\013\uffed\014\024" +
    "\015\023\016\uffed\023\025\024\026\025\uffed\032\030\001" +
    "\002\000\020\011\027\014\024\015\023\023\025\024\026" +
    "\025\050\032\030\001\002\000\014\005\004\017\006\026" +
    "\005\027\010\031\011\001\002\000\022\002\ufffd\005\ufffd" +
    "\017\ufffd\022\ufffd\026\ufffd\027\ufffd\030\ufffd\031\ufffd\001" +
    "\002\000\004\002\001\001\002\000\016\005\004\017\006" +
    "\022\054\026\005\027\010\031\011\001\002\000\022\002" +
    "\ufffe\005\ufffe\017\ufffe\022\ufffe\026\ufffe\027\ufffe\030\ufffe" +
    "\031\ufffe\001\002\000\016\005\uffeb\017\uffeb\022\uffeb\026" +
    "\uffeb\027\uffeb\031\uffeb\001\002\000\022\002\uffff\005\uffff" +
    "\017\uffff\022\uffff\026\uffff\027\uffff\030\uffff\031\uffff\001" +
    "\002\000\020\004\012\005\013\006\021\007\014\012\016" +
    "\020\015\033\017\001\002\000\020\011\027\014\024\015" +
    "\023\016\061\023\025\024\026\032\030\001\002\000\022" +
    "\002\000\005\000\017\000\022\000\026\000\027\000\030" +
    "\000\031\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\004\002\006\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\004\052\001\001\000\002\001\001" +
    "\000\004\003\046\001\001\000\004\003\017\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\003\042\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\003\021\001\001\000\002\001\001" +
    "\000\004\003\035\001\001\000\004\003\034\001\001\000" +
    "\004\003\033\001\001\000\004\003\032\001\001\000\004" +
    "\003\031\001\001\000\004\003\030\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\002\037\001" +
    "\001\000\002\001\001\000\004\002\041\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\003" +
    "\045\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\002\050\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\002\054\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\003\057\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




	public void syntax_error(Symbol currentToken) {
		report_error("Syntax error at [" + (currentToken.left+1) +"," + (currentToken.right+1) +"]!", null);
	}

	public static Symbol parse(Reader input) throws Exception {
		return (new Parser(new Lexer(input))).parse();
	}

	public static Symbol parse(String input) throws Exception {
		return parse(new StringReader(input));
	}

	public static void main(String[] args) throws Exception {
		if (args.length < 1) {
			System.out.println(parse(new InputStreamReader(System.in, "UTF8")).value);
		} else for (int i = 0; i < args.length; ++i) {
			System.out.println(parse(new InputStreamReader(new FileInputStream(args[i]), "UTF8")).value);
		}
	}



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= stmt EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Stmt start_val = (Stmt)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // stmt ::= ID EQUALS_SIGN exp SEMICOLON 
            {
              Stmt RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String $1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int $2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int $2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object $2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int $3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int $3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Exp $3 = (Exp)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int $4left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $4right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object $4 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new AssignmentStmt($1, $3); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // stmt ::= SKIP SEMICOLON 
            {
              Stmt RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object $1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int $2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object $2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Sequence(new Stmt[0]); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // stmt ::= LEFT_CURLY_BRACKET repeat$stmt RIGHT_CURLY_BRACKET 
            {
              Stmt RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object $1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int $2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int $2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		List<Stmt> $2 = (List<Stmt>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int $3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object $3 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Sequence($2.toArray(new Stmt[$2.size()])); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // stmt ::= WHILE exp DO stmt 
            {
              Stmt RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object $1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int $2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int $2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Exp $2 = (Exp)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int $3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int $3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object $3 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int $4left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $4right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Stmt $4 = (Stmt)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new WhileDo($2, $4); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // stmt ::= IF exp THEN stmt 
            {
              Stmt RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object $1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int $2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int $2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Exp $2 = (Exp)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int $3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int $3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object $3 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int $4left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $4right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Stmt $4 = (Stmt)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new IfThen($2, $4); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // stmt ::= IF exp THEN stmt ELSE stmt 
            {
              Stmt RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		Object $1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int $2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int $2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Exp $2 = (Exp)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int $3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int $3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object $3 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int $4left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int $4right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Stmt $4 = (Stmt)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int $5left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int $5right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object $5 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int $6left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $6right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Stmt $6 = (Stmt)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new IfThenElse($2, $4, $6); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // exp ::= NUM 
            {
              Exp RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double $1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Numeral($1); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // exp ::= STR 
            {
              Exp RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String $1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Str($1); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // exp ::= ID 
            {
              Exp RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String $1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Variable($1); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // exp ::= exp ASTERISK exp 
            {
              Exp RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Exp $1 = (Exp)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int $2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int $2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object $2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int $3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Exp $3 = (Exp)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Multiplication($1, $3); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // exp ::= exp PLUS_SIGN exp 
            {
              Exp RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Exp $1 = (Exp)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int $2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int $2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object $2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int $3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Exp $3 = (Exp)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Addition($1, $3); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // exp ::= exp HYPHEN_MINUS exp 
            {
              Exp RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Exp $1 = (Exp)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int $2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int $2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object $2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int $3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Exp $3 = (Exp)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Subtraction($1, $3); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // exp ::= LEFT_PARENTHESIS exp RIGHT_PARENTHESIS 
            {
              Exp RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object $1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int $2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int $2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Exp $2 = (Exp)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int $3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object $3 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = $2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // exp ::= TRUE 
            {
              Exp RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object $1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new TruthValue(true); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // exp ::= FALSE 
            {
              Exp RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object $1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new TruthValue(false); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // exp ::= exp DOUBLE_EQUALS_SIGN exp 
            {
              Exp RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Exp $1 = (Exp)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int $2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int $2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object $2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int $3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Exp $3 = (Exp)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new CompareEqual($1, $3); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // exp ::= exp LESS_THAN_OR_EQUAL exp 
            {
              Exp RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Exp $1 = (Exp)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int $2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int $2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object $2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int $3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Exp $3 = (Exp)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new CompareLessOrEqual($1, $3); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // exp ::= EXCLAMATION_MARK exp 
            {
              Exp RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object $1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int $2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Exp $2 = (Exp)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Negation($2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // exp ::= exp DOUBLE_AMPERSAND exp 
            {
              Exp RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Exp $1 = (Exp)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int $2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int $2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object $2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int $3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Exp $3 = (Exp)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Conjunction($1, $3); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // exp ::= ID EQUALS_SIGN exp 
            {
              Exp RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String $1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int $2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int $2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object $2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int $3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Exp $3 = (Exp)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new AssignmentExp($1, $3); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // repeat$stmt ::= 
            {
              List<Stmt> RESULT =null;
		 List<Stmt> $0;
		$0 = new ArrayList<Stmt>();
		RESULT = $0; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("repeat$stmt",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // repeat$stmt ::= repeat$stmt stmt 
            {
              List<Stmt> RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		List<Stmt> $1 = (List<Stmt>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int $2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Stmt $2 = (Stmt)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 List<Stmt> $0;
		$1.add($2); $0 = $1;
		RESULT = $0; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("repeat$stmt",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
