package NoClassDefFoundErrorTest;

class Test {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.getConfigValue());
    }
    public boolean getConfigValue(){
        return OrderAbilityConfig.FRACTIONAL_SHARE_ENABLED;
    }
}
