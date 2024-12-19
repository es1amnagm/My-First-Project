
package a.way.to.pkglong.word;


import java.util.Scanner;
public class AWayToLongWord {
    public static void main(String[] args) {
        /* if word.length <10 you should print the word only 
        ,but if word.length > 10 you should print first character of word int the start and pirnt last character in the last
        and between them you should print number of character between them*/
Scanner input=new Scanner(System.in);
        
        System.out.println("enter number of words you want to enter");
        int num_of_words=input.nextInt();
        
        for (int i = 0; i < num_of_words; i++) {
            System.out.println("enter word number "+(i+1));
            String word=input.next();
            if(word.length()<10)
                System.out.println(word);
        else
            {
                System.out.println(word.charAt(0)+""+(word.length()-2)+""+word.charAt(word.length()-1));
            }
            
            
            
            
        }
        
        
        
        
      
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
