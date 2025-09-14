 class Assignment implements Runnable {
 String task;
 Assignment(String task){
    this.task = task;
 }
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Task: "+this.task+", i: "+i);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }         
        }

   }
    
}


public class Assignment5 {

    public static void main(String[] args) {
        Thread t1 =  new Thread( new Assignment("One"));
        Thread t2 = new Thread(new Assignment("Two"));
        Thread t3= new Thread(new Assignment("Three"));
        Thread t4 = new Thread(new Assignment("Fourth"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}