/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;


public class Collection {
  String title;
  String publisher;
  int year;
   public Collection (){
       System.out.println("Yafi's Library");
    }
   public void speak(){
        System.out.println("Welcome");
    }  
   
    public static void main(String[] args) {
    Collection c = new Collection();
    c.speak();
        System.out.println("\n");
    Book b = new Book();
    b.speak();
        System.out.println("\n");
    Magazine m = new Magazine();
    m.speak();
    System.out.println("\n");
    Skripsi s = new Skripsi();
    s.speak();
    s.lancar();
        System.out.println("\n");
    }
}

class Book extends Collection {
    String writer;
    public Book (){
        super ();
        title="Tatacara Membuat Program C++ Untuk Pemula";
        publisher="Mahasiswa UPNVJT";
        year= 2023;
        writer = "Yafi Arya Maulana";
        System.out.println("Ini adalah buku "+title);
        System.out.println("Penerbit nya adalah "+publisher);
        System.out.println("Tahun terbit nya adalah "+year);
        System.out.println("Penulis buku ini adalah "+writer);
    }

public void speak (){
        System.out.println("Finish");
    }
}

class Magazine extends Collection {
    String edition;
    public Magazine (){
        super ();
        title = "Majalah Automotif di Indonesia";
        publisher = "Otodriver";
        year = 2021;
        edition = "terbaru";
        System.out.println("Ini adalah buku "+title);
        System.out.println("Penerbit nya adalah "+publisher);
        System.out.println("Tahun terbit nya adalah "+year);
        System.out.println("Edisi buku ini adalah "+edition);
    }
    public void speak (){
        System.out.println("Happy Driving !!");
    }
}

class Skripsi extends Book {
    String NPM;
    public Skripsi (){
        super ();
        NPM = "135";
        System.out.println("NPM = "+NPM);
    }
    public void lancar (){
        System.out.println("Bismillah Lancar!");
    }
}