import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PigLatin {
    
    public void tester() {
        // String[] lines = loadStrings("words.txt");
        String[] lines = new String[8]; 
        try{
            File myFile = new File("words.txt");
            Scanner myReader = new Scanner(myFile);
            int counter = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lines[counter] = data;
                counter++;
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
	    System.out.println("there are " + lines.length + " lines");
	    for (int i = 0 ; i < lines.length; i++) {
	        System.out.println(pigLatin(lines[i]));
	    }
    }
    public int findFirstVowel(String word) {
        //precondition: sWord is a valid String of length greater than 0.
        //postcondition: returns the position of the first vowel in sWord.  If there are no vowels, returns -1
	     int index =0;
  for(int i = 0; i < word.length(); i ++){
   if(word.substring(i, i +1).equals("a")){
     return index;
   }else if(word.substring(i, i +1).equals("a")){
     return index;
   }else if(word.substring(i, i +1).equals("e")){
     return index;
   }else if(word.substring(i, i +1).equals("i")){
     return index;
   }else if (word.substring(i, i +1).equals("o")){
     return index;
   }else if(word.substring(i, i +1).equals("u")){
     return index;
   }
   index = index +1;
 }
return -1;
    }

    public String pigLatin(String word) {
        //precondition: sWord is a valid String of length greater than 0
        //postcondition: returns the pig latin equivalent of sWord
        // more code should go here
	    if(findFirstVowel(word) == -1){
             return word + "ay"; 
	 }else if(findFirstVowel(word) == 0){
	    return word + "way";
	  }else if(word.substring(0,2).equals("qu")){
	    return word.substring(2,word.length()) + "qu" + "ay";
	  }else if(findFirstVowel(word) >=1){
	    return word.substring(findFirstVowel(word)) + word.substring(0, findFirstVowel(word)) + "ay";
	  }else{
	    return "ERROR!";
  }
 }
}//end PigLatin class
