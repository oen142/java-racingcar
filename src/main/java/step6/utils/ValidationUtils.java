package step6.utils;

public class ValidationUtils {

    public static final int NAME_LENGTH = 5;

    public static boolean validName(String name) {
        if(StringUtils.isBlank(name)){
            return false;
        }
        if(name.length() > NAME_LENGTH){
            return false;
        }
        return true;
    }
}
