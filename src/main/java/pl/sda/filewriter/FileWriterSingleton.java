package pl.sda.filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterSingleton {

    private static FileWriterSingleton instance;

    private FileWriterSingleton(){ // prywatny konstruktor zapewnia 1 instancję klasy

    }

    public synchronized static FileWriterSingleton getInstance(){ // słowo synchronized!!!!
        if(instance == null){
            System.out.println("jestem w if");
            instance = new FileWriterSingleton();
        }
        return instance;
    }

    public void write(String text, String file) throws IOException {
        FileWriter writer = new FileWriter(new File(file), true);
        writer.write(text);
        writer.close();



    }


}
