package c4q.com.retake;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

/**
 * Created by D on 1/16/18.
 */

public class ListActivity  extends AppCompatActivity{

    RecyclerView recyclerView = findViewById(R.id.recycler_view);
    String  intent = getIntent().getStringExtra("current");




    BlankFragment blankFragment = new BlankFragment();
    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    Bundle bundle = new Bundle();
        bundle.putString("stuff",intent);
        blankFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.container,blankFragment);
        fragmentTransaction.commit();




}
