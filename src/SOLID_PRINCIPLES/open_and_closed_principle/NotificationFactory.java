package SOLID_PRINCIPLES.open_and_closed_principle;

public class NotificationFactory {
    /**
     * this is an example for open and closed principle
     * I can extend the same interface to any number of classes as per my requirement
     * And I am not touching the original interface logic
     * hence open for extension but closed for modifications
     * @param type is the message type
     *             depending on the type we send object is created
     * @return Notification object
     */
    public static Notification getNotification(String type){
        if(type.equalsIgnoreCase("email")) return new EmailNotification();
        if(type.equalsIgnoreCase("whatsapp")) return new WhatsAppNotification();

        throw new IllegalArgumentException("invalid notification type");
    }

    public static void main(String[] args) {
        //for email
        Notification notification = NotificationFactory.getNotification("email");
        notification.send("hello!");
        //for whatsapp
        Notification whatsapp = NotificationFactory.getNotification("whatsapp");
        whatsapp.send("hello!");
        //i can do the same for as many classes as i need

    }
}
