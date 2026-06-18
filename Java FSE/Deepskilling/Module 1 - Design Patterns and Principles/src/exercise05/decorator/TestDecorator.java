package exercise05.decorator;

public class TestDecorator {

    public static void main(String[] args) {

        System.out.println("Email Only:");
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Server is running.");

        System.out.println("\nEmail + SMS:");
        Notifier smsNotifier =
                new SMSNotifierDecorator(new EmailNotifier());
        smsNotifier.send("Server is running.");

        System.out.println("\nEmail + SMS + Slack:");
        Notifier fullNotifier =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));

        fullNotifier.send("Server is running.");
    }
}