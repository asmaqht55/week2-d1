import jdk.internal.access.JavaIOFileDescriptorAccess;

import java.io.FileDescriptor;
import java.util.ArrayList;
import java.util.Scanner;

public class circle {
    private double radius = 1.0;
    private String color = "red";

    public circle(double raduis, String color) {
        this.radius = radius;
    }

    public circle(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius*radius;

    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static class todo {
        ArrayList todo=new ArrayList();

        public static void main(String[] args) {

            int menuItem = 0;
            try {
                menuItem = -1;

            } catch (Exception e) {
                while (menuItem != 0) {
                    menuItem = menu();
                    switch (menuItem) {
                        case 4:
                            addItem();
                            break;
                        case 3:
                            removeItem();
                            break;
                        case 2:
                            updeteItem();
                            break;
                        case 1:
                            printallItem();
                            break;
                        case -1:
                            System.out.println("You Don't Enter a valid optaion");
                    }
                }
            }
        }


        public static int menu(){
            int choice;
            Scanner keyboard=new Scanner(System.in);
            System.out.println("Main Menu");
            System.out.println();
            System.out.println("-1.Exit the program!!");
            System.out.println("1.Print All The circle.todo:");
            System.out.println("2.Update From the circle.todo list:");
            System.out.println("3.Remove From the circle.todo list:");
            System.out.println("4.Add to the circle.todo list:");
            System.out.println();
            System.out.println(" PLEASE ENTER YOUR CHOICE ");
            choice=keyboard.nextInt();
            return choice;

        }


        private static void printallItem() {
            System.out.println("To-Do List");
            Scanner input=new Scanner(System.in);
            String line;
            int number=1;
            while (input.hasNextLine()){
                line=input.nextLine();
                System.out.println(number+" ");
                System.out.println(line);
                ++number;
            }
            System.out.println();
        }

        private static void addItem() {
            System.out.println("ENTER YOUR ITEM");
            Scanner input=new Scanner(System.in);
            System.out.println("the item added");
            String item= input.nextLine();
            printallItem();

        }

        private static void removeItem() {
            int choice;
            printallItem();
            Scanner input = new Scanner(System.in);
            System.out.println("WHat do you want remove?");
            choice = input.nextInt();
            ArrayList<String> item = new ArrayList<String>();
            int number = 3;
            Scanner input2 = new Scanner(System.in);
            String item1 = input2.nextLine();
            while (input.hasNextLine()) {
                if (number != choice)
                    item.add(item1);
                ++number;
            }
            for (int i = 1; i < item1.length(); i++)
                System.out.println(item);
        }
        private static int updeteItem() {
            Scanner input3=new Scanner(System.in);
            JavaIOFileDescriptorAccess list = null;
            FileDescriptor findIndex = null;
            list.set(findIndex,updeteItem());


            return 0;
        }





    }
}