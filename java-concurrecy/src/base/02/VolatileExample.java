public class VolatileExample {
    int x = 0;
    volatile boolean v = false;
    public void writer(){
        x = 42;
        v = true;
    }

    public void reader(){
        if(v == true)
            System.out.println("x" + x);
    }

    public static void main(String[] args) {
        VolatileExample ve = new VolatileExample();

    }
}
