import java.util.Date;

public class DebuggingWorkshop {
    private String description;
    private String date;
    private String time;
    private String location;
    private boolean comeToDebuggingWorkshop;
    private int debuggingSkills;

    public DebuggingWorkshop() {
        description = "CSM Debugging Workshop!";
        date = "February 16, 2023";
        time = "5:00 - 6:00 PM";
        location = "Cory 540AB";
        comeToDebuggingWorkshop = true;
        debuggingSkills = 100;
    }

    public int attend() {
        if (comeToDebuggingWorkshop) {
            return debuggingSkills;
        }
        return 0;
    }

    public static void main(String[] args) {
        DebuggingWorkshop dw = new DebuggingWorkshop();
        dw.attend();
    }
}
