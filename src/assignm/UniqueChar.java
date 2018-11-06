package assignm;

public class UniqueChar {

	public static char getFirstNonRepeatedChar(String word)
	{
    
   Character nonRepeatingCharacter = Character.MIN_VALUE;
        if(word == null) {
            return nonRepeatingCharacter.charValue();
        }
        String wordLowerCase = word.toLowerCase();
        HashMap<Character,Integer> map = new HashMap<>();
        // Count the occurrence of each character and record it in the HashMap
        for(int i=0;i<wordLowerCase.length();i++) {
            Character ch=wordLowerCase.charAt(i);
            Integer count = map.get(ch);
            count = count == null ? 0 : count;
            map.put(ch, ++count);
        }
        // Get the first character with 1 occurrence.
        for(int i=0;i<wordLowerCase.length();i++) {
            Character ch=wordLowerCase.charAt(i);
            int count = map.get(ch);
            if(count == 1) {
                nonRepeatingCharacter=word.charAt(i);
                break;
            }
        }
        return nonRepeatingCharacter.charValue();
	}	
}

