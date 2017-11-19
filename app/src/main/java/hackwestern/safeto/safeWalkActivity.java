package hackwestern.safeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class safeWalkActivity extends AppCompatActivity {

    Button requestButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(hackwestern.safeto.R.layout.activity_safe_walk);

        requestButton = findViewById(R.id.requestBtn);

        requestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchGoogleMaps();
            }
        });
    }

    public void launchGoogleMaps() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
