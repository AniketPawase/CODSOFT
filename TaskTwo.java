import java.util.Scanner;

public class TaskTwo {
    //Show the total marks, average percentage, and the corresponding grade to the user
    public int science;
    public int maths;
    public int phyEdu;
    public int socialStdy;
    public int art;
    public int totalMarks;
    public double  avgPercentage;
    public String grade;

    //Getting all MArks of the Students using Scanner functn
    public void getAllSubMarks(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Marks in Subjects : Science");
        this.science = sc.nextInt();
        if(science <0 || science >100){
            System.out.println("Enter between 1 -100 for Science Marks");
            return;
        }

        System.out.println("Enter Marks in Subjects : Mathematics");
        this.maths = sc.nextInt();
        if(maths <0 || maths >100){
            System.out.println("Enter between 1 -100 for Mathematics Marks");
            return;
        }

        System.out.println("Enter Marks in Subjects : Physical Education");
        this.phyEdu = sc.nextInt();
        if(phyEdu <0 || phyEdu >100){
            System.out.println("Enter between 1 -100 for Physical Education Marks");
            return;
        }

        System.out.println("Enter Marks in Subjects : Social Studies");
        this.socialStdy = sc.nextInt();
        if(socialStdy <0 || socialStdy >100){
            System.out.println("Enter between 1 -100 for Social Studies Marks");
            return;
        }

        System.out.println("Enter Marks in Subjects : Art");
        this.art = sc.nextInt();
        if(art <0 || art >100){
            System.out.println("Enter between 1 -100 for Art Marks");
            return;
        }
        totalMarks = this.science + this.maths + this.phyEdu + this.socialStdy + this.art ;
        System.out.println("Total Marks Obtained By Student :"+this.totalMarks);
     }

     //Calculation Average percentage Accoringly
    public void averagePercentage(){
        avgPercentage = this.totalMarks/5;
        System.out.println("Average percentage for student is "+this.avgPercentage+"%");
    }

    //Assigning a Grade and Pass/Fail status 
    public void gradeCalculation(){
        if (this.avgPercentage > 90) {
            this.grade = "A+";
        }
        else 
        if (this.avgPercentage >= 75 && this.avgPercentage <= 89) {
            this.grade = "A";
        }
        else 
        if (this.avgPercentage > 50 && this.avgPercentage <= 74) {
            this.grade = "B";
        }
        else 
        if (this.avgPercentage > 25 && this.avgPercentage <= 49) {
            this.grade = "C";
        }
        else 
        if (this.avgPercentage < 24) {
            this.grade = "F";
        } 
        System.out.println("Grade of the Student is "+this.grade);
        if (this.grade != "F") {
            System.out.println("Congratulations you have passed");
        }
        else{
            System.out.println( "Sorry! You Have failed.");
        }       
    }

    public static void main(String[] args) {
        TaskTwo tsk = new TaskTwo();
        System.out.println("------------------------------");
        tsk.getAllSubMarks();
        System.out.println("------------------------------");
        tsk.averagePercentage();
        System.out.println("------------------------------");
        tsk.gradeCalculation();
        System.out.println("------------------------------");
    }
}
