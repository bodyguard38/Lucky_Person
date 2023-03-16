package Lucky_User;

import java.time.LocalDateTime;

public class User {
    //fields
    String name;
    LocalDateTime recordTime;

    public User(String name, LocalDateTime recordTime) {
        this.name = name;
        this.recordTime = recordTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", recordTime=" + recordTime +
                '}';
    }
}
