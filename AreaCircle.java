package javaclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaCircle {
	public static void main(String args[])throws IOException  {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        int radius ;
            
        System.out.println("Enter the radius of circle.. ");
        radius=Integer.parseInt(ob.readLine());
        AreaCircle a=new AreaCircle();
        double g=a.findarea(radius);
        System.out.println(g);
        }
        
        public static double findarea(int radius){
            double area;
            
            
            double pi=3.14;
            area = pi * radius * radius;
               return area;
            }
}
