package assignment.android.acadgild.layoutfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by DivyaVipin on 12/31/2016.
 */
public class MainFragment extends Fragment implements View.OnClickListener {
    Button btnLayout1;
    Button btnLayout2;
    Button btnLayout3;
    Button btnLayout4;
    public MainFragment()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView = inflater.inflate(R.layout.mainfragment, container, false);
        btnLayout1 = (Button) myView.findViewById(R.id.btnLay1);
        btnLayout2 = (Button) myView.findViewById(R.id.btnLay2);
        btnLayout3 = (Button) myView.findViewById(R.id.btnLay3);
        btnLayout4 = (Button) myView.findViewById(R.id.btnLay4);
        btnLayout1.setOnClickListener(this);
        btnLayout2.setOnClickListener(this);
        btnLayout3.setOnClickListener(this);
        btnLayout4.setOnClickListener(this);
        return myView;
       // return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnLay1:
            {
                FragmentManager fragmentManager=getFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Layout1 fragmentShow=new Layout1();
                fragmentTransaction.replace(R.id.fragmentcontainer,fragmentShow);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            }
            case R.id.btnLay2:
            {
                FragmentManager fragmentManager=getFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Layout2 fragmentShow=new Layout2();
                fragmentTransaction.replace(R.id.fragmentcontainer,fragmentShow);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            }
            case R.id.btnLay3:
            {
                FragmentManager fragmentManager=getFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Layout3 fragmentShow=new Layout3();
                fragmentTransaction.replace(R.id.fragmentcontainer,fragmentShow);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            }
            case R.id.btnLay4:
            {
                FragmentManager fragmentManager=getFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Layout4 fragmentShow=new Layout4();
                fragmentTransaction.replace(R.id.fragmentcontainer,fragmentShow);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            }
            default:
                break;
        }

    }
}
