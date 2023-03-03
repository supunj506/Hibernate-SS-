/*
 * @author : Supun Jaysinghe
 * Date    : 03 March 2023
 * Time    : 8:20 PM
 * Project : Thgakade With Hibernate
 * Created by IntelliJ IDEA.
 */
package lk.ccns.thogakade.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    private
    String item_code;
    private String item_description;
    private double item_unit_price;
    private int qty_on_hand;

    public Item() {
    }

    public Item(String item_code, String item_description, double item_unit_price, int qty_on_hand) {
        this.item_code = item_code;
        this.item_description = item_description;
        this.item_unit_price = item_unit_price;
        this.qty_on_hand = qty_on_hand;
    }

    public String getItem_code() {
        return item_code;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public double getItem_unit_price() {
        return item_unit_price;
    }

    public void setItem_unit_price(double item_unit_price) {
        this.item_unit_price = item_unit_price;
    }

    public int getQty_on_hand() {
        return qty_on_hand;
    }

    public void setQty_on_hand(int qty_on_hand) {
        this.qty_on_hand = qty_on_hand;
    }
}
