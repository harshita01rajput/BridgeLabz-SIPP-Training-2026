class Notification {
    protected String recipientName;
    protected String message;

    public Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    public void sendNotification() {
        System.out.println("Sending Notification...");
    }
}

class EmailNotification extends Notification {

    public EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println(
            "Email sent to " + recipientName +
            " : " + message
        );
    }
}

class SMSNotification extends Notification {

    public SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println(
            "SMS sent to " + recipientName +
            " : " + message
        );
    }
}

class PushNotification extends Notification {

    public PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println(
            "Push Notification sent to " + recipientName +
            " : " + message
        );
    }
}

public class SmartNotification {
    public static void main(String[] args) {

        Notification[] notifications = {
            new EmailNotification(
                "Harshita",
                "Your placement test is tomorrow."
            ),

            new SMSNotification(
                "Rahul",
                "Your OTP is 1234."
            ),

            new PushNotification(
                "Priya",
                "New job opportunities available."
            )
        };

        System.out.println("Sent Notifications:\n");

        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
}