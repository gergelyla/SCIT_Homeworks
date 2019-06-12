package LibraryApp;

public class Novels1 extends Books{

    private String typeNovel;
    private String nameBook;
    private int nrOfPagesBook;

    public Novels1(String nameBook, int nrOfPagesBook,String typeNovel){
        this.nameBook=nameBook;
        this.nrOfPagesBook=nrOfPagesBook;
        this.typeNovel=typeNovel;
    }

    public String getTypeNovel() {
        return typeNovel;
    }

    public void setTypeNovel(String typeNovel) {
        this.typeNovel = typeNovel;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getNrOfPagesBook() {
        return nrOfPagesBook;
    }

    public void setNrOfPagesBook(int nrOfPagesBook) {this.nrOfPagesBook = nrOfPagesBook;}

    @Override
    public String toString(){
        return(getNameBook());
    }
}
