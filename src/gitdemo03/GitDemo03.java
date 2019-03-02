/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitdemo03;

/**
 *
 * @author FVanderSchueren
 */
public class GitDemo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("first hello...");
        NewClass01 m01 = new NewClass01();
        m01.setMessage("message from NewClass01....");
        System.out.println("second hello from :" + m01.getMessage());
        
        // TODO code application logic here
    }
    
}
