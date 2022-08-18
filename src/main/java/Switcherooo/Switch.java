package Switcherooo;

import java.util.Objects;

public class Switch {
    public static void main(String[] args) {
        String x = "bac";
        System.out.println(x);
        System.out.println(switcheroo(x));
    }
    public static String switcheroo(String x) {
        return x.replace("a","x").replace("b", "a").replace("x", "b");
    }
}
