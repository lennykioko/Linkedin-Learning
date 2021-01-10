import java.util.Scanner;

public class Choice {

    public static void main(String args[]) {
        String question = "Mission code name?";
        String choiceOne = "spider";
        String choiceTwo = "entebe";
        String choiceThree = "yohan";

        String correctAnswer = choiceThree;

        System.out.println(question);

        System.out.println("The choices are: " + choiceOne + ", " + choiceTwo + ", " + choiceThree);

        Scanner input = new Scanner(System.in);
        System.out.println("What's your answer?");

        String userInput = input.next();

        if(correctAnswer.equals(userInput.toLowerCase())) {
            System.out.println("Correct, Congratulations!");
        } else {
            System.out.println("Sorry, the correct answer is: " + correctAnswer);

        }
    }
}