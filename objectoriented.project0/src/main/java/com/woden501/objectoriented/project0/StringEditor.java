package com.woden501.objectoriented.project0;

import java.util.HashMap;
import java.util.Stack;

public class StringEditor {
	private final HashMap<String, iCommand> commandMap = new HashMap<>();
	
	private Stack<iCommand> undoStack = new Stack<iCommand>();
	private Stack<iCommand> redoStack = new Stack<iCommand>();
	
	public void register(String commandName, iCommand command) {
		commandMap.put(commandName, command);
	}
	
	public void execute(String commandName) {
		iCommand command = commandMap.get(commandName);
		if (command == null) {
			throw new IllegalStateException("No command registred for " + commandName);
		}
		
		redoStack.clear();
		
		command.execute();
		
		undoStack.push(command);
	}
	
	public void undo() {
		if (undoStack.size() <= 0)
			return;
		
		undoStack.peek().undo();
		redoStack.push(undoStack.peek());
		undoStack.pop();
	}
	
	public void redo() {
		if (redoStack.size() <= 0)
			return;
		
		redoStack.peek().redo();
		undoStack.push(redoStack.peek());
		redoStack.pop();
	}
}
