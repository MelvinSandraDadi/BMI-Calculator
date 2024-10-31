/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;

/**
 *
 * @author My PC
 */
public class BMI {
    double bmi;  
    
    void getBmi(double berat, double tinggi){
        double TinggiM = tinggi / 100;
        bmi = berat/(TinggiM * TinggiM);
        
        System.out.println("BMI Anda: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi < 24.9) {
            System.out.println("Kategori: Normal");
        } else if (bmi < 29.9) {
            System.out.println("Kategori: Gemuk");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }
    
}
