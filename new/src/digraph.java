import java.io.File;


public class digraph {

	private static String DOT = "C:/Program Files (x86)/Graphviz2.26.3/bin/dot.exe";
	 private static String TEMP_DIR = "c:/temp";	// Windows


	public static void generatedigraph(File dot, String type,String outputfile)
	{
	   File img;
	  

	   try {
	 	 
	      img =  new File(outputfile);
	      if(!img.exists()){
	     	 img.createNewFile();
	      } else {
	     	 img.delete();
	     	 img.createNewFile();
	      }
	      Runtime rt = Runtime.getRuntime();
	      

	      String[] args = {DOT, "-T"+type, dot.getAbsolutePath(), "-o", img.getAbsolutePath()};
	      Process p = rt.exec(args);
	      
	      p.waitFor();

	      
	   }
	   catch (java.io.IOException ioe) {
	      System.err.println("Error:    in I/O processing of tempfile in dir " + outputfile +"\n");
	      System.err.println("       or in calling external command");
	      ioe.printStackTrace();
	   }
	   catch (java.lang.InterruptedException ie) {
	      System.err.println("Error: the execution of the external program was interrupted");
	      ie.printStackTrace();
	   }

	}
}
