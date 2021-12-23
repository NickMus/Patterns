package State;

public class NormalState implements Stateable{
    @Override
    public void writingState(String str) {
        System.out.println(str);
    }
}
