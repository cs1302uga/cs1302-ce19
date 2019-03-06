
package cs1302.ce19;

import javafx.application.Application;

public class PushCounterDriver {

    public static void main(String[] args) {
        try {
            Application.launch(PushCounterApp.class, args);
        } catch (Exception e) {
            System.err.println(e);
            System.err.println("Likely due to X11 timeout. Logout and log back in...");
            System.exit(1);
        } // try
    } // main

} // PushCounterDriver
