
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emil
 */
public class DiscountFixed  extends discounttype{
    @Id@GeneratedValue
    long id;

    double discount = 0.1; //10% on all

    @Override
    public double calcDiscount(double priceItem, int quantity) {
        return priceItem * discount * quantity;
    }

}
