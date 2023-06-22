package builder;

import helpers.UserProps;
import model.User;
import org.aeonbits.owner.ConfigFactory;

public class UserBuilder {

    private static final UserProps user = ConfigFactory.create(UserProps.class);

    private UserBuilder() {
    }

    public static User getDefaultUser() {
        return User.builder()
                .email(user.EMAIL())
                .password(user.PASSWORD())
                .build();
    }
}
