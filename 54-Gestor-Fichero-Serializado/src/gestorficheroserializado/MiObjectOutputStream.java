package gestorficheroserializado;

import java.io.*;


/**
 * The Class MiObjectOutputStream.
 *		!!!!!!!!IMPORTANTE!!!!!!!!!!
 *
 * El ObjectInputStream/Output da error si abrimos/cerramos el fichero para escribir varias veces
 * usar esta clase,se ha sobreescrito el metodo writeStreamHeader para que no haga nada
 * https://www.chuidiang.org/java/ficheros/ObjetosFichero.php
 * 
 * @author DiscoDurodeRoer
 */
public class MiObjectOutputStream extends ObjectOutputStream{
    
    /**
     *  
     * Constructor que recibe OutputStream .
     *
     * @param out OutputStream
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public MiObjectOutputStream(OutputStream out) throws IOException{
        super(out); //Llama al constructor de la superclase(OutputStream)
    }
    
    /**
     *  
     * Constructor sin parámetros .
     *
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws SecurityException the security exception
     */
    protected MiObjectOutputStream() throws IOException, SecurityException{
        super(); //Llama al constructor de la superclase(OutputStream)
    }
    
    /**
     * Write stream header.
     *
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @Override
    protected void writeStreamHeader() throws IOException{
        //No hacemos nada
    }
}
