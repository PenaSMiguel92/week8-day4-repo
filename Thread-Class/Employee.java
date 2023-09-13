public class Employee extends Thread {
    private int countTo;
    Employee() {

    }

    Employee(int countTo) {
        this.countTo = countTo;
    }
    @Override
    public void run() {
        for (int i = 0; i < countTo; i++) {
            //System.out.println(Thread.currentThread().getName() + " is working...");
            // try {
            //     Thread.sleep(2000);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            //     break;
            // }
            Counter.inc();

        }
    }
    
    public void reportCount() {
        System.out.println(Thread.currentThread().getName() + " is reporting: " + Counter.getCount());
    }

    static class Counter {static int count; static void inc() { count++;} static int getCount() {return count;}}
    
}
