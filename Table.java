public class Table {
    public synchronized void printTable(int n){
        for (int i = 1; i <= 10;i++) {
            try {
                Thread.sleep(1000);
                System.out.println(n*i);

            }catch (Exception e){

            }
        }

    }

}