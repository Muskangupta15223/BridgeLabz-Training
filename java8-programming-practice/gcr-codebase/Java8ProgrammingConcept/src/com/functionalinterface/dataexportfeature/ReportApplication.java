package com.functionalinterface.dataexportfeature;

public class ReportApplication {

	public static void main(String args[]) {
	ReportExporter json = () ->  System.out.println("Exporting report using generic exporter");
	ReportExporter csv = () ->  System.out.println("Exporting report using CSV format");
	ReportExporter pdf = () ->  System.out.println("Exporting report using pdf format");
	
	json.export();
	json.exportToJSON();
	
	csv.export();
	csv.exportToJSON();
	
	pdf.export();
	pdf.exportToJSON();
	}
}
