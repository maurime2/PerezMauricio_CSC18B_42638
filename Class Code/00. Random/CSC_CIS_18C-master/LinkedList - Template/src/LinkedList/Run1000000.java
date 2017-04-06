/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Paul
 */
public class Run1000000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Float> test = new LinkedList();
        // add a nodes with the dataValues of 1 to 1,000,000
        for (int i=1;i<=10;i++)
            test.add(i/100.0f);
        
        test.add(26.34534f,5);
        test.add(99.2345f,12);
        test.add(100.3453f,0);
        
        System.out.println( test.toString() );
    }    
}
