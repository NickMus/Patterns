package Strategy;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.setStatus(new Online());
        user.changeStatus();
        user.setStatus(new Afk());
        user.changeStatus();
        user.setStatus(new Offline());
        user.changeStatus();



    }
}
