import java.util.*;
public class Anagram {
        
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1="Silent";
        String str2="Listen";
        if(str1.length()!=str2.length()){
            System.out.println("Not an anagram");
            
        }
        else {
            char[] arr1=str1.toLowerCase().toCharArray();
            char[] arr2=str2.toLowerCase().toCharArray();
              Arrays.sort(arr1);
       Arrays.sort( arr2);
       if(Arrays.equals(arr1,arr2 )){
           System.out.println("Anagarm");
       }
        }
     
       
        
    }
    
}
