package Thread;

class ck extends Thread{
    public void run(){

        System.out.println("product"+Thread.currentThread().getId());
        System.out.println("making"+Thread.currentThread().getId());
        System.out.println("selling"+Thread.currentThread().getId());
    }
}
class ma{
    public static void main(String[] args) {
        int x = 5;
        for (int i =0 ;i<x;i++){
            ck o= new ck();
            o.start();
        }

    }
}