package tester.metodsPratice;

import java.util.*;
public class CountVowelInStr {
    public static void main(String[] args) {
        //System.out.println(countVowel("Jai Shree Ram"));
        System.out.println(countVowelInEachWord("Jai Shree Ram"));
    }
    public static int countVowel(String str)
    {
        str=str.toLowerCase();
        int result=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                result++;
            }
        }
        return result;
    }
    public static int countVowelInEachWord(String s)
    {
        HashMap<String,Integer> map=new HashMap<>();
        int ct=0;
        String word[]=s.split("\\s");
        for (String w:word) {
            if(w!="")
            {
                //System.out.println(w);
                int count=countVowel(w);
                ct=ct+count;
                map.put(w,count);
            }
        }
        System.out.println(map);
        return ct;
    }
}
