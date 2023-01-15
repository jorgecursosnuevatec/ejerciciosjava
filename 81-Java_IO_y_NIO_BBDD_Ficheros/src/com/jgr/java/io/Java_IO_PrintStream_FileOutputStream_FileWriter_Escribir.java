package com.jgr.java.io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

/**
 * The Class Java_IO_PrintStream_FileOutputStream_FileWriter_Escribir.
 * OutputStream->abstracta,flujo de salida
 * PrintStream->subclase de OutputStream,datos a cualquier flujo de salida
 * 	print(tipo dato)
 * 	println(tipo dato),cualquier dato con salto de linea al final
 * 	printf(String format,Object args...) escritura datos con formato
 * 	se puede escribir en un fichero,sobreescribre y si no existe el fichero se crea
 * 	
 * FileOutputStreamEjemplo->subclase de  OutputStream,flujo de salida para ficheros
 * 	podemos usarlo como intermedio para escribir con el  PrintStream
 * 
 * FileWriter->clase especifica para escribir texto
 * puede sobreescribir o no,crea fichero, si se usa con BufferedWriter mejora el rendimiento
 * 
 * https://www.youtube.com/watch?v=gqrRieAbHws
 */
public class Java_IO_PrintStream_FileOutputStream_FileWriter_Escribir {
	public static void main(String[] args)  {
		
		
		//PrintStream
		//escribe con formato,en modo sobreescritura y si no existe el archivo lo crea
		String dir="1printStream.txt";		
		try(PrintStream outPrintStream= new PrintStream(dir)){
			outPrintStream.println("textoPrintStream");	
			System.out.println("printStream.txt");
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		
		
		//PrintStream+ FileOutputStreamEjemplo
		//permite realizar la escritura en modo append	
		//aqui usamos el fileoutputstream como objeto auxiliar para escribir con el printstream
		String dir2="2OutputStream_y_printStream.txt";		
		try(FileOutputStream fileOutputStream = new FileOutputStream(dir2,true)){			
			PrintStream outPrintStream2= new PrintStream(fileOutputStream);
			outPrintStream2.println("textoFileOutputStream_Y_PrintStream");	
			System.out.println("OutputStream_y_printStream.tx");
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
		}
		
		//con FileWriter
		//se puede usar con/sin sobreescritura,crea fichero si no existe,y se puede usar BufferedWriter
		//para mejorar el rendimiento		
		//este no hace append
		String dir3="3fileWriter.txt";
		try(FileWriter fileWriter = new FileWriter(dir3)){
			fileWriter.write("fileWriter");
			System.out.println("fileWriter.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//con sobreescritura
		String dir4="4fWriter_Append.txt";		
		try(FileWriter fileWriter2 = new FileWriter(dir4,true)){
			fileWriter2.write("fileWriterAppend");	
			fileWriter2.write("fileWriterAppend");	
			System.out.println("fileWriterAppend.txt");
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		//con sobreescritura y bufferedWriter
		String dir5="5fWriter_Buffered.txt";		
		try(FileWriter fileWriter3 = new FileWriter(dir5,true);
				BufferedWriter bw = new BufferedWriter(fileWriter3)
				){
			bw.write(dir5);
			bw.newLine();
			bw.write(dir5+"despues del salto de linea");
			System.out.println("fileWriterBufferedWriterAppend.txt");
					
		} catch (IOException e) {			
			e.printStackTrace();
		}

	}

}
