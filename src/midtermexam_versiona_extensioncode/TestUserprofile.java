/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author 91628
 */
public class TestUserprofile {
     public static void main(String[] args) {
        System.out.print("write your name here: ");
        Scanner sc =new Scanner(System.in);
       
        
        System.out.println("select your favourite genre from the genres given below");
        String name =sc.next();
        System.out.println("Comedy");
        System.out.println( "Drama");
        System.out.println( "Action");
        System.out.println( "Mystery");
        String genre =sc.next();
        UserProfile user1 = new UserProfile(name,genre);
        System.out.println("Your user profile is created");
       

    }
    
}
