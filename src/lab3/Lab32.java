package lab3;

import java.util.Arrays;
import java.util.Scanner;

class Lab32 {
    public static Scanner scanner = new Scanner(System.in);
    public static Mountain[] mountains;

    public static void main(String[] args) {
        mountains = new Mountain[]{
                new Mountain("Эльбрус", "Кавказ", 5642),
                new Mountain("Килиманджаро", "Танзания", 5895),
                new Mountain("Дениали", "Аляска", 6190),
                new Mountain("Монт Блан", "Альпы", 4810),
                new Mountain("Канченджанга", "Гималаи", 8586),
                new Mountain("Казбек", "Кавказ", 5033),
                new Mountain("Монблан", "Альпы", 4810),
                new Mountain("Макалу", "Гималаи", 8485),
                new Mountain("Хиёрияма", "Япония", 3)
        };

        findTallMountains();
            System.out.println();
        sortByHeight();
        printMountainData();
             System.out.println();
        searchMountain();
    }
    public static void findTallMountains() {
        System.out.println("Вершины с высотой более 1000м:");
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
        System.out.print("Введите название горы: ");
        String name = scanner.nextLine();

        Mountain mountain = null;
        for (Mountain m : mountains) {
            if (m.getName().equals(name)) {
                mountain = m;
                break;
            }
        }

        if (mountain == null) {
            System.out.println("Гора не найдена.");
        } else {
            System.out.println("Найдена гора: " + mountain);
            System.out.print("Введите новую высоту: ");
            int height = scanner.nextInt();
            mountain.setHeight(height);
            System.out.println("Данные о горе изменены: " + mountain);
        }
    }

    public static void printMountainData() {
        System.out.println("Информация о горах:");
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