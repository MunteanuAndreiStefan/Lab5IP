import java.io.Serializable;


public final class Singleton1 implements SingletonMarker {

public static final Singleton1 INSTANCE = new Singleton1();

private Singleton1() {};

public synchronized int mySyncMethod(){System.out.println("Sample text."); return 1;}

}