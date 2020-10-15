package GradesStatistics;


import java.text.DecimalFormat;
import java.util.*;


public class GradesStatistics {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    private Scanner scanner = new Scanner(System.in);
    private ArrayList grades;
    private int numStudent;

    public GradesStatistics() {
        grades = new ArrayList();
        numStudents();
        getAverage();
        getMedian();
        getMin();
        getMax();
        getStandardDeviation();
    }

    private int getInput() {
        return scanner.nextInt();
    }

    private ArrayList numStudents() {
        System.out.println("Enter the number of students: ");
        numStudent = getInput();
        for (int i = 1; i < numStudent + 1; i++) {
            System.out.println("Enter the grade for student " + i + ": ");
            int grade = getInput();
            if (grade >=0 && grade <=100){
                grades.add(grade);
            }
            else {
                System.out.println("Error, please enter a number between 0-100");
                numStudents();
            }
        }
        System.out.println("The grades are: "+ grades);
        return grades;
    }

    private double getTotal() {
        double total = 0;
        for (Object grade : grades) {
            double currentNum = (Integer) grade;
            total = total + currentNum;
        }
        return total;
    }

    private double getAverage() {
        double average = Double.parseDouble(df2.format(getTotal()/grades.size()));
        System.out.println("The average is: " + average);
        return average;
    }

    private void getMedian() {
        int placeHolder;
        int firstEvenNum;
        Object median;
        Collections.sort(grades);
        if (isOdd(numStudent)){
            placeHolder = (int) ((numStudent/2) - 0.5);
            median = grades.get(placeHolder);
        }
        else {
            firstEvenNum = (numStudent/2);
            placeHolder = (firstEvenNum + (firstEvenNum+1))/2;
            median = grades.get(placeHolder);
        }
        System.out.println();
        System.out.println("The median is: " + df2.format(median));
    }

    private static boolean isOdd(int i) {
        boolean answer = false;

        for (int j = 1; j <= i; i++)
            answer = !answer;

        return answer;
    }


    private void getMin() {
        System.out.println("The minimum is: " + grades.get(0));
    }

    private void getMax() {
        System.out.println("The maximum is: " + grades.get(grades.size()-1));
    }


    private void getStandardDeviation() {
        double total =0;
        double average = getAverage();

        for (int i = 0; i <numStudent; i++) {
            int currentNum = (Integer) grades.get(i);
            total = total + Math.pow((currentNum-average),2);
        }

        average = total/(numStudent-1);
        double deviation = Math.sqrt(average);
        System.out.println("The standard deviation is: " + df2.format(deviation));
    }

}
