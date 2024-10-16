/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask10;

/**
 *
 * @author RC_Student_lab
 */
public class ICETASK10 {

    public static void main(String[] args) {
       int [] price = {200,350,700,400};
       String [] item = {"Shirt","Pants","Sneakers","Jacket"};
        
        // 1. Calculating the sum of all the elements in price
        int totalSum = 0;
        for (int p = 0;p < price.length;p++) {
            totalSum += price[p];
        }

        // 2. Calculating the average of the elements in the price array
        double averagePrice = (double) totalSum / price.length;

        // 3. Getting the maximum price and the minimum price
        int maxPrice = price[0];
        int minPrice = price[0];
        for (int p = 0; p < price.length; p++) {
            if (price[p] > maxPrice) {
                maxPrice = price[p];
            }
            if (price[p] < minPrice) {
                minPrice = price[p];
            }
        }

        // 4. Getting the item with the highest price
        String itemWithMaxPrice = "";
        for (int i = 0; i < price.length; i++) {
            if (price[i] == maxPrice) {
                itemWithMaxPrice = item[i];
                break;
            }
        }

        // Printing the results
        System.out.println("Total Sum: " + totalSum);
        System.out.println("Average Price: " + averagePrice);
        System.out.println("Maximum Price: " + maxPrice);
        System.out.println("Minimum Price: " + minPrice);
        System.out.println("Item with the Highest Price: " + itemWithMaxPrice);
    }
}

    
