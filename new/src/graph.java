import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


public class graph {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filename = "d:/good";
		System.out.println(filename);
		digraph nnn=new digraph();
		  FileOutputStream out= new FileOutputStream(filename + ".dig");
		  PrintStream p= new PrintStream( out );
		 	p.println("digraph M {");     
		  p.println("a->b");
		
		  p.println("}");
		  p.close();
		  out.close();
		  File f=new File(filename + ".dig");
		  String outputfilepath=filename + ".png";
		  nnn.generatedigraph(f,"png",outputfilepath);
	}

}
