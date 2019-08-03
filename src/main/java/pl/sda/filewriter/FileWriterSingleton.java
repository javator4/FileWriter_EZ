package pl.sda.filewriter;

public class FileWriterSingleton {

    private static FileWriterSingleton instance;

    private FileWriterSingleton(){ // prywatny konstruktor zapewnia 1 instancję klasy

    }

    public static FileWriterSingleton getInstance(){
        if(instance == null){
            instance = new FileWriterSingleton();
        }
        return instance;
    }
}
