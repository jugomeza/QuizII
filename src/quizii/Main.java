/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizii;

/**
 *
 * @author INTEL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Farmer f1 = new Farmer("GRANJA x", "123", 144);
        f1.proceso("leche", 1111, "2/01/18", "123");
        Farmer f2 = new Farmer("y", "321", 441);
        f2.proceso("harina", 4000, "04/5/11", "321");
        Manufacturer m = new Manufacturer("w", "111", 444);
        m.proceso(f1, f2, 4444, "1/1/1", "744");
        DistributionCenter d = new DistributionCenter("d", "777", 443);
        d.proceso(m, "5/12/1","744");
        Retail r1 = new Retail("z", "222", 111);
        r1.proceso(d, 2000, "744");
        System.out.println(r1.toString("744"));
        // TODO code application logic here
    }

}
