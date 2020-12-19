package demonew;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class CMDexecute {

	public static void main(String[] args) {
		
		String val = new String();
		try {
		ProcessBuilder processBuilder = new ProcessBuilder("C:\\Users\\Shikha Kumari\\Desktop\\chromebrowserversion.bat");
		Process process = processBuilder.start();
		
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()));	
        String line = null;
        
        for (int i = 0; i <10; i++) {
        	line=reader.readLine();
        	if(i==8) {
        		String[] st = line.split("    ");
        		val = st[3];
        		break;
        	}
        	
		}
        System.out.println(val);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
