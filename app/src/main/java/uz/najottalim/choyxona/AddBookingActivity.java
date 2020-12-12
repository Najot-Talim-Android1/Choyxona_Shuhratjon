package uz.najottalim.choyxona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class AddBookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton room1Radio = findViewById(R.id.room1_radio_button);
        RadioButton room2Radio = findViewById(R.id.room2_radio_button);
        EditText numberOfPeopleEdit = findViewById(R.id.number_of_people_edit_text);
        EditText enterDateEdit = findViewById(R.id.enter_date_edit_text);
        RadioButton foodOshRadio = findViewById(R.id.food_osh_radio_button);
        RadioButton foodQozonKabobRadio = findViewById(R.id.food_qozon_kabob_radio_button);

        Button addBookingButton = findViewById(R.id.add_booking_button);
        Button bookingListButton = findViewById(R.id.booking_list_button);

        addBookingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String room1 = room1Radio.getText().toString();
                String room2 = room2Radio.getText().toString();
                String numberOfPeople = numberOfPeopleEdit.getText().toString();
                String enterDate = enterDateEdit.getText().toString();
                String foodOshPrice = foodOshRadio.getText().toString();
                String foodQozonKabobPrice = foodQozonKabobRadio.getText().toString();

                int parsedRoom1 = Integer.parseInt(room1);
                int parsedRoom2 = Integer.parseInt(room2);
//                int parsedNumberOfPeople = Integer.parseInt(numberOfPeople);

                Choyxona addBooking = new Choyxona(parsedRoom1, parsedRoom2, foodOshPrice,foodQozonKabobPrice, numberOfPeople,enterDate);

                Choyxona.getAddBooking().add(addBooking);


            }
        });
        bookingListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AddBookingActivity.this, BookingListActivity.class);
                startActivity(intent);

            }
        });

    }


}