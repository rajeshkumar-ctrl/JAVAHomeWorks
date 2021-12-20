//package book;

class BookMain {
  public static void main(String [] args) {
   
    Book FirstBook = new Book("Peace and War", "Tolstoi", 1865, 1600, false);
    Book SecondBook = new Book("Manga", "J. Koko", 1920, 300, true);
    Book ThirdBook = new Book("Peace and War", "Tolstoi", 1865, 1600, true);
   
    System.out.println(FirstBook.toString());
   
  
  
  }
}
