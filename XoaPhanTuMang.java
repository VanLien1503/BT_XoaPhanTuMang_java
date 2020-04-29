package BT_XoaPhanTuMang.BT_XoaPhanTuMang_java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        //khai báo và kiểm tra kích thước của mảng
        int size;//tạo độ dài cảu mảng
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập Độ Dài Của Mảng..!");
            size = scanner.nextInt();
            if (size > 10) {
                System.out.println("Độ Dài của Mảng Nhỏ Hơn 10");
            }
        } while (size > 10);
        array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20) + 1;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập Số Muốn xóa..!");
        int inputNumber = scanner.nextInt();
        int count=0;
        int index=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == inputNumber) {
                count++;
                index=i;
                System.out.println("Tìm thấy Phần tử "+count+" = "+inputNumber+"\n"+"Có Chỉ Số : "+index);
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
            }
        }
        int [] arrNew=new int[array.length-count];
        for (int i=0;i<array.length-count;i++){
            arrNew[i]=array[i];
        }
        System.out.println("Mảng Sau Khi Bị Xóa Là: ");
        System.out.println(Arrays.toString(arrNew));
    }
}
