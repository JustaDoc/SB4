
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4 {

    // replace this line with your constants
    private static final String wordsToFindT = "T";
    private static final String wordsToFindt = "t";
    private static final String wordsToFindY = "Y";
    private static final String wordsToFindy = "y";

    public static String findTYPattern(String s) {
        // replace this line with your code
        StringBuilder returnPhrase = new StringBuilder();
        int counter = 0;
        for (int index = 0; index < s.length(); index++) {
            char ch = s.charAt(index);
            char wordT = wordsToFindT.charAt(0);
            char wordt = wordsToFindt.charAt(0);
            char wordY = wordsToFindY.charAt(0);
            char wordy = wordsToFindy.charAt(0);
            if (ch == wordy || ch == wordY)
                counter +=1;
            if (ch == wordT || ch == wordt) {
                returnPhrase.append(ch);
                for (int index2 = index + 1; index2 < s.length(); index2++)
                {
                    char ch2 = s.charAt(index2);
                    if (ch2 == wordy || ch2 == wordY)
                    {
                        returnPhrase.append(ch2);
                        counter +=1;
                        index = index2 + 1;
                        break;
                    }
                    else
                    {
                        returnPhrase.append(ch2);
                    }
                }

            }
            if(counter == 0 )
            {
                returnPhrase.delete(0,s.length());
            }
        }
        return returnPhrase.toString();
    }
}
