package ohqueue;

public class OHRequest {
    public String description;
    public String name;
    public boolean isSetup;
    public OHRequest next;

    public OHRequest(String description, String name, boolean isSetup, OHRequest next) {
        this.description = description;
        this.name = name;
        this.isSetup = isSetup;
        this.next = next;
    }

    /** Part c */
    public class OHRequestComparator /** implements Comparator<_____________________________> */ {
        /**
         @Override
         public int compare(___________________________ s1, ________________________ s2) {
            // feel free to define variables here for readability if you'd like

             if (______________________________________________________________) {
                return -1;
             } else if (____________________________________________________________) {
                return 1;
             } else if (____________________________________________________________) {
                return -1;
             } else if (______________________________________________________________) {
                return 1;
             }
            return 0;
         }
         */
    }
}