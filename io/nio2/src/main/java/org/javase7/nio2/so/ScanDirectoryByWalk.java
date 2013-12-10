
package org.javase7.nio2.so;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * http://stackoverflow.com/questions/20438328/how-to-search-for-a-subdirectory-from-a-parent-directory
 * @author Masudul Haque
 */
public class ScanDirectoryByWalk {

    public static void main(String[] args) throws IOException {
        Path startingDir = Paths
                .get("J:\\Video Songs");
        Files.walkFileTree(startingDir, new FindJavaVisitor());
    }

    private static class FindJavaVisitor extends SimpleFileVisitor<Path> {

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            if(dir.getFileName().toAbsolutePath().toString().contains("Work Out")){
            System.out.println("z1 is found at"+ dir.getFileName().toAbsolutePath());
            }
          return FileVisitResult.CONTINUE;
        }
    }

}
