/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johndo
 */

import java.util.ArrayList;

public class GradeStatistics {
    private ArrayList<Integer> grades;
    
    public GradeStatistics() {
        this.grades = new ArrayList<>();
    }
    
    public void add(int grade) {
        if (!(grade >= 0 && grade <= 100)) {
            return;
        }
        
        this.grades.add(grade);
    }
    
    public double getAverage() {
        if (this.grades.size() <= 0) {
            return -1;
        }
        
        int sum = 0;
        for (int grade: this.grades) {
            sum += grade;
        }
        
        return 1.0 * sum / this.grades.size();
    }
    
    public double getPassingAverage() {
        if (this.grades.size() <= 0) {
            return -1;
        }
        
        int sum = 0;
        int count = 0;
        for (int grade: this.grades) {
            if (grade >= 50) {
                sum += grade;
                count++;
            }
        }
        
        if (count <= 0) {
            return -1;
        }
        
        return 1.0 * sum / count;
    }
    
    public double getPassPercentage() {
        int passed = 0;
        
        for (int grade: this.grades) {
            if (grade >= 50) {
                passed++;
            }
        }
        
        return 100.0 * passed / this.grades.size();
    }
    
    public void printGradeDistribution2() {
        int[] gradeBands = {101, 90, 80, 70, 60, 50, 0};
        
        int i = 1;
        while (i < gradeBands.length) {
            System.out.print(gradeBands.length - 1 - i + ": ");
            for (int grade: this.grades) {
                if (grade < gradeBands[i-1] && grade >= gradeBands[i]) {
                    System.out.print("*");
                }
            }
            System.out.println("");
            i++;
        }
    }
    
    
    public void printGradeDistribution() {
        int grade5 = 0;
        int grade4 = 0;
        int grade3 = 0;
        int grade2 = 0;
        int grade1 = 0;
        int grade0 = 0;
        
        for (int grade: this.grades) {
            if (grade >= 90) {
                grade5++;
            } else if (grade >= 80) {
                grade4++;
            } else if (grade >= 70) {
                grade3++;
            } else if (grade >= 60) {
                grade2++;
            } else if (grade >= 50) {
                grade1++;
            } else {
                grade0++;
            }
        }
        
        System.out.print("5: ");
        while (grade5 > 0) {
            System.out.print("*");
            grade5--;
        }
        System.out.println("");

        System.out.print("4: ");
        while (grade4 > 0) {
            System.out.print("*");
            grade4--;
        }
        System.out.println("");


        System.out.print("3: ");
        while (grade3 > 0) {
            System.out.print("*");
            grade3--;
        }
        System.out.println("");


        System.out.print("2: ");
        while (grade2 > 0) {
            System.out.print("*");
            grade2--;
        }
        System.out.println("");


        System.out.print("1: ");
        while (grade1 > 0) {
            System.out.print("*");
            grade1--;
        }
        System.out.println("");


        System.out.print("0: ");
        while (grade0 > 0) {
            System.out.print("*");
            grade0--;
        }
        System.out.println("");
        
    }
}
