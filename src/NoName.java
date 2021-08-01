public class NoName {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<120;i++){
                    System.out.println("匿名内部："+i);
                }
            }
        });
                thread.start();
    }
}
