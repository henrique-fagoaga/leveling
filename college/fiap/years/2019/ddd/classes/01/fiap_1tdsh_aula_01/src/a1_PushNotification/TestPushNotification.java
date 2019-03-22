public class TestPushNotification {
    public static void main(String[] args) {
        PushNotification notification = new PushNotification("tinder", 3, 1);

        System.out.println(notification.getAppName());
        System.out.println(notification.getNotificationQuantity());
        System.out.println(notification.getPriority());

        notification.setAppName("twitter");
        notification.setNotificationQuantity(10);
        notification.setPriority(10);

        System.out.println(notification.getAppName());
        System.out.println(notification.getNotificationQuantity());
        System.out.println(notification.getPriority());

        notification.clear();
        notification.open();
        notification.openConfiguration();
    }
}
