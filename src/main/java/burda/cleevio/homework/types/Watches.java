package burda.cleevio.homework.types;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Base64;

@Entity
@Getter
@EqualsAndHashCode
@ToString
public class Watches {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String type;
    private int price;
    private String description;
    private String fountain;

    public Watches() {}

    public Watches(String type, int price, String description, String fountain) {
        this.type = type;
        this.price = price;
        this.description = description;
        this.fountain = fountain;
    }

    public boolean isImageValid() {
        if (price <= 0) {
            return false;
        }
        if (fountain.length() > 255) return false;
        try {
            Base64.getDecoder().decode(fountain);
        } catch (IllegalArgumentException ex) {
            return false;
        }
        return true;
    }
}
