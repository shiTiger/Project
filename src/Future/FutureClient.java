package Future;

public class FutureClient {
    public static void main(String[] args) {
        FutureService futureService = new FutureService();
        Data data = futureService.service();
        String s = data.getRequest();
        System.out.println(s);
    }
}
