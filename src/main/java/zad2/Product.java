package zad2;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String name;
    private String contry;
    private Integer mass;
    private Integer cost;
    private Integer sort;
}
