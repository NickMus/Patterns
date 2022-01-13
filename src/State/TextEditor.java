package State;

public class TextEditor {
   private Stateable stateable;

    public TextEditor(Stateable stateable) {
        this.stateable = stateable;
    }

    public void setStateable(Stateable stateable) {
        this.stateable = stateable;
    }

    public void writeText(String str) {
        stateable.writingState(str);
    }
}
