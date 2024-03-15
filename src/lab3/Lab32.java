package lab3;

import java.util.Arrays;
import java.util.Scanner;

class Lab32 {
    public static Scanner scanner = new Scanner(System.in);
    public static Mountain[] mountains;

    public static void main(String[] args) {
        mountains = new Mountain[]{
                new Mountain("�������", "������", 5642),
                new Mountain("������������", "��������", 5895),
                new Mountain("�������", "������", 6190),
                new Mountain("���� ����", "�����", 4810),
                new Mountain("������������", "�������", 8586),
                new Mountain("������", "������", 5033),
                new Mountain("�������", "�����", 4810),
                new Mountain("������", "�������", 8485),
                new Mountain("�������", "������", 3)
        };

        findTallMountains();
            System.out.println();
        sortByHeight();
        printMountainData();
             System.out.println();
        searchMountain();
    }
    public static void findTallMountains() {
        System.out.println("������� � ������� ����� 1000�:");
        for (Mountain mountain : mountains) {
            if (mountain.getHeight() > 1000) {
                System.out.println(mountain);
            }
        }
    }

    public static void sortByHeight() {
        Arrays.sort(mountains, (a, b) -> a.getHeight() - b.getHeight());
    }

    public static void searchMountain() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� �������� ����: ");
        String name = scanner.nextLine();

        Mountain mountain = null;
        for (Mountain m : mountains) {
            if (m.getName().equals(name)) {
                mountain = m;
                break;
            }
        }

        if (mountain == null) {
            System.out.println("���� �� �������.");
        } else {
            System.out.println("������� ����: " + mountain);
            System.out.print("������� ����� ������: ");
            int height = scanner.nextInt();
            mountain.setHeight(height);
            System.out.println("������ � ���� ��������: " + mountain);
        }
    }

    public static void printMountainData() {
        System.out.println("���������� � �����:");
        for (Mountain mountain : mountains) {
            System.out.println(mountain);
        }
    }
}

class Mountain {
    private String name;
    private String location;
    private int height;

    public Mountain(String name, String location, int height) {
        this.name = name;
        this.location = location;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String toString() {
        return name + " (" + location + "), " + height + "m";
    }
}