
//import static Available_Drivers.source;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Distance 
{
    static String src,dest;
    static float dist;
    static float arr[][];
    static int n=-1;
    static int m=-1;
    public static float getDistance(String src,String dest)
    {
        arr = new float[10][10];
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
                arr[i][j]=1;
        }
        src=src;
        dest=dest;
        switch(src)
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
        
        switch(dest)
        {
            case "SHALIMAR BAGH": m=0;break;
            case "PITAMPURA": m=1;break;
            case "JANAKPURI": m=2;break;
            case "KAROL BAGH": m=3;break;
            case "SHAHDRA": m=4;break;
            case "IGI Airport": m=5;break;
            case "LAJPAT NAGAR": m=6;break;
            case "PATPARGANJ": m=7;break;
            case "RAJOURI GARDEN": m=8;break;
            case "HAUZ KHAAS": m=9;break;
        }
//        System.out.println(n+" "+m);
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(i==j)
                    arr[i][j]=0;
                if(i==0)
                {
                    if(j==1)
                        arr[i][j]=3;
                    if(j==2)
                        arr[i][j]=15;
                    if(j==3)
                        arr[i][j]=9;
                    if(j==4)
                        arr[i][j]=17;  
                    if(j==5)
                        arr[i][j]=26;  
                    if(j==6)
                        arr[i][j]=23;  
                    if(j==7)
                        arr[i][j]=22;  
                    if(j==8)
                        arr[i][j]=11;
                    if(j==9)
                        arr[i][j]=25;
                }
                 if(i==1)
                {
                    if(j==0)
                        arr[i][j]=3;
                    if(j==2)
                        arr[i][j]=13;
                    if(j==3)
                        arr[i][j]=9;
                    if(j==4)
                        arr[i][j]=18;  
                    if(j==5)
                        arr[i][j]=23;  
                    if(j==6)
                        arr[i][j]=27;  
                    if(j==7)
                        arr[i][j]=22;  
                    if(j==8)
                        arr[i][j]=8;
                    if(j==9)
                        arr[i][j]=23;
                }
                  if(i==2)
                {
                    if(j==0)
                        arr[i][j]=15;
                    if(j==1)
                        arr[i][j]=13;
                    if(j==3)
                        arr[i][j]=13;
                    if(j==4)
                        arr[i][j]=27;  
                    if(j==5)
                        arr[i][j]=14;  
                    if(j==6)
                        arr[i][j]=20;  
                    if(j==7)
                        arr[i][j]=25;  
                    if(j==8)
                        arr[i][j]=5;
                    if(j==9)
                        arr[i][j]=18;
                }
                   if(i==3)
                {
                    if(j==0)
                        arr[i][j]=9;
                    if(j==1)
                        arr[i][j]=9;
                    if(j==2)
                        arr[i][j]=13;
                    if(j==4)
                        arr[i][j]=14;  
                    if(j==5)
                        arr[i][j]=17;  
                    if(j==6)
                        arr[i][j]=14;  
                    if(j==7)
                        arr[i][j]=14;  
                    if(j==8)
                        arr[i][j]=9;
                    if(j==9)
                        arr[i][j]=16;
                }
                   if(i==4)
                {
                    if(j==0)
                        arr[i][j]=17;
                    if(j==1)
                        arr[i][j]=18;
                    if(j==2)
                        arr[i][j]=27;
                    if(j==3)
                        arr[i][j]=14;  
                    if(j==5)
                        arr[i][j]=27;  
                    if(j==6)
                        arr[i][j]=19;  
                    if(j==7)
                        arr[i][j]=7.2f;  
                    if(j==8)
                        arr[i][j]=22;
                    if(j==9)
                        arr[i][j]=22;
                }
                   if(i==5)
                {
                    if(j==0)
                        arr[i][j]=26;
                    if(j==1)
                        arr[i][j]=23;
                    if(j==2)
                        arr[i][j]=14;
                    if(j==3)
                        arr[i][j]=17;  
                    if(j==4)
                        arr[i][j]=27;  
                    if(j==6)
                        arr[i][j]=17;  
                    if(j==7)
                        arr[i][j]=26;  
                    if(j==8)
                        arr[i][j]=17;
                    if(j==9)
                        arr[i][j]=11;
                }
                   if(i==6)
                {
                    if(j==0)
                        arr[i][j]=23;
                    if(j==1)
                        arr[i][j]=27;
                    if(j==2)
                        arr[i][j]=20;
                    if(j==3)
                        arr[i][j]=14;  
                    if(j==4)
                        arr[i][j]=19;  
                    if(j==5)
                        arr[i][j]=17;  
                    if(j==7)
                        arr[i][j]=15;  
                    if(j==8)
                        arr[i][j]=20;
                    if(j==9)
                        arr[i][j]=5.6f;
                }
                    if(i==7)
                {
                    if(j==0)
                        arr[i][j]=22;
                    if(j==1)
                        arr[i][j]=22;
                    if(j==2)
                        arr[i][j]=25;
                    if(j==3)
                        arr[i][j]=14;  
                    if(j==4)
                        arr[i][j]=7.2f;  
                    if(j==5)
                        arr[i][j]=26;  
                    if(j==6)
                        arr[i][j]=15;  
                    if(j==8)
                        arr[i][j]=21;
                    if(j==9)
                        arr[i][j]=18;
                }
                      if(i==8)
                {
                    if(j==0)
                        arr[i][j]=11;
                    if(j==1)
                        arr[i][j]=8;
                    if(j==2)
                        arr[i][j]=5;
                    if(j==3)
                        arr[i][j]=9;  
                    if(j==4)
                        arr[i][j]=22;  
                    if(j==5)
                        arr[i][j]=17;  
                    if(j==6)
                        arr[i][j]=20;  
                    if(j==7)
                        arr[i][j]=21;
                    if(j==9)
                        arr[i][j]=19;
                }
                       if(i==9)
                {
                    if(j==0)
                        arr[i][j]=25;
                    if(j==1)
                        arr[i][j]=23;
                    if(j==2)
                        arr[i][j]=18;
                    if(j==3)
                        arr[i][j]=16;  
                    if(j==4)
                        arr[i][j]=22;  
                    if(j==5)
                        arr[i][j]=11;  
                    if(j==6)
                        arr[i][j]=5.6f;  
                    if(j==7)
                        arr[i][j]=18;
                    if(j==8)
                        arr[i][j]=19;
                }
            }
        }
             dist=arr[n][m];
        return dist; 
    }
    public static String getNearest(String src)
    {
        float near=0;
        switch(src)
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
        near = 10000;
        int x=0;
        for(int i=0;i<10;i++)
        {
            if(i!=n)
            {
                if(arr[n][i]<near)
                {
                    near=arr[n][i];
//                    System.out.println(near);
                    x=i;
                }
            }
//            if(n==0)
//            {
//                near = arr[n][1];
//                x=1;
//            }
        }
        String str="";
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
        return str;
    }
}
