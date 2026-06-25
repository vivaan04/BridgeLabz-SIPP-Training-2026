class Smart_notification {
    public void sendNotification() {
        System.out.println("Sending a generic notification.");
    }

}
class EmailNotification extends Smart_notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending an email notification.");
    }
}
class SMSNotification extends Smart_notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending an SMS notification.");
    }
}
class PushNotification extends Smart_notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending a push notification.");
    }
}
class Main {
    public static void main(String[] args) {
        Smart_notification notification1 = new EmailNotification();
        Smart_notification notification2 = new SMSNotification();
        Smart_notification notification3 = new PushNotification();

        notification1.sendNotification();
        notification2.sendNotification();
        notification3.sendNotification();
    }
}