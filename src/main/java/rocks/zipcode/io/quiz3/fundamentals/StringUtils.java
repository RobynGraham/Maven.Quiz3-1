package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
                String str1 = str.substring(0, indexToCapitalize);
                char char1 = Character.toUpperCase(str.charAt(indexToCapitalize));
                String str2 = str.substring(indexToCapitalize + 1);
                return (str1 + char1 + str2);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
                    return characterToCheckFor == baseString.charAt(indexOfString);

    }

    public static String[] getAllSubStrings(String string) {
            List<String> allSubStrings = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                String newSub = string.substring(i,j);
                if (!allSubStrings.contains(newSub)){
                    allSubStrings.add(newSub);
                }
            }

        }
                       return allSubStrings.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){

        return getAllSubStrings(input).length;

    }
}
