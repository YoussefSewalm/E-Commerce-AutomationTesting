package org.sample.TestingEcommerce;

import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;


public class ReadDataFromExcel {

	public String[][] ReadRegData() throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		File file_1=new File("C:\\Users\\giga\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook Workbook_1=new XSSFWorkbook(file_1);		
		XSSFSheet RegDataSheet=Workbook_1.getSheet("RegisterPage");
		int number_of_rows=RegDataSheet.getPhysicalNumberOfRows();	
		int number_of_columns=RegDataSheet.getRow(0).getLastCellNum();
		String[][]reg_data=new String[number_of_rows-1][number_of_columns];	
		for(int i=1;i<number_of_rows;i++)
		{
			for(int j=0;j<number_of_columns;j++)
			{
				//
				XSSFRow Row=RegDataSheet.getRow(i);
				reg_data[i-1][j]=Row.getCell(j).toString();
			}
		}	
		return reg_data;
	}
	public String[][] ReadLoginData() throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		File file_1=new File("C:\\Users\\giga\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook Workbook_1=new XSSFWorkbook(file_1);
		XSSFSheet LoginSheet=Workbook_1.getSheet("ToLogin");
		int number_of_rows=LoginSheet.getPhysicalNumberOfRows();
		int number_of_columns=LoginSheet.getRow(0).getLastCellNum();
		String[][]login_data=new String[number_of_rows-1][number_of_columns];
		for(int i=1;i<number_of_rows;i++)
		{
			for(int j=0;j<number_of_columns;j++)
			{	
				XSSFRow Row=LoginSheet.getRow(i);
				login_data[i-1][j]=Row.getCell(j).toString();
			}
		}		
		return login_data;
	}
	public String[][] ReadMainLoginData() throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		File file_1=new File("C:\\Users\\giga\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook Workbook_1=new XSSFWorkbook(file_1);
		XSSFSheet MainLoginSheet=Workbook_1.getSheet("ValidLoginAndLogout");
		int number_of_rows=MainLoginSheet.getPhysicalNumberOfRows();
		int number_of_columns=MainLoginSheet.getRow(0).getLastCellNum();
		String[][]mainlogin_data=new String[number_of_rows-1][number_of_columns];
		for(int i=1;i<number_of_rows;i++)
		{
			for(int j=0;j<number_of_columns;j++)
			{	
				XSSFRow Row=MainLoginSheet.getRow(i);
				mainlogin_data[i-1][j]=Row.getCell(j).toString();
			}
		}		
		return mainlogin_data;
	}
	public String[][] ReadValidRegisterData() throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		File file_1=new File("C:\\Users\\giga\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook Workbook_1=new XSSFWorkbook(file_1);
		XSSFSheet ValidRegSheet=Workbook_1.getSheet("ValidRegisterWithNewEmail");
		int number_of_rows=ValidRegSheet.getPhysicalNumberOfRows();
		int number_of_columns=ValidRegSheet.getRow(0).getLastCellNum();
		String[][]validreg_data=new String[number_of_rows-1][number_of_columns];
		for(int i=1;i<number_of_rows;i++)
		{
			for(int j=0;j<number_of_columns;j++)
			{	
				XSSFRow Row=ValidRegSheet.getRow(i);
				validreg_data[i-1][j]=Row.getCell(j).toString();
			}
		}		
		return validreg_data;
	}
	public String[][] ReadInvalidRegisterData() throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		File file_1=new File("C:\\Users\\giga\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook Workbook_1=new XSSFWorkbook(file_1);
		XSSFSheet InvalidRegSheet=Workbook_1.getSheet("InvalidRegisterUsedEmail");
		int number_of_rows=InvalidRegSheet.getPhysicalNumberOfRows();
		int number_of_columns=InvalidRegSheet.getRow(0).getLastCellNum();
		String[][]invalidreg_data=new String[number_of_rows-1][number_of_columns];
		for(int i=1;i<number_of_rows;i++)
		{
			for(int j=0;j<number_of_columns;j++)
			{	
				XSSFRow Row=InvalidRegSheet.getRow(i);
				invalidreg_data[i-1][j]=Row.getCell(j).toString();
			}
		}		
		return invalidreg_data;
	}
	public String[][] ReadInvalidLoginData() throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		File file_1=new File("C:\\Users\\giga\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook Workbook_1=new XSSFWorkbook(file_1);
		XSSFSheet InvalidLoginSheet=Workbook_1.getSheet("InvalidLoginData");
		int number_of_rows=InvalidLoginSheet.getPhysicalNumberOfRows();
		int number_of_columns=InvalidLoginSheet.getRow(0).getLastCellNum();
		String[][]invalidlogin_data=new String[number_of_rows-1][number_of_columns];
		for(int i=1;i<number_of_rows;i++)
		{
			for(int j=0;j<number_of_columns;j++)
			{	
				XSSFRow Row=InvalidLoginSheet.getRow(i);
				invalidlogin_data[i-1][j]=Row.getCell(j).toString();
			}
		}		
		return invalidlogin_data;
	}
	public String[][] ReadPaymentAfterRegData_1() throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		File file_1=new File("C:\\Users\\giga\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook Workbook_1=new XSSFWorkbook(file_1);
		XSSFSheet PaymentAfterLoginSheet=Workbook_1.getSheet("AfterRegisterPayment_1");
		int number_of_rows=PaymentAfterLoginSheet.getPhysicalNumberOfRows();
		int number_of_columns=PaymentAfterLoginSheet.getRow(0).getLastCellNum();
		String[][]paymentafterlogin_data_1=new String[number_of_rows-1][number_of_columns];
		for(int i=1;i<number_of_rows;i++)
		{
			for(int j=0;j<number_of_columns;j++)
			{	
				XSSFRow Row=PaymentAfterLoginSheet.getRow(i);
				paymentafterlogin_data_1[i-1][j]=Row.getCell(j).toString();
			}
		}		
		return paymentafterlogin_data_1;
	}
	public String[][] ReadPaymentAfterRegData_2() throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		File file_1=new File("C:\\Users\\giga\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook Workbook_1=new XSSFWorkbook(file_1);
		XSSFSheet PaymentAfterLoginSheet_2=Workbook_1.getSheet("AfterRegisterPayment_2");
		int number_of_rows=PaymentAfterLoginSheet_2.getPhysicalNumberOfRows();
		int number_of_columns=PaymentAfterLoginSheet_2.getRow(0).getLastCellNum();
		String[][]paymentafterlogin_data_2=new String[number_of_rows-1][number_of_columns];
		for(int i=1;i<number_of_rows;i++)
		{
			for(int j=0;j<number_of_columns;j++)
			{	
				XSSFRow Row=PaymentAfterLoginSheet_2.getRow(i);
				paymentafterlogin_data_2[i-1][j]=Row.getCell(j).toString();
			}
		}		
		return paymentafterlogin_data_2;
	}
	public String[][] ReadPaymentAfterRegData_3() throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		File file_1=new File("C:\\Users\\giga\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook Workbook_1=new XSSFWorkbook(file_1);
		XSSFSheet PaymentAfterLoginSheet_3=Workbook_1.getSheet("AfterRegisterPayment_3");
		int number_of_rows=PaymentAfterLoginSheet_3.getPhysicalNumberOfRows();
		int number_of_columns=PaymentAfterLoginSheet_3.getRow(0).getLastCellNum();
		String[][]paymentafterlogin_data_3=new String[number_of_rows-1][number_of_columns];
		for(int i=1;i<number_of_rows;i++)
		{
			for(int j=0;j<number_of_columns;j++)
			{	
				XSSFRow Row=PaymentAfterLoginSheet_3.getRow(i);
				paymentafterlogin_data_3[i-1][j]=Row.getCell(j).toString();
			}
		}		
		return paymentafterlogin_data_3;
	}
	public String[][] ReadPaymentAlreadyLogin() throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		File file_1=new File("C:\\Users\\giga\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook Workbook_1=new XSSFWorkbook(file_1);
		XSSFSheet PaymentAlreadyLoginSheet=Workbook_1.getSheet("AlreadyLoginPayment");
		int number_of_rows=PaymentAlreadyLoginSheet.getPhysicalNumberOfRows();
		int number_of_columns=PaymentAlreadyLoginSheet.getRow(0).getLastCellNum();
		String[][]paymentalreadylogin=new String[number_of_rows-1][number_of_columns];
		for(int i=1;i<number_of_rows;i++)
		{
			for(int j=0;j<number_of_columns;j++)
			{	
				XSSFRow Row=PaymentAlreadyLoginSheet.getRow(i);
				paymentalreadylogin[i-1][j]=Row.getCell(j).toString();
			}
		}		
		return paymentalreadylogin;
	}
	public String[][] ReadReviewContent() throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		File file_1=new File("C:\\Users\\giga\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook Workbook_1=new XSSFWorkbook(file_1);
		XSSFSheet ReviewContentSheet=Workbook_1.getSheet("ReviewData");
		int number_of_rows=ReviewContentSheet.getPhysicalNumberOfRows();
		int number_of_columns=ReviewContentSheet.getRow(0).getLastCellNum();
		String[][]reviewcontent=new String[number_of_rows-1][number_of_columns];
		for(int i=1;i<number_of_rows;i++)
		{
			for(int j=0;j<number_of_columns;j++)
			{	
				XSSFRow Row=ReviewContentSheet.getRow(i);
				reviewcontent[i-1][j]=Row.getCell(j).toString();
			}
		}		
		return reviewcontent;
	}
	public String[][] ReadContactUsContent() throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		File file_1=new File("C:\\Users\\giga\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook Workbook_1=new XSSFWorkbook(file_1);
		XSSFSheet ContactUsSheet=Workbook_1.getSheet("ContactUs");
		int number_of_rows=ContactUsSheet.getPhysicalNumberOfRows();
		int number_of_columns=ContactUsSheet.getRow(0).getLastCellNum();
		String[][]contactus=new String[number_of_rows-1][number_of_columns];
		for(int i=1;i<number_of_rows;i++)
		{
			for(int j=0;j<number_of_columns;j++)
			{	
				XSSFRow Row=ContactUsSheet.getRow(i);
				contactus[i-1][j]=Row.getCell(j).toString();
			}
		}		
		return contactus;
	}
}
