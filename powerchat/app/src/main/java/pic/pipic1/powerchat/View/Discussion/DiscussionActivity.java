package pic.pipic1.powerchat.View.Discussion;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import pic.pipic1.powerchat.R;

public class DiscussionActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discussion);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("The subject");
        setSupportActionBar(toolbar);
    }


}
