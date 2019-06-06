package com.woden501.objectoriented.project0.commands;

import com.woden501.objectoriented.project0.CustomString;
import com.woden501.objectoriented.project0.iCommand;

public class UpperCaseLetterCommand implements iCommand{
	private final CustomString customString;
	private final int position;
	
	private String newString;
	private String oldString;
	
	public UpperCaseLetterCommand(CustomString customString, int position) {
		this.customString = customString;
		this.position = position;
	}
	
	@Override
	public void execute() {
		oldString = customString.getCustomString();
		customString.upperCaseLetter(position);
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
