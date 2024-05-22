package com.example.helloword;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication {
    public static void main(String[] args) {
        String hello="Hello Word";
         int num1=4;
         int num2=5;
         float num3=1.5f;
         float num4=2.5f;
         int sum1=num1+num2;
         float sum2=num3+num4;
        System.out.println(hello);
        System.out.println(sum1);
        System.out.println(sum2);
        int limit1=10;
        int limit2=9;
        for (int i=1;i<=limit1;i++){
            int par=2*i;
            System.out.println(par);
        }
        for (int j=0;j<=limit2;j++){
            int impair=2*j+1;
            System.out.println(impair);
        }
        String name[]={"Elian","Marcelo","Erick","Brenda"};
        for (int i=0;i<= name.length-1;i++){
            System.out.println(name[i]);
        }
        int bin1=0;
        int bin2=1;
        int[][] box=new int[3][4];
        for (int i=0;i<=2;i++){
            for (int j=0;j<=3;j++){
                if (j==1|i==1){
                    System.out.println(box[i][j]=bin2);
                }else{
                    System.out.println(box[i][j]=bin1);
                }
            }
        }
    }
}