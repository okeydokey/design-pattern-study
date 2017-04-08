package opserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yhkim on 2017-03-03.
 */
public class StatusSubject {
    private static List<StatusObserver> observers = new ArrayList<>();

    public static void add(StatusObserver observer) {
        if(!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public static void remove(StatusObserver observer) {
        observers.remove(observer);
    }

    public void notifyStatus(Status status) {
        observers.forEach((observer) -> observer.onAbnormalStatus(status));
    }

}
