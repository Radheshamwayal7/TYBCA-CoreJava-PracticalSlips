class Book {
    int Bookid;
    String Bookname;
    double Price;

    void display() {
        System.out.println(Bookid + " " + Bookname + " " + Price);
    }

    public static void main(String[] args) {
        Book[] b = new Book[5];
        
        b[0] = new Book();
        b[0].Bookid = 1;
        b[0].Bookname = "Python";
        b[0].Price = 300.00;

        b[1] = new Book();
        b[1].Bookid = 2;
        b[1].Bookname = "Java";
        b[1].Price = 500.00; 
        
        b[2] = new Book();
        b[2].Bookid = 3;
        b[2].Bookname = "C";
        b[2].Price = 200.00;

        b[3] = new Book();
        b[3].Bookid = 4;
        b[3].Bookname = "Advance C";
        b[3].Price = 250.00;

        b[4] = new Book();
        b[4].Bookid = 5;
        b[4].Bookname = "C++";
        b[4].Price = 400.00;

        System.out.println("Book Details :");

        for(int i = 0; i < 5; i++) {
            b[i].display();
        }
    }
}