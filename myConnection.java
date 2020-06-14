/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlacementCell;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Himanshu Kakkar
 */
public class myConnection {
    Connection db;
    myConnection()
    {
       try
       {
           db=DriverManager.getConnection("jdbc:mysql://localhost/dbplacementcell","root","");
       }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
    }
}
