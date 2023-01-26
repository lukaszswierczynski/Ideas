package pl.swierczynskil.ideas.Input;

import java.util.Scanner;

public class UserInputManager {

    private Scanner scanner;

    public UserInputManager(){
        scanner = new Scanner(System.in);
    }
// category list
// category add CategoryName
// question add CategoryName QuestionName
    public UserInputCommand nextCommand() {
        //scanner.nextLine();
        //return null;
        return new UserInputCommand(scanner.nextLine());
    }
}
