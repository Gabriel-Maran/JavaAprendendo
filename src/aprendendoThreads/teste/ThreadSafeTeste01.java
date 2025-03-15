package aprendendoThreads.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames{
    private final List<String> names = Collections.synchronizedList(new ArrayList<>());

    public synchronized void add(String name){
        names.add(name);
    }

    public synchronized void removeFirts(){
        if(!names.isEmpty()){
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.removeFirst());
        }
    }
}


public class ThreadSafeTeste01 {
    public static void main(String[] args) {
        ThreadSafeNames t = new ThreadSafeNames();
        t.add("AWDKAWDK");
        Runnable r = t::removeFirts;
//        Runnable r = () ->{
//            t.removeFirts();
//        };
        new Thread(r).start();
        new Thread(r).start();

    }
}
