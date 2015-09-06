# TabLayoutWithViewPagerExample
A simple example showing how to use tablayout with viewpager    
![alt tag](https://github.com/JianhuiZhu/TabLayoutWithViewPagerExample/blob/master/example.gif)   
    Key word: material design, tablayout, viewpager example   
#Library    
    compile 'com.jakewharton:butterknife:7.0.1'   
    compile 'com.android.support:design:23.0.1'   
#XML Layout file
    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
      xmlns:tools="http://schemas.android.com/tools"
      xmlns:app="http://schemas.android.com/apk/res-auto"
      android:layout_width="match_parent"
      android:layout_height="match_parent"
      android:orientation="vertical"
      tools:context=".MainActivity">
      <android.support.design.widget.TabLayout
          android:id="@+id/sliding_tabs"
          android:layout_width="match_parent"
          android:layout_height="wrap_content"
          app:tabMode="fixed"
          app:tabGravity="fill" />
      <android.support.v4.view.ViewPager
          xmlns:android="http://schemas.android.com/apk/res/android"
          android:id="@+id/viewpager"
          android:layout_width="match_parent"
          android:layout_height="wrap_content" />
      </LinearLayout>
