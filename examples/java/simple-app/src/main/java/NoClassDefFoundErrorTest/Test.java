package NoClassDefFoundErrorTest;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import simplelib.SimpleLibContext;

class Test {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.getConfigValue());
    }
    public boolean getConfigValue(){
        return OrderAbilityConfig.FRACTIONAL_SHARE_ENABLED;
    }
}
