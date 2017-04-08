package opserver;

/**
 * Created by yhkim on 2017-03-03.
 */
public class StatusChecker {
    public void statusCheck() {
        // ex
        Status status = loadStatus();

//        while (true) {

            if(status == Status.ERROR) {
                StatusSubject subject = new StatusSubject();
                subject.notifyStatus(status);
            }
//        }
    }

    private Status loadStatus() {
        return Status.ERROR;
    }
}
