package phamtanphat.ptp.khoaphamtraining.androidbasic08102019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    // global scope
//    String mTen;
    // block scope : {}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // local scope
//        String ten;
        // 4 : for vong lặp
        // mảng array
        // null : chưa khai báo vùng nhớ
        // "" : chưa giá trị
//        String[] arrayName = {"Teo","Ti","Tun","Tuan"};
        //for
//        int i = 0;
//         for ( ; i < arrayName.length ; i++){
//            //ctrl + p : gợi ý tham số truyền vào
//            if (arrayName[i].equals("Ti")){
//                break;
//            }
//            Log.d("BBB",arrayName[i]);
//        }
        //for each
//        for (String value : arrayName){
//            Log.d("BBB",value);
//        }
        // 5 : while
//        String[] arrayName = {"Teo","Ti","Tun","Tuan"};
//        int index = 4;
//        do {
//            Log.d("BBB","Nhay vao trong do");
//        }while (index == arrayName.length);
        // 6 : function

//        Log.d("BBB", showName("Phat"));
        // 0 -> 100
        // 1 : in ra so chan
        // 2 : in ra so le
        // 3 : in ra so chia 3 du 1
//        inSoChan();
//        inSole();
//        inSoChiaBaDuMot();
//        inChinhPhuong();
//        inNguyenTo();
        // Math method
        // 1 : Lam tron : Math.round()
//        float number1 = 2.1f;
//        number1 = Math.round(number1);
//        Log.d("BBB",number1 + "");
        // 2 : Lam tron len : 2.1 -> 3
//        double number2 = 2.1f;
//        number2 = Math.ceil(number2);
//        Log.d("BBB",number2 + "");
        // 3 : Lam tron xuong : 2.9 -> 2
//        double number3 = 2.9f;
//        number3 = Math.floor(number3);
//        Log.d("BBB",number3 + "");
        // 4 : Math random
//        for (int i = 0 ; i <= 100 ; i++){
//            double number4 = Math.floor(Math.random() * 6);
//            Log.d("BBB",number4 + "");
//        }
        // 5 : tim ra so lon nhat , so nho nhat
//        int[] arrayNumber = {1,10,11,20,18,19,21,99};
//        int sonhonhat = arrayNumber[0];
//        int solonnhat = 0;
//        for (int value : arrayNumber){
//            solonnhat = Math.max(solonnhat,value);
//            sonhonhat = Math.min(sonhonhat,value);
//        }
//        Log.d("BBB",solonnhat + "");
//        Log.d("BBB",sonhonhat + "");
//        int temp = 0;
//        for (int i = 0 ; i < arrayNumber.length ; i++){
//            if (i < arrayNumber.length - 1){
//                if (arrayNumber[i] > arrayNumber[i + 1]){
//                    temp = arrayNumber[i];
//                    arrayNumber[i] = arrayNumber[i + 1];
//                    arrayNumber[i+1] = temp;
//                }
//            }
//            Log.d("BBB", arrayNumber[i] + "");
//        }
        // 7 : Map
//            + Thay doi phan tu trong mang
//            + Tao ra 1 mang moi voi cac chuc nang duoc thay doi

//       int[] arrayNuber = {1,10,11,20,18,19,21,99};

        // bai tap ve nha :
        //  1 : tinh tong cac gia trong mang
        //  2 : tim kiem gia tri trong mang
//                +Neu co tra ve vi tri
//                +Neu khong co tra ve -1
        // 3 : tim kiem gia tri o vi tri dau tien
//            {1,10,11,20,18,1,21,99};
//            + Neu co in ra vi tri dau tien
//            + Neu khong co in ra gia tri -1
        // 4 : Xoa cac phan tu bi trung trong mang
//            [1,2,3,3,3,4,5] => [1,2,3,4,5]

//       int[] newArray = myMap(new Map() {
//           @Override
//           public int onChangeValue(int value) {
//               return (int) Math.sqrt(value);
//           }
//       }, arrayNuber);
//
//       for (int i = 0 ; i < newArray.length ; i++){
//           Log.d("BBB",newArray[i] + "");
//       }
    }
    //1 : access modifier : pham vi truy cập của biến , class , function
    // 2 : gia trị trả về
//    private String showName(String name){
//        return  name;
//
//    }
//    private void inSoChan(){
//        for (int i = 0 ; i <= 100 ; i+= 2) Log.d("BBB",i + "");
//    }
//    private void inSoLe(){
//        for (int i = 1 ; i <= 100 ; i+= 2) Log.d("BBB",i + "");
//    }
//    private void inSoChiaBaDuMot(){
//        for (int i = 1 ; i <= 100 ; i+= 3) Log.d("BBB",i + "");
//    }
//    private int[] myMap(Map map , int[] array){
//        Map map1 = map;
//        int [] outputArray = new int[array.length];
//        for (int i = 0 ; i < array.length ; i++){
//            outputArray[i] = map1.onChangeValue(array[i]);
//        }
//        return outputArray;
//    }



}
