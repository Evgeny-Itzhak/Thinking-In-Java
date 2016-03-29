package com.company.home.differentexperiments;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by Itzhak-Miryam on 12.03.2016.
 */
public class FileExperiment {
    public static void main(String[] args) throws ParseException {

        final String pathToDirectory = "arm_flag";
        final String pathToFile = "bin/armStartFlag";

        File startFlagFolder = new File(pathToDirectory);
        File startFlagFile = new File(pathToFile);

        if (!startFlagFolder.exists()) {
            startFlagFolder.mkdir();
        }

        if (startFlagFile.exists()) {
            System.out.println("файл уже есть:" + startFlagFile.getAbsolutePath());
            System.out.println("" + startFlagFile.getPath());
            System.out.println("" + startFlagFile.getAbsolutePath());
            try {
                System.out.println("" + startFlagFile.getCanonicalPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        } else {
            try {
                startFlagFile.createNewFile();
                System.out.println("файл " + startFlagFile.getName() + " создан " + startFlagFile.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if ((startFlagFile.exists())) {
            //startFlagFile.delete();
            System.out.println("файл удалён");
        }
    }
}
