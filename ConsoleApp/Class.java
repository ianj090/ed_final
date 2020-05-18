// package com.example.demo;

import java.util.Arrays;

public class Class {
    String ClassName;
    String Teacher;
    String TA;
    float Credits;
    String Descripcion;
    String WeekDay;
    int Period;
    float Score = 0.0f;
    float ScoreWithoutFinal;
    float ScoreWanted = 0.0f;
    float FinalScoreNeeded;
    float Total;
    float HomeWork;
    float ClassWork;
    float Quiz;
    float Test;
    float Final;

    AssignmentLinkedList ClassActivities;

    float avgHomeWork = 0.0f;
    int sizeHomeWork = 0;
    float amountHomeWork = 0.0f;
    float avgClassWork = 0.0f;
    int sizeClassWork = 0;
    float amountClassWork = 0.0f;
    float avgQuiz = 0.0f;
    int sizeQuiz = 0;
    float amountQuiz = 0.0f;
    float avgTest = 0.0f;
    int sizeTest = 0;
    float amountTest = 0.0f;
    float avgFinal = 0.0f;
    int sizeFinal = 0;
    float amountFinal = 0.0f;

// --------------------------------------------------------------------------------------------

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getTeacher() {
        return Teacher;
    }

    public void setTeacher(String teacher) {
        Teacher = teacher;
    }

    public String getTA() {
        return TA;
    }

    public void setTA(String TA) {
        this.TA = TA;
    }

    public float getCredits() {
        return Credits;
    }

