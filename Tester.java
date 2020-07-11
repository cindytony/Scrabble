import java.util.*;
import java.io.*;
import java.util.ArrayList;


public class Tester{
    
    public static void main(String[] args) {

        // object
        WordLists word = new WordLists("dictionary2.txt");

        
        // calling object properties  
        System.out.println(word.lengthN(3) );                    //print words that have 3 characters
        System.out.println(word.endsWith('s', 4) );              //print words that ends with s and has 4 characters
        System.out.println(word.containsLetter('a',0,4));        //print words that has "a" at index 0, with length 4
        System.out.println(word.multiLetter(2,'a'));             //print words that has "a" appears 2 times


      }
}
