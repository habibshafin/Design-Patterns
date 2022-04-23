public class shakeshack {
    public shake produce(String sh) {
        shake temp = null;
        if (sh.equalsIgnoreCase("chocolate shake")) {
            temp = new chocolateShake();
        } else if (sh.equalsIgnoreCase("coffee shake")) {
            temp = new coffeeShake();
        } else if (sh.equalsIgnoreCase("strawberry shake")) {
            temp = new strawberryShake();
        } else if (sh.equalsIgnoreCase("vanilla shake")) {
            temp = new vanillaShake();
        } else if (sh.equalsIgnoreCase("zero shake")) {
            temp = new zeroShake();
        }
        return temp;
    }
}
