public class LowerCase {
	public static void main (String[] args) {
		String original = args[0];
		String lower = "";
		for(int i=0; i < original.length(); i++){
			if(( 64 < original.charAt(i) ) && (original.charAt(i) < 91 ))
				{
				lower =	lower + (char) (original.charAt(i) + 32);  
				}
				else{
					lower = lower + original.charAt(i);
				}
		}
		System.out.println(lower);
		
		
		
		
	}
	}
