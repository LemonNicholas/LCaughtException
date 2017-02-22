package lemon.library.util;

/**
 * Created by NicholasTan on 22/02/2017.
 */

public class ExceptionSetting {

    public static boolean isDebugMode = false;

    public static boolean isDebugMode() {
        return isDebugMode;
    }

    public static void setIsDebugMode(boolean isDebugMode) {
        ExceptionSetting.isDebugMode = isDebugMode;
    }
}
