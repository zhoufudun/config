package NoClassDefFoundErrorTest;


import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public final class OrderAbilityConfig {
    private static final Config CONFIG = ConfigFactory.load();
    public static final boolean FRACTIONAL_SHARE_ENABLED;

    public OrderAbilityConfig() {
    }

    static {
        // 这里要try catch 否者如果fractionalShare.support.enable不存在，会跑出异常，类无法初始化。
        FRACTIONAL_SHARE_ENABLED = CONFIG.getBoolean("fractionalShare.support.enable");
    }
}