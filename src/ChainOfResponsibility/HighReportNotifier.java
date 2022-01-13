package ChainOfResponsibility;

public class HighReportNotifier extends Notifier {
    public HighReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("High report " + message);
    }
}
