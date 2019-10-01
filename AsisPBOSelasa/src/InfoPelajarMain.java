/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class InfoPelajarMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InfoPelajar ip1 = new InfoPelajar("06111840000041", "Muhammad Alfin Zidane Rahman", 90, 86, 90);
        ip1.info();
        InfoPelajar ip2 = new InfoPelajar("06111840000114", "Muhammad Alfan Zidane Rahmat", 56, 47, 60);
        ip2.info();
    }
    
}
