package com.faith.app;

import com.faith.model.Notification;
import com.faith.model.NotificationFactory;

public class NotificationService {

	public static void main(String[] args) {
		NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();

	}

}
