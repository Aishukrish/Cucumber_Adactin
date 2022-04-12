package com.Configuration.helper;

import java.io.IOException;

public class File_Reader_Manager {
	private File_Reader_Manager() {
	}
	public static File_Reader_Manager get_Instance_frm()
	{
		File_Reader_Manager frm= new File_Reader_Manager();
		return frm;
	}
	public Configuration_Reader get_Instance_CR() throws IOException
	{
		Configuration_Reader  reader= new Configuration_Reader();
		return reader;
		
	}
}
