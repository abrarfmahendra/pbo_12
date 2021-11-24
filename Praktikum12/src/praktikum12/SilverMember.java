/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum12;

/**
 *
 * @author LENOVO
 */
public class SilverMember extends Others {
    // atribut
    protected int rentCost, point, disc, tempCost, discountAmount, totalCost;
    
    
    // constructor
    SilverMember() {
        this.rentCost = 25000;
        this.point = 1;
        this.disc = 1;
    }
    
    protected int costAmount(int rentalDuration) {
        
        tempCost = rentalDuration * rentCost;
        discountAmount = (tempCost * disc) / 100;
        totalCost = tempCost - discountAmount;
        
        return totalCost;
    }
    
    protected int getPoint(int rentalDuration) {
        
        int totalPoint = rentalDuration * point;
        return totalPoint;
    }
}
