package com.techlab.tes;

import java.util.ArrayList;
import java.util.List;

public class Folder implements StorageItem{
	
	private String name;
	private List<StorageItem> children; 
	
	
	public Folder(String name) {
		this.name = name;
		children = new ArrayList<StorageItem>();
	}
	
	public void addChild(StorageItem item) {
		children.add(item);
	}
	public String getFolderName() {
		return name;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
//		List<File> files = new ArrayList<File>();
//		List<Folder> folders = new ArrayList<Folder>();
//		for(StorageItem child:children) {
//			if(child instanceof Folder) {
//				folders.add((Folder)child);
//			}
//			else {			
//			
//				files.add((File)child);
//			}
//		}
		System.out.println(name);
		for(StorageItem child:children) {
			child.display();
		}
		
	}

}
