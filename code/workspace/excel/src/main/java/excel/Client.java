package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Client {
	public static void main(String[] args) throws IOException {
		String excelFilePath = "Books.xlsx";
		FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet firstSheet = workbook.getSheetAt(0);
		Iterator<Row> iterator = firstSheet.iterator();
		while (iterator.hasNext()) {
			Row nextRow = iterator.next();
			Iterator<Cell> cellIterator = nextRow.cellIterator();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				//private Object getCellValue(Cell cell) {
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				}
				System.out.println(" - ");
			}
			System.out.println();
		}
		workbook.close();
		inputStream.close();
	}
}
