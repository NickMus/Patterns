package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Notifier lowReportNotifier = new LowReportNotifier(Priority.LOW);
        Notifier middleReportNotifier = new MidReportNotifier(Priority.MIDDLE);
        Notifier highReportNotifier = new HighReportNotifier(Priority.HIGH);

        lowReportNotifier.setNextNotifier(middleReportNotifier);
        middleReportNotifier.setNextNotifier(highReportNotifier);

        lowReportNotifier.notifyManager("test1", 0);
        lowReportNotifier.notifyManager("test2", 1);
        lowReportNotifier.notifyManager("test3", 2);
    }
}
