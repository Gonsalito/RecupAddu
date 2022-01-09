package com.aad.ejercicio2;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess{

	static RandomAccessFile fichero = null;
    
	public static void main(String[] args) {
      
    	

        try {
            
        	fichero = new RandomAccessFile("ficheros/enteros.dat", "rw");                                        

            // Muestre el número de enteros contiene el fichero, Ejemplo: el fichero tiene x enteros.

        		System.out.println("El fichero tiene " + fichero.readInt() + " enteros.");
        	
            // Imprima los valores de los enteros del fichero
        		mostrarFichero();        	
        
        	
        	// Modifique el valor 20 por 99
        		fichero.seek(20);
        		int numero = 99;
        		fichero.writeInt(numero);
            // Imprima los valores de los enteros del fichero
        		mostrarFichero();
            // Realice el tratamiento de excepciones correspondientes
           

        } catch (Exception ex) {
            
        } 
    }
    public static void mostrarFichero() {
        int n;
        try {
           
			fichero.seek(0); //nos situamos al principio
            while (true) {
                n = fichero.readInt();  //se lee  un entero del fichero                                           
                System.out.println(n);  //se muestra en pantalla
            }
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
