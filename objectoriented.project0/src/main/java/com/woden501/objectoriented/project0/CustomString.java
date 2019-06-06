package com.woden501.objectoriented.project0;

public class CustomString {
	String customString = "This is the string";
	
	public String getCustomString() {
		return customString;
	}

	public void setCustomString(String customString) {
		this.customString = customString;
		System.out.println(customString);
	}

	public void appendLetter(String letter) {
		customString = customString + letter;
		System.out.println(customString);
	}
	
	public void deleteFirstLetter() {
		customString = customString.substring(1);
		System.out.println(customString);
	}
	
	public void deleteLastLetter() {
		customString = customString.substring(0, customString.length() - 1);
		System.out.println(customString);
	}
	
	public void upperCaseLetter(int position) {
		if (position > 0)
			customString = customString.substring(0,position) + customString.substring(position, position + 1).toUpperCase() + customString.substring(position + 1);
		else
			customString = customString.substring(0,1).toUpperCase() + customString.substring(1);
		System.out.println(customString);
	}
	
	public void lowerCaseLetter(int position) {
		if (position > 0)
			customString = customString.substring(0,position) + customString.substring(position, position + 1).toLowerCase() + customString.substring(position + 1);
		else
			customString = customString.substring(0,1).toLowerCase() + customString.substring(1);
		System.out.println(customString);
	}
	
	public void titleCaseString() {
		StringBuilder converted = new StringBuilder();
		 
	    boolean convertNext = true;
	    for (char ch : customString.toCharArray()) {
	        if (Character.isSpaceChar(ch)) {
	            convertNext = true;
	        } else if (convertNext) {
	            ch = Character.toTitleCase(ch);
	            convertNext = false;
	        } else {
	            ch = Character.toLowerCase(ch);
	        }
	        converted.append(ch);
	    }
	    
	    customString = converted.toString();
	    
	    System.out.println(customString);
	}
}
