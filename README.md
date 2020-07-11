# Scrabble
Scrabble Dictionary

Scrabble Help: The file dictionary.txt contains all of the words in the Official Scrabble Player’s Dictionary, Second Edition. Note: this list contains some offensive language. Write a class, WordLists, in Java that generates useful word lists for scrabble players using this list.

Your class should contain the following methods:

WordLists(String fileName): a constructor that takes the name of the dictionary file as the only parameter.
lengthN(int n): returns an ArrayList of all length n words (Strings) in the dictionary file.
endsWith(char lastLetter, int n): returns an ArrayList of words of length n ending with the letter lastLetter
containsLetter(char included, int index, int n): returns an ArrayList of words of length n containing the letter included at position index. So for example the word “cannon” would be on the list returned by containsLetter('o’,6,4) because it contains the letter 'o’, at index 4, and is length 6.
multiLetter(int m, char included): returns an ArrayList of words with at least m occurrences of the letter included.
Use the included template for your WordLists.java file. Write your own test class for your WordLists class that tries these methods out and writes the word lists (the ArrayLists of strings) to text files.
