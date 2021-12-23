package State;

import java.util.Locale;

public class ToLowerCase implements Stateable{
    @Override
    public void writingState(String str) {
        System.out.println(str.toLowerCase(Locale.ROOT));
    }
}
