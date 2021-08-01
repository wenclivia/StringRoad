public class RunlableCreate implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<120;i++){
            System.out.println("run方法执行："+i);
        }
    }

    public static void main(String[] args) {
        RunlableCreate runlableCreate = new RunlableCreate();
        Thread thread = new Thread(runlableCreate);
        thread.start();

    }
}
