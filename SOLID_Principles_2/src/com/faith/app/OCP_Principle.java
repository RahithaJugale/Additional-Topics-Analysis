package com.faith.app;

import com.faith.model.Application;
import com.faith.model.Cuboid;
import com.faith.model.Geo_objects;
import com.faith.model.Sphere;

public class OCP_Principle {

	public static void main(String[] args) {
		
		//Initializing 3 cuboids
		Cuboid cuboid1 = new Cuboid(5, 10, 15);
 
        Cuboid cuboid2 = new Cuboid(2, 4, 6);
 
        Cuboid cuboid3 = new Cuboid(3, 12, 15);

        //Initializing 3 spheres
        Sphere sphere1 = new Sphere(5);

        Sphere sphere2 = new Sphere(2);

        Sphere sphere3 = new Sphere(3);

        //initializing and declaring an array of Geo_objects
        Geo_objects[] g_arr = new Geo_objects[6];
 
        // Setting Geo_objects to cuboid class
        g_arr[0] = cuboid1;
        g_arr[1] = cuboid2;
        g_arr[2] = cuboid3;
 
        // Setting Geo_objects to sphere class
        g_arr[3] = sphere1;
        g_arr[4] = sphere2;
        g_arr[5] = sphere3;
 
        // Initializing the Application class
        Application app = new Application();
         
        // Getting the total volume
        double vol = app.get_total_volume(g_arr);
 
        // Printing total volume
        System.out.println("The total volume is " + vol);
    }
}
