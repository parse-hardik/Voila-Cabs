
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Randomize 
{
    
    public static void rand()
    {
        String arr[] = new String[10]; 
        arr[0]="SHALIMAR BAGH";
        arr[1]="PITAMPURA";
        arr[2]="JANAKPURI";
        arr[3]="KAROL BAGH";
        arr[4]="SHAHDRA";
        arr[5]="IGI Airport";
        arr[6]="LAJPAT NAGAR";
        arr[7]="PATPARGANJ";
        arr[8]="RAJOURI GARDEN";
        arr[9]="HAUZ KHAAS";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hardik?useSSL=false","root","Rssb18@babaji");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from drivers;");
            Statement stmt1 = conn.createStatement();
            while(rs.next())
            {
                String userid = rs.getString("userid");
                String name = rs.getString("name");
//                System.out.println(name);
                int flag = rs.getInt("flag");
                if(flag==1)
                {
                    int x = RandomNum_Driver.getRandom();
                    stmt1.executeUpdate("update drivers set loc = \""+arr[x] +"\" where userid = \""+userid +"\""+";");
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
