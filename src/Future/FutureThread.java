package Future;

import com.sun.org.apache.xml.internal.dtm.DTMAxisIterator;

public class FutureThread implements Runnable {
    private FutureData data;
    public FutureThread(FutureData data){
        this.data = data;
    }
    @Override
    public void run() {
        System.out.println("唤醒");
        data.notifyData();
    }
}
