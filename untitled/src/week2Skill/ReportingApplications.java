package week2Skill;

import java.util.Scanner;

interface Factory {
  String report();
}

class PdfReport implements Factory {
  public String report() {
    return "This is a PDF report";
  }
}

class ExcelReport implements Factory {
  public String report() {
    return "This is an Excel report";
  }
}

class HtmlReport implements Factory {
  public String report() {
    return "This is an HTML report";
  }
}

class ReportFactory {
  public static Factory getReport(int c) {
    switch (c) {
      case 1:
        return new PdfReport();
      case 2:
        return new ExcelReport();
      case 3:
        return new HtmlReport();
      default:
        return null; 
    }
  }
}

public class ReportingApplications {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the report type: 1 for PDF, 2 for Excel, 3 for HTML");
    int c = sc.nextInt();

    Factory obj = ReportFactory.getReport(c);
    if (obj != null) {
      System.out.println(obj.report());
    } else {
      System.out.println("Invalid report type selected");
    }
    sc.close();
  }
}
