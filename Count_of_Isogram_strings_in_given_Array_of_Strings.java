

// Enter the String Array :  "abcd" "derg" "erty";
// Isogram is : 3


// Enter the String Array :  "agka", "lkmn";
// Isogram is : 1



import java.util.HashMap;

public class Count_of_Isogram_strings_in_given_Array_of_Strings{

    static int count = 0;
    static boolean isPalindrom(String s){
        int n2 = s.length();

        // Palindromic String
        for(int i=0; i<n2; i++){
            for(int j=i+1; j<=n2-1; j++){
                if(s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }


    public static int countIsogram(String[] str , int n){
        HashMap<String, Integer> s = new HashMap<>();

            for(int i=0; i<n; i++){
                if(isPalindrom(str[i])){
                    count = count + 1;
                }
            }

            return count;

    }


    public static void main(String[] args){

        String[] str =  {"abcd", "derdg", "erty"};
        int n = str.length;

        // countIsogram(str, n);
        System.out.println("Isogram is : " + countIsogram(str, n));






    }


}
