package assignment.android.acadgild.layoutfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by DivyaVipin on 12/31/2016.
 */
public class Layout1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.layout1, container, false);

        return myView;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }

    // Inflate the layout for this fragment

}
