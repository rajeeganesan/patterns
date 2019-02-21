public class MostChar {
    /*
    findMostChar // analyzes a string and finds the most repeated character
    @params S string to be analyzed
    @returns char that occurs most frequently
     */
    public static char findMostChar(String s) {
 	int a = 97; // ascii code for the letter a
	int[] alphabet = new int[26];  // creates int array for alphabet
	int length = alphabet.length;
	   for (int loop = 0; loop < length; loop++){ // recursive loop
		alphabet[loop]=0; // sets initial value to zero
	   }
   
	   char[] array = s.toCharArray();
	   int charLength = array.length;
	   for (char vari : array ){ // turns input into array
		int intVari = (int)vari;
		alphabet[intVari - a] += 1; // checks higher val
	   }

	int highestIndex = 0; // sets highestIndex values
	int high = -1;
	    for (int i = 0; i < alphabet.length; i++){ // loop for length
		if (alphabet[i] > high){ // checks for most repeated value
			high = alphabet[i];
			highestIndex = i; // index of most repeated val
		}
	    }
     return (char)(highestIndex + a); // returns value
     } 


    public static void main(String[] args){
        char c = findMostChar("abcaadddb");
        System.out.println(c);
    }
}
