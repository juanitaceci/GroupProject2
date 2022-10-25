package com.Syntax.Task2;

abstract class Marks {
    /*2. We have to calculate the average of marks
        obtained in three subjects by student A and by
        student B. Create class 'Marks' with an abstract
        method 'getPercentage' that will be returning
        the average percentage of marks. Provide
        implementation of abstract method in classes
       'A' and 'B'. The constructor of student A takes the
       marks in three subjects as its parameters and
       the marks in four subjects as its parameters for
       student B. Test your code
     */
    int math;
    int english;
    int science;
    int art;

    abstract void getPercentage();


}
class StudentA extends Marks {


    StudentA(int math,int english,int science){

        this.math=math;
        this.english=english;
        this.science=science;


    }

    @Override
    void getPercentage() {
        int totalA=(math+english+science)/3;
        System.out.println("The average percentage of student A is "+ totalA);
    }
}
class StudentB extends Marks {

    StudentB(int math,int english,int science,int art){
        this.math=math;
        this.english=english;
        this.science=science;
        this.art=art;
    }

    @Override
    void getPercentage() {
        int totalB=(math+english+science+art)/4;
        System.out.println("The average percentage of student B is "+ totalB);

    }

    public static void main(String[] args) {
        StudentA studentA=new StudentA(50,60,90);
        studentA.getPercentage();

        StudentB studentB=new StudentB(80,75,65,99);
        studentB.getPercentage();
    }
}
