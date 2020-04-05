/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protoType;

/**
 *
 * @author majid
 */
public class Book {
    private int book_id;
    private String BookName;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    @Override
    public String toString() {
        return "Book{" + "book_id=" + book_id + ", BookName=" + BookName + '}';
    }
       
}
