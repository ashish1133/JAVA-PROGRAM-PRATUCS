class ca implements Runnable{
    public void run(){
        System.out.println("product"+Thread.currentThread().getId());
        System.out.println("making"+Thread.currentThread().getId());
        System.out.println("selling"+Thread.currentThread().getId());
    }
}
class main{
    public static void main(String[] args) {
        int x=3;
        for (int i=0;i<=x;i++){
            ca o = new ca();
            Thread k = new Thread(o);
            k.start();
        }
    }
}