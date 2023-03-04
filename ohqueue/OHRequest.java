package ohqueue;

import java.util.Comparator;

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
    public class OHRequestComparator implements Comparator<OHRequest> {

         @Override
         public int compare(OHRequest s1, OHRequest s2) {
            // feel free to define variables here for readability if you'd like

             if (s1.isSetup == true && s2.isSetup == false) {
                return -1;
             } else if (s1.isSetup == false && s2.isSetup == true) {
                return 1;
             } else if (s1.description.contains("setup") && !s2.description.contains("setup")) {
                return -1;
             } else if (!s1.description.contains("setup") && s1.description.contains("setup")) {
                return 1;
             }
            return 0;
         }
    }
}