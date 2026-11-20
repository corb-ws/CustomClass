public class MrKStudent {
   private String name;
   private int period;
   private double GPA;
   private int grade;
   private int seatNum;
   private boolean isPassing;
   public static void main(String[] args) {
      
      
   }
   public void MrKStudent() {
      name = "Yousif";
      period = 4;
      GPA = 1.3;
      grade = 11;
      seatNum = 1;
      isPassing = false;
   }
   public MrKStudent(String name, int period, double GPA, int grade, int seatNum, boolean isPassing) {
      this.name = name;
      this.period = period;
      this.GPA = GPA;
      this.grade = grade;
      this.seatNum = seatNum;
      this.isPassing = isPassing;
   }
   public void goodScore(double differenceAfter) {
      //Changes GPA after good score
   }
   public int completesYear() {
      //Adds one to grade
      return grade;
   }
   public void seatingChange() {
      //changes seatNum
   }
   public void checkIfPassing() {
      //checks if GPA is less than 2.0
   }
   public void changeStudent() {
      //changes name
   }
}