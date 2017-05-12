/**
 * Created by timothyodonga on 5/12/17.
 */
public class Main {

    private boolean inDoubt;
    private boolean ready;

    public static void run(boolean inDoubt, boolean ready){
        System.out.println("Welcome to code2flow");

        if(inDoubt){

            System.out.println("Press Help");

            while(ready == false){
                System.out.println("Read Help");
                //ready = true;       // This is just placed in to break from an infinite loop
            }

            //ready = false;          // This is just included in the code to test other output values

            if(ready == true){
                System.out.println("Improve your workflow");
            }

            else{
                System.out.println("my name is chris");
                System.out.println("Improve your workflow");
            }

        }

        else{
            System.out.println("Improve your workflow");
        }

    }

    public static void main(String[] args){
        //Initializing these two value to be used

        run(true, false);



    }
}
