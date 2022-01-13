package ChainOfResponsibility;

public class MidReportNotifier extends Notifier {
    public MidReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Middle report " + message);
    }
}
