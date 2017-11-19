package hackwestern.safeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.util.Log;
//import android.widget.Toast;
//
//import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
//import com.google.android.gms.common.GooglePlayServicesRepairableException;
//import com.google.android.gms.common.GooglePlayServicesUtil;
//import com.google.android.gms.location.places.Place;
//import com.google.android.gms.location.places.ui.PlacePicker;
//
//import com.example.google.playservices.placepicker.cardstream.Card;
//import com.example.google.playservices.placepicker.cardstream.CardStream;
//import com.example.google.playservices.placepicker.cardstream.CardStreamFragment;
//import com.example.google.playservices.placepicker.cardstream.OnCardClickListener;

//API key: AIzaSyAdZoZqMimxR8MCPEm2UfCYR4xVAnBf7HQ
public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(hackwestern.safeto.R.layout.activity_search);
    }

//    int PLACE_PICKER_REQUEST = 1;
//    PlacePicker.IntentBuilder builder = new PlacePicker.IntentBuilder();
//
//    startActivityForResult(builder.build(this), PLACE_PICKER_REQUEST);
//
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == PLACE_PICKER_REQUEST) {
//            if (resultCode == RESULT_OK) {
//                Place place = PlacePicker.getPlace(data, this);
//                String toastMsg = String.format("Place: %s", place.getName());
//                Toast.makeText(this, toastMsg, Toast.LENGTH_LONG).show();
//            }
//        }
//    }
}
