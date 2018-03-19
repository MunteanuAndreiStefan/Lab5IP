import java.io.Serializable;


public final class Singleton1 implements SingletonMarker {

private static Singleton1 INSTANCE = null

private Singleton1() {};

public synchronized int mySyncMethod(){System.out.println("Sample text."); return 1;}

public Singleton1 getInstance(){
    if(INSTANCE == null)
            INSTANCE = new Singleton1();
            return INSTANCE;
    }

}