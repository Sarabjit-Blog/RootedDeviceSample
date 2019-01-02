package blog.sarabjit.rooteddevicesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.isRootedButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isDeviceRooted = new RootUtil().isRooted();
                Toast.makeText(MainActivity.this, getString(R.string.is_device_rooted) + isDeviceRooted,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
