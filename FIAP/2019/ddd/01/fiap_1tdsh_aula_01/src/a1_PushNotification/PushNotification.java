public class PushNotification {
    private String appName;
    private int notificationQuantity;
    private int priority;

    public PushNotification(String appName, int notificationQuantity, int priority) {
        this.appName = appName;
        this.notificationQuantity = notificationQuantity;
        this.priority = priority;
    }

    public String getAppName() {
        return this.appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getNotificationQuantity() {
        return this.notificationQuantity;
    }

    public void setNotificationQuantity(int notificationQuantity) {
        this.notificationQuantity = notificationQuantity;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void clear() {
        System.out.println("Not relevant");
    }

    public void open() {
        System.out.println("Need to check, go to app");
    }

    public void openConfiguration() {
        System.out.println("Will disable this one forever");
    }
}
