package com.mycompany.app.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapTest {

    public static void main(String[] args) {
        Book b1 = new Book("Narayan", "Java Programming");
        Book b2 = new Book("Alfrod", "C++ Programming");
        Student s1 = new Student("Test",2, Arrays.asList(b1,b2));

        Book b3 = new Book("Einsteen", "DBMS");
        Book b4 = new Book("Ram Sundar", "Probability");
        Student s2 = new Student("Mock",5, Arrays.asList(b3,b4,b1));

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        //get list of books
        List<Book> bksList = studentList.stream().flatMap(s->s.books.stream()).collect(Collectors.toList());
        bksList.forEach(b->
                System.out.println(b.authorName+" "+b.subject));

        Map<Object,List<Student>> studentsByBooks = studentList.stream().collect(Collectors.groupingBy(s->s.books.stream().map(b->b.subject)));
      //  studentsByBooks.forEach(map->);

        //
        List<Integer> il = Arrays.asList(4,1,6,3,10);
       il.stream().sorted().forEach(System.out::println);
        List<String> il1 = Arrays.asList("4","1","6","3","10");
        il1.stream().sorted().forEach(System.out::println);

    }
}

class Student{
    String name ;
    Integer id;
    List<Book> books;
    Student(String name, Integer id, List<Book> books){
        this.name= name;
        this.id= id;
        this.books = books;
    }

}
class Book{
    String authorName;
    String subject;
    Book( String authorName,String subject){
        this.authorName = authorName;
        this.subject = subject;
    }

}
