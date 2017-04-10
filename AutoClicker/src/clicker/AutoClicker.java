package clicker;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Created by Ben on 4/10/2017.
 */
public class AutoClicker {
    private static Robot marco = null;
    private static boolean run = false;
    private static double time = 6.5;

    private static void createMacro(){
        try{
            marco = new Robot();
        }catch (AWTException e){
            System.out.println(e.getMessage());
        }
    }

    protected static void leftClick(){
        createMacro();
        marco.mousePress(MouseEvent.BUTTON1_MASK);
        marco.mousePress(MouseEvent.BUTTON1_MASK);
    }

    protected static void delay(double seconds){
        createMacro();
        marco.delay((int)(seconds*1000.0));
    }

    public static void MainFunction(){
        while(run){
            leftClick();
            delay(time);
        }
    }

    public static void setRun(Boolean y){
        run = y;
    }

    public static void setTime(double in){
        time = in;
    }
}
