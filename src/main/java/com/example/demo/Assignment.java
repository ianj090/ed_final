package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

/*Se necesita para tareasc on fecha de vencimiento:
*   - Mes en el que se entrega la tarea
*   - Día en el que se entrega la tarea


* Se necesita para tareas sin fecha de vencimiento:
*   - Sólo necesita inicializar el objeto
*/

public class Assignment {

    String DateAdded;
    String DateDue;
    String TypeOfActivity;
    double ScoreOfThisActivity;
    String InstructionsOfThisActivity;

    public void setDateAdded(String DateAdded) {
        this.DateAdded = DateAdded;
    }

    public String getDateAdded() {
        return this.DateAdded;
    }

    public void setDateDue(String DateDue) {
        this.DateDue = DateDue;
    }

    public String getDateDue() {
        return this.DateDue;
    }

    public String getTypeOfActivity() {
        return this.TypeOfActivity;
    }

    public void setTypeOfActivity(String TypeOfActivity) {
        this.TypeOfActivity = TypeOfActivity;
    }

    public double getScoreOfThisActivity() {
        return this.ScoreOfThisActivity;
    }

    public void setScoreOfThisActivity(double ScoreOfThisActivity) {
        this.ScoreOfThisActivity = ScoreOfThisActivity;
    }

    public String getInstructionsOfThisActivity() {
        return this.InstructionsOfThisActivity;
    }

    public void setInstructionsOfThisActivity(String InstructionsOfThisActivity) {
        this.InstructionsOfThisActivity = InstructionsOfThisActivity;
    }

    /* CONSTRUCTORS */
    Assignment() { // ZERO ARG CONSTRUCTOR
        /* This constructor only registers the date being added */
        Date temp_added = new Date();
        SimpleDateFormat added = new SimpleDateFormat("dd/MM/yyyy");
        this.DateAdded = added.format(temp_added);
    }

    Assignment(String due_s) { // ONE ARG CONSTRUCTOR
        /* This constructor registers the date due */
        Date temp_added = new Date();
        SimpleDateFormat added = new SimpleDateFormat("dd/MM/yyyy");
        this.DateAdded = added.format(temp_added);

        Date due_date = new Date();
        String s = String.format("E %s/yyyy", due_s);
        SimpleDateFormat due = new SimpleDateFormat(s);
        this.DateDue = due.format(due_date);
    }
}
