// THREADS

// Thread 1 Declaration
class thread1 extends Thread {

    // Thread run Function
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Parth");
        }
    }

    // Class Constructor For changing the name of thread
    public thread1(String name) {
        super(name);
    }

}

// Thread 2 Declaration
class thread2 extends Thread {

    // Thread run Function
    @Override
    public void run() {
        for (int i = 0; i < 55; i++) {
            System.out.printf("thank you\n");

            // Thread Delay Property
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class G_multithreading {
    public static void main(String[] args) {

        // Threaded Class Objects
        thread1 t1 = new thread1("pammu");
        thread2 t2 = new thread2();

        // Thread Priority
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        // Thread Run Function Acsess
        t1.start();
        t2.start();

        // Thread Properties
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t1.getClass());
        System.out.println(t2.getClass());

    }
}
