
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emil
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class discounttype implements Serializable {
    @Id@GeneratedValue
    long id;
    private long discount;
    public void calcDiscount (int pricePerItem,int quanity){
        
    }
    public double calcDiscount(double priceItem, int quantity) {
        return priceItem * discount * quantity;
    }
}
