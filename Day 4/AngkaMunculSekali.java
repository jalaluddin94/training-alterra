import java.util.*;

public class AngkaMunculSekali {
    public static void main(String[] args){
        System.out.println("Masukkan input string: ");
        Scanner scanner1 = new Scanner(System.in);
        String inputan = scanner1.nextLine();
        char[] charInput = inputan.toCharArray();
        // int charLength = charInput.length;

        Set<Character> noDuplicates = new HashSet<>();
        for(char x: charInput){
            noDuplicates.add(x);
        }

        System.out.println("Output : " + noDuplicates);

        scanner1.close();
    }
}
