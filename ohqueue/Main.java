package ohqueue;

/** Part e */
public class Main {
    public static void main(String[] args) {
        OHRequest s5 = new OHRequest("I deleted all of my files, thank u", "Elana", true, null);
        OHRequest s4 = new OHRequest("conceptual: what is Java", "Stella", false, s5);
        OHRequest s3 = new OHRequest("git: I never did lab 1", "Omar", true, s4);
        OHRequest s2 = new OHRequest("help", "Angel", false, s3);
        OHRequest s1 = new OHRequest("no I haven't tried stepping through", "Ashley", false, s2);

        /**
        ________________________________;
        for (________________________________) {
            ________________________________;
        }
         */
    }
}