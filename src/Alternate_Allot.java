
//import static Map_Source.source;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hardik
 */
public class Alternate_Allot {
    static String source1,userid1;
    public static String getSource()
    {
        return source1;
    }
     public static String getUserId()
    {
        return userid1;
    }
    public void Alternate(String source)
    {
        String str="";
        int n=0;
         String dest = Map_Source.getDest();
         float dist = Distance.getDistance(source,dest);
         long time = (long)dist*10000;
        switch(source)
        {
            case "SHALIMAR BAGH": n=0;break;
            case "PITAMPURA": n=1;break;
            case "JANAKPURI": n=2;break;
            case "KAROL BAGH": n=3;break;
            case "SHAHDRA": n=4;break;
            case "IGI Airport": n=5;break;
            case "LAJPAT NAGAR": n=6;break;
            case "PATPARGANJ": n=7;break;
            case "RAJOURI GARDEN": n=8;break;
            case "HAUZ KHAAS": n=9;break;
        }
        int x= n+1;
        if(x==10)
            x=0;
        switch(x)
        {
            case 0: str="SHALIMAR BAGH";break;
            case 1: str="PITAMPURA";break;
            case 2: str="JANAKPURI";break;
            case 3: str="KAROL BAGH";break;
            case 4: str="SHAHDRA";break;
            case 5: str="IGI Airport";break;
            case 6: str="LAJPAT NAGAR";break;
            case 7: str="PATPARGANJ";break;
            case 8: str="RAJOURI GARDEN";break;
            case 9: str="HAUZ KHAAS";break;
        }
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hardik?useSSL=false","root","Rssb18@babaji");
            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from drivers where flag = 1 and loc = \""+str+"\" ;");
//            if(rs.next())
//            {
//                Statement stmt2 = conn.createStatement();
//                stmt2.executeUpdate("update drivers set loc = \""+Map_Source.getSource()+" where loc = \""+str+" ;");
//            }
               ResultSet rs1 = stmt.executeQuery("select * from drivers where flag = 1 and loc = \""+str+"\" order by rating desc;");
               boolean nxt= rs1.next();
               if(nxt)
               {
                String alloted = rs1.getString("name");
                String userid = rs1.getString("userid");
                userid1=userid;
                Statement stmt2 = conn.createStatement();
                stmt2.executeUpdate("update drivers set loc = \""+Map_Source.getSource()+"\" , flag=0 where name = \""+alloted+"\" ;");
                new Alternate_Trip().setVisible(true);
                try
                {
                  Thread.sleep(3500);
                  JOptionPane.showMessageDialog(null,"Ride has started!\nWish you a safe Journey");
                 }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
                try
                {
                    
                  Thread.sleep(44000);
                  
                }catch(InterruptedException e)
                {
                    System.out.println(e);
                }
                 JOptionPane.showMessageDialog(null,"Ride has ended.");
                   Statement stmt4=conn.createStatement();
                stmt4.executeUpdate("update drivers set flag=1, loc = \""+dest+"\" where userid = \""+userid1+"\";");
               }
            else
            {
                Alternate(str);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public Alternate_Allot(String source)
    {
        Alternate(source);
//        new Alternate_Trip().setVisible(true);
    }
}
