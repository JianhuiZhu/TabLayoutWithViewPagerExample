package com.tofohack.jianhui_zhu.tablayoutwithviewpagerexample;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jianhuizhu on 15-09-05.
 */
public class PageFragment extends Fragment {
     Context context;
    @Bind(R.id.textInPage)
    TextView textView;
    @Bind(R.id.imageInPage)
    ImageView imageView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.page_fragment,container,false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int pageNum=getArguments().getInt("Page");
        textView.setText("Squirrel "+(pageNum+1));
        switch(pageNum){
            case 0:
                imageView.setImageResource(R.drawable.squirrel1);
                break;
            case 1:
                imageView.setImageResource(R.drawable.squirrel2);
                break;
            case 2:
                imageView.setImageResource(R.drawable.squirrel3);
                break;
        }
    }
    public static PageFragment newInstance(Context context,int pageNum){
        PageFragment pageFragment=(PageFragment)instantiate(context,PageFragment.class.getName());
        pageFragment.context=context;
        Bundle bundle=new Bundle();
        bundle.putInt("Page", pageNum);
        pageFragment.setArguments(bundle);
        return pageFragment;
    }
}
