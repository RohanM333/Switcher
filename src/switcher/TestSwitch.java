package switcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestSwitch implements Runnable{

    String exe1=null, exe2=null, path1=null, path2=null;
    static Process pr, pCheck;
    private AtomicBoolean keepRunning;
    BufferedReader input;
    
    TestSwitch()
    {
        keepRunning = new AtomicBoolean(true);
    }
    
    public void openChrome()
    {
         try {
             Runtime rt = Runtime.getRuntime();
             path2 = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\";
             exe2 = "Chrome.exe";
             pr = rt.exec(path2+exe2); 
            //pr = rt.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\Chrome.exe"); 

             //Thread.sleep(10000);

         } catch(Exception e) {
             System.out.println(e.toString());
             e.printStackTrace();
         }
    }
    
    public void openVlc() {

        String path = "E:\\GTA San Andreas\\DJ-SpongeBob\\Linkin Park";
        path1 = "C:\\Program Files (x86)\\VideoLAN\\VLC\\";
        exe1 = "vlc.exe";
         try {
             Runtime rt = Runtime.getRuntime();
             //pr = rt.exec("\"C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe\" \""+path+"\""); 
             pr = rt.exec(path1 + exe1 + " \"" + path + "\"");
             //Thread.sleep(10000);

         } catch(Exception e) {
             System.out.println(e.toString());
             e.printStackTrace();
         }
     }


    public void close() {
            pr.destroy();
        }

    public void stop() {
        keepRunning.set(false);
        close();
    }
    
    @Override
    public void run() {
        int pause = 0;
        DateFormat t = new SimpleDateFormat("HHmm");
        
        while (keepRunning.get()) {
            int SysTime, Time1, Time2;
            //System.out.println("Thread Running!");
            String line, pidInfo = "";
            Date time = new Date();
            System.out.println(t.format(time));
            SysTime = Integer.parseInt(t.format(time));
            Time1 = 0000;
            Time2 = 2118;
            
            if(SysTime<=1200)
            {
                if(SysTime==Time1)
                {
                    //2nd exe to execute
                    //Pause
                }
                else
                {
                    //1st exe to execute
                    try {
                    pCheck = null;
                    pCheck =Runtime.getRuntime().exec(System.getenv("windir") +"\\system32\\"+"tasklist.exe");
                    input =  new BufferedReader(new InputStreamReader(pCheck.getInputStream()));

                    while ((line = input.readLine()) != null) {
                        pidInfo+=line; 
                    }
                    input.close();
                    if(pidInfo.contains("vlc.exe"))
                    {
                        System.out.println("Yay!!!!");
                        continue;
                    }
                    else
                    {
                        openVlc();
                    }
                    } catch (IOException ex) {
                        Logger.getLogger(Switcher.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            else if(SysTime>1200)
            {
                if(SysTime==Time2)
                {
                    //2nd exe to execute
                    //pause
                }
                else
                {
                    try {
                    pCheck = null;
                    pCheck =Runtime.getRuntime().exec(System.getenv("windir") +"\\system32\\"+"tasklist.exe");
                    input =  new BufferedReader(new InputStreamReader(pCheck.getInputStream()));

                    while ((line = input.readLine()) != null) {
                        pidInfo+=line; 
                    }
                    input.close();
                    if(pidInfo.contains("vlc.exe"))
                    {
                        System.out.println("Yay!!!!");
                        continue;
                    }
                    else
                    {
                        openVlc();
                    }
                    } catch (IOException ex) {
                        Logger.getLogger(Switcher.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
}
}    



/*
package switcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Switcher implements Runnable{

    String exe1=null, exe2=null, path1=null, path2=null;
    static Process pr, pCheck;
    private AtomicBoolean keepRunning;
    BufferedReader input;
    
    Switcher()
    {
        keepRunning = new AtomicBoolean(true);
    }
    
    public void openChrome()
    {
         try {
             Runtime rt = Runtime.getRuntime();
             path2 = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\";
             exe2 = "Chrome.exe";
             pr = rt.exec(path2+exe2); 
            //pr = rt.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\Chrome.exe"); 

             //Thread.sleep(10000);

         } catch(Exception e) {
             System.out.println(e.toString());
             e.printStackTrace();
         }
    }
    
    public void openVlc() {

        String path = "E:\\GTA San Andreas\\DJ-SpongeBob\\Linkin Park";
        path1 = "C:\\Program Files (x86)\\VideoLAN\\VLC\\";
        exe1 = "vlc.exe";
         try {
             Runtime rt = Runtime.getRuntime();
             //pr = rt.exec("\"C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe\" \""+path+"\""); 
             pr = rt.exec(path1 + exe1 + " \"" + path + "\"");
             //Thread.sleep(10000);

         } catch(Exception e) {
             System.out.println(e.toString());
             e.printStackTrace();
         }
     }


    public void close() {
            pr.destroy();
        }

    public void stop() {
        keepRunning.set(false);
        close();
    }
    
    @Override
    public void run() {
        int pause = 0;
        DateFormat t = new SimpleDateFormat("HHmm");
        
        while (keepRunning.get()) {
            int SysTime, Time1, Time2;
            //System.out.println("Thread Running!");
            String line, pidInfo = "";
            Date time = new Date();
            System.out.println(t.format(time));
            SysTime = Integer.parseInt(t.format(time));
            Time1 = 0000;
            Time2 = 2300;
            
        if(SysTime<=1200)                                            /*****************12:00*****************/
          //{
            /*if(SysTime < Time2)                     //VLC Time
               {
                try {
                    pCheck = null;
                    //Below process pCheck executes the tasklist.exe cmd to get a list of all running processes 
                    pCheck =Runtime.getRuntime().exec(System.getenv("windir") +"\\system32\\"+"tasklist.exe");
                    //Get each process name in the list in a Buffer input
                    input =  new BufferedReader(new InputStreamReader(pCheck.getInputStream()));

                    //Insert elements of 'input' into 'line' and then check if line is null or not
                    //Run the loop till the input is !null
                    //Keep adding each 'line' to the String named 'pidInfo'
                    while ((line = input.readLine()) != null) {
                        pidInfo+=line; 
                    }
                    //Close the input
                    input.close();
                    //Check if the huge string 'pidInfo' contains our .exe name
                    if(pidInfo.contains("vlc.exe"))
                    {
                        System.out.println("Yay!!!!");
                        continue;
                    }
                    else
                    {
                        openVlc();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Switcher.class.getName()).log(Level.SEVERE, null, ex);
                }
               }
            else{                                                               //Chrome Time
                try {
                    pCheck = null;
                    //Below process pCheck executes the tasklist.exe cmd to get a list of all running processes
                    pCheck =Runtime.getRuntime().exec(System.getenv("windir") +"\\system32\\"+"tasklist.exe");
                    //Get each process name in the list in a Buffer input
                    input =  new BufferedReader(new InputStreamReader(pCheck.getInputStream()));

                    //Insert elements of 'input' into 'line' and then check if line is null or not
                    //Run the loop till the input is !null
                    //Keep adding each 'line' to the String named 'pidInfo'
                    while ((line = input.readLine()) != null) {
                        pidInfo+=line; 
                    }
                    //Close the input
                    input.close();
                    //Check if the huge string 'pidInfo' contains our .exe name
                    if(pidInfo.contains("chrome.exe"))
                    {
                        System.out.println("Yay!!!!");
                        continue;
                    }
                    else
                    {
                        openChrome();
                    }
                    Thread.sleep(pause);
                } catch (Exception ex) {
                    Logger.getLogger(Switcher.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
        }
        else if(SysTime<=2359 && SysTime>1200)                            /*****************23:59**************/
          //{
            /*if(SysTime < Time2)                     //VLC Time
               {
                try {
                    pCheck = null;
                    //Below process pCheck executes the tasklist.exe cmd to get a list of all running processes 
                    pCheck =Runtime.getRuntime().exec(System.getenv("windir") +"\\system32\\"+"tasklist.exe");
                    //Get each process name in the list in a Buffer input
                    input =  new BufferedReader(new InputStreamReader(pCheck.getInputStream()));

                    //Insert elements of 'input' into 'line' and then check if line is null or not
                    //Run the loop till the input is !null
                    //Keep adding each 'line' to the String named 'pidInfo'
                    while ((line = input.readLine()) != null) {
                        pidInfo+=line; 
                    }
                    //Close the input
                    input.close();
                    //Check if the huge string 'pidInfo' contains our .exe name
                    if(pidInfo.contains("vlc.exe"))
                    {
                        System.out.println("Yay!!!!");
                        continue;
                    }
                    else
                    {
                        openVlc();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Switcher.class.getName()).log(Level.SEVERE, null, ex);
                }
               }
            else{                                                               //Chrome Time
                try {
                    pCheck = null;
                    //Below process pCheck executes the tasklist.exe cmd to get a list of all running processes
                    pCheck =Runtime.getRuntime().exec(System.getenv("windir") +"\\system32\\"+"tasklist.exe");
                    //Get each process name in the list in a Buffer input
                    input =  new BufferedReader(new InputStreamReader(pCheck.getInputStream()));

                    //Insert elements of 'input' into 'line' and then check if line is null or not
                    //Run the loop till the input is !null
                    //Keep adding each 'line' to the String named 'pidInfo'
                    while ((line = input.readLine()) != null) {
                        pidInfo+=line; 
                    }
                    //Close the input
                    input.close();
                    //Check if the huge string 'pidInfo' contains our .exe name
                    if(pidInfo.contains("chrome.exe"))
                    {
                        System.out.println("Yay!!!!");
                        continue;
                    }
                    else
                    {
                        openChrome();
                    }
                    Thread.sleep(pause);
                } catch (Exception ex) {
                    Logger.getLogger(Switcher.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
        }
    }
}
}    

*/
