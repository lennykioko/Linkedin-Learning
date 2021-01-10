import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepaat = true;

        while(isOnRepaat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes");
            String userInput = input.next();

            if(userInput.equals("yes")) {
                isOnRepaat = false;
            }
        }
        System.out.println("Playing next song");
    }
}
