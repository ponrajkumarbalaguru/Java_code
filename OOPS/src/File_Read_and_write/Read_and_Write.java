package File_Read_and_write;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read_and_Write 
{

	public static void main(String[] args)throws Exception
	{
		FileInputStream fos = null;
		int track;
		
		try 
		{
			fos = new FileInputStream("ponraj.txt");
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		try
		{
			do 
			{
				track=fos.read();
				System.out.print((char)track);
			}while(track!=-1);
		}catch(IOException e) {
			System.out.println("Cannot Read File");
		}
	}
	
}
