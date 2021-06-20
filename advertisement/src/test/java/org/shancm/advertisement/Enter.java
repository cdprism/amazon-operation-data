package org.shancm.advertisement;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.shancm.advertisement.domain.entity.TermReport;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/**
 * @Classname Enter
 * @Description TODO
 * @Date 2021/6/3 8:56
 * @Created by S.cm
 */
public class Enter {

    public static final String TERM_REPORT = "Sponsored Products Search term report";
    public static final String PRODUCT_REPORT = "a";
    public static final String PLACEMENT_REPORT = "Sponsored Products Placement report";
    public static final String PURCHASE_REPORT = "d";
    public static final String TERM_SHARE_REPORT = "Sponsored Products Search Term Impression Share report";

    public static void main(String[] args) throws IOException {


//  读取文件
//        1.读取以**开头的文件
//        2.校验表头
//        3.记录数据
//  保存数据库
//        1.校验是否存在 若存在 则不保存

//        读取目录下所有文件
        File dir = new File("C:\\Users\\S.cm\\Desktop\\1");
        File[] subFiles = dir.listFiles();

        assert subFiles != null;
        /*if(list.length==0){
            System.out.println("dir is empty, program is done");
            System.exit(0);
        }*/

        for (File file : subFiles) {
            System.out.println(file.getName());
//            InputStream is = new FileInputStream(s);
//            analyseReport(s);
            analyseExcel(file);
        }

    }

    private static final String XLS = "xls";
    private static final String XLSX = "xlsx";

    /**
     * 根据文件后缀名类型获取对应的工作簿对象
     *
     * @param inputStream 读取文件的输入流
     * @param file        文件名
     * @return 包含文件数据的工作簿对象
     * @throws IOException
     */
    public static Workbook getWorkbook(InputStream inputStream, String file) throws IOException {
        Workbook workbook = null;
        /*if (file.endsWith(XLS)) {
            workbook = new HSSFWorkbook(inputStream);
        } else if (file.endsWith(XLSX)) {
            workbook = new XSSFWorkbook(inputStream);
        }*/
        if (file.endsWith(XLSX)) {
            workbook = new XSSFWorkbook(inputStream);
        } else {
            workbook = new HSSFWorkbook(inputStream);
        }

        return workbook;
    }

    public static void analyseReport(String fileName) {
        switch (fileName) {
            case TERM_REPORT:
                termAnalyse();
                break;
//            case PRODUCT_REPORT:
//                productAnalyse();
//                break;
//            case PLACEMENT_REPORT:
//                placementAnalyse();
//                break;
//            case PURCHASE_REPORT:
//                purchaseAnalyse();
//                break;
//            case TERM_SHARE_REPORT:
//                termShareAnalyse();
//                break;
            default:
                System.out.println(fileName + " can't match any fileType");
        }
    }


    public static void termAnalyse() {

    }

//    public static void productAnalyse() {
//
//    }
//
//    public static void placementAnalyse() {
//
//    }
//
//    public static void purchaseAnalyse() {
//
//    }
//
//    public static void termShareAnalyse() {
//
//    }

    //todo try-with-resources jdk 11
    public static void analyseExcel(File file) throws IOException {

        //判断是否是CSV
        if(file.getName().endsWith("csv")){
            System.out.println(file.getName());
        }

        InputStream is = new FileInputStream(file);
        Workbook workbook = getWorkbook(is, file.getName());

        Sheet sheet = workbook.getSheetAt(0);

        // 获取最大行数
        int rows = sheet.getPhysicalNumberOfRows();
        Row head = sheet.getRow(0);

        if (Objects.isNull(head)) {
            System.out.println("head is empty");
            System.exit(0);
        }

        // 获取最大列数
        int columns = head.getPhysicalNumberOfCells();

        //todo 校验行 ！！！！main方法读取解析 存为list 写死

        //按行读取数据 判断是否有数据
        if (rows < 1) {
            System.out.println("content is empty");
            System.exit(0);
        }

        //term report
        TermReport termReport;

        for (int i = 1; i < rows; i++) {
            Row row = sheet.getRow(i);
            termReport = new TermReport();
            for (int j = 0; j < columns; j++) {


                Cell cell = row.getCell(j);
                String value = cell.getStringCellValue();

                System.out.println(value);

            }
        }


    }

}
