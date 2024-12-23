package com;

public class UseDataType {
	
	public int areaRectangel() {
		
		int length = 70;
		int width = 40;
		int area = 0;
		
		area = length * width;
		
		System.out.println("area="+area);
		return area;
		
	}
	
	public void areaTraingle() {
		
	}

	public static void main(String[] args) {
		UseDataType u = new UseDataType();
		u.areaRectangel();
		int Area_Rect = u.areaRectangel();
		System.out.println("Area_Rect="+Area_Rect);
	}

}
