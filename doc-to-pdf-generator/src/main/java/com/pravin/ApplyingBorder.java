package com.pravin;

import java.io.File;

import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.Borders;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import org.apache.poi.xwpf.usermodel.XWPFRun;

public class ApplyingBorder extends XWPFDocument{

public static void ApplyingBorderMethod() throws Exception {

//Blank Document

XWPFDocument document = new XWPFDocument();

//Write the Document in file system

FileOutputStream out = new FileOutputStream(new File("C:\\AnypointStudio\\Design Document.docx"));

//create paragraph

XWPFParagraph paragraph = document.createParagraph();

//Set bottom border to paragraph

paragraph.setBorderBottom(Borders.BASIC_BLACK_DASHES);

//Set left border to paragraph

paragraph.setBorderLeft(Borders.BASIC_BLACK_DASHES);

//Set right border to paragraph

paragraph.setBorderRight(Borders.BASIC_BLACK_DASHES);

//Set top border to paragraph

paragraph.setBorderTop(Borders.BASIC_BLACK_DASHES);

paragraph.setAlignment(ParagraphAlignment.LEFT);

XWPFRun run = paragraph.createRun();

run.setText("Hi, This is the document created to demonstrate how to create pdf using Mulesoft");

document.write(out);

out.close();

System.out.println("sampleDocument.docx written successully");

}

}