package burda.cleevio.homework.types;

import lombok.Getter;

import javax.persistence.*;
import java.util.Base64;

@Entity
@Getter
public class Watches {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String type;
    private int price;
    private String description;
    private Base64 image;

    public Watches() {}

    public Watches(String type, int price, String description, Base64 image) {
        this.type = type;
        this.price = price;
        this.description = description;
        this.image = image;
    }
}
