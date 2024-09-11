package excel;

import java.io.IOException;

public class ExcelRead {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		{
			String s = ExcelReadSub.readStringdata(1,0);
			System.out.println(s);
			String s1 = ExcelReadSub.readIntigerData(1,1);
			System.out.println(s1);

		}

	}

}
