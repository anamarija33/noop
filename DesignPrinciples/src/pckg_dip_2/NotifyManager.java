package pckg_dip_2;

import java.util.ArrayList;
import java.util.List;

public class NotifyManager {
    private List<NotificationService> notificationServices;

    public NotifyManager() {
        this.notificationServices = new ArrayList<>();
    }

    public void addNewNotificationService(NotificationService notificationService){
        if(notificationService == null) {
            throw new NullPointerException("NotificationService cannot be null");
        } else if(notificationServices.contains(notificationService)) {
            throw new IllegalArgumentException("NotificationService already exists");
        } else {
            notificationServices.add(notificationService);
            System.out.println("NotificationService added successfully");
        }
    }

    public void notifyWithAll(String msg, String rec){
        for(NotificationService notificationService : notificationServices) {
            notificationService.notifyWithSender(msg, rec);
        }
    }
}
