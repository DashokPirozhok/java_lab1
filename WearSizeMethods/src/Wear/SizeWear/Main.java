package Wear.SizeWear;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.println("Введите кол-во людей");
        int n = sc.nextInt(); 
        Person people[] = new Person[n];
        System.out.println("Введите информацию о людях");
        for(int i=0; i< people.length; i++) //ввод
        {
            sc.nextLine();
            people[i] = new Person();
            System.out.println("Введите фамилию " + (i+1) + " человека");
            people[i].Surname = sc.nextLine();
            System.out.println("Введите имя " + (i+1) + " человека");
            people[i].Name = sc.nextLine();
            System.out.println("Введите возраст " + (i+1) + " человека");
            people[i].age = sc.nextInt();
            System.out.println("Введите размер " + (i+1) + " человека");
            people[i].size = sc.nextInt();
            
        }
        System.out.println("Характеристики людей:");
        System.out.println("фамилия" + "\t"+"\t"+ "имя" + "\t"+ "\t" +"\t" +
                "возраст" + "\t" +"\t" +"\t" + "размер" + "\n" + "_____________________________________________________");
        for(Person c: people) //вывод
        {
            System.out.println(c.Surname + "\t"+ "\t" + c.Name + "\t" + "\t" + "\t" +
                    c.age + "\t" + "\t" + "\t" + "\t" + c.size);
        }
        //вызовы методов
        MaxSize(people);
      
        Sort(people);
        TitleSearch(people);
        EditFields(people);
    }

    public static void MaxSize(Person arr[]) 
    {
        int nmax = 0; 
        int max = arr[nmax].size;
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i].size > max)
            {
                max = arr[i].size;
                nmax = i;
            }
        }
        System.out.println("Человек с самым большим размером:" + "\n");
        System.out.println("Фамилия: " + arr[nmax].Surname + "\n" +
                "Размер: " + arr[nmax].size);
    }

  

    public static void Sort(Person arr[]) 
    {
        for(int i=0; i < arr.length-1; i++)
        {
            for(int j=0; j < arr.length-1-i; j++)
            {
                if(arr[j].size > arr[j+1].size)
                {
                    Person temp = arr[j]; 
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Отсортированный список : ");
        System.out.println("Фамилия" + "\t"+ "\t" +"имя" + "\t"+ "\t" +"\t" +
                "Возраст" + "\t" + "\t" +"размер" + "\n" + "_____________________________________________________");
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i].Surname + "\t"+ "\t" + arr[i].Name + "\t" + "\t" + "\t" +
                    arr[i].age + "\t" + "\t" + "\t" + "\t" + arr[i].size);
        }
    }

    public static void TitleSearch(Person arr[]) 
    {
        Scanner sc = new Scanner(System.in, "cp1251");
        sc.nextLine();
        System.out.println("Введите фамилию для поиска:");
        String search_title = sc.nextLine();
        int num = -1;
        for(int i=0; i< arr.length; i++)
        {
            if(search_title.equalsIgnoreCase(arr[i].Surname))
                num = i;
        }
        System.out.println("Найденые люди:");
        if(num != -1)
        {
            System.out.println("фамилия" + "\t"+ "\t" +"имя" + "\t"+ "\t" +"\t" +
                    "возраст" + "\t" +"\t" + "размер" + "\n" + "_____________________________________________________");
            System.out.println(arr[num].Surname + "\t"+ "\t" + arr[num].Name + "\t" + "\t" + "\t" +
                    arr[num].age + "\t" + "\t" + "\t" + "\t" + arr[num].size);
        }
        else System.out.println("Таких людей нет(");
    }

    public static void EditFields(Person arr[]) 
    {
        Scanner sc = new Scanner(System.in, "cp1251");
        sc.nextLine();
        int s; 
        System.out.println("Введите фамилию для редактирования: ");
        String inputTitle = sc.nextLine();
        for(int i=0; i< arr.length; i++) {
            if (inputTitle.equalsIgnoreCase(arr[i].Surname)) {
            }
            else
            {
                System.out.println("Такого человека нет(");
                break;
            }
        }
        System.out.println("Выберите поле которое хотите редактировать: " + "\n" +
                "1 - фамилия" + "\n" +
                "2 - имя" + "\n" +
                "3 - возраст" + "\n" +
                "4 - размер");
        int inputField = sc.nextInt();
        sc.nextLine();
        for(int i=0; i< arr.length; i++)
        {
            s=i;
            if(inputField == 1)
            {
                String t;
                System.out.println("Введите новую фамилию:");
                t = sc.nextLine();
                arr[s].Surname = t;
                System.out.println("фамилия" + "\t"+ "\t" +"имя" + "\t"+ "\t" +"\t" +
                "возраст" + "\t" +"\t" + "размер" + "\n" + "_____________________________________________________");
        for(Person c: arr) //вывод
        {
            System.out.println(c.Surname + "\t"+ "\t" + c.Name + "\t" + "\t" + "\t" +
                    c.age + "\t" + "\t" + "\t" + "\t" + c.size);
        }
            }
            else if(inputField == 2)
            {
                System.out.println("Введите новое имя:");
                arr[s].Name = sc.nextLine();
                System.out.println("фамилия" + "\t"+"\t" + "имя" + "\t"+ "\t" +"\t" +
                "возраст" + "\t" +"\t" + "размер" + "\n" + "_____________________________________________________");
        for(Person c: arr) //вывод
        {
            System.out.println(c.Surname + "\t"+ "\t" + c.Name + "\t" + "\t" + "\t" +
                    c.age + "\t" + "\t" + "\t" + "\t" + c.size);
        }
            }
            else if(inputField == 3)
            {
                System.out.println("Введите новый возраст:");
                arr[s].age = sc.nextInt();
                System.out.println("фамилия" + "\t"+"\t" + "имя" + "\t" +"\t"+ "\t" +
                "возраст" + "\t" +"\t" + "размер" + "\n" + "_____________________________________________________");
        for(Person c: arr) //вывод
        {
            System.out.println(c.Surname + "\t"+ "\t" + c.Name + "\t" + "\t" + "\t" +
                    c.age + "\t" + "\t" + "\t" + "\t" + c.size);
        }
            }
            else if(inputField == 4)
            {
                System.out.println("Введите новый размер:");
                arr[s].size = sc.nextInt();
                System.out.println("фамилия" + "\t"+"\t" + "имя" + "\t"+ "\t" +"\t" +
                        "возраст" + "\t" + "\t" +"размер" + "\n" + "_____________________________________________________");
                for(Person c: arr) //вывод
                {
                    System.out.println(c.Surname + "\t"+ "\t" + c.Name + "\t" + "\t" + "\t" +
                            c.age + "\t" + "\t" + "\t" + "\t" + c.size);
                }
            }
        }
    }
}
