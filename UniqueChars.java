public class UniqueChars {
	public static void main (String[] args) {
        // definig String answer and the strings we input so it has no unique chars
		String original = args[0];
		String answer = "";
        // goes for each and every one of the chars of the string original 
        // and adding only unique chars and space to the answer 
		for(int i=0; i <original.length() ; i++){
			if( (answer.indexOf(original.charAt(i)) == -1) || ((original.charAt(i)) == ' ' )){
				answer = answer + original.charAt(i);
			}
		}
        // printing the String we formed
		System.out.println(answer);
		
		
		
		
	}}
