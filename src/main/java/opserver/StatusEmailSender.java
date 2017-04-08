package opserver;

/**
 * Created by yhkim on 2017-03-03.
 */
public class StatusEmailSender implements StatusObserver {

    @Override
    public void onAbnormalStatus(Status status) {
        System.out.println("Send Status Email ! " + status.toString());
    }
}
