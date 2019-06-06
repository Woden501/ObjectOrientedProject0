package com.woden501.objectoriented.project0.commands;

import com.woden501.objectoriented.project0.CustomString;
import com.woden501.objectoriented.project0.iCommand;

public class AppendLetterCommand implements iCommand {
	private final CustomString customString;
	private final String letter;
	
	private String newString;
	private String oldString;
	
	public AppendLetterCommand(CustomString customString, String letter) {
		this.customString = customString;
		this.letter = letter;
	}
	
	@Override
	public void execute() {
		oldString = customString.getCustomString();
		customString.appendLetter(letter);
		newString = customString.getCustomString();
	}
	
	@Override
	public void undo() {
		customString.setCustomString(oldString);
	}
	
	@Override
	public void redo() {
		customString.setCustomString(newString);
	}
}
