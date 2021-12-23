package State;

import java.util.Locale;

public class UpperCase implements Stateable{
    @Override
    public void writingState(String str) {
        System.out.println(str.toUpperCase(Locale.ROOT));
    }
}
