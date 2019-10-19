package phamtanphat.ptp.khoaphamtraining.androidbasic08102019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

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
    }
}
