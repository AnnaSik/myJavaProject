package school.lesson4.Task6;

import java.io.IOException;
import java.util.Scanner;
public class Payment {
    private String productType;
    private Product[] smName;
    private int cost;

    private class Product {
        private String name;
        private int price;

        public Product() {
            super();
            name = "";
            price = 0;
        }
        public Product(String name, int price) {
            super();
            this.name = name;
            this.price = price;
        }
        public String getName() {
            return this.name;
        }

        public int getPrice() {
            return this.price;
        }
    }

    public Payment() {
        super();
        this.productType = "";
        this.cost = 0;
    }
    public Payment (String productType){
        super();
        this.productType=productType;
    }

    public void setPayment() throws IOException
    {
        this.cost = 0;
        System.out.print("Приобрести количество товаров: ");

        Scanner in = new Scanner(System.in);
        try
        {
            int x = in.nextInt();
            smName = new Product[x];

            for(int i = 0; i < x; i++)

            {
                System.out.println("Товар " + (i+1) + ": ");
                System.out.print("Наименование: ");
                String productType = in.next();
                System.out.print("Цена: ");
                int productCost = in.nextInt();

                smName [i] = new Product(productType, productCost);
                this.cost = this.cost + smName[i].price;
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Неверный формат");
        }
        catch(NegativeArraySizeException e)
        {
            System.out.println("Массив не может быть < 0");
        }
        catch (NullPointerException e)
        {
            System.out.println(); System.out.println("Массив не создан");
        }
    }
    public void print() throws IOException

    {
        try
        {
            if(this.smName.length != 0)
            {
                System.out.println("============================");
                System.out.println(" " + this.productType);
                System.out.println("============================");
                for(int i = 0; i < this.smName.length; i++)
                {
                    System.out.printf("%3d", i+1); System.out.printf("%15s",

                        this.smName[i].price); System.out.printf("%10d",

                        this.smName[i].price); System.out.println();
                }

                System.out.println("============================");
                System.out.print("Итого сумма: ");
                System.out.printf("%11d", this.cost);
                System.out.println();
                System.out.println("============================");
            }
            else
            {
                System.out.println(); System.out.println("Массив не создан");
            }
        }
        catch(NullPointerException e)
        {
            System.out.println(); System.out.println("Массив не создан");
        }
    }
}