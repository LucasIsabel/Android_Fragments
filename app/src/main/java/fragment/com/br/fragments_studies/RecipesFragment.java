package fragment.com.br.fragments_studies;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lucas on 24/10/16.
 */

public class RecipesFragment extends Fragment {

    private static final String TAG = RecipesFragment.class.getSimpleName();

    public RecipesFragment(){

    }

    @Override
    public void onAttach(Context context) {
        Log.v(TAG,"On Attach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.v(TAG,"On Create");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_recipe, container, false);
        return rootView;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.v(TAG,"On Activity");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.v(TAG,"On Start");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.v(TAG,"On Resume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.v(TAG,"On Pause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.v(TAG,"On Stop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.v(TAG,"On DestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.v(TAG,"On Destroy");
        super.onDestroy();
    }
}
