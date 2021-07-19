package SSVSEM.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/*
  @author   Mariia Naduieva
  @project   course-project
  @class  Book
  @version  1.0.0 
  @since 19.07.2021 - 18.17
*/

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Book {
    private String id;
    private String title;
    private String author;
    private String genre;
    private double rentalPrice;
    private double bail;
    private String desc;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Book(String title, String author, String genre, double rentalPrice, double bail, String desc) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rentalPrice = rentalPrice;
        this.bail = bail;
        this.desc = desc;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", rentalPrice=" + rentalPrice +
                ", bail=" + bail +
                ", desc='" + desc + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

}
