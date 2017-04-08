package opserver;

/**
 * Created by yhkim on 2017-03-03.
 */
public class Client {
    public static void main(String[] args) {
        StatusSubject.add(new StatusEmailSender());
        StatusSubject.add(new StatusMessageSender());

        StatusChecker checker = new StatusChecker();
        checker.statusCheck();
    }
}
