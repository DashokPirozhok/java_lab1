package wearsize.wear;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.println("Введите кол-во людей");
        int n = sc.nextInt(); 
        person people[] = new person[n];
        System.out.println("Введите информацию о людях");
        for(int i=0; i< people.length; i++) //ввод
        {
            sc.nextLine();
            people[i] = new person();
            System.out.println("Введите Фамилию " + (i+1) + " человека");
            people[i].Surname = sc.nextLine();
            System.out.println("Введите имя " + (i+1) + " человека");
            people[i].Name = sc.nextLine();
            System.out.println("Введите возраст " + (i+1) + " человека");
            people[i].age = sc.nextInt();
            System.out.println("Введите размер одежды " + (i+1) + " человека");
            people[i].size = sc.nextInt();
           
        }
        System.out.println("Характеристики людей:");
        System.out.println("Фамилия" + "\t"+ "имя" + "\t"+ "\t" +
                "Возраст" + "\t" + "Размер одежды" + "\n" + "_____________________________________________________");
        for(person c: people) //вывод
        {
            System.out.println(c.Surname + "\t"+ "\t" + c.Name + "\t" + "\t" + "\t" +
                    c.age + "\t" + "\t" + "\t" + "\t" + c.size);
        }
       
        int nmax = 0; 
        int max = people[nmax].size;
        for(int i = 0; i< people.length; i++)
        {
            if(people[i].size > max)
            {
                max = people[i].size;
                nmax = i;
            }
        }
        System.out.println("Человек с максимальным размером одежды:" + "\n");
        System.out.println("Фамилия: " + people[nmax].Surname + "\n" +
                "Размер: " + people[nmax].size);

        
        int sum = 0; 
        int a =0;
        for(int i=0; i< people.length; i++)
        if(people[i].age > 40 )
           
            sum+=people[i].size;
           
        double medium = sum/ people.length; 
        System.out.println("Средний размер: " + medium);
        
        

     
        for(int i=0; i < people.length-1; i++)
        {
            for(int j=0; j < people.length-1-i; j++)
            {
                if(people[j].age > people[j+1].age)
                {
                    person temp = people[j]; 
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }
            }
        }
        System.out.println("Отсортированный список по размеру: ");
        System.out.println("Фамилия" + "\t"+ "имя" + "\t"+ "\t" +
                "Возраст" + "\t" + "Размер" + "\n" + "_____________________________________________________");
        for(int i=0; i< people.length; i++){
            System.out.println(people[i].Surname + "\t"+ "\t" + people[i].Name + "\t" + "\t" + "\t" +
                    people[i].age + "\t" + "\t" + "\t" + "\t" + people[i].size);
        }

      
        sc.nextLine();
        System.out.println("Введите фамилию человека чтобы найти его:");
        String search_title = sc.nextLine();
        int num = -1;
        for(int i=0; i< people.length; i++)
        {
            if(search_title.equalsIgnoreCase(people[i].Surname))
                num = i;
        }
        System.out.println("Найденые люди:");
        if(num != -1)
        {
            System.out.println("Фамилия" + "\t"+ "имя" + "\t"+ "\t" +
                    "Возраст" + "\t" + "Размер" + "\n" + "_____________________________________________________");
            System.out.println(people[num].Surname + "\t"+ "\t" + people[num].Name + "\t" + "\t" + "\t" +
                    people[num].age + "\t" + "\t" + "\t" + "\t" + people[num].size);
        }
        else System.out.println("Такого человека нет(");

        //редактирование полей
        sc.nextLine();
        int s; 
        System.out.println("Введите фамилию человека которую хотите редактировать: ");
        String inputTitle = sc.nextLine();
        for(int i=0; i< people.length; i++) {
            if (inputTitle.equalsIgnoreCase(people[i].Surname)) {
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
        for(int i=0; i< people.length; i++)
        {
                s=i;
                if(inputField == 1)
                {
                    String t;
                    System.out.println("Введите новую фамилию человека:");
                    t = sc.nextLine();
                    people[s].Surname = t;
                    System.out.println("Фамилия" + "\t"+ "имя" + "\t"+ "\t" +
                            "возраст" + "\t" + "размер" + "\n" + "_____________________________________________________");
                    for(person c: people) //вывод
                    {
                        System.out.println(c.Surname + "\t"+ "\t" + c.Name + "\t" + "\t" + "\t" +
                                c.age + "\t" + "\t" + "\t" + "\t" + c.size);
                    }
                }
                else if(inputField == 2)
                {
                    System.out.println("Введите новое имя человека:");
                    people[s].Name = sc.nextLine();
                    System.out.println("фамилия" + "\t"+ "имя" + "\t"+ "\t" +
                    "возраст" + "\t" + "размер" + "\n" + "_____________________________________________________");
                    for(person c: people) //вывод
                    {
                    System.out.println(c.Surname + "\t"+ "\t" + c.Name + "\t" + "\t" + "\t" +
                    c.age + "\t" + "\t" + "\t" + "\t" + c.size);
                    }
                }
                else if(inputField == 3)
                {
                    System.out.println("Введите новый возраст:");
                    people[s].age = sc.nextInt();
                    System.out.println("фамилия" + "\t"+ "имя" + "\t"+ "\t" +
                            "возраст" + "\t" + "размер" + "\n" + "_____________________________________________________");
                    for(person c: people) //вывод
                    {
                        System.out.println(c.Surname + "\t"+ "\t" + c.Name + "\t" + "\t" + "\t" +
                                c.age + "\t" + "\t" + "\t" + "\t" + c.size);
                    }
                }
                else if(inputField == 4)
                {
                    System.out.println("Введите новый размер:");
                    people[s].size = sc.nextInt();
                    System.out.println("вамилия" + "\t"+ "имя" + "\t"+ "\t" +
                            "возраст" + "\t" + "размер" + "\n" + "_____________________________________________________");
                    for(person c: people) //вывод
                    {
                        System.out.println(c.Surname + "\t"+ "\t" + c.Name + "\t" + "\t" + "\t" +
                                c.age + "\t" + "\t" + "\t" + "\t" + c.size);
                    }
                }
        }
    }
}

