package ro.itschool.hmw_30ian.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Book {

    private long id;
    private int year;
    private String title;
    private String author;
}
