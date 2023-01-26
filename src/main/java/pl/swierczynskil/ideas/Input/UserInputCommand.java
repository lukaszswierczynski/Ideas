package pl.swierczynskil.ideas.Input;


import java.util.ArrayList;
import java.util.List;

public class UserInputCommand {

    private String command; //question

    private String action; //add

    private List<String> param;

    // category list
    // category add CategoryName
    // question add CategoryName QuestionName
    // [question, add, CategoryName, QuestionName]


    public UserInputCommand(String line) {
        //quick checking
        if (line != null) {
            String[] array = line.split("\\s");
            if (array.length > 0) {
                command = array[0];
            }
            if (array.length > 1) {
                action = array[1];
            }
            param = new ArrayList<>();
            for (int i=2; i<array.length; i++){
                param.add(array[i]);
            }
        }

    }

    public String getCommand() {
        return command;
    }

    public String getAction() {
        return action;
    }

    public List<String> getParam() {
        return param;
    }

    @Override
    public String toString() {
        return "UserInputCommand{" +
                "command='" + command + '\'' +
                ", action='" + action + '\'' +
                ", param=" + param +
                '}';
    }
}
