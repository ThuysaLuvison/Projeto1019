/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1019;

import java.util.Scanner;

public class Projeto1019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas, minutos, segundos;
        segundos = sc.nextInt();
        horas = segundos / 3600;
        segundos %= 3600;
        minutos = segundos / 60;
        segundos %= 60;
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
