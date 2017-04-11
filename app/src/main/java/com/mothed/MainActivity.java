package com.mothed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData1();
        initData2();
    }

    //简单选择排序
    private void initData2() {

        int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
        // 需要遍历获得最小值的次数
        // 要注意一点，当要排序 N 个数，已经经过 N-1 次遍历后，已经是有序数列
        for (int i = 0; i < a.length-1; i++) {
            int temp = 0;
            int index = i; // 用来保存最小值得索引

            // 寻找第i个小的数值
            for (int j = i + 1; j < a.length; j++) {
                if (a[index] > a[j]) {
                    index = j;
                }
            }

            // 将找到的第i个小的数值放在第i个位置上
            temp = a[index];
            a[index] = a[i];
            a[i] = temp;

        }

        for(int i=0;i<a.length;i++){
            Log.e("METHOD2",""+a[i]);
        }

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
