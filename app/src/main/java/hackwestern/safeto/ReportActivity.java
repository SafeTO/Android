package hackwestern.safeto;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;

public class ReportActivity extends Activity {

    Button reportButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(hackwestern.safeto.R.layout.activity_report);

        reportButton = findViewById(R.id.reportBtn);

        reportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                confirmClick();
            }
        });
    }
    public void confirmClick() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Confirm report?")
                .setTitle("Send a report!")
                .setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // CONFIRM
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // CANCEL
                    }
                });
        // Create the AlertDialog object and return it
        builder.create();
        builder.show();

    }
}
