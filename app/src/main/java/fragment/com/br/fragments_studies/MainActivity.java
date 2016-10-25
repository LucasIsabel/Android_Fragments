package fragment.com.br.fragments_studies;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private RecipesFragment recipesFragment;
    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipesFragment = new RecipesFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.recipes_container, recipesFragment, "Recipes Fragment");
        transaction.commit();

    }

    @Override
    protected void onStart() {

        Log.v(TAG, "onSTART");

        super.onStart();
    }

    @Override
    protected void onResume() {

        Log.v(TAG, "onResume");

        super.onResume();
    }

    @Override
    protected void onPause() {

        Log.v(TAG, "onPause");

        super.onPause();
    }

    @Override
    protected void onStop() {

        Log.v(TAG, "onSTOP");

        super.onStop();
    }

    @Override
    protected void onDestroy() {

        Log.v(TAG, "onDestroy");

        super.onDestroy();
    }
}
