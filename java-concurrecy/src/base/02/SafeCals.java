import com.sun.xml.internal.ws.api.message.saaj.SAAJFactory;

public class SafeCals {
    long value = 0L;
    long get(){
        return value;
    }
    synchronized void addOne(){
        value += 1;
    }

    public static void main(String[] args) throws InterruptedException {
        SafeCals sf = new SafeCals();
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=0; i<100;i++)
                    sf.addOne();
            }
        });

        t1.start();
        t1.join();
        System.out.println(sf.get());
    }
}

