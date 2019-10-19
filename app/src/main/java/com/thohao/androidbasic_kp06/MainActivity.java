package com.thohao.androidbasic_kp06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    //global scope - cục bộ
    //String mTen;

    //block scope : {...}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //local scope

        //String ten;

        //for vòng lặp
//mảng Array :
/*
        String[] arrayName = {"Hao","Pham","Van","Uyen"};//mang cố đinh, kg thêm dc phần tử
        */
/*String[] arrayName= new String[5];
        arrayName[4]="Uyen";*//*
 //có thể thêm phtu
        int i=0; // Nen khai báo bên ngoài nhằm tối ưu vùng nhớ
       for ( ; i<arrayName.length;i++){

           //ctrl +p : gợi ý tham số truyền vào
           //Log.d("AAA", arrayName[i]);//xem method có
           //log xuất thông tin ra logcat

           */
/*if(arrayName[i]=="Van"){

           }else{
               Log.d("AAA", arrayName[i]);
           }*//*

           //.equal để ss chuôi, object ss tuyet doi
           if(arrayName[i].equals("Van")){
               continue;
           }
           Log.d("AAA", arrayName[i]);


           //trong log cat tìm keyword "FATAL" tìm lỗi
           //null : chưa khai bao vùng nhớ
           //" " : kg chưa giá trị

       //**- for each, nên dùng for each nhằm tối ưu, nó chỉ gáng
       */
/* for (String value : arrayName){
            Log.d("BBB",value);
       }
       /*
 */

        // 5-While
        /*String[] arrayName = {"Hao","Pham","Van","Uyen"};
        int index=0;*/
        /*while(index<arrayName.length){
            Log.d("AAA", arrayName[index]);
        }*/
       /* do {
                Log.d("AAA", arrayName[index]);

        }while(index==arrayName.length);*/

//6- Function
        //I-acess modifier : pham vi truy cap cua bien,class,function... (public,private..)
        //II-gia tri trả về
 /*    //void kg cần giá trị trả về return
    private String showName(String s){

        return s;
    }*/


        // inSoCHinhPhuong() ; inSoNguyenTo();
        /*int i=0;

        for ( ;i<=100;i++){
            if (i%2==0){
                Log.d("AA","So chẵn");
            }else if (i%3==1){
                Log.d("AA","Chia 3 dư 1");
            }else {
                Log.d("AA","So Lẻ");
            }
        }*/
        }
    private void inSoChan(){
        for (int i=0;i<=100;i+=2) Log.d("AA",i+" ");
    }
    private void inSoLe(){
        for (int i=1;i<=100;i+=2) Log.d("BB",i+" ");
    }
    private void inSochia3du1(){
        for (int i=1;i<=100;i+=3) Log.d("CC",i+" ");
    }

}

