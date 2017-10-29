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
      
  
               //Test MyThread1
    File file = new File("C:/Users/User/Desktop/234241_A2/Assignment2_TestFiles/MyThread1.java");
   
    InputStream inputStream = new FileInputStream(file);
    InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "iso-8859-1");
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    
    int lineCount = 0, commentsCount = 0, blankLines = 0;
    int keyPackage=0, keyClass=0, keyExtends=0, keyPublic=0, keyVoid=0, keyStatic=0, keyNew=0;
    
    int keyAssert=0, keyBoolean=0, keyBreak=0, keyByte=0, keyAbstract=0, keyCase=0, keyCatch=0, keyChar=0, 
        keyContinue=0, keyDefault=0, keyDo=0, keyDouble=0,keyElse=0,keyEnum=0, keyFinal=0, keyFinally=0, 
        keyFloat=0, keyFor=0, keyIf=0, keyImplements=0, keyImport=0, keyInstanceof=0, keyInt=0, 
        keyInterface=0, keyLong=0, keyNative=0, keyPrivate=0,keyProtected=0, keyReturn=0, keyThrow=0, 
        keyShort=0, keyStrictfp=0, keySuper=0, keySwitch=0, keySynchronized=0, keyThis=0, keyThrows=0, 
        keyVolatile=0, keyTry=0, keyTransient=0, keyWhile=0, keyTrue=0, keyNull=0, keyFalse=0, 
        keyConst=0, keyGoto=0;     

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
 
            if (line.contains("abstract")) keyAbstract++;
            if (line.contains("assert")) keyAssert ++;
            if (line.contains("boolean")) keyBoolean ++;
            if (line.contains("break")) keyBreak ++;
            if (line.contains("byte")) keyByte ++;
            if (line.contains("case")) keyCase++;
            if (line.contains("catch")) keyCatch++;
            if (line.contains("char")) keyChar++;
            if (line.contains("continue")) keyContinue++;
            if (line.contains("default")) keyDefault ++;
            if (line.contains("do")) keyDo++;
            if (line.contains("double")) keyDouble++;
            if (line.contains("else")) keyElse++;
            if (line.contains("enum")) keyEnum++;
            if (line.contains("final")) keyFinal++;
            if (line.contains("finally")) keyFinally++;
            if (line.contains("float")) keyFloat++;
            if (line.contains("for")) keyFor ++;
            if (line.contains("if")) keyIf++;
            if (line.contains("implements")) keyImplements++;
            if (line.contains("import")) keyImport++;
            if (line.contains("instanceof")) keyInstanceof ++;
            if (line.contains(" int ")) keyInt++;          
            if (line.contains("interface")) keyInterface ++;
            if (line.contains("long")) keyLong++;
            if (line.contains("native")) keyNative ++;
            if (line.contains("private")) keyPrivate++;
            if (line.contains("protected")) keyProtected++;
            if (line.contains("return")) keyReturn++;
            if (line.contains("short")) keyShort++;
            if (line.contains("strictfp")) keyStrictfp++;
            if (line.contains("super")) keySuper++;
            if (line.contains("switch")) keySwitch++;
            if (line.contains("synchronized")) keySynchronized++;
            if (line.contains("this")) keyThis++;
            if (line.contains("throw")) keyThrow++;
            if (line.contains("throws")) keyThrows++;
            if (line.contains("transient")) keyTransient++;
            if (line.contains("try")) keyTry++;
            if (line.contains("volatile")) keyVolatile++;
            if (line.contains("while")) keyWhile++;
            if (line.contains("true")) keyTrue++;
            if (line.contains("null")) keyNull++;
            if (line.contains("false")) keyFalse++;
            if (line.contains("const")) keyConst++;
            if (line.contains("goto")) keyGoto++;
  
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
        + "\nbreak: " + keyBreak + "\nbyte: " + keyByte + "\ncase: " + keyCase + "\ncatch: " + keyCatch 
        + "\nabstract: " + keyAbstract + "\nassert: " + keyAssert + "\nboolean: " + keyBoolean 
        + "\npublic: " + keyPublic + "\nvoid: " + keyVoid + "\nstatic: " + keyStatic 
        + "\nenum: " + keyEnum + "\nchar: " + keyChar + "\ncontinue: " + keyContinue 
        + "\ndefault: " + keyDefault + "\ndo: " + keyDo + "\ndouble: " + keyDouble 
        + "\nelse: " + keyElse + "\nnew: " + keyNew + "\nfinal: " + keyFinal 
        + "\nfinally: " + keyFinally + "\nstrictfp: " + keyStrictfp + "\nfor: " + keyFor 
        + "\nif: " + keyIf + "\nimplements: " + keyImplements + "\nimport: " + keyImport
        + "\ninstanceof: " + keyInstanceof + "\nint: " + keyInt + "\ninterface: " + keyInterface 
        + "\nlong: " + keyLong + "\nnative: " + keyNative + "\nprivate: " + keyPrivate 
        + "\nprotected: " + keyProtected + "\nreturn: " + keyReturn + "\nshort: " + keyShort 
        + "\nfloat: " + keyFloat + "\nsuper: " + keySuper + "\nswitch: " + keySwitch 
        + "\nsynchronized: " + keySynchronized + "\nthis: " + keyThis + "\nthrow: " + keyThrow 
        + "\nthrows: " + keyThrows + "\ntransient: " + keyTransient + "\ntry: " + keyTry 
        + "\nvolatile: " + keyVolatile + "\nwhile: " + keyWhile + "\ntrue: " + keyTrue 
        + "\nnull: " + keyNull + "\nfalse: " + keyFalse + "\nconst: " + keyConst 
        + "\ngoto: " + keyGoto);
    
        System.out.println("\nTotal: " + total);
        
        

    System.out.println(" ");
    
    
    File file2 = new File("C:/Users/User/Desktop/234241_A2/Assignment2_TestFiles/MyThread2.java");
    
    InputStream inputStream2 = new FileInputStream(file2);
    InputStreamReader inputStreamReader2 = new InputStreamReader(inputStream2, "iso-8859-1");
    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
    
    //Test MyThread2 file
    int lineCount2 = 0, commentsCount2 = 0, blankLines2 = 0;
    int keyPackage2=0, keyClass2=0, keyExtends2=0, keyPublic2=0, keyVoid2=0, keyStatic2=0, keyNew2=0;
    
     int keyAssert2=0, keyBoolean2=0, keyBreak2=0, keyByte2=0, keyAbstract2=0, keyCase2=0, keyCatch2=0, keyChar2=0, 
        keyContinue2=0, keyDefault2=0, keyDo2=0, keyDouble2=0,keyElse2=0,keyEnum2=0, keyFinal2=0, keyFinally2=0, 
        keyFloat2=0, keyFor2=0, keyIf2=0, keyImplements2=0, keyImport2=0, keyInstanceof2=0, keyInt2=0, 
        keyInterface2=0, keyLong2=0, keyNative2=0, keyPrivate2=0,keyProtected2=0, keyReturn2=0, keyThrow2=0, 
        keyShort2=0, keyStrictfp2=0, keySuper2=0, keySwitch2=0, keySynchronized2=0, keyThis2=0, keyThrows2=0, 
        keyVolatile2=0, keyTry2=0, keyTransient2=0, keyWhile2=0, keyTrue2=0, keyNull2=0, keyFalse2=0, 
        keyConst2=0, keyGoto2=0;

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
            
            if (line2.contains("abstract")) keyAbstract2++;
            if (line2.contains("assert")) keyAssert2++;
            if (line2.contains("boolean")) keyBoolean2++;
            if (line2.contains("break")) keyBreak2++;
            if (line2.contains("byte")) keyByte2++;
            if (line2.contains("case")) keyCase2++;
            if (line2.contains("catch")) keyCatch2++;
            if (line2.contains("char")) keyChar2++;
            if (line2.contains("continue")) keyContinue2++;
            if (line2.contains("default")) keyDefault2++;
            if (line2.contains("do")) keyDo2++;
            if (line2.contains("double")) keyDouble2++;
            if (line2.contains("else")) keyElse2++;
            if (line2.contains("enum")) keyEnum2++;
            if (line2.contains("final")) keyFinal2++;
            if (line2.contains("finally")) keyFinally2++;
            if (line2.contains("float")) keyFloat2++;
            if (line2.contains("for")) keyFor2++;
            if (line2.contains("if")) keyIf2++;
            if (line2.contains("implements")) keyImplements2++;
            if (line2.contains("import")) keyImport2++;
            if (line2.contains("instanceof")) keyInstanceof2++;
            if (line2.contains(" int ")) keyInt2++;          
            if (line2.contains("interface")) keyInterface2++;
            if (line2.contains("long")) keyLong2++;
            if (line2.contains("native")) keyNative2++;
            if (line2.contains("private")) keyPrivate2++;
            if (line2.contains("protected")) keyProtected2++;
            if (line2.contains("return")) keyReturn2++;
            if (line2.contains("short")) keyShort2++;
            if (line2.contains("strictfp")) keyStrictfp2++;
            if (line2.contains("super")) keySuper2++;
            if (line2.contains("switch")) keySwitch2++;
            if (line2.contains("synchronized")) keySynchronized2++;
            if (line2.contains("this")) keyThis2++;
            if (line2.contains("throw")) keyThrow2++;
            if (line2.contains("throws")) keyThrows2++;
            if (line2.contains("transient")) keyTransient2++;
            if (line2.contains("try")) keyTry2++;
            if (line2.contains("volatile")) keyVolatile2++;
            if (line2.contains("while")) keyWhile2++;
            if (line2.contains("true")) keyTrue2++;
            if (line2.contains("null")) keyNull2++;
            if (line2.contains("false")) keyFalse2++;
            if (line2.contains("const")) keyConst2++;
            if (line2.contains("goto")) keyGoto2++;
            
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
        + "\nbreak: " + keyBreak2 + "\nbyte: " + keyByte2 + "\ncase: " + keyCase2 + "\ncatch: " + keyCatch2 
        + "\nabstract: " + keyAbstract2 + "\nassert: " + keyAssert2 + "\nboolean: " + keyBoolean2 
        + "\npublic: " + keyPublic2 + "\nvoid: " + keyVoid2 + "\nstatic: " + keyStatic2 + "\nenum: " + keyEnum2
        + "\nchar: " + keyChar2 + "\ncontinue: " + keyContinue2 + "\ndefault: " + keyDefault2 
        + "\ndo: " + keyDo2 + "\ndouble: " + keyDouble2 + "\nelse: " + keyElse2 + "\nnew: " + keyNew2
        + "\nfinal: " + keyFinal2 + "\nfinally: " + keyFinally2 + "\nstrictfp: " + keyStrictfp2 
        + "\nfor: " + keyFor2 + "\nif: " + keyIf2 + "\nimplements: " + keyImplements2 + "\nimport: " + keyImport2
        + "\ninstanceof: " + keyInstanceof2 + "\nint: " + keyInt2 + "\ninterface: " + keyInterface2 
        + "\nlong: " + keyLong2 + "\nnative: " + keyNative2 + "\nprivate: " + keyPrivate2 
        + "\nprotected: " + keyProtected2 + "\nreturn: " + keyReturn2 + "\nshort: " + keyShort2 
        + "\nfloat: " + keyFloat2 + "\nsuper: " + keySuper2 + "\nswitch: " + keySwitch2 
        + "\nsynchronized: " + keySynchronized2 + "\nthis: " + keyThis2 + "\nthrow: " + keyThrow2 
        + "\nthrows: " + keyThrows2 + "\ntransient: " + keyTransient2 + "\ntry: " + keyTry2 
        + "\nvolatile: " + keyVolatile2 + "\nwhile: " + keyWhile2 + "\ntrue: " + keyTrue2 
        + "\nnull: " + keyNull2 + "\nfalse: " + keyFalse2 + "\nconst: " + keyConst2 + "\ngoto: " + keyGoto2);
    
        System.out.println("\nTotal: " + total2);
    

    //WRITE EXCEL FILE
    try {
            String filename = "C:/Users/User/Desktop/234241_A2/Output-234241.xls" ;
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
