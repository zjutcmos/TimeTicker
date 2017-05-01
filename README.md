# TimeTicker
This is a custom countdown widget,with the rolling-over 3D effect.
# 如何使用
** 首先在根布局里添加 xmlns:custom="http://schemas.android.com/apk/res-auto" **
<com.zjutcmos.timeticker.MyClockView
    android:id="@+id/myClockView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:background="@drawable/clock_view_bg"
    android:gravity="center"
    custom:dayTextBackground="@drawable/time_bg"
    custom:dayTextColor="#ffffff"
    custom:hourTextBackground="@drawable/time_bg"
    custom:hourTextColor="#ffffff"
    custom:minTextBackground="@drawable/time_bg"
    custom:minTextColor="#ffffff"
    custom:secTextBackground="@drawable/time_bg"
    custom:secTextColor="#ffffff"
    />
