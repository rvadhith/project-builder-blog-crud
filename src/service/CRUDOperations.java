package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Blog;

public class CRUDOperations {
	static List<Blog> blogCRUD = new ArrayList<Blog>(); // Store the blog in the list
	
	public List<Blog> addBlog(Blog blog) throws IOException {
		blogCRUD.add(blog);
		return blogCRUD;
	}
	
	public List<Blog> viewBlog(Blog blog) throws IOException{
		return blogCRUD;		
	}
}
