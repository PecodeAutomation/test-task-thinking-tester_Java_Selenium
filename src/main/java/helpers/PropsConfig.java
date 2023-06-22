package helpers;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config.properties"})
public interface PropsConfig extends Config {

  @Key("ui_url_base")
  String UI_URL_BASE();
}
