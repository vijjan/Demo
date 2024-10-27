//package stepDefi;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.net.MalformedURLException;
//import java.util.Iterator;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;


//excel table for be;wp test
//    	testcase		uname	upass
//		normal user		Vijay	vpass123
//		admin user		Akash 	apass123
//		hr user		Nagesh 	npass123


//
//public class ExecelDTestingStepDef {
//
//	XSSFWorkbook book;
//	FileInputStream fis;
//	int sheets;
//	Iterator<Row> headrow;
//	int column = 0;
//
//	@Given("user on prac page")
//	public void user_on_prac_page() throws IOException {
//
//		fis = new FileInputStream("C:\\Users\\vijay\\Desktop\\Book1.xlsx");
//		book = new XSSFWorkbook(fis);
//		XSSFSheet tsheet;
//
//		Iterator<Cell> cells;
//
//		sheets = book.getNumberOfSheets();
//
//		for (int i = 0; i < sheets; i++) {
//
//			if (book.getSheetName(i).equalsIgnoreCase("sanity")) {
//				tsheet = book.getSheetAt(i);
//				System.out.println(tsheet.getFirstRowNum());
//				System.out.println(tsheet.getLastRowNum());
//				System.out.println("--------------");
//
//				headrow = tsheet.rowIterator();
//				Row row1 = headrow.next();
//
//				cells = row1.cellIterator();
//
//				int k = 0;
//
//				while (cells.hasNext()) {
//
//					Cell value = cells.next();
//
//					if (value.getStringCellValue().equalsIgnoreCase("testcase")) {
//
//						column = k;
//						System.out.println("-------------------");
//						System.out.println("column of testdata is " + column);
//						System.out.println("-----------------");
//						break;
//
//					}
//					k++;
//
//				}
//			}
//		}
//
//		
//		while (headrow.hasNext()) {
//			Row r = headrow.next();
//			if (r.getCell(column).getStringCellValue().equalsIgnoreCase("hr user")) {
//
//				Iterator<Cell> m = r.cellIterator();
//				while (m.hasNext()) {
//					Cell u = m.next();
//					System.out.println(u);
//				}
//			}
//
//		}
//
//	}
//
//	@When("click on window button")
//	public void click_on_window_button() {
//
//	}
//
//	@Then("should switch to new window")
//	public void should_switch_to_new_window() {
//
//	}
//
//}