
package Assignment1;

public class MyTranslator{
	private String phrase = null;
	private String firstPart = null;
	private int firstPartIndex = -1;
	private final char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

	/*************Constructor***********************/
	MyTranslator(String phrase){
		this.phrase = phrase;
	}

	/*************Setters and Getters**************/
	public void setPhrase(String phrase){
		this.phrase = phrase;
	}

	public String getPhrase(){
		return this.phrase;
	}

	public String getFirstPart(){
		return this.firstPart;
	}


	public int getFirstPartIndex(){
		return this.firstPartIndex;
	}

	public boolean isVowel(char character){
		int length = vowels.length;

		//check the char agains all vowels in the alphabet
		for (int i = 0; i < length; i+=1 ) {
			if(character == vowels[i]) return true;
		}

		//if reached this point, not a vowel
		return false;
	}

	public String EngToPiglatinTranslator(){
		int index = 0;

		while(isVowel(this.phrase.charAt(index))){}

		return null;
	}
}