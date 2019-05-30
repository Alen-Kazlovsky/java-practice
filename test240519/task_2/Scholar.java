package task_2;

public class Scholar {
    private int day;

    public void definition() {
        day = ScholarSchedule.day();
        if ((Days.values()[day].toString().equals("Sunday"))) {
            System.out.println("Выходной");
        } else {
            System.out.println("В школунужно идти");
        }
    }
}

