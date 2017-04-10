package com.mothed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData1();
    }


    //直接插入排序
    private void initData1() {
        int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};

        for(int i=1;i<a.length;i++){
            int j=i-1;
            int temp=a[i];

          // 因为前i-1个数都是从小到大的有序序列，所以只要当前比较的数(list[j])比temp大，就把这个数后移一位

                for(;j>=0&&temp<a[j];j--){
                    a[j+1]=a[j];  //将大于temp的值整体后移一个单位
                }
                a[j+1]=temp;//将元素插入到相应位置
        }

        for(int i=0;i<a.length;i++){
            Log.e("METHOD",""+a[i]);
        }
    }



}
