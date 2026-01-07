package com.BookBazar;

class EBook extends Book implements IDiscountable {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }
    @Override
    public double applyDiscount(int quantity) {
        return price * quantity * 0.20; 
    }
}
