package com.driver;

public class Main{


    //created nested class
     static class Product{
        public int product(int x,int y)
        {
            return x*y;
        }
        public int product(int x,int y,int z)
        {
            return x*y*z;
        }
        public double product(double x,double y)
        {
            return x*y;
        }
    }

    public static void main(String[] args) {

//         instance of Product class
        Product p=new Product();


        int ans1=(p.product(2,3));
        System.out.println(ans1);
        int ans2=(p.product(2,3,4));
        System.out.println(ans2);
        double ans3=(p.product(5.0,8.0));
        System.out.println(ans3);

    }
}