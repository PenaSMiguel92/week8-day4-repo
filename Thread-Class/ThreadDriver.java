public class ThreadDriver {
    public static void main(String[] args) {
        Employee emp1 = new Employee(10000);
        emp1.setPriority(1);
        emp1.start();

        Employee emp2 = new Employee(10000);
        emp2.setPriority(2);
        emp2.start();

        try {
            emp1.join(); //wait for emp1 thread to finish executing.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //display priority of threads, default is 5;
        System.out.println(emp1.getPriority());
        System.out.println(emp2.getPriority());
        //check to see if given thread is alive or dead;
        System.out.println(emp1.isAlive());
        System.out.println(emp2.isAlive());

        emp1.reportCount();
    }

    
}
