/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protoType;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author majid
 */
public class BookShop implements Cloneable{
    private String shop_name;
    private List<Book> books = new ArrayList();

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
    public void loadData(){
        for (int i=1;i<=10;i++){
            Book b = new Book();
            b.setBookName("Book "+i);
            b.setBook_id(i);
            books.add(b);
        }
    }

    @Override
    public String toString() {
        return "shop_name=" + shop_name + ", books=" + books + '\n';
    }

    @Override
    @SuppressWarnings("CloneDoesntCallSuperClone")
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bshp= new BookShop();
        this.getBooks().stream().forEach((b) -> {
            bshp.books.add(b);
        });
        return bshp;
        
    }
    
    
}
