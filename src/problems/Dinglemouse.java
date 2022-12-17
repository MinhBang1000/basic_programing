/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author Administrator
 */
public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int dogYears = 0;
        int catYears = 0;
        if (humanYears == 1) {
            dogYears = catYears = 15;
        } else {
            if (humanYears >= 2) {
                dogYears = catYears = 24;
                if (humanYears > 2) {
                    dogYears += (humanYears - 2) * 5;
                    catYears += (humanYears - 2) * 4;
                }
            }
        }
        return new int[]{humanYears, dogYears, catYears};
    }

}
