import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class WordLists{
    private ArrayList<String> words;
    
    public WordLists(String fileName){
        
        // your code here
        words = new ArrayList<String>();
        try {
            Scanner input;
            input = new Scanner(getClass().getClassLoader().getResource(fileName).openStream());
            while (input.hasNextLine()) {
                String line = input.nextLine().trim();
                if (line.length() > 0)
                words.add(line);
                }
            if (words.size() == 0)
                    throw new IllegalArgumentException("File is empty " + fileName);
                    System.out.println(words.size() + " words read from " + fileName);
}
         
        catch (IOException e) {
            throw new IllegalArgumentException("can not read file " + fileName);
}
    }


    
    
    public ArrayList<String> lengthN(int n){
        
        // your code here
         ArrayList<String> list = new ArrayList<String>();            //declare an ArrayList
         for(String woord: words){                                    //using the enhanced for loop, for each word in file text
                if(woord.length()==n){                                //if length of word = n 
                list.add(woord);                                     // then add that word to the list
        }
                  }
        return list;
    }


    
    
    
    public ArrayList<String> endsWith(char lastLetter, int n){

        // your code here
         ArrayList<String> list = new ArrayList<String>();
         for(String woord: words) {
            if(woord.length() == n){                                      
                if(woord.endsWith(""+lastLetter) )list.add(woord);           
            }
    }
         return list;
    }

    
    

    public ArrayList<String> containsLetter(char included, int index, int n){
        // your code here
         ArrayList<String> list = new ArrayList<String>();
         for(String woord: words) {
            if(woord.length() == n){
                if(woord.charAt(index) == included )  list.add(woord);              //utilize the charAt method 
            }
     }
         return list;

    }

    
    
    
 
    public ArrayList<String> multiLetter(int m, char included){

        // your code here
        int count = 0;
        int index  = 0 ;
        ArrayList<String> list = new ArrayList<String>();
        for(String woord: words) {
            for(int i = 0 ; i < woord.length();i++){
                if(woord.charAt(i) == included){
                     count++;
                     if(count >= m )   list.add(woord);
             }
      }
        count  = 0;
                      }
        return list;

    }

} // end of class
