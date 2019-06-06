package com.woden501.objectoriented.project0;

import com.woden501.objectoriented.project0.commands.AppendLetterCommand;
import com.woden501.objectoriented.project0.commands.DeleteFirstLetterCommand;
import com.woden501.objectoriented.project0.commands.DeleteLastLetterCommand;
import com.woden501.objectoriented.project0.commands.LowerCaseLetterCommand;
import com.woden501.objectoriented.project0.commands.TitleCaseStringCommand;
import com.woden501.objectoriented.project0.commands.UpperCaseLetterCommand;

public class App 
{
    public static void main( String[] args )
    {
        CustomString customString = new CustomString();
        
        iCommand appendLetter = new AppendLetterCommand(customString, "a");
        iCommand deleteFirstLetter = new DeleteFirstLetterCommand(customString);
        iCommand deleteLastLetter = new DeleteLastLetterCommand(customString);
        iCommand upperCaseLetter = new UpperCaseLetterCommand(customString, 1);
        iCommand lowerCaseLetter = new LowerCaseLetterCommand(customString, 1);
        iCommand titleCaseString = new TitleCaseStringCommand(customString);
        
        StringEditor myEditor = new StringEditor();
        myEditor.register("appendLetter", appendLetter);
        myEditor.register("deleteFirstLetter", deleteFirstLetter);
        myEditor.register("deleteLastLetter", deleteLastLetter);
        myEditor.register("upperCaseLetter", upperCaseLetter);
        myEditor.register("lowerCaseLetter", lowerCaseLetter);
        myEditor.register("titleCaseString", titleCaseString);
        
        
        System.out.println("Original String: " + customString.customString);
        System.out.println("Append \"a\" to the end of the string:");
        myEditor.execute("appendLetter");
        System.out.println("Delete the first letter of the string:");
        myEditor.execute("deleteFirstLetter");
        System.out.println("Delete the last letter of the string:");
        myEditor.execute("deleteLastLetter");
        System.out.println("Capitalize a letter of the string:");
        myEditor.execute("upperCaseLetter");
        System.out.println("Set a letter of the string to lowercase:");
        myEditor.execute("lowerCaseLetter");
        System.out.println("Set string to title case:");
        myEditor.execute("titleCaseString");
        System.out.println("Undoing all commands:");
        myEditor.undo();
        myEditor.undo();
        myEditor.undo();
        myEditor.undo();
        myEditor.undo();
        myEditor.undo();
        System.out.println("Redoing all commands:");
        myEditor.redo();
        myEditor.redo();
        myEditor.redo();
        myEditor.redo();
        myEditor.redo();
        myEditor.redo();
        System.out.println("Undoing two commands:");
        myEditor.undo();
        myEditor.undo();
        System.out.println("Making new append a commmand:");
        myEditor.execute("appendLetter");
        System.out.println("Attempting to redo previous commands:");
        myEditor.redo();
        myEditor.redo();
    }
}