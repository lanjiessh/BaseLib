package com.ryeex.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.ciwor.app.R;

/**
 * Toast工具类
 * Created by Vin on 2015/12/31.
 */
public class JToast {

    private static boolean isShow = true;
    static Toast toast;


    private JToast() {
        /** cannot be instantiated **/
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showShort(Context context, CharSequence message) {
        if (isShow && !TextUtils.isEmpty(message)) {
            LayoutInflater inflater = LayoutInflater.from(context.getApplicationContext());
            View view = inflater.inflate(R.layout.toast_rectang, null);
            TextView tv = view.findViewById(R.id.toast_content);

            //防止多次点击按钮出现很多toast一直不消失
            if (toast != null) {
                toast.setView(view);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                tv.setText(message);

            } else {
                toast = new Toast(context);
                toast.setView(view);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                tv.setText(message);
            }
            toast.show();
        }
    }

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param res
     */
    public static void showShort(Context context, int res) {
        if (isShow && res > 0) {
            LayoutInflater inflater = LayoutInflater.from(context.getApplicationContext());
            View view = inflater.inflate(R.layout.toast_rectang, null);
            TextView tv = view.findViewById(R.id.toast_content);

            //防止多次点击按钮出现很多toast一直不消失
            if (toast != null) {
                toast.setView(view);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                tv.setText(context.getResources().getString(res));

            } else {
                toast = new Toast(context);
                toast.setView(view);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                tv.setText(context.getResources().getString(res));
            }
            toast.show();
        }
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showLong(Context context, CharSequence message) {
        if (isShow && !TextUtils.isEmpty(message)) {
            LayoutInflater inflater = LayoutInflater.from(context.getApplicationContext());
            View view = inflater.inflate(R.layout.toast_rectang, null);
            TextView tv = view.findViewById(R.id.toast_content);

            //防止多次点击按钮出现很多toast一直不消失
            if (toast != null) {
                toast.setView(view);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                tv.setText(message);

            } else {
                toast = new Toast(context);
                toast.setView(view);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                tv.setText(message);
            }
            toast.show();
        }
    }


}
