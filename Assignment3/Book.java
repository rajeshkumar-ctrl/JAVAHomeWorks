//package book;
class Book {
  
  private String title_book;
  private String author_book;
  private int YearofPublishment;
  private int NumberofPages;

  private boolean canBeBorrowed;

              private boolean isNullOrEmpty(String str) 
              {
                if(str == null || str.isEmpty()) 
                {
                  return true;
                }
                return false;
              }

  Book(String title_book, String author_book, int YearofPublishment, int NumberofPages, boolean canBeBorrowed) 
  {
    if(!isNullOrEmpty(title_book) && !isNullOrEmpty(author_book)) 
    {
      this.title_book = title_book;
      this.author_book = author_book;
      this.YearofPublishment = YearofPublishment;
      this.NumberofPages = NumberofPages;
      this.canBeBorrowed = canBeBorrowed;
    } 
    
    else 
    {
      throw new RuntimeException("GETTING RUNTIME ERROR 404!");
    }

  }

  public String toString() 
  {
    String bookData = "title_book: " + title_book + "\n" + "author_book: " + author_book + "\n" +  "published year: "  + String.valueOf(YearofPublishment) + "\n" +
      "number of pages: " + String.valueOf(NumberofPages) + "\n" + "can be borrowed: " + String.valueOf(canBeBorrowed);
      return bookData;

  }
  
  public boolean sameAs(Book book) 
  {
    final boolean areSame = book.title_book.equals(this.title_book) && book.author_book.equals(this.author_book) && this.YearofPublishment == book.YearofPublishment && this.NumberofPages == book.NumberofPages ? true : false; // got this thing by first quiz
    return areSame;
  }
}
