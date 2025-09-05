package activities;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:/Users/004PM1744/OneDrive - IBM/My docs_One drive/Srikanth/Learning/MM/Java/newtest.txt");
		boolean fs = file.createNewFile();
		if (fs) {
			System.out.println("new file is created");
			FileUtils.writeStringToFile(file, "content written from program", Charset.defaultCharset());	
		}
		else {
			System.out.println("file exist");
		}
		System.out.println("data from file is :" + FileUtils.readFileToString(file, "UTF8"));
		
		File newdir = new File("C:/Users/004PM1744/OneDrive - IBM/My docs_One drive/Srikanth/Learning/MM");
		//copy the file created in above to code to new path mentioned in above line
		FileUtils.copyFileToDirectory(file, newdir);
		//get file from new path
		File newfile = FileUtils.getFile(newdir, "newtest.txt");
		System.out.println(newfile);
		String data = FileUtils.readFileToString(newfile, "UTF8");
		//read data from file & display
		System.out.println("content in new copied file is : " + data);
		
	}

}
