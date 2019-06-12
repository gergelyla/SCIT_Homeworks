package LibraryApp;

public class Books {

    private String typeBook;
    private String nameBook;
    private int nrOfPagesBook;
    //private Novels typeNovel;
    //private Albums qualityOfPages;

    public Books() {
        this.typeBook = "";
        this.nameBook = "";
        this.nrOfPagesBook = 0;
    }

    public Books(String nameBookValue, int nrOfPagesBookValue) {
        //this.typeBook = typeBookValue;
        this.nameBook = nameBookValue;
        this.nrOfPagesBook = nrOfPagesBookValue;
        //this.typeNovel=typeNovelValue;
        //this.qualityOfPages=qualityOfPagesValue;
    }

    public String getNameBook() {
        return "Name of book";
    }

    public int getNrOfPagesBook() {
        return 0;
    }

    public String getTypeNovel() {
        return "Novel type";
    }

    public String getQualityOfPages() {
        return "QualityOfPages";
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setNrOfPagesBook(int nrOfPagesBook) {
        this.nrOfPagesBook = nrOfPagesBook;
    }


    public static void missingField() {
        System.out.println("The field cannot remain empty!");
    }

    @Override
    public String toString() {
        return ("Title:"+getNameBook()+"| nr. of pages: "+getNrOfPagesBook()+"| type of novel: "+getTypeNovel()+"| quality of pages: "+getQualityOfPages());
    }


}
