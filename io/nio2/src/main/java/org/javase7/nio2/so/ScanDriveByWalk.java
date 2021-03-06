package org.javase7.nio2.so;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * http://stackoverflow.com/questions/20077290/how-can-i-scan-whole-c-drive-for-playlists/
 *
 * @author Masudul Haque
 */
public class ScanDriveByWalk {

    public static void main(String[] args) throws IOException {
        Path startingDir = Paths
                .get("J:\\Video Songs");
        Files.walkFileTree(startingDir, new FindJavaVisitor());
    }

    private static class FindJavaVisitor extends SimpleFileVisitor<Path> {

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {

            if (file.toString().contains("non-existent-playlist.m3u")) {

                System.out.println(file.getFileName());
            }
            return FileVisitResult.CONTINUE;
        }
    }
}
