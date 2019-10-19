package phamtanphat.ptp.khoaphamtraining.androidbasic08102019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

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
        inChinhPhuong();
        inNguyenTo();
    }
    //1 : access modifier : pham vi truy cập của biến , class , function
    // 2 : gia trị trả về
//    private String showName(String name){
//        return  name;
//
//    }
    private void inSoChan(){
        for (int i = 0 ; i <= 100 ; i+= 2) Log.d("BBB",i + "");
    }
    private void inSoLe(){
        for (int i = 1 ; i <= 100 ; i+= 2) Log.d("BBB",i + "");
    }
    private void inSoChiaBaDuMot(){
        for (int i = 1 ; i <= 100 ; i+= 3) Log.d("BBB",i + "");
    }



}
