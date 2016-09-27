package com.example.ziyi.fragmentpractice;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.example.ziyi.fragmentpractice.Words.WordsContent;

public class MainActivity extends Activity implements ItemFragment.OnListFragmentInteractionListener,DetailFragment.OnFragmentInteractionListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onListFragmentInteraction(WordsContent.WordsItem item) {
        Bundle bundle = new Bundle();
        String id = item.id;
        bundle.putString("id",id);
        DetailFragment detailFragment = new DetailFragment();
        detailFragment.setArguments(bundle);
        getFragmentManager().beginTransaction().replace(R.id.worddetail,detailFragment).commit();
    }

    public void onFragmentInteraction(Uri uri) {


    }
}
