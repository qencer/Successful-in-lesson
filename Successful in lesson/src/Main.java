public class Main {
    public static void main(String[] args) {
            char grade = 'A';       // Character definition made with 'char' command

          switch (grade){           // Changed char definition with 'switch' command
              case 'A':             // case for grade A
                  System.out.println("PERFECT: You succeeded in the course with the highest grade");
                  break;            // Print the statement specified as a line to the system output and stop the process.
              case 'B':             // case for grade B
                  System.out.println("Very Good : You passed the course with a high grade");
                  break;            // Print the statement specified as a line to the system output and stop the process.
              case 'C':             // case for grade C
                  System.out.println("Good : You have passed reguler points from the course");
                  break;            // Print the statement specified as a line to the system output and stop the process.
              case 'D':             // case for grade D
                  System.out.println("ENOUGH : You passed the course with the lowest score");
                  break;            // Print the statement specified as a line to the system output and stop the process.
              case 'F':             // case for grade F
                  System.out.println("Insufficient : Unfortunately, you did not pass the course.");
                  break;            // Print the statement specified as a line to the system output and stop the process.
              default:              // The command to be written in case of entering values other than the defined characters
                  System.out.println("FALSE VALUE: Please enter one of the values A-B-C-D-F.");
                                    // Print the statement specified as a line to the system output.
          }
    }
}