import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class crawler_config {

	public static Properties prop = new Properties();
	
	public void SaveProp(String EXCEL,String URL,String DBC,String LOGIN,String ex,String ur,String db,String log)
	{
		try{
			String path = new File(".").getCanonicalPath();
			System.out.println("Application path is: "+path);
			prop.setProperty(EXCEL, ex);
			
			prop.setProperty(URL, ur);
			
			prop.setProperty(DBC, db);
			prop.setProperty(LOGIN, log);
		//	String s1=String.valueOf(a); 
		
			FileOutputStream out = new FileOutputStream(""+path+"/chromedriver/configs/crawler_config.txt");
			prop.save(out,null);
			out.close();
			
		}catch(IOException e)
		{
			
		}
	}
	public String  GetProp(String Delay) throws IOException
	{
		
		String path = new File(".").getCanonicalPath();
		System.out.println("Application path is: "+path);
		String value ="";
		
		String F ="";
		String txt = "";
		try{
			FileInputStream inStream = new FileInputStream(""+path+"/chromedriver/configs/crawler_config.txt");
			prop.load(inStream);
			prop.getProperty(Delay);
			value = prop.getProperty(Delay);
	//		F = prop.getProperty(F_path);
			
		//	txt = prop.getProperty(api);
			inStream.close();
			
		}catch(IOException e)
		{
			
		}
		
		return  value;
		
		 
		
	}
	
}