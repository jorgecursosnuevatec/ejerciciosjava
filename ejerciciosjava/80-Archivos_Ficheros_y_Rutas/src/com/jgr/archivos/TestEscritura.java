package com.jgr.archivos;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;


/**
 * The Class TestEscritura.
 * 
 * DIFERENCIA ENTRE ESCRIBIR FileWriter/FileOutputStream CON y SIN FLUSHING
 */
public class TestEscritura {
	 
 	/** The bytes. */
 	static byte[] bytes = new byte[10_000_000];
	  static {
	    for (int i = 0; i < bytes.length; i++) bytes[i] = (byte) (i%100+32);
	  }
	  
  	/**
  	 * The main method.
  	 *
  	 * @param args the arguments
  	 * @throws Exception the exception
  	 */
  	public static void main(String[] args) throws Exception {
	    writer(true);
	    writer(false);
	    stream(true);
	    stream(false);
	  }

	  /**
  	 * Writer.
  	 *
  	 * @param flush the flush
  	 * @throws IOException Signals that an I/O exception has occurred.
  	 */
  	static void writer(boolean flush) throws IOException {
	    Writer out = new FileWriter("./Writeroutput.txt");
	    long a = System.currentTimeMillis();
	    for (byte j : bytes) {
	      out.write(j);
	      if (flush) out.flush();
	    }
	    out.close();
	    System.out.println("FileWriter with" + (flush? "":"out") + " flushing: " +
	        (System.currentTimeMillis() - a));
	  }
	  
  	/**
  	 * Stream.
  	 *
  	 * @param flush the flush
  	 * @throws IOException Signals that an I/O exception has occurred.
  	 */
  	static void stream(boolean flush) throws IOException {
	    OutputStream out = new FileOutputStream("./OutputStreamoutput.txt");
	    long a = System.currentTimeMillis();
	    for (byte j : bytes) {
	      out.write(j);
	      if (flush) out.flush();
	    }
	    out.close();
	    System.out.println("FileOutputStream with" + (flush? "":"out") + " flushing: " +
	        (System.currentTimeMillis() - a));
	  }
}