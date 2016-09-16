/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Emil
 */
@Entity
public class Customer implements Serializable {
    @Id@GeneratedValue
    long id;
    
    @OneToMany
    List<discounttype> Discounts = new ArrayList();
    public double getprice (int pricePerItem,int quanity){
        return pricePerItem * quanity;
    }
}
