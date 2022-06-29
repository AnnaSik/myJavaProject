package school.lesson4.Task6;
import school.lesson4.Task6.Payment;
import java.io.IOException;

public class PaymentMain {

    public static void main(String[] args) throws IOException
    {
        try {
            Payment arr1 = new Payment("Первая покупка");
            arr1.setPayment();
            Payment arr2 = new Payment("Вторая покупка");
            arr2.setPayment();
            arr1.print();
            arr2.print();
        }
        catch (NumberFormatException e)
        {
            System.out.println("Неверный формат");
        }
        catch(NullPointerException e)
        {
            System.out.println("Массив не создан");
        }
    }
}