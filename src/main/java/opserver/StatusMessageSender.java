package opserver;

/**
 * Created by yhkim on 2017-03-03.
 */
public class StatusMessageSender implements StatusObserver {

    @Override
    public void onAbnormalStatus(Status status) {
        System.out.println("Send Status Message ! " + status.toString());
    }
}
