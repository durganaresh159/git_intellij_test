import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello Good Morning");
        int x=10;
        System.out.println("branch 2 is created");
        System.out.println("Hello Good Morning -- branch1");
        List<String> list = Arrays.asList(new String[]{"Raghu", "Ram"});
        for (String text: list) {
            System.out.println(text);
        }
    }
}
