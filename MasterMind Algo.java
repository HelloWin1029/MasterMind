public class Main{
    public static final int SIZE = 6;
    
	public static void main(String[] args) {
		String master = "CBBC", guess = "CCBB";
		int[] count = new int[SIZE];
		for (int i = 0; i < master.length(); i++){
		    count[master.charAt(i) - 'A']++;
		}
		int partial = 0, exact = 0;
		for (int i = 0; i < guess.length(); i++){
		    if (guess.charAt(i) == master.charAt(i)){
		        exact++;
		        count[guess.charAt(i) - 'A']--;
		    }
		}
		for (int i = 0; i < guess.length(); i++){
		    boolean same = (guess.charAt(i) == master.charAt(i));
		    if (same == false && count[guess.charAt(i) - 'A'] > 0){
		        count[guess.charAt(i) - 'A']--;
		        partial++;
		    }
		}
		System.out.println(exact + " " + partial);
	}
}
