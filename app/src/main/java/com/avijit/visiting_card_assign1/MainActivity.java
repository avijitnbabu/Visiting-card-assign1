package com.avijit.visiting_card_assign1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
////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

    //TextView phoneTxt = findViewById(R.id.phoneField);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t = (TextView) findViewById(R.id.locationField);
        t.setText(Html.fromHtml(
                "Address: " +
                        "<a href=\"http://maps.google.com/maps?q=1+Infinite+Loop,+Cupertino,+Santa+Clara,+California+95014\">" +
                        "Find the Head Office in Google map" +
                        "</a>"));
        t.setMovementMethod(LinkMovementMethod.getInstance());

        TextView porichoyTxt = (TextView) findViewById(R.id.titleField1);
        porichoyTxt.setText(Html.fromHtml(
                        "<a href=\"http://porichoy.gov.bd\">" +
                        "Porichoy" +
                        "</a>"));
        porichoyTxt.setMovementMethod(LinkMovementMethod.getInstance());

        TextView digiconTxt = (TextView) findViewById(R.id.titleField3);
        digiconTxt.setText(Html.fromHtml(
                "<a href=\"http://digicontechnologies.com\">" +
                        "Digicon Technologies Ltd" +
                        "</a>"));
        digiconTxt.setMovementMethod(LinkMovementMethod.getInstance());

    }


}