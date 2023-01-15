

import java.util.*;
import java.util.Set;
public class AllUniqueCharacter {

	public static void main(String[] args) {
		boolean isUnique = hasAllUniqueCharacter("Learning");
		System.out.println("Learning has all unique character :" + isUnique);

	}

	private static boolean hasAllUniqueCharacter(String word) {
	Set<Character> alphaSet = new HashSet<>();
	
	for (int i=0; i<word.length(); i++) {
		char c = word.charAt(i);
		if (!alphaSet.add(c)) {
	      return false;
		}
	}

	return true;
   }
}
