public class CreatThread extends Thread{
    @Override
    public void run(){
        for (int i=0;i<120;i++){
            System.out.println("run方法执行："+i);
        }
    }

    public static void main(String[] args) {
        CreatThread creatThread = new CreatThread();
        creatThread.start();
    }
}
