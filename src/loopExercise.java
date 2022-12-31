
public class loopExercise {
    public static void main(String[] args)
    throws java.io.IOException{

        char input;
        int i;
        char letterTest = 'A';

        System.out.println("Enter letter");
        input = (char) System.in.read();

        for (i=1; i<=26; i++){
            if (letterTest==input)
                break;
            letterTest++;
        }
        System.out.println("you fav letter " + input + " is alphabet " + i);
    }
}