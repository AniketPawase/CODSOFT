import java.util.Scanner;

public class TaskOne{
    public int winCount=0;
    public int loseCount=0;


    public void gameStart(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Game Start");
        int randomNumber = (int) Math.floor(Math.random()*100) +1;
        System.out.println("the Random No. is :"+randomNumber);
        int chanceCounter=3;
        for(int i=0;i<3;i++){
            System.out.println("Enter your choice you Have "+ chanceCounter+" Chances");
            int choice = sc.nextInt();
            System.out.println("Your choice was :"+choice);
            if (choice != randomNumber) {
                System.out.println("Wrong Guess! Try Again!");
                chanceCounter--;
            } else {
                System.out.println("Correct guess");
                winCount++;
                chanceCounter--;
                break;
            }
        }
        if (chanceCounter == 0) {
            System.out.println("You Ran Out of Chances");
            loseCount++;
        }
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    TaskOne tsk = new TaskOne();
    int option;
    do {
        System.out.println("Enter Your choice :");
        System.out.println("1.  Start Game \n0. Exit");
        option = sc.nextInt();
        switch (option) {
            case 1:
                tsk.gameStart();
                System.out.println("Your Score Won " +tsk.winCount+" times. And Lost "+tsk.loseCount+" times ");
                break;

            case 0:
                System.out.println( "Thank You For Playing !!!");
                System.out.println("Your Score Won " +tsk.winCount+" times. And Lost "+tsk.loseCount+" times ");
                break;            
        
            default:
            System.out.println("Invalid Choice  Please Enter again");
                break;
        }
    } while (option !=0);
 }
}