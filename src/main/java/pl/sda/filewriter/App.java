package pl.sda.filewriter;


import java.util.TreeMap;

public class App
{
    static class Task1 implements Runnable{ //wewnętrzna klasa

        @Override
        public void run() {
            for(int i =0; i<1000; i++){
                System.out.println("watek 1: " + i);
            }

        }
    }

    static class Task2 implements Runnable{

        @Override
        public void run() {
            for(int j =0; j<1000; j++){
                System.out.println("watek 2: " + j);
            }

        }
    }

    public static void main( String[] args ){

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start(); // uruchomienie wątku thread1
        thread2.start();
    }
}
