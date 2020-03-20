
import java.text.SimpleDateFormat;
import java.util.Date;

/*Se necesita para tareasc on fecha de vencimiento:
*   - Mes en el que se entrega la tarea
*   - Día en el que se entrega la tarea


* Se necesita para tareas sin fecha de vencimiento:
*   - Sólo necesita inicializar el objeto
*/

public class Homework {

    String DateAdded;
    String DateDue;

    Homework(){
        Date temp_added = new Date();
        SimpleDateFormat added = new SimpleDateFormat ("dd/MM/yyyy");
        this.DateAdded = added.format(temp_added);
    }

    Homework(String due_s) {
        Date temp_added = new Date();
        SimpleDateFormat added = new SimpleDateFormat ("dd/MM/yyyy");
        this.DateAdded = added.format(temp_added);

        Date due_date = new Date();
        String s = String.format("E %s/yyyy",due_s);
        SimpleDateFormat due = new SimpleDateFormat(s);
        this.DateDue = due.format(due_date);
    }

    public String getDateAdded() {
        return this.DateAdded;
    }

    public String getDateDue() {
        return this.DateDue;
    }

    public static void main(String[] args) {
        Homework obj = new Homework("13/03");

        System.out.println(obj.getDateAdded() + "\n" + obj.getDateDue());
    }
}
