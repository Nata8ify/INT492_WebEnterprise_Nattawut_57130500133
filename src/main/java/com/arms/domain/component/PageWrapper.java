package com.arms.domain.component;

public class PageWrapper {
	
	public static final int MAX_DISPLAY_PAGES = 7;
	
	private int start;
	private int end;
	
	
	public PageWrapper(int current, int totalPages) {
		int index = MAX_DISPLAY_PAGES - 1;
		if(totalPages < MAX_DISPLAY_PAGES){
			this.start = 0;
			this.end = totalPages-1;
			return;
		}
		
		if(current - index < 0 ){
			this.start = 0;
			this.end = index;
		} else if (totalPages - current <= index){
			this.start = totalPages - MAX_DISPLAY_PAGES;
			this.end = totalPages - 1;
		} else {
			this.start = current - index/2 - (MAX_DISPLAY_PAGES%2==0?1:0);
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
