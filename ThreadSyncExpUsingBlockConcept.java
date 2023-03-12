public class ThreadSyncExpUsingBlockConcept {
    public static void main(String[] args) {
        Table t1 = new Table();

        Thread1 thread1 = new Thread1(t1);
        Thread2 thread2 = new Thread2(t1);

        thread1.start();
        thread2.start();
    }
}
