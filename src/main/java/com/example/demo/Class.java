package com.example.demo;

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
        return this.ClassName;
    }

    public AssignmentLinkedList getClassActivities() {
        return this.ClassActivities;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public String getTeacher() {
        return this.Teacher;
    }

    public void setTeacher(String Teacher) {
        this.Teacher = Teacher;
    }

    public void setCredits(Float Credits) {
        this.Credits = Credits;
    }

    public String getTA() {
        return this.TA;
    }

    public float getCredits() {
        return this.Credits;
    }

    public String getDescripcion() {
        return this.Descripcion;
    }

    public int getPeriod() {
        return this.Period;
    }

    public void setPeriod(int Period) {
        this.Period = Period;
    }

    public String getWeekDay() {
        return this.WeekDay;
    }

    public void setWeekDay(String WeekDay) {
        this.WeekDay = WeekDay;
    }

    public void setHomeWork(Float Homework) {
        this.HomeWork = Homework;
    }

    public float getHomeWork() {
        return this.HomeWork;
    }

    public void setClassWork(Float ClassWork) {
        this.ClassWork = ClassWork;
    }

    public float getClassWork() {
        return this.ClassWork;
    }

    public void setQuiz(Float Quiz) {
        this.Quiz = Quiz;
    }

    public float getQuiz() {
        return this.Quiz;
    }

    public void setTest(Float Test) {
        this.Test = Test;
    }

    public float getTest() {
        return this.Test;
    }

    public void setFinal(Float Final) {
        this.Final = Final;
    }

    public float getFinal() {
        return this.Final;
    }

    public void setScore(Float Score) {
        this.Score = Score;
    }

    public float getScore() {
        return this.Score;
    }

    public void setTotal(Float Total) {
        this.Total = Total;
    }

    public float getTotal() {
        return this.Total;
    }

    public void setScoreWanted(Float ScoreWanted) {
        this.ScoreWanted = ScoreWanted;
    }

    public float getScoreWanted() {
        return this.ScoreWanted;
    }

    public void setFinalScoreNeeded(Float FinalScoreNeeded) {
        this.FinalScoreNeeded = FinalScoreNeeded;
    }

    public float getFinalScoreNeeded() {
        return this.FinalScoreNeeded;
    }

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
