package model;

public class Book {

String id,nameBook, nameAuthor, nameCompany, sPrice;

public Book(String id, String nameBook, String nameAuthor, String nameCompany, String sPrice) {
	super();
	this.id = id;
	this.nameBook = nameBook;
	this.nameAuthor = nameAuthor;
	this.nameCompany = nameCompany;
	this.sPrice = sPrice;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getNameBook() {
	return nameBook;
}

public void setNameBook(String nameBook) {
	this.nameBook = nameBook;
}

public String getNameAuthor() {
	return nameAuthor;
}

public void setNameAuthor(String nameAuthor) {
	this.nameAuthor = nameAuthor;
}

public String getNameCompany() {
	return nameCompany;
}

public void setNameCompany(String nameCompany) {
	this.nameCompany = nameCompany;
}

public String getsPrice() {
	return sPrice;
}

public void setsPrice(String sPrice) {
	this.sPrice = sPrice;
}

}
