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
//First Step: b2olo e3mly open l file l excel 2ly ana 3malto w maleh b data
		File file_1=new File("C:\\Users\\giga\\Desktop\\DataDriven.xlsx");
//Second step: b2olo eft7ly l Workbook bta3 l excel dh 3shan a3rf 3any kam sheets w details l file 3shan mno
//h3ml access ll sheets wl rows
		XSSFWorkbook Workbook_1=new XSSFWorkbook(file_1);
//Third Step: h3ml access b2a ll sheet 2ly 3ayzha w edeto esm l Page mn excel 2ly ana 3amlo "RegisterPage" 		
		XSSFSheet RegDataSheet=Workbook_1.getSheet("RegisterPage");
//Fourth Step: haro7 ashof 3andy kam Row fl sheet dh "RegisterPage"::Remember awl row 5als 3andy mogarad titles
//Msh Data f 3shan keda hashel l row dh lma agy ab3at w hnshof l klam dh
		int number_of_rows=RegDataSheet.getPhysicalNumberOfRows();
//Fifth Step: Haro7 ashof 3andy kam Column fl Sheet dh 		
		int number_of_columns=RegDataSheet.getRow(0).getLastCellNum();
//Sixth Step: hbd2 a3ml l array 2ly hystlm l data deh mn l Excel..hla2y hena 3mlt rows-1 w dh 3shan zy m2olt
// awl Row 3andy dh Titles msh Data 3shan keda msh bb3to
		String[][]reg_data=new String[number_of_rows-1][number_of_columns];
//Final Step hbd2 a3ml loop b2a fl sheet kolo w a7ot l data fl array		
		for(int i=1;i<number_of_rows;i++)//bda2t i=1 msh b 0 l2n l func bta3t GetRow 2ly ta7t bta5od l i 
			//w ana fl excel awl row 3andy 1 msh 0 f 3`asb 3any lazm abd2 l i b 1
			//f 3shan keda zbatha reg_data[i-1][j] 3shan awl element m3ya yb2a reg_data[0][0]
		{
			for(int j=0;j<number_of_columns;j++)
			{
				//
				XSSFRow Row=RegDataSheet.getRow(i);//3malt access ll rows mn l sheet 2ly ana 3mlto
				reg_data[i-1][j]=Row.getCell(j).toString();//5adt l data b3d m gebt row mo3yna w gebt cell mo3yna feh
			// W lazem a7wl l data bta3ty l String [nafs l no3 2ly l data m7tagah 2ly hwa ana kont hb3tha 
				//manual 3ady h5leha nafs l data type deh
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
