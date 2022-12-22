package day50;

import java.io.File;

public class AbsVsRelativePath {
	public static void main(String[] args) {
		
	//Absolute file path is a path from root directory to your specific fi
jFile myNotes = new File("/Users/thanyaratsaengsing/eclipse-workspace/sdet-java-b7/src/day50/notes.txt");
	System.out.println("file exists: " + myNotes.exists()); //file exists: true
	System.out.println(myNotes.getAbsolutePath()); ///Users/thanyaratsaengsing/eclipse-workspace/sdet-java-b7/src/day50/notes.txt
	
	//Relative file path is a path from the place where code is running to your specific file
	File myNotesRelativePath = new File("src/day50/notes.txt");
	System.out.println("file exists: " + myNotesRelativePath.exists());
<<<<<<< HEAD
	System.out.println(myNotesRelativePath.getAbsolutePath());fgdfgdfg
fdgdfadfgfdagadf
        System.out.println("person 2 added new line")	
=======
	System.out.println(myNotesRelativePath.getAbsolutePath());
		
		System.out.println("Mohammad did")
>>>>>>> d1a08731f398543ba8d5f282c421cae74f64acfe
	}
}
