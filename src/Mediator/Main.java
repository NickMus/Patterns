package Mediator;

public class Main {
    public static void main(String[] args) {


        ChatRoom chat = new ChatRoom();

        User admin = new Admin(chat, "admin");
        User user1 = new SimpleUser(chat, "user 1");
        User user2 = new SimpleUser(chat, "user 2");

        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);

//        user1.sendMessage("hello");
        admin.sendMessage("hello");

    }
}
