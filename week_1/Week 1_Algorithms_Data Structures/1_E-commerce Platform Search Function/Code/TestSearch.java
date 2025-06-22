package com.EcommerceSearchExample;

import java.util.Arrays;

public class TestSearch {
    public static void main(String[] args) {
        Product[] p = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shirt", "Clothing"),
            new Product(3, "Book", "Education"),
            new Product(4, "Camera", "Electronics"),
            new Product(5, "Shoes", "Footwear")
        };

        Product res1 = SearchUtil.linearSearch(p, "Camera");
        System.out.println("Linear: " + (res1 != null ? res1 : "Not Found"));

        Arrays.sort(p, (a, b) -> a.productName.compareToIgnoreCase(b.productName));
        Product res2 = SearchUtil.binarySearch(p, "Camera");
        System.out.println("Binary: " + (res2 != null ? res2 : "Not Found"));
    }
}
