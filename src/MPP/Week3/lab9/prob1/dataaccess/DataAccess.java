package MPP.Week3.lab9.prob1.dataaccess;

import MPP.Week3.lab9.prob1.business.Book;
import MPP.Week3.lab9.prob1.business.LibraryMember;

import java.util.HashMap;



public interface DataAccess { 
	public HashMap<String, Book> readBooksMap();
	public HashMap<String,User> readUserMap();
	public HashMap<String, LibraryMember> readMemberMap();
}
