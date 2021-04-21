package OfficeHours.Practice_04_19_2021;

import day38_methods.StringUtils;

public class ReverseEachWord {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("It started to snow in Chicago"));
    }
    public static String reverseEachWord(String str) {
        String revers = "";

        for (String each : str.split(" ")) {
            revers += StringUtils.revers(each) + " ";

        }
        return revers.trim();
    }
}

