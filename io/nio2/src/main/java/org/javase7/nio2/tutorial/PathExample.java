package org.javase7.nio2.tutorial;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Masud
 */
public class PathExample {

    public static void main(String[] args) {
        Path listing = Paths.get("C:\\Users\\Masud\\Projects\\GrailsApp");
        System.out.println("File Name [" + listing.getFileName() + "]");
        System.out.println("Number of Name Elements in the Path ["
                + listing.getNameCount() + "]");
        System.out.println("Parent Path [" + listing.getParent() + "]");
        System.out.println("Root of Path [" + listing.getRoot() + "]");
        System.out.println("Subpath from Root, 2 elements deep ["
                + listing.subpath(0, 2) + "]");
    }
}
