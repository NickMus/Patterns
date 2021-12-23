package State;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new NormalState());
        textEditor.writeText("hello");

        textEditor.setStateable(new UpperCase());
        textEditor.writeText("hello");

        textEditor.setStateable(new ToLowerCase());
        textEditor.writeText("HELLO");
    }
}
