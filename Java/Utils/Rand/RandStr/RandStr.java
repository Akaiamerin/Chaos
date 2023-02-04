import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
public class RandStr {
    public static final int RAND_INDEX = 1;
    public static final int NON_RAND_INDEX = 2;
    public static final String MIXED_CASE = "Az"; //大小写
    public static final String ALL_UPPERCASE = "AZ"; //全大写
    public static final String ALL_LOWERCASE = "az"; //全小写
    public static final String DIGIT = "09"; //数字
    public static final String OTHER = "!~"; //其他
    public static final String MIXED_CASE_AND_DIGIT = "Az09"; //大小写 + 数字
    public static final String ALL_UPPERCASE_AND_DIGIT = "AZ09"; //全大写 + 数字
    public static final String ALL_LOWERCASE_AND_DIGIT = "az09"; //全小写 + 数字
    public static final String MIXED_CASE_AND_DIGIT_AND_OTHER = "Az09!~"; //大小写 + 数字 + 其他
    public static final String ALL_UPPERCASE_AND_DIGIT_AND_OTHER = "AZ09!~"; //全大写 + 数字 + 其他
    public static final String ALL_LOWERCASE_AND_DIGIT_AND_OTHER = "az09!~"; //全小写 + 数字 + 其他
    private static final ArrayList<Character> CH_ARR_LIST1 = new ArrayList<>(Arrays.asList('!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/')); //33-47
    private static final ArrayList<Character> CH_ARR_LIST2 = new ArrayList<>(Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')); //48-57
    private static final ArrayList<Character> CH_ARR_LIST3 = new ArrayList<>(Arrays.asList(':', ';', '<', '=', '>', '?', '@')); //58-64
    private static final ArrayList<Character> CH_ARR_LIST4 = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')); //65-90
    private static final ArrayList<Character> CH_ARR_LIST5 = new ArrayList<>(Arrays.asList('[', '\\', ']', '^', '_', '`')); //91-96
    private static final ArrayList<Character> CH_ARR_LIST6 = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')); //97-122
    private static final ArrayList<Character> CH_ARR_LIST7 = new ArrayList<>(Arrays.asList('{', '|', '}', '~')); //123-126
    private static final SecureRandom secRand = new SecureRandom();
    private static void randOrderChArrList(ArrayList<Character> arrList) {
        for (int i = 0; i < arrList.size(); i++) {
            Collections.swap(arrList, secRand.nextInt(arrList.size()), secRand.nextInt(arrList.size()));
        }
    }
    private static ArrayList<Character> getChArrList(String str) {
        ArrayList<Character> ret = new ArrayList<>();
        if (Objects.equals(str, RandStr.MIXED_CASE) == true) {
            ret = new ArrayList<>() {{
                addAll(CH_ARR_LIST4);
                addAll(CH_ARR_LIST6);
            }};
        }
        else if (Objects.equals(str, RandStr.ALL_UPPERCASE) == true) {
            ret = new ArrayList<>() {{
                addAll(CH_ARR_LIST4);
            }};
        }
        else if (Objects.equals(str, RandStr.ALL_LOWERCASE) == true) {
            ret = new ArrayList<>() {{
                addAll(CH_ARR_LIST6);
            }};
        }
        else if (Objects.equals(str, RandStr.DIGIT) == true) {
            ret = new ArrayList<>() {{
                addAll(CH_ARR_LIST2);
            }};
        }
        else if (Objects.equals(str, RandStr.OTHER) == true) {
            ret = new ArrayList<>() {{
                addAll(CH_ARR_LIST1);
                addAll(CH_ARR_LIST3);
                addAll(CH_ARR_LIST5);
                addAll(CH_ARR_LIST7);
            }};
        }
        else if (Objects.equals(str, RandStr.MIXED_CASE_AND_DIGIT) == true) {
            ret = new ArrayList<>() {{
                addAll(CH_ARR_LIST2);
                addAll(CH_ARR_LIST4);
                addAll(CH_ARR_LIST6);
            }};
        }
        else if (Objects.equals(str, RandStr.ALL_UPPERCASE_AND_DIGIT) == true) {
            ret = new ArrayList<>() {{
                addAll(CH_ARR_LIST2);
                addAll(CH_ARR_LIST4);
            }};
        }
        else if (Objects.equals(str, RandStr.ALL_LOWERCASE_AND_DIGIT) == true) {
            ret = new ArrayList<>() {{
                addAll(CH_ARR_LIST2);
                addAll(CH_ARR_LIST6);
            }};
        }
        else if (Objects.equals(str, RandStr.MIXED_CASE_AND_DIGIT_AND_OTHER) == true) {
            ret = new ArrayList<>() {{
                addAll(CH_ARR_LIST1);
                addAll(CH_ARR_LIST2);
                addAll(CH_ARR_LIST3);
                addAll(CH_ARR_LIST4);
                addAll(CH_ARR_LIST5);
                addAll(CH_ARR_LIST6);
                addAll(CH_ARR_LIST7);
            }};
        }
        else if (Objects.equals(str, RandStr.ALL_UPPERCASE_AND_DIGIT_AND_OTHER) == true) {
            ret = new ArrayList<>() {{
                addAll(CH_ARR_LIST1);
                addAll(CH_ARR_LIST2);
                addAll(CH_ARR_LIST3);
                addAll(CH_ARR_LIST4);
                addAll(CH_ARR_LIST5);
                addAll(CH_ARR_LIST7);
            }};
        }
        else if (Objects.equals(str, RandStr.ALL_LOWERCASE_AND_DIGIT_AND_OTHER) == true) {
            ret = new ArrayList<>() {{
                addAll(CH_ARR_LIST1);
                addAll(CH_ARR_LIST2);
                addAll(CH_ARR_LIST3);
                addAll(CH_ARR_LIST5);
                addAll(CH_ARR_LIST6);
                addAll(CH_ARR_LIST7);
            }};
        }
        else {
            ret = null;
        }
        if (ret != null) {
            randOrderChArrList(ret);
        }
        return ret;
    }
    private static ArrayList<String[]> getRestrictionArrList(String str) {
        String[] splitArr = str.split(" ");
        ArrayList<String[]> ret = new ArrayList<>();
        for (int i = 0; i < splitArr.length; i++) {
            String[] split2 = splitArr[i].split("-");
            ret.add(split2);
        }
        return ret;
    }
    public static String RandStr(int randStrSize, int opt, String str) {
        StringBuilder ret = new StringBuilder();
        if (opt == RandStr.RAND_INDEX) {
            ArrayList<Character> arrList = getChArrList(str);
            for (int i = 0; i < randStrSize; i++) {
                ret.append(arrList.get(secRand.nextInt(arrList.size())));
            }
        }
        else if (opt == RandStr.NON_RAND_INDEX) {
            ArrayList<String[]> restrictionArrList = getRestrictionArrList(str);
            for (int i = 0; i < restrictionArrList.size(); i++) {
                int curBeginIndex = Integer.parseInt(restrictionArrList.get(i)[0]);
                int curEndIndex = Integer.parseInt(restrictionArrList.get(i)[1]);
                String curStr = restrictionArrList.get(i)[2];
                ArrayList<Character> arrList = getChArrList(curStr);
                for (int j = curBeginIndex; j <= curEndIndex; j++) {
                    ret.append(arrList.get(secRand.nextInt(arrList.size())));
                }
            }
        }
        else {
            ret = null;
        }
        return Objects.toString(ret);
    }
}