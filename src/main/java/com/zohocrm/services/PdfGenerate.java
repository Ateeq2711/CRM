package com.zohocrm.services;

import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfGenerate {
	
	private static final String FILE_NAME = "D:\\spring boot 4.8.1\\zohocrmapp4\\pdf_folder\\sample3.pdf";

	   
	
	   public  void writeUsingIText( String firstName, String lastName,String email,long mobile,String product,String amount) {

	        Document document = new Document();

	        try {

	            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));

	            //open
	            document.open();

	            Paragraph p = new Paragraph();
	            p.add("Bill");
	            p.setAlignment(Element.ALIGN_CENTER);

	            document.add(p);

	            
	            

	            Font f = new Font();
	            f.setStyle(Font.BOLD);
	            f.setSize(8);

	            document.add(new Paragraph("Bill details", f));
	            
	          
	            
	         // creating table and set the column width
	         			PdfPTable pdfPTable = new PdfPTable(2);
	         			
	         			 //Create cells
	         	        PdfPCell pdfPCell1 = new PdfPCell(new Paragraph("Custmer details"));
	         	        PdfPCell pdfPCell2 = new PdfPCell(new Paragraph("details"));
	         	        
	         	       //Add cells to table
	         	       
	         	        
	         	       //Create cells
	         	        PdfPCell pdfPCell3 = new PdfPCell(new Paragraph("FirstName"));
	         	        PdfPCell pdfPCell4 = new PdfPCell(new Paragraph(firstName));
	         	        
	         	       //Add cells to table
	         	        
	         	        
	         	       //Create cells
	         	        PdfPCell pdfPCell5 = new PdfPCell(new Paragraph("LastName"));
	         	        PdfPCell pdfPCell6 = new PdfPCell(new Paragraph(lastName));
	         	        
	         	       PdfPCell pdfPCell7 = new PdfPCell(new Paragraph("Email"));
	         	        PdfPCell pdfPCell8 = new PdfPCell(new Paragraph(email));
	         	        
	         	       PdfPCell pdfPCell9 = new PdfPCell(new Paragraph("Mobile"));
	         	        PdfPCell pdfPCell10 = new PdfPCell(new Paragraph(mobile));
	         	        
	         	       PdfPCell pdfPCell11 = new PdfPCell(new Paragraph("Product"));
	         	        PdfPCell pdfPCell12 = new PdfPCell(new Paragraph(product));
	         	        
	         	       PdfPCell pdfPCell13 = new PdfPCell(new Paragraph("Amount"));
	         	        PdfPCell pdfPCell14 = new PdfPCell(new Paragraph(amount));
	         	        
	         	       pdfPTable.addCell(pdfPCell1);
	         	        pdfPTable.addCell(pdfPCell2);
	         	        
	         	       pdfPTable.addCell(pdfPCell3);
	         	        pdfPTable.addCell(pdfPCell4);
	         	        
	         	       //Add cells to table
	         	        pdfPTable.addCell(pdfPCell5);
	         	        pdfPTable.addCell(pdfPCell6);
	         	       pdfPTable.addCell(pdfPCell7);
	         	        pdfPTable.addCell(pdfPCell8);
	         	       pdfPTable.addCell(pdfPCell9);
	         	        pdfPTable.addCell(pdfPCell10);
	         	       pdfPTable.addCell(pdfPCell11);
	         	        pdfPTable.addCell(pdfPCell12);
	         	       pdfPTable.addCell(pdfPCell13);
	         	        pdfPTable.addCell(pdfPCell14);
	         	        
	         	       //Add content to the document using Table objects.
	         	        document.add(pdfPTable);
	         			
	         	       //Close document and outputStream.
	         	        document.close();
	         	       
	         	        System.out.println("Pdf created successfully.");

	            System.out.println("Done");
	         
	        } catch (Exception e) {
	            e.printStackTrace();
	        } 

	    }


}
