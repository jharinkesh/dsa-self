package main.java.q150.arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAna("ca","rac"));
        System.out.println(isAna("malayalam","amlayalam"));
        System.out.println(isAna("malayalam","malayamam"));
    }


    static boolean isAna(String a, String b){
        if(a.length()!=b.length())
            return false;
        int[] m = new int[26];
        for(int i=0;i<a.length();i++){
            int y = a.charAt(i)-97;
            m[y] += 1;
        }
        for(int j=0;j<b.length();j++){
            int y = b.charAt(j) - 97;
            m[y] -= 1;
            if(m[y]<0)
                return false;
        }
        return true;
    }
}
