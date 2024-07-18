package jisay.library.module;

import java.io.File;
import java.io.IOException;
import java.nio.*;
import java.nio.file.*;

public class File_1 {

    public static void main(String[] args) {

        Path sourceDir = Paths.get("G:\\.shortcut-targets-by-id\\1gPsR6Mw23rzxBNEjJ4TgSx_JBBdtnTK-\\Product\\breezm_customer\\202407\\titan\\티탄 도면\\2407_11_fitting"); // 원본 파일 경로
//        Path targetPath = Paths.get("C:\\this"); // 대상 파일 경로
//
//        try {
//            // 파일 복사
//            Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
//            System.out.println("파일 복사 완료");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("파일 복사 중 오류 발생");
//        }

//        Path sourceDir = Paths.get("sourceFolder"); // 원본 폴더 경로
        Path targetDir = Paths.get("targetFolder"); // 대상 폴더 경로

        try {
            // 대상 폴더가 존재하지 않으면 생성
            if (Files.notExists(targetDir)) {
                Files.createDirectory(targetDir);
            }

            // 소스 폴더의 모든 파일을 대상으로 복사
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
            System.out.println("파일 복사 중 오류 발생");
        }


//        File dir = new File("G:\\.shortcut-targets-by-id\\1gPsR6Mw23rzxBNEjJ4TgSx_JBBdtnTK-\\Product\\breezm_customer\\202407\\titan\\티탄 도면\\2407_11_fitting");
//
//        String[] filenames = dir.list();
//        for (String filename : filenames) {
//            System.out.println("filename : " + filename);
//        }


    }
}
