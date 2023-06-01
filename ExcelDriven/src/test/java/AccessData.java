import java.io.IOException;
import java.util.ArrayList;

public class AccessData {

	public static void main(String[] args) throws IOException 
	{

       testExcel e=new testExcel();
        ArrayList storeValue = e.DataDrive("Sale");
        System.out.println(storeValue.get(0));
        System.out.println(storeValue.get(1));
        System.out.println(storeValue.get(2));
        System.out.println(storeValue.get(3));
	}

}
