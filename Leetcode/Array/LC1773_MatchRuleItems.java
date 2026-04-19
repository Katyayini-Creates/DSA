package Array;

import java.util.*;

public class LC1773_MatchRuleItems {
    public static void main(String[] args) {
        //Another Optimal Approach
        List<List<String>> items = new ArrayList<>();

        items.add(new ArrayList<>(List.of("phone", "blue", "pixel")));
        items.add(new ArrayList<>(List.of("computer", "silver", "lenovo")));
        items.add(new ArrayList<>(List.of("phone", "gold", "iphone")));

        String ruleKey = "type";
        String ruleValue = "phone";

        int result = countItems(items, ruleKey, ruleValue);
        System.out.println(result);
    }

    static int countItems(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;

        if (ruleKey.equals("type")) index = 0;
        else if (ruleKey.equals("color")) index = 1;
        else index = 2;

        int count = 0;

        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}

//Optimal Approach
//class Solution {
//    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//        int count = 0;
//        switch (ruleKey) {
//            case "type" :
//                for (int i = 0; i < items.size(); i++) {
//                    if (items.get(i).get(0).equals(ruleValue)) {
//                        count++;
//                    }
//                }
//                break;
//            case "color" :
//                for (int i =0; i< items.size(); i++) {
//                    if(items.get(i).get(1).equals(ruleValue)) {
//                        count++;
//                    }
//                }
//                break;
//            case "name" :
//                for (int i =0; i< items.size(); i++) {
//                    if(items.get(i).get(2).equals(ruleValue)) {
//                        count++;
//                    }
//                }
//                break;
//            default :
//                return -1;
//        }
//        return count;
//    }
//}
