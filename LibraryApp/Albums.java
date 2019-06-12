package LibraryApp;

public class Albums extends Books {
    private String nameBook;
    int nrOfPagesBook;
    private String qualityOfPages;

    public Albums(String nameBook, int nrOfPagesBook,String qualityOfPages){
        this.nameBook=nameBook;
        this.nrOfPagesBook=nrOfPagesBook;
        this.qualityOfPages=qualityOfPages;
    }

    public String getQualityOfPages() {
        return qualityOfPages;
    }

    public void setQualityOfPages(String qualityOfPages) { this.qualityOfPages = qualityOfPages; }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getNrOfPagesBook() {
        return nrOfPagesBook;
    }

    public void setNrOfPagesBook(int nrOfPagesBook) {
        this.nrOfPagesBook = nrOfPagesBook;
    }
}
