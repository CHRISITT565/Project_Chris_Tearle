import java.lang.Object;

public class BOOK {
    private String title;
    private int pageNum;
    private float price;
    private String isbn;

    public BOOK(){
        this("unknown","Unknown",0,0.0f);
    }

    public BOOK(String title, String isbn,int pageNum, Float price)
    {
        setTitle("Unknown");
        setIsbn("Unknown");
        setPageNum(0);
        setPrice(0.0f);

    }
    public void setTitle(String Title)
    {
        this.title=Title;
    }

    public void setIsbn(String Isbn) {


        this.isbn = Isbn;
    }




    public void setPageNum(int PageNum)
    {
        this.pageNum=PageNum;
    }

    public void setPrice(float Price)
    {
        this.price=Price;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public float getPrice() {
        return price;
    }

    public int getPageNum() {
        return pageNum;
    }

    public String toString(){
        return String.format("Title " + getTitle() +
                " ISBN  " + getIsbn() + " No Of Pages " + getPageNum() +  " €" +getPrice() + "\n");
    }
}
