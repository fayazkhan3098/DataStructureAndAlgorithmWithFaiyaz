package DSA.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class CountItemsMatchingARule {
    public static void main(String[] args) {
//        String a = "abc";
//        String b = "abc";
//        String c = "adb";
//        System.out.println(a.matches(b));
//        System.out.println(a.matches(c));
        List<List<String>> items = new ArrayList<>();

        // Manually adding items to the 2D ArrayList
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        System.out.println(countMatches(items,"color","silver"));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i = 0;
        int count = 0;
        int len = items.size();
        int index = (Objects.equals(ruleKey, "type"))?0:(Objects.equals(ruleKey, "color"))?1:2;
        while(i < len){
            if(items.get(i).get(index).matches(ruleValue) )
                count++;
            i++;

        }
        return count;
    }
    public static int countmatches(List<List<String>> items, String ruleKey, String ruleValue){
        int count=0;
        for (int i = 0; i < items.size(); i++) {
            if(ruleKey.equals("type") && ruleValue.equals(items.get(i).get(0)))count++;
            if(ruleKey.equals("color") && ruleValue.equals(items.get(i).get(1)))count++;
            if(ruleKey.equals("name") && ruleValue.equals(items.get(i).get(2)))count++;

        }
    return count;}
}