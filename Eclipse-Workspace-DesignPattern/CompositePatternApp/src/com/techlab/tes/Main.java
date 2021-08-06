package com.techlab.tes;

public class Main {
	public static void main(String[] args) {
		
		Folder root = new Folder("Movies");
		root.addChild(new File("Saga",45,".pem"));
		
		Folder scaryMovies = new Folder("Scary");
		scaryMovies.addChild(new File("Twilight",50,".mp4"));
		scaryMovies.addChild(new File("American Pyscho",100,".mp4"));
		scaryMovies.addChild(new File("It's all alive",10,".mp3"));
		scaryMovies.addChild(new File("Wrong Turn",50,".mp4"));
		
		root.addChild(scaryMovies);
		
		root.display();
		
	}
}
