package jisay.library.module;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class File_1 {

    Path sourceDir = Paths.get("G:\\.shortcut-targets-by-id\\1gPsR6Mw23rzxBNEjJ4TgSx_JBBdtnTK-\\Product\\breezm_customer\\202407\\titan\\티탄 도면\\2407_11_fitting"); // 원본 파일 경로
    Path targetDir = Paths.get("C:\\this"); // 대상 파일 경로

    public File_1(){

    }

    public void copy_file(String fileName) throws IOException {
        if (Files.notExists(targetDir)) {
            Files.createDirectory(targetDir);
        }

        Path sourceFilePath = sourceDir.resolve(fileName);

        if (Files.exists(sourceFilePath) && Files.isRegularFile(sourceFilePath)) {
            Path targetFilePath = targetDir.resolve(sourceFilePath.getFileName());
            Files.copy(sourceFilePath, targetFilePath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("복사 완료: " + sourceFilePath + " -> " + targetFilePath);
        } else {
            System.out.println("원본 디렉터리에 파일이 존재하지 않습니다: " + fileName);
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("복사할 파일 이름을 입력하세요: ");
        String fileName = scanner.nextLine();

        File_1 f = new File_1();
        f.copy_file(fileName);
    }
}


//package jisay.library.module;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.*;
//import java.nio.file.*;
//
//import java.util.*;
//
//public class File_1 {
//
//    Path sourceDir = Paths.get("G:\\.shortcut-targets-by-id\\1gPsR6Mw23rzxBNEjJ4TgSx_JBBdtnTK-\\Product\\breezm_customer\\202407\\titan\\티탄 도면\\2407_11_fitting"); // 원본 파일 경로
//    Path targetDir = Paths.get("C:\\this"); // 대상 파일 경로
//
//    public File_1(){
//
//    }
//
//    public String copy_file() throws IOException {
//        if (Files.notExists(targetDir)) {
//            Files.createDirectory(targetDir);
//        }
//        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(sourceDir);
//
//        for (Path sourceFilePath : directoryStream) {
//            Path targetFilePath = targetDir.resolve(sourceFilePath.getFileName());
//            if (Files.isRegularFile(sourceFilePath)) {
//                Files.copy(sourceFilePath, targetFilePath, StandardCopyOption.REPLACE_EXISTING);
//                System.out.println("복사 완료: " + sourceFilePath + " -> " + targetFilePath);
//            }
//        }
//
//        return null;
//    }
//
//    public static void main(String[] args) throws IOException {
//        File_1 f = new File_1();
//        f.copy_file();
//    }
//}
