package forfun.good.a2017122802;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CL1(View v)
    {
        Intent it = new Intent();
        it.setAction("ACE56");
        it = Intent.createChooser(it,"隨便選一個用吧^^");
        startActivity(it);
    }
}
