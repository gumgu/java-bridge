package bridge;

public class Error {
    public static void isNumber(String object) {
        try {
            Integer.parseInt(object);
        } catch(IllegalArgumentException e) {
            System.out.println(ErrorMessage.RIGHT_BRIDGE_RANGE);
        }
    }

    public static void isRightNumberRange(int startNotInclude, int endNotInclude, int object) {
        if(object<startNotInclude || object>endNotInclude) {
            System.out.println(ErrorMessage.RIGHT_BRIDGE_RANGE);
            throw new IllegalArgumentException();
        }
    }


}

