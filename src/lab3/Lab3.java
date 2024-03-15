package lab3;

import java.lang.*;
import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

class Lab3 {
    public static Scanner scanner = new Scanner(System.in);
    public static Film[] Films;

    public static void main(String[] args) {
        int i=0;
        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
      //   System.out.print("������� ����������: ");
       // int n = in.nextInt();
        System.out.print("������� �������� ������: ");
        String name = scanner.nextLine();
        System.out.print("������� ���� ������: ");
        String ganer = scanner.nextLine();
        System.out.print("������� ���� ������: ");
        int data = in.nextInt();
        Films = new Film[]{
                new Film("������", "������", 2014),
                new Film("������� �����", "����������", 2000),
                new Film("������", "����������", 2021),
                new Film("���� 2", "������", 2024),
                new Film(name, ganer, data),           
                
        };
        

        findTallMountains();
            System.out.println();
            SORT();
            printFilmData();
             System.out.println();
            
        
    }
    public static void findTallMountains() {
        System.out.println("�������� , ����, ���� ������ :");
        for (Film Film : Films) {            
                System.out.println(Film);          
        }
    }
     public static void SORT() { 
         
           
             Arrays.sort(Films,(a, b) ->a.name.compareTo(b.name));
            
        
            }
     public static void printFilmData() {
        System.out.println("���������� � �������:");
        for (Film Film : Films) {
            System.out.println(Film);
        }
    }
        
    }
    



class Film {
     String name;
     String ganer;
     int height;

    public Film(String name, String ganer, int height) {
        this.name = name;
        this.ganer = ganer;
        this.height = height;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setganer(String location) {
        this.ganer = ganer;
    }

    public String getganer() {
        return ganer;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String toString() {
        return name + " (" + ganer + "), " + height + " ���";
    }
}

