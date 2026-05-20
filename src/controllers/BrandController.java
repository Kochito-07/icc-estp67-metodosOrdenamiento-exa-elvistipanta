package controllers;

import models.Brand;

public class BrandController {
    public Brand[] sortBubbleDesc(Brand[] brands){
        int n = brands.length;
        boolean intercambo;
        for (int i = 0; i < n - 1; i++) {
            intercambo = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (brands[j].getTotalValidYears() < brands[j + 1].getTotalValidYears()) {
                    Brand temp = brands[j];
                    brands[j] = brands[j + 1];
                    brands[j + 1] = temp;
                    intercambo = true;
                    
                }
            }
            if (!intercambo) {
                break;
            }
        }
        return brands;
    }
  public Brand binarySearchByValidYears(Brand[] brands, int validYears, boolean isAscending) {
    int left = 0;
    int rigth = brands.length - 1;
    while (left <= rigth) {
      int mid = left + (rigth - left) / 2;
      int midYears = brands[mid].getTotalValidYears();
      if (midYears == validYears) {
        return brands[mid];
      }
      if (isAscending) {
        if (midYears < validYears) {
          left = mid + 1;
        } else {
          rigth = (mid - 1);
        }
      }
      else{
        if (midYears > validYears) {
          left = mid + 1;
        } else {
          rigth = (mid - 1);
        }                
      }
    }
    return null;
    }
}
