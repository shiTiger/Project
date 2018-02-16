package Future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureService {
    private FutureData data;
    public Data service(){
        data = new FutureData();
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new FutureThread(data));
        return data;
    }
}
