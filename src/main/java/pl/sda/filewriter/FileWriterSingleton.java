package pl.sda.filewriter;

public class FileWriterSingleton {

    private static FileWriterSingleton instance;

    private FileWriterSingleton(){ // prywatny konstruktor zapewnia 1 instancję klasy

    }

    public synchronized static FileWriterSingleton getInstance(){
        if(instance == null){
            System.out.println("jestem w if");

            instance = new FileWriterSingleton();
        }
        return instance;
    }
}
