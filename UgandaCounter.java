import java.util.Scanner;

public class UgandaCounter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the book description:");
            String description = scanner.nextLine();
            
            String lowerDescription = description.toLowerCase();
            
            String target = "uganda";
            
            String[] words = lowerDescription.split("\\b");
            
            int count = 0;
            
            for (String word : words) {
                if (word.trim().equals(target)) {
                    count++;
                }
            }
            System.out.println("The word 'Uganda' appears " + count + " times in the description.");}
        }
    }