package com.EcommerceSearchExample;

public class SearchUtil {
    public static Product linearSearch(Product[] arr, String name) {
        for (Product p : arr) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] arr, String name) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            int cmp = arr[m].productName.compareToIgnoreCase(name);
            if (cmp == 0) return arr[m];
            if (cmp < 0) l = m + 1;
            else r = m - 1;
        }
        return null;
    }
}
