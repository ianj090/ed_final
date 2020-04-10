package com.example.demo;

public class Class {
    String ClassName;
    String Teacher;
    String TA;
    float Credits;
    String Descripcion;

    AssignmentLinkedList ClassActivities;

//    Class(String ClassName, String Teacher, String TA, float Credits, String Description) {
//        this.ClassName = ClassName;
//        this.Teacher = Teacher;
//        this.TA = TA;
//        this.Credits = Credits;
//        this.Descripcion = Description;
//        // this.HomeworkAssignments = new LinkedList()
//    }

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

    public void add_activity() {

    }

    public void ScoreStatistics() {

    }
}
