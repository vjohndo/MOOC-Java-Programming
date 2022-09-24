
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> examPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPoints = new ArrayList<>();
    }
    
    public void addGradeBasedOnPoints(int points) {
        this.examPoints.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }
    
    public double averageOfPoints() {
        if (this.examPoints.isEmpty()) {
            return -1;
        }
        
        int total = 0;
        for (int points: this.examPoints) {
            total += points;
        }
        
        return 1.0 * total / this.examPoints.size();
    }
   
    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }
        
        int total = 0;
        for (int grade: this.grades) {
            total += grade;
        }
        return 1.0 * total / this.grades.size();
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
