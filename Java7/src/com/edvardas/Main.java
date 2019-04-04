package com.edvardas;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Human defaultHuman = new Human();
	    int[] marks = {2,5,8,4,7,6};
        defaultHuman.setMarks(marks);
        System.out.println(defaultHuman);
        int calcMax = defaultHuman.calcMax();
        double calcAvg = defaultHuman.calcAvg();

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();

        int[] student1Marks = {5,8,7,4,6,9,10,4};
        int[] student2Marks = {1,2,3,4,5,6,7,8,9,10};

        student1.setName("Vardenis");
        student1.setLastName("Pavardenis");
        student1.setGrade(4);

        student1.setMarks(student1Marks);
        student2.setMarks(student2Marks);
        student2.setGrade(4);
        student3.setGrade(3);
        student4.setGrade(4);

        double calcAVG1 = student1.calcAvg();
        double calcAVG2 = student2.calcAvg();

        System.out.println(Arrays.toString(student1.getMarks()));

        Student[] arr = new Student[]{student1, student2, student3, student4};


        if(calcAVG1 > calcAVG2) {
            System.out.println(student1.getName() + " has higher marks than " + student2.getName());
        } else {
            System.out.println(student2.getName() + " has higher marks than " + student1.getName());
        }

        System.out.println(arr[getBestStudentIndex(arr)].getName() + " " + arr[getBestStudentIndex(arr)].getLastName());

    }

    public static int getBestStudentIndex(Student[] arr) {
        int index = 0;
        double max = Double.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].calcAvg() >= max) {
                max = arr[i].calcAvg();
                index = i;
            }
        }

        return index;
    }

    public static void mostStudents(Student[] arr) {
        int grade = arr[0].getGrade();
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            grade = arr[i].getGrade();
            count = 1;
            for(int j = i+1; j < arr.length; j++) {
                if(grade == arr[i].getGrade()) {
                    count++;
                }
            }
        }
    }
}
