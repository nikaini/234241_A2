/* 
 * Semester: A171
 * Course: STIW3054
 * Group: A
 * Task: Assignment 2
 * Matric Num: 234241
 * Name: Nik Nur Aini Bt Nik Mat
 */

package com.nikaini._a2;

import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Assignment2 {
  
  public static void main(String[] args) throws IOException {
      
    
    File file = new File("C:\\Users\\User\\Desktop\\A171-234241-NikNurAini\\Assignment2_TestFiles\\MyThread1.java");
    File file2 = new File("C:\\Users\\User\\Desktop\\A171-234241-NikNurAini\\Assignment2_TestFiles\\MyThread2.java");
   
    InputStream inputStream = new FileInputStream(file);
    InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "iso-8859-1");
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    
    InputStream inputStream2 = new FileInputStream(file2);
    InputStreamReader inputStreamReader2 = new InputStreamReader(inputStream2, "iso-8859-1");
    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
    
    //Test MyThread1 file
    int lineCount = 0, commentsCount = 0, blankLines = 0;
    int keyPackage=0, keyClass=0, keyExtends=0, keyPublic=0, keyVoid=0, keyStatic=0, keyNew=0;

    try {
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            if (line.startsWith("//")) commentsCount++; 
            if (line.isEmpty()) blankLines++;
            
            if (line.contains("package")) keyPackage++;
            if (line.contains("class")) keyClass++;
            if (line.contains("extends")) keyExtends++;
            if (line.contains("public")) keyPublic++;
            if (line.contains("void")) keyVoid++;
            if (line.contains("static")) keyStatic++;
            if (line.contains("new")) keyNew++;
            
            if(line.startsWith("//Matrik")) 
                System.out.println("\nMatrik: " + line.substring(11));

            processLine(line);
            lineCount++;  
        }
        
    } finally {
        bufferedReader.close();
    }

        int actualLOC = lineCount - commentsCount - blankLines;
        int total = actualLOC + keyPackage + keyClass + keyExtends + keyPublic + keyVoid + keyStatic + keyNew;
        
        System.out.println("LOC: " + lineCount + "\nComment: " + commentsCount 
        + "\nBlank: " + blankLines + "\nActual LOC: " + actualLOC );
        
        System.out.println("===Java Keywords===");
        
        System.out.println("package: " + keyPackage + "\nclass: " + keyClass + "\nextends: " + keyExtends 
        + "\npublic: " + keyPublic + "\nvoid: " + keyVoid + "\nstatic: " + keyStatic + "\nnew: " + keyNew);
        
        System.out.println("Total: " + total);
        

    System.out.println(" ");
    
    
    //Test MyThread2 file
    int lineCount2 = 0, commentsCount2 = 0, blankLines2 = 0;
    int keyPackage2=0, keyClass2=0, keyExtends2=0, keyPublic2=0, keyVoid2=0, keyStatic2=0, keyNew2=0;

    try {
        while (bufferedReader2.ready()) {
            String line2 = bufferedReader2.readLine();
            
            if (line2.startsWith("//")) commentsCount2++;
            if (line2.isEmpty()) blankLines2++;
            
            if (line2.contains("package")) keyPackage2++;
            if (line2.contains("class")) keyClass2++;
            if (line2.contains("extends")) keyExtends2++;
            if (line2.contains("public")) keyPublic2++;
            if (line2.contains("void")) keyVoid2++;
            if (line2.contains("static")) keyStatic2++;
            if (line2.contains("new")) keyNew2++;
            
            if(line2.startsWith("//Matrik")) 
                System.out.println("\nMatrik: " + line2.substring(11));

            lineCount2++;
        }

    } finally {   
        bufferedReader2.close();
    }
    
     int blankSpace = blankLines2+1;
        int actualLOC2 = lineCount2 - commentsCount2 - blankSpace;
        int total2 = actualLOC2 + keyPackage2 + keyClass2 + keyExtends2 + keyPublic2 + keyVoid2 + keyStatic2 + keyNew2;
        
        System.out.println("LOC: " + lineCount2 + "\nComment: " + commentsCount2 
        + "\nBlank: " + blankSpace + "\nActual LOC: " + actualLOC2);
        
        System.out.println("===Java Keywords===");
        
         System.out.println("package: " + keyPackage2 + "\nclass: " + keyClass2 + "\nextends: " + keyExtends2
        + "\npublic: " + keyPublic2 + "\nvoid: " + keyVoid2 + "\nstatic: " + keyStatic2 + "\nnew: " + keyNew2);
        
        System.out.println("Total: " + total2);
    

    //WRITE EXCEL FILE
    try {
            String filename = "C:\\Users\\User\\Desktop\\A171-234241-NikNurAini\\Output-234241.xls" ;
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("FirstSheet");  

            HSSFRow row1 = sheet.createRow((short)0);
            row1.createCell(0).setCellValue("Semester");
            row1.createCell(1).setCellValue("A171");
            
            HSSFRow row2 = sheet.createRow((short)1);
            row2.createCell(0).setCellValue("Course");
            row2.createCell(1).setCellValue("STIW3054");
            
            HSSFRow row3 = sheet.createRow((short)2);
            row3.createCell(0).setCellValue("Group");
            row3.createCell(1).setCellValue("A");
            
            HSSFRow row4 = sheet.createRow((short)3);
            row4.createCell(0).setCellValue("Task");
            row4.createCell(1).setCellValue("Assignment1");
            
            HSSFRow rowhead = sheet.createRow((short)5);
            rowhead.createCell(5).setCellValue("Java Keywords");
            

            HSSFRow row = sheet.createRow((short)6);
            row.createCell(0).setCellValue("Matrik");
            row.createCell(1).setCellValue("LOC");
            row.createCell(2).setCellValue("Blank");
            row.createCell(3).setCellValue("Comment");
            row.createCell(4).setCellValue("ActualLOC");
            row.createCell(5).setCellValue("package");
            row.createCell(6).setCellValue("class");
            row.createCell(7).setCellValue("extends");
            row.createCell(8).setCellValue("public");
            row.createCell(9).setCellValue("void");
            row.createCell(10).setCellValue("static");
            row.createCell(11).setCellValue("new");
            row.createCell(12).setCellValue("Total");
 
            HSSFRow row7 = sheet.createRow((short)7);
            row7.createCell(0).setCellValue("898989");
            row7.createCell(1).setCellValue(lineCount);
            row7.createCell(2).setCellValue(blankLines);
            row7.createCell(3).setCellValue(commentsCount);
            row7.createCell(4).setCellValue(actualLOC);
            row7.createCell(5).setCellValue(keyPackage);
            row7.createCell(6).setCellValue(keyClass);
            row7.createCell(7).setCellValue(keyExtends);
            row7.createCell(8).setCellValue(keyPublic);
            row7.createCell(9).setCellValue(keyVoid);
            row7.createCell(10).setCellValue(keyStatic);
            row7.createCell(11).setCellValue(keyNew);
            row7.createCell(12).setCellValue(total);
            
            
            HSSFRow row8 = sheet.createRow((short)8);
            row8.createCell(0).setCellValue("123456");
            row8.createCell(1).setCellValue(lineCount2);
            row8.createCell(2).setCellValue(blankLines2);
            row8.createCell(3).setCellValue(commentsCount2);
            row8.createCell(4).setCellValue(actualLOC2);
            row8.createCell(5).setCellValue(keyPackage2);
            row8.createCell(6).setCellValue(keyClass2);
            row8.createCell(7).setCellValue(keyExtends2);
            row8.createCell(8).setCellValue(keyPublic2);
            row8.createCell(9).setCellValue(keyVoid2);
            row8.createCell(10).setCellValue(keyStatic2);
            row8.createCell(11).setCellValue(keyNew2);
            row8.createCell(12).setCellValue(total2);

            FileOutputStream fileOut = new FileOutputStream(filename);
            workbook.write(fileOut);
            fileOut.close();
            System.out.println("\nYour excel file has been generated!");

        } catch ( Exception ex ) {
            System.out.println(ex);
        }
    
}
   public static void processLine(String lines) {    
       
       if(lines.startsWith("//Semester")) 
           System.out.println("Semester: " + lines.substring(13));
       
       if (lines.startsWith("//Course")) 
           System.out.println("Course: " + lines.substring(11));
       
       if (lines.startsWith("//Group")) 
          System.out.println("Group: " + lines.substring(10));

       if (lines.startsWith("//Task")) 
           System.out.println("Task: " + lines.substring(9)); 
    }
}
