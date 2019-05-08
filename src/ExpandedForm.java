import java.util.LinkedList;

public class ExpandedForm
{
    public static String expand(int num)
    {
        LinkedList<String> expandedList = new LinkedList<>();

        int digit;
        int multiplier = 1;

        while (num > 0) {
            digit = num % 10 * multiplier;
            if (digit > 0) {
                expandedList.push(Integer.toString(digit));
            }
            multiplier *= 10;
            num /= 10;
        }

        return String.join(" + ", expandedList);
    }
}