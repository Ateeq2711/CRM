package com.zohocrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.dbp.pdf;
import com.zohocrm.services.PdfGenerate;

@Controller
public class pdfController {
	
	@RequestMapping("/saveBill")
	public String pdfGenerate(@ModelAttribute("pdf") pdf pdf ) {
		PdfGenerate pd=new PdfGenerate();
		pd.writeUsingIText(pdf.getFirstName(),pdf.getLastName(),pdf.getEmail(),pdf.getMobile(),pdf.getProduct(),pdf.getAmount());
		
		
		return "pdfgenerated";
	}

	
	
}
