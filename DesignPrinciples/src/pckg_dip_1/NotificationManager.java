package pckg_dip_1;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager {

    private final List<NotificationService> notificationServiceList;

    public NotificationManager() {
        notificationServiceList = new ArrayList<>();
    }

    public void addNotificationService(NotificationService notificationService) {
        if(notificationService == null) {
            throw new NullPointerException("NotificationService cannot be null");
        } else if(notificationServiceList.contains(notificationService)) {
            throw new IllegalArgumentException("NotificationService already exists");
        }else{
            notificationServiceList.add(notificationService);
            System.out.println("NotificationService added successfully");
        }

    }

    public void notifyWithMsg(String message, String recipient) {
        for(NotificationService notificationService : notificationServiceList) {
            notificationService.sendNotification(message, recipient);
        }
    }


}
