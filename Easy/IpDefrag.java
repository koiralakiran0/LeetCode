package Easy;

public class IpDefrag {
    public static void main(String[] args) {
        String input = "1.1.1.1";
        System.out.println(defangIPaddr(input));
    }
    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}