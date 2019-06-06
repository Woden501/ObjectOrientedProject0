package com.woden501.objectoriented.project0.commands;

import com.woden501.objectoriented.project0.CustomString;
import com.woden501.objectoriented.project0.iCommand;

public class TitleCaseStringCommand implements iCommand{
	private final CustomString customString;
	
	private String newString;
	private String oldString;
	
	public TitleCaseStringCommand(CustomString customString) {
		this.customString = customString;
	}
	
	@Override
	public void execute() {
		oldString = customString.getCustomString();
		customString.titleCaseString();
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
