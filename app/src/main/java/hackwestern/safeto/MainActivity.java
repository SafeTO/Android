package hackwestern.safeto;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button dashboardButton;
    Button safewalkButton;
    Button searchButton;
    Button resourcesButton;
    Button reportButton;
    Button settingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(hackwestern.safeto.R.layout.activity_main);

        /* Load buttons */
        dashboardButton = findViewById(hackwestern.safeto.R.id.dashboardBtn);
        safewalkButton = findViewById(hackwestern.safeto.R.id.safewalkBtn);
        searchButton = findViewById(hackwestern.safeto.R.id.searchBtn);
        resourcesButton = findViewById(hackwestern.safeto.R.id.resourcesBtn);
        reportButton = findViewById(hackwestern.safeto.R.id.reportBtn);
        settingButton = findViewById(hackwestern.safeto.R.id.settingBtn);

        //Clickers for buttons
        dashboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDashboard();
            }
        });

        safewalkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchSafeWalk();
            }
        });

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchSearch();
            }
        });

        resourcesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchResources();
            }
        });

        reportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchReport();
            }
        });

        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchSetting();
            }
        });

    }

    public void launchDashboard() {
        Intent intent = new Intent(this, DashboardActivity.class);
        startActivity(intent);
    }

    public void launchSafeWalk() {
        Intent intent = new Intent(this, safeWalkActivity.class);
        startActivity(intent);
    }

    public void launchSearch() {
        Intent intent = new Intent (this, SearchActivity.class);
        startActivity(intent);
    }

    public void launchResources() {
        Intent intent = new Intent (this, ResourcesActivity.class);
        startActivity(intent);
    }

    public void launchReport() {
        Intent intent = new Intent (this, ReportActivity.class);
        startActivity(intent);
    }

    public void launchSetting() {
        Intent intent = new Intent (this, SettingsActivity.class);
        startActivity(intent);
    }




}
