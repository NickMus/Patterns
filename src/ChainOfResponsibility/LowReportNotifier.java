package ChainOfResponsibility;

public class LowReportNotifier extends Notifier {
    public LowReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Low notifier " + message);
    }
}
