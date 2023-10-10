import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException{

	// we expect exactly one argument: the name of the input file
	if (args.length!=1) {
	    System.err.println("\n");
	    System.err.println("Impl Interpreter\n");
	    System.err.println("=================\n\n");
	    System.err.println("Please give as input argument a filename\n");
	    System.exit(-1);
	}
	String filename=args[0];

	// open the input file
	CharStream input = CharStreams.fromFileName(filename);
	    //new ANTLRFileStream (filename); // depricated
	
	// create a lexer/scanner
	hdlLexer lex = new hdlLexer(input);
	
	// get the stream of tokens from the scanner
	CommonTokenStream tokens = new CommonTokenStream(lex);
	
	// create a parser
	hdlParser parser = new hdlParser(tokens);
	
	// and parse anything from the grammar for "start"
	ParseTree parseTree = parser.start();

	// Construct an interpreter and run it on the parse tree
	Interpreter interpreter = new Interpreter();
	String result=interpreter.visit(parseTree);
	System.out.println("The result is: "+result);
    }
}

// We write an interpreter that implements interface
// "implVisitor<T>" that is automatically generated by ANTLR
// This is parameterized over a return type "<T>" which is in our case
// simply a Double.

class Interpreter extends AbstractParseTreeVisitor<String> implements hdlVisitor<String> {
    // todo - Java will complain that "Interpreter" does not in fact
    // implement "implVisitor" at the moment.

	@Override
	public String visitTerminal(TerminalNode node) {
		return node.getText(); // Return the text of the visited token
	}

	//add comment to negar
	public String visitStart(hdlParser.StartContext ctx){
		 System.out.println("Evaluating Start");
		//return "hello";
		String program = "<h1>";
		program += ctx.name_of_file.getText();

		program += ctx.ins.getText();

		System.out.println(visit(ctx.lats));

		return ctx.name_of_file.getText() + ctx.ins.getText() + ctx.outs.getText();
	}

	@Override
	public String visitLatchSection(hdlParser.LatchSectionContext ctx) {
		System.out.println("latches Section");
		int length = ctx.latches().size();

		String latches="";
		for (int i = 0; i <length ; i++) {
			latches+=visit(ctx.latches().get(i));
		}
	//	System.out.println(latches);
		return latches;
	}

	@Override
	public String visitLatches(hdlParser.LatchesContext ctx) {
	String id1=ctx.id1.getText();
	String id2=ctx.id2.getText();
	return id1 + "&rarr;" +id2;
	}

	@Override
	public String visitUpdateSection(hdlParser.UpdateSectionContext ctx) {
		System.out.println("updates section");
		String updates=ctx.updates().toString();
		return ctx.updates().toString();
	}

	@Override
	public String visitUpdates(hdlParser.UpdatesContext ctx) {
		String id=ctx.id.getText();
		String e=ctx.e.getText();
		return ctx.id + "=" + ctx.e.getText();
	}

	@Override
	public String visitSimulateSection(hdlParser.SimulateSectionContext ctx) {
		String id=ctx.id.getText();
		String e=ctx.e.getText();
		System.out.println("Simulate Section");
		return ctx.id+"="+ctx.e.getText();
	}

	@Override
	public String visitNot(hdlParser.NotContext ctx) {
		return null;
	}

	@Override
	public String visitOr(hdlParser.OrContext ctx) {
		return null;
	}

	@Override
	public String visitVar(hdlParser.VarContext ctx) {
		return ctx.getText();
	}

	@Override
	public String visitAnd(hdlParser.AndContext ctx) {
		return null;
	}

	@Override
	public String visitNum(hdlParser.NumContext ctx) {
		return null;
	}

	@Override
	public String visitParen(hdlParser.ParenContext ctx) {
		return null;
	}
   /* public Double visitStart(implParser.StartContext ctx){
	System.out.println("Evaluating Start");
	return visit(ctx.e);
    }*/

	//T visitLatchSection(hdlParser.LatchSectionContext ctx);
	/* public Double visitAdd(implParser.AddContext ctx){
	Double d1=visit(ctx.e1);
	Double d2=visit(ctx.e2);
	System.out.println("Addition "+d1+ctx.op.getText()+d2);
	if (ctx.op.getText().equals("+"))
	    return d1+d2;
	else return d1-d2;
    };*/
   /* public Double visitMult(implParser.MultContext ctx){
	Double d1=visit(ctx.e1);
	Double d2=visit(ctx.e2);
	System.out.println("Mult "+d1+ctx.op.getText()+d2);
	if (ctx.op.getText().equals("*"))
	    return d1*d2;
	else return d1/d2;
    }
    public Double visitVar(implParser.VarContext ctx){
	System.err.println("Variables not yet supported.");
	System.exit(-1);
	return null;
    };
    public Double visitConst(implParser.ConstContext ctx){
	return Double.valueOf(ctx.f.getText());
    }
    public Double visitParen(implParser.ParenContext ctx){
	System.out.println("Parentheses");
	return visit(ctx.e);}*/


}

