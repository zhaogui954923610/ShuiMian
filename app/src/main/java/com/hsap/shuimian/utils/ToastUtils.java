package com.hsap.shuimian.utils;

import android.content.Context;
import android.widget.Toast;

import com.hsap.shuimian.R;
import com.muddzdev.styleabletoastlibrary.StyleableToast;

/**
 * Created by zhao on 2017/11/17.
 */

public class ToastUtils {
    public static void showToast(Context context, String text){
        StyleableToast.makeText(context,text, Toast.LENGTH_SHORT, R.style.MyToast).show();
    }

}
