package com.example.product_management.DpApply.Report.STR;

public class ShareReportAction implements ReportActionStrategy {
    @Override
    public void execute(String fileName) {
        System.out.println("Sharing report: " + fileName);
    }
}