package Future;

import java.security.PrivateKey;

public class FutureData implements Data {
    private Object lock =  new Object();//验证锁,monitor
    private String name;
    private boolean isOk = false;
    @Override
    public String getRequest() {
            try {
                    synchronized (this) {
                        while (!isOk) {
                            System.out.println("假象数据");
                            this.wait();
                            System.out.println("等待线程被唤醒");
                        }
                    }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        return "hehe";
    }

    public  void notifyData(){
            synchronized (this) {
                System.out.println("真正的操作");
                name = "真的数据返回";
                isOk = true;
                this.notify();
                System.out.println("ssssss");
            }
    }
}
