package helpers;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:user.properties"})
public interface UserProps extends Config {

    @Key("email")
    String EMAIL();

    @Key("password")
    String PASSWORD();
}
