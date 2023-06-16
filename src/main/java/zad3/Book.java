package zad3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String nameBook;
    private String nameAuthor;
    private Integer cost;
    private Integer year;
    private Integer page;
}
