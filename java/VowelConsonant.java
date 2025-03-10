import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);
        System.out.println("aeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant");
        sc.close();
    }
}
