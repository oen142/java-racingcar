package step6.utils;

public class StringUtils {


    public static boolean isBlank(String name) {

        if(name == null){
            return true;
        }
        if (name.trim().isEmpty()) {
            return true;
        }
        return false;
    }

    public static String repeat(String value, int repeat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(value);
        }
        return sb.toString();
    }
}
