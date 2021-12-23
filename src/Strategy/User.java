package Strategy;

public class User {
    Status status;

    public void setStatus(Status status) {
        this.status = status;
    }

    public void changeStatus() {
        status.change();
    }
}
