# TimeTicker
This is a custom countdown widget,with the rolling-over 3D effect.
##如何使用
###1.在根布局中添加自定义属性的标签
xmlns:custom="http://schemas.android.com/apk/res-auto"
然后在布局文件中放置view
```xml
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
```
###2.在使用的Activity中设置时间和监听的回调
```java
        myClockView= (MyClockView) findViewById(R.id.myClockView);
        myClockView.setDownCountTime(1000*60*60*24*3+1000*12);
        myClockView.startDownCountTimer();
        myClockView.setDownCountTimerListener(this);
```
##注意：
1.如果有部分机型不适配，可以在xml的布局中设置padding属性
2.部分机型在翻转动画时出现闪烁的现象，请将硬件加速关掉。具体代码如下：
```java
myClockView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
```
