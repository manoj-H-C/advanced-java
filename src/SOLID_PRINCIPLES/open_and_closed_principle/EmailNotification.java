package SOLID_PRINCIPLES.open_and_closed_principle;

public class EmailNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Email: "+ message);
    }
}