    public void setCredits(float credits) {
        Credits = credits;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getWeekDay() {
        return WeekDay;
    }

    public void setWeekDay(String weekDay) {
        WeekDay = weekDay;
    }

    public int getPeriod() {
        return Period;
    }

    public void setPeriod(int period) {
        Period = period;
    }

    public float getScore() {
        return Score;
    }

    public void setScore(float score) {
        Score = score;
    }

    public float getScoreWithoutFinal() {
        return ScoreWithoutFinal;
    }

    public void setScoreWithoutFinal(float scoreWithoutFinal) {
        ScoreWithoutFinal = scoreWithoutFinal;
    }

    public float getScoreWanted() {
        return ScoreWanted;
    }

    public void setScoreWanted(float scoreWanted) {
        ScoreWanted = scoreWanted;
    }

    public float getFinalScoreNeeded() {
        return FinalScoreNeeded;
    }

    public void setFinalScoreNeeded(float finalScoreNeeded) {
        FinalScoreNeeded = finalScoreNeeded;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float total) {
        Total = total;
    }

    public float getHomeWork() {
        return HomeWork;
    }

    public void setHomeWork(float homeWork) {
        HomeWork = homeWork;
    }

    public float getClassWork() {
        return ClassWork;
    }

    public void setClassWork(float classWork) {
        ClassWork = classWork;
    }

    public float getQuiz() {
        return Quiz;
    }

    public void setQuiz(float quiz) {
        Quiz = quiz;
    }

    public float getTest() {
        return Test;
    }

    public void setTest(float test) {
        Test = test;
    }

    public float getFinal() {
        return Final;
    }

    public void setFinal(float aFinal) {
        Final = aFinal;
    }

    public AssignmentLinkedList getClassActivities() {
        return ClassActivities;
    }

    public void setClassActivities(AssignmentLinkedList classActivities) {
        ClassActivities = classActivities;
    }

    public float getAvgHomeWork() {
        return avgHomeWork;
    }

    public void setAvgHomeWork(float avgHomeWork) {
        this.avgHomeWork = avgHomeWork;
    }

    public int getSizeHomeWork() {
        return sizeHomeWork;
    }

    public void setSizeHomeWork(int sizeHomeWork) {
        this.sizeHomeWork = sizeHomeWork;
    }

    public float getAmountHomeWork() {
        return amountHomeWork;
    }

    public void setAmountHomeWork(float amountHomeWork) {
        this.amountHomeWork = amountHomeWork;
    }

    public float getAvgClassWork() {
        return avgClassWork;
    }

    public void setAvgClassWork(float avgClassWork) {
        this.avgClassWork = avgClassWork;
    }

    public int getSizeClassWork() {
        return sizeClassWork;
    }

    public void setSizeClassWork(int sizeClassWork) {
        this.sizeClassWork = sizeClassWork;
    }

    public float getAmountClassWork() {
        return amountClassWork;
    }

    public void setAmountClassWork(float amountClassWork) {
        this.amountClassWork = amountClassWork;
    }

    public float getAvgQuiz() {
        return avgQuiz;
    }

    public void setAvgQuiz(float avgQuiz) {
        this.avgQuiz = avgQuiz;
    }

    public int getSizeQuiz() {
        return sizeQuiz;
    }

    public void setSizeQuiz(int sizeQuiz) {
        this.sizeQuiz = sizeQuiz;
    }

    public float getAmountQuiz() {
        return amountQuiz;
    }

    public void setAmountQuiz(float amountQuiz) {
        this.amountQuiz = amountQuiz;
    }

    public float getAvgTest() {
        return avgTest;
    }

    public void setAvgTest(float avgTest) {
        this.avgTest = avgTest;
    }

    public int getSizeTest() {
        return sizeTest;
    }

    public void setSizeTest(int sizeTest) {
        this.sizeTest = sizeTest;
    }

    public float getAmountTest() {
        return amountTest;
    }

    public void setAmountTest(float amountTest) {
        this.amountTest = amountTest;
    }

    public float getAvgFinal() {
        return avgFinal;
    }

    public void setAvgFinal(float avgFinal) {
        this.avgFinal = avgFinal;
    }

    public int getSizeFinal() {
        return sizeFinal;
    }

    public void setSizeFinal(int sizeFinal) {
        this.sizeFinal = sizeFinal;
    }

    public float getAmountFinal() {
        return amountFinal;
    }

    public void setAmountFinal(float amountFinal) {
        this.amountFinal = amountFinal;
    }

//    public String getClassName() {
//        return this.ClassName;
//    }
//
//    public AssignmentLinkedList getClassActivities() {
//        return this.ClassActivities;
//    }
//
//    public void setClassName(String ClassName) {
//        this.ClassName = ClassName;
//    }
//
//    public String getTeacher() {
//        return this.Teacher;
//    }
//
//    public void setTeacher(String Teacher) {
//        this.Teacher = Teacher;
//    }
//
//    public void setCredits(Float Credits) {
//        this.Credits = Credits;
//    }
//
//    public String getTA() {
//        return this.TA;
//    }
//
//    public void setTA(String TA) {
//        this.TA = TA;
//    }
//
//    public float getCredits() {
//        return this.Credits;
//    }
//
//    public String getDescripcion() {
//        return this.Descripcion;
//    }
//
//    public void setDescripcion(String Descripcion) {
//        this.Descripcion = Descripcion;
//    }
//
//    public int getPeriod() {
//        return this.Period;
//    }
//
//    public void setPeriod(int Period) {
//        this.Period = Period;
//    }
//
//    public String getWeekDay() {
//        return this.WeekDay;
//    }
//
//    public void setWeekDay(String WeekDay) {
//        this.WeekDay = WeekDay;
//    }
//
//    public void setHomeWork(Float Homework) {
//        this.HomeWork = Homework;
//    }
//
//    public float getHomeWork() {
//        return this.HomeWork;
//    }
//
//    public void setClassWork(Float ClassWork) {
//        this.ClassWork = ClassWork;
//    }
//
//    public float getClassWork() {
//        return this.ClassWork;
//    }
//
//    public void setQuiz(Float Quiz) {
//        this.Quiz = Quiz;
//    }
//
//    public float getQuiz() {
//        return this.Quiz;
//    }
//
//    public void setTest(Float Test) {
//        this.Test = Test;
//    }
//
//    public float getTest() {
//        return this.Test;
//    }
//
//    public void setFinal(Float Final) {
//        this.Final = Final;
//    }
//
//    public float getFinal() {
//        return this.Final;
//    }
//
//    public void setScore(Float Score) {
//        this.Score = Score;
//    }
//
//    public float getScore() {
//        return this.Score;
//    }
//
//    public void setTotal(Float Total) {
//        this.Total = Total;
//    }
//
//    public float getTotal() {
//        return this.Total;
//    }
//
//    public void setScoreWanted(Float ScoreWanted) {
//        this.ScoreWanted = ScoreWanted;
//    }
//
//    public float getScoreWanted() {
//        return this.ScoreWanted;
//    }
//
//    public void setFinalScoreNeeded(Float FinalScoreNeeded) {
//        this.FinalScoreNeeded = FinalScoreNeeded;
//    }
//
//    public float getFinalScoreNeeded() {
//        return this.FinalScoreNeeded;
//    }

// --------------------------------------------------------------------------------------------

    public void findTotal() {
        Total = HomeWork + ClassWork + Quiz + Test + Final;
    }

    public void findaverages() {
        Assignment[] assignmentArrayCopy = ClassActivities.toArray();
        for (Assignment assignment : assignmentArrayCopy) {
            if (assignment != null) {
                switch (assignment.TypeOfActivity) {
                    case "homework":
                        sizeHomeWork++;
                        amountHomeWork += assignment.ScoreOfThisActivity;
                        break;
                    case "classwork":
                        sizeClassWork++;
                        amountClassWork += assignment.ScoreOfThisActivity;
                        break;
                    case "quiz":
                        sizeQuiz++;
                        amountQuiz += assignment.ScoreOfThisActivity;
                        break;
                    case "test":
                        sizeTest++;
                        amountTest += assignment.ScoreOfThisActivity;
                        break;
                    case "final":
                        sizeFinal++;
                        amountFinal += assignment.ScoreOfThisActivity;
                        break;
                }
            }
        }
        if (sizeHomeWork != 0) {
            avgHomeWork = amountHomeWork / sizeHomeWork;
        }
        if (sizeClassWork != 0) {
            avgClassWork = amountClassWork / sizeClassWork;
        }
        if (sizeQuiz != 0) {
            avgQuiz = amountQuiz / sizeQuiz;
        }
        if (sizeTest != 0) {
            avgTest = amountTest / sizeTest;
        }
        if (sizeFinal != 0) {
            avgFinal = amountFinal / sizeFinal;
        }
    }

    public void findScore() {
        if (Total != 0.0f) {
            Score = (avgHomeWork * (HomeWork/Total)) + (avgClassWork * (ClassWork/Total)) + (avgQuiz * (Quiz/Total)) + (avgTest * (Test/Total)) + (avgFinal * (Final/Total));
        }
    }

    public void findScoreWanted() {
        if (Total != 0.0f) {
            ScoreWithoutFinal = Score - (avgFinal * (Final / Total));
        }
        FinalScoreNeeded = ScoreWanted - ScoreWithoutFinal;
        FinalScoreNeeded = FinalScoreNeeded * (Total/Final);
    }

//    public void findTime() {
//        switch (WeekDay) {
//            case "monday":
//                Time = 0 + (StartTime * 0.0001f);
//                break;
//            case "tuesday":
//                Time = 1 + (StartTime * 0.0001f);
//                break;
//            case "wednesday":
//                Time = 2 + (StartTime * 0.0001f);
//                break;
//            case "thursday":
//                Time = 3 + (StartTime * 0.0001f);
//                break;
//            case "friday":
//                Time = 4 + (StartTime * 0.0001f);
//                break;
//        }
//    }
}
