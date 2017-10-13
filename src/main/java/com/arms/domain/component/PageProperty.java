package com.arms.domain.component;

public class PageProperty {
	
	public static final int MAX_DISPLAY_PAGES = 5;
	
	private int start;
	private int end;
	
	
	public PageProperty(int current, int totalPages) {
		int index = MAX_DISPLAY_PAGES - 1;
		if(current - index < 0 ){
			this.start = 0;
			this.end = totalPages-1;
		} else if (totalPages - current <= index){
			this.start = totalPages - MAX_DISPLAY_PAGES;
			this.end = totalPages - 1;
		} else {
			this.start = current - index/2;
			this.end = current + index/2;
		}
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	
}
