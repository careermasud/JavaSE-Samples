package org.javase7.puzzle.so;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Masud
 */
public class RuntimeWaitFor {

    public static void main(String[] args) throws IOException, InterruptedException {
        Process p = Runtime.getRuntime().exec("tasklist");
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        System.out.println("Waiting for process");
        int execId = p.waitFor();
        System.out.println(" Process is done " + execId);
    }
}
