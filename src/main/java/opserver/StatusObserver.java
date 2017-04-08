package opserver;

/**
 * Created by yhkim on 2017-03-03.
 */
public interface StatusObserver {
    void onAbnormalStatus(Status status);
}
