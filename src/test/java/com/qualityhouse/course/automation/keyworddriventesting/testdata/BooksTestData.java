package com.qualityhouse.course.automation.keyworddriventesting.testdata;

import java.util.Hashtable;

public class BooksTestData {

    private static Hashtable<String, String> booksCategories = new Hashtable<String, String>();

    private static Hashtable<String, String[]> books = new Hashtable<String, String[]>();

    static {
        /* list all books' categories */
        booksCategories.put("Art", "books-art");
        booksCategories.put("Biographies", "books-biographies");
        booksCategories.put("Children’s books", "books-childrens");
        booksCategories.put("Finance", "books-finance");
        booksCategories.put("Computers", "books-computers");
        booksCategories.put("Cooking, food & wine", "books-cooking-food-wine");
        booksCategories.put("Entertainment", "books-entertainment");
        booksCategories.put("Mind & body", "books-mind-body");
        booksCategories.put("History", "books-history");
        booksCategories.put("Hobbies", "books-hobbies");
        booksCategories.put("Home & garden", "books-home-garden");
        booksCategories.put("Horror", "books-horror");
        booksCategories.put("Literature & fiction", "books-literature-fiction");
        booksCategories.put("Mystery & thrillers", "books-mystery-thrillers");
        booksCategories.put("Non-fiction", "books-non-fiction");
        booksCategories.put("Professional & technical", "books-professional-technical");
        booksCategories.put("Reference", "books-reference");
        booksCategories.put("Religion & spirituality", "books-religion-spirituality");
        booksCategories.put("Sports & outdoors", "books-sports-outdoors");
        booksCategories.put("Travel", "books-travel");
        booksCategories.put("Science & nature", "books-science-nature");
        booksCategories.put("Science fiction", "books-science-fiction");

        /* list all books */
        books.put("Autumn Colors", new String[] {"Art","Diana Jones", "Nature Books Ltd.", "55134124", "12.99", "6"});
        books.put("Yellow Flower Songs", new String[] {"Children’s books","Lilly Penny", "Little World", "622513423", "4.99", "8"});
        books.put("Agile Technologies", new String[] {"Computers","William Nelson", "Bit", "5628423724", "23.49", "12"});
    }

    /* list of books' categories actions */

    public static String getBooksCategoryURLParameter(String category) { return booksCategories.get(category); };

    /* list of books' actions */

    public static String getBookCategory(String title) { return books.get(title)[0]; }

    public static String getBookAuthor(String title) { return books.get(title)[1]; }

    public static String getBookPublisher(String title) { return books.get(title)[2]; }

    public static String getBookISBN(String title) { return books.get(title)[3]; }

    public static String getBookPrice(String title) { return books.get(title)[4]; }

    public static String getBookProductId(String title) { return books.get(title)[5]; }

}
