package zad3;

import zad1.Product;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("кольца", "А", 150, 2011, 3);
        Book book2 = new Book("ролан", "Рамон.Ф.Г", 230, 2013, 7);
        Book book3 = new Book("ватон", "Джоню.А.В.", 150, 2007, 121);
        Book book4 = new Book("олган", "Аоронг.", 150, 2011, 121);
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        for (int i = 0; i < bookList.size(); i++){
            if (bookList.get(i).getNameAuthor().contains("А") && bookList.get(i).getYear()>2010){
                if (bookList.get(i).getPage()==2 | bookList.get(i).getPage()==3 | bookList.get(i).getPage()==2 | bookList.get(i).getPage()==5){
                    System.out.println(bookList.get(i).getNameBook());
                } else if (bookList.get(i).getPage()%2!=0 && bookList.get(i).getPage()%3!=0 && bookList.get(i).getPage()==2 | bookList.get(i).getPage()%5!=0) {
                    System.out.println(bookList.get(i).getNameBook());
                }

            }
            }
        }
    }

