package uz.najottalim.choyxona;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class BookingListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_list);

        LinearLayout bookingListRootLayout = findViewById(R.id.bookingList_root_layout);

        for (int i = 0; i < Choyxona.getAddBooking().size(); i++) {

            LinearLayout itemLayout = new LinearLayout(getApplicationContext());


            RadioButton room1RadioBatton = new RadioButton(getApplicationContext());
            RadioButton room2RadioBatton = new RadioButton(getApplicationContext());
            RadioButton oshRadioBatton = new RadioButton(getApplicationContext());
            RadioButton qozonKabobRadioBatton = new RadioButton(getApplicationContext());
            TextView numberOfPeopleText = new TextView(getApplicationContext());
            TextView dateText = new TextView(getApplicationContext());


//            room1RadioBatton.setTextSize(40F);
//            room1RadioBatton.setTextColor(Color.BLACK);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

            params.setMargins(32, 4, 32, 4);


            room1RadioBatton.setText(String.valueOf(Choyxona.getAddBooking().get(i).getRoom1()));
            room2RadioBatton.setText(String.valueOf(Choyxona.getAddBooking().get(i).getRoom2()));
            oshRadioBatton.setText(Choyxona.getAddBooking().get(i).getosh());
            qozonKabobRadioBatton.setText(Choyxona.getAddBooking().get(i).getqozonKabob());
            numberOfPeopleText.setText(Choyxona.getAddBooking().get(i).getNumberOfPeople());
            dateText.setText(Choyxona.getAddBooking().get(i).getDate());

            itemLayout.addView(room1RadioBatton);
            itemLayout.addView(room2RadioBatton);
            itemLayout.addView(oshRadioBatton);
            itemLayout.addView(qozonKabobRadioBatton);
            itemLayout.addView(numberOfPeopleText);
            itemLayout.addView(dateText);
            itemLayout.setBackgroundColor(Color.YELLOW);
            itemLayout.setLayoutParams(params);
            itemLayout.setOrientation(LinearLayout.VERTICAL);

            bookingListRootLayout.addView(itemLayout);


        }
    }
}