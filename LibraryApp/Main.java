package LibraryApp;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        int menuCounter=0;
        ArrayList<Books> library = new ArrayList<Books>();
        while (menuCounter!=6){
            Menu();                                                                                                         //Afisare meniu aplicatie
            switch (UserInputNr()){
                case 1:                                                                                                     //Meniu de citire carte noua
                    AddNewBook(library);
                    RevenireMeniu();
                    break;
                case 2:                                                                                                     //Meniu de listare a unei carti anume
                    SearchBook(library);
                    RevenireMeniu();
                    break;
                case 3:                                                                                                     //Listare a tuturor titlurilor din aplicatie
                    ListLibrary(library);
                    RevenireMeniu();
                    break;
                case 4:                                                                                                     //Stergerea unei carti anume
                    DeleteBook(library);
                    RevenireMeniu();
                    break;
                case 5:                                                                                                     //Stergerea tuturor titlurilor din aplicatie
                    DeleteAllBooks(library);
                    RevenireMeniu();
                    break;
                case 6:                                                                                                     //Terminare aplicatie
                    menuCounter=6;
                    break;
                default:
                    System.out.println("------------------------------------------------------");
                    System.out.println("Incorrect menu option! Choose from the defined options! ");
                    System.out.println("------------------------------------------------------");
                    break;
            }
        }
    }

    private static void DeleteBook(ArrayList<Books> library) {                                                              //Stergere o carte anume
        System.out.print("Specify deleted book type (Novel/Album): ");
        switch(UserInputString()){
            case "Novel":
                System.out.print("Name book to be deleted: ");
                String searchNameNovel=UserInputString();
                for(int i=0;i<library.size();i++) {
                    Novels Name=new Novels(searchNameNovel,0,"");
                    Novels searchBook= new Novels(library.get(i).getNameBook(), library.get(i).getNrOfPagesBook(), library.get(i).getTypeNovel());
                    if (searchBook.getNameBook().equals(Name.getNameBook())){
                        System.out.println("The novel "+searchBook.getNameBook()+" will be deleted");
                        library.remove(i);
                        searchNameNovel="";
                        System.out.println("The novel has been deleted");
                    }
                }
                if(searchNameNovel!=""){
                    System.out.println ("The book "+searchNameNovel+" has not been found");
                }
                break;
            case "Album":
                System.out.print("Name book to be deleted: ");
                String searchNameAlbum=UserInputString();
                for(int i=0;i<library.size();i++) {
                    Novels Name=new Novels(searchNameAlbum,0,"");
                    Novels searchBook= new Novels(library.get(i).getNameBook(), library.get(i).getNrOfPagesBook(), library.get(i).getTypeNovel());
                    if (searchBook.getNameBook().equals(Name.getNameBook())){
                        System.out.println("The album "+searchBook.getNameBook()+" will be deleted");
                        library.remove(i);
                        searchNameAlbum="";
                        System.out.println("The album has been deleted");
                    }
                }
                if(searchNameAlbum!=""){
                    System.out.println ("The book "+searchNameAlbum+" has not been found");
                }
                break;
            default:
                System.out.println("Incorrect book type");
                break;
        }
    }

    private static void SearchBook(ArrayList<Books> library) {                                                              //Listare o carte anume
        System.out.print("Specify researched book type (Novel/Album): ");
        switch(UserInputString()){
            case "Novel":
                System.out.print("Name reaserched book: ");
                String searchNameNovel=UserInputString();
                for(int i=0;i<library.size();i++) {
                    Novels1 Name=new Novels1(searchNameNovel,0,"");
                    Novels1 searchBook= new Novels1(library.get(i).getNameBook(), library.get(i).getNrOfPagesBook(), library.get(i).getTypeNovel());
                    if (searchBook.getNameBook().equals(Name.getNameBook())){
                        System.out.println("The reaserched novel is: "+searchBook.getNameBook()+" | pages: "+searchBook.getNrOfPagesBook()+" | book type: "+searchBook.getTypeNovel());
                        searchNameNovel="";
                    }
                }
                if(searchNameNovel!=""){
                    System.out.println ("The book "+searchNameNovel+" has not been found");
                }
                break;
            case "Album":
                System.out.print("Name reaserched book: ");
                String searchNameAlbum=UserInputString();
                for(int i=0;i<library.size();i++) {
                    Albums1 Name=new Albums1(searchNameAlbum,0,"");
                    Albums1 searchBook= new Albums1(library.get(i).getNameBook(), library.get(i).getNrOfPagesBook(), library.get(i).getQualityOfPages());
                    if (searchBook.getNameBook().equals(Name.getNameBook())){
                        System.out.println("The reaserched album is: "+searchBook.getNameBook()+" | pages: "+searchBook.getNrOfPagesBook()+" | quality of pages: "+searchBook.getQualityOfPages());
                        searchNameAlbum="";
                    }
                }
                if(searchNameAlbum!=""){
                    System.out.println ("The book "+searchNameAlbum+" has not been found");
                }
                break;
            default:
                System.out.println("Incorrect book type");
                break;
        }
    }

    private static void DeleteAllBooks(ArrayList<Books> library) {                                                          //Stergere toate cartile din aplicatie
        library.clear();
        System.out.println(library);
        System.out.println("All registered books have been deleted!");
    }

    private static void AddNewBook(ArrayList<Books> library) {                                                              //Adaugare carte noua
        System.out.print("Type of new book (Novel/Album): ");                                                               //Alegere tip carte noua
        switch (UserInputString()) {
            case "Novel":                                                                                                   //Introducere roman nou
                library.add(AddNovel());
                break;
            case "Album":                                                                                                   //Introducere album nou
                library.add(AddAlbum());
                break;
            default:
                System.out.println("Incorrect book type!");
                break;
        }
    }

    private static void ListLibrary(ArrayList<Books> library) {                                                             //Listare toate cartile din aplicatie
        System.out.println("Books currently in the library:");
        System.out.println("-------------------------------");
        for(int i=0;i<library.size();i++) {
            System.out.println(library.get(i));
        }
        System.out.print("");
    }

    private static Books AddNovel() {                                                                                       //Metoda de introducere roman nou
        String novelName;
        int nrOfPages;
        String novelType;

        System.out.print("Name of new novel: ");
        novelName=UserInputString();
        System.out.print("Number of pages: ");
        nrOfPages=UserInputNr();
        System.out.print("Type of novel: ");
        novelType=UserInputString();
        Books newNovel=new Novels(novelName,nrOfPages,novelType);
        System.out.println("Newly added novel: "+newNovel.getNameBook()+" - nr. of pages: "+newNovel.getNrOfPagesBook()+" - Novel type: "+newNovel.getTypeNovel());
        return newNovel;
    }

    private static Books AddAlbum() {                                                                                       //Metoda de introducere album nou
        String albumName;
        int nrOfPages;
        String qualityOfPages;

        System.out.print("Name of new album: ");
        albumName=UserInputString();
        System.out.print("Number of pages: ");
        nrOfPages=UserInputNr();
        System.out.print("Quality of pages: ");
        qualityOfPages=UserInputString();
        Books newAlbum=new Albums(albumName,nrOfPages,qualityOfPages);
        System.out.println("Newly added album: "+newAlbum.getNameBook()+" - nr. of pages: "+newAlbum.getNrOfPagesBook()+" - Quality of pages: "+newAlbum.getQualityOfPages());
        return newAlbum;
    }

    public static void Menu(){                                                                                              //Afisare meniu
        System.out.println("__________________________________");
        System.out.println("Library options:");
        System.out.println("__________________________________");
        System.out.println("1) Add a book");
        System.out.println("2) List information on a book ");
        System.out.println("3) List information on all books");
        System.out.println("4) Delete information on a book ");
        System.out.println("5) Delete information on all books");
        System.out.println("6) Exit app");
        System.out.println("");
        System.out.print("Choose an action:  ");
    }

    public static void RevenireMeniu(){                                                                                     //Revenire la meniul principal
        System.out.println(" ");
        System.out.println("Press key to return to main menu!");
        UserInputString();
    }

    public static int UserInputNr() {                                                                                       //Metoda de citire Nr de la tastatura
        Scanner input = new Scanner(System.in);
        //if (input.nextInt()!=Integer;
        int value = input.nextInt();
        return value;
    }

    public static String UserInputString() {                                                                                //Metoda de citire String de la tastatura
        Scanner scan = new Scanner(System.in);
        String value = scan.nextLine();
        return value;
    }

}

