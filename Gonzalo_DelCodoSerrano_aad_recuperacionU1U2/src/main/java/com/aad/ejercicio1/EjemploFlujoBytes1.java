package com.aad.ejercicio1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

//Ejemplo de uso de las clases:


public class EjemploFlujoBytes1 {
	
	File file = new File("C:/text.bin");
	file.
	DataOutputStream stream = new DataOutputStream(new FileOutputStream(file));
	stream.writeBoolean(true);
	stream.writeInt(1234);
	stream.close();

}
