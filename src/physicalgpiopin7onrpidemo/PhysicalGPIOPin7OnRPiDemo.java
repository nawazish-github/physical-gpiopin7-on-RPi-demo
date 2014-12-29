/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physicalgpiopin7onrpidemo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.microedition.midlet.MIDlet;
import jdk.dio.DeviceManager;
import jdk.dio.gpio.GPIOPin;

/**
 *
 * @author NawazishMohammad
 */
public class PhysicalGPIOPin7OnRPiDemo extends MIDlet {
    
    GPIOPin gpio7;
    
    @Override
    public void startApp() {
        try {
            System.out.println("Opening GPIO7");
            gpio7 = DeviceManager.open("GPIO7", GPIOPin.class, null);
            while (true){
                gpio7.setValue(true);
                System.out.println("gpio7 set to true");
                Thread.sleep(4000);
                gpio7.setValue(false);
                System.out.println("gpio7 set to false");
                Thread.sleep(4000);
                
            }
        } catch (IOException ex) {
            Logger.getLogger(PhysicalGPIOPin7OnRPiDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(PhysicalGPIOPin7OnRPiDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void destroyApp(boolean unconditional) {
        try {
            System.out.println("Closing GPIO7");
            gpio7.close();
        } catch (IOException ex) {
            Logger.getLogger(PhysicalGPIOPin7OnRPiDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
