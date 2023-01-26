package pl.swierczynskil.ideas;

import pl.swierczynskil.ideas.Input.UserInputCommand;
import pl.swierczynskil.ideas.Input.UserInputManager;

public class IdeasApplication {

    public static void main(String[] args) {
        //psvm shortcut
        new IdeasApplication().start();

    }

    private void start() {
        System.out.println("Start app...");

        /**
         * category list -> categoryList();
         * category add CategoryName -> categoryAdd(name);
         *
         * quit -> quitApplication();
         *
         * question list -> questionList();
         * question add CategoryName QuestionName -> questionAdd(CategoryName, QuestionName)
         *
         * answer list QuestionName -> answerList(QuestionName)
         * answer add QuestionName AnswerName -> answerAdd(QuestionName, AnswerName)
         *
         *
         */

        boolean applicationLoop = true;

        UserInputManager userInputManager = new UserInputManager();

        while(applicationLoop){
        try {
            UserInputCommand userInputCommand = userInputManager.nextCommand();
            System.out.println(userInputCommand);
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }
}
