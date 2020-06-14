/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlacementCell;

import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author Himanshu Kakkar
 */
public class addtbstudent {
    public static void main(String[] args) {
        try
        {
            int rno;
            String fn,ln,em,add,pn,pass,cno;
            Double m10,m12,mgrad;
            Scanner s1=new Scanner(System.in);
            rno=s1.nextInt();
            fn=s1.next();
            ln=s1.next();
            em=s1.next();
            cno=s1.next();
            
            add=s1.next();
            
            m10=s1.nextDouble();
            m12=s1.nextDouble();
            mgrad=s1.nextDouble();
            
            pn=s1.next();
            pass=s1.next();
            String q="insert into tbstudent(rno,fname,lname,email,contact,address,10th,12th,graduation,father_name,password)values(?,?,?,?,?,?,?,?,?,?,?)";
            myConnection obj=new myConnection();
            PreparedStatement pst=obj.db.prepareStatement(q);
            pst.setInt(1,rno);
            pst.setString(2,fn);
            pst.setString(3,ln);
            pst.setString(4,em);
            pst.setString(5,cno);
            pst.setString(6,add);
            
            pst.setDouble(7,m10);
            pst.setDouble(8,m12);
            pst.setDouble(9,mgrad);
            
            pst.setString(10,pn);
            pst.setString(11,pass);
            pst.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
