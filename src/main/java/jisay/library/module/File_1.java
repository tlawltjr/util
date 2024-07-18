package jisay.library.module;

import java.io.File;
import java.io.IOException;
import java.nio.*;
import java.nio.file.*;

public class File_1 {

    public static void main(String[] args) {

        Path sourceDir = Paths.get("G:\\.shortcut-targets-by-id\\1gPsR6Mw23rzxBNEjJ4TgSx_JBBdtnTK-\\Product\\breezm_customer\\202407\\titan\\티탄 도면\\2407_11_fitting"); // 원본 파일 경로
        Path targetDir = Paths.get("C:\\this"); // 대상 파일 경로

        try {
            if (Files.notExists(targetDir)) {
                Files.createDirectory(targetDir);
            }

            try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(sourceDir)) {
                for (Path sourceFilePath : directoryStream) {
                    Path targetFilePath = targetDir.resolve(sourceFilePath.getFileName());
                    if (Files.isRegularFile(sourceFilePath)) {
                        Files.copy(sourceFilePath, targetFilePath, StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("복사 완료: " + sourceFilePath + " -> " + targetFilePath);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
