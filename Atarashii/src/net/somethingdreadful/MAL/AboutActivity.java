package net.somethingdreadful.MAL;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

import org.holoeverywhere.app.Activity;

public class AboutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle(R.string.title_activity_about);

        ((Card) findViewById(R.id.atarashii_card)).setContent(R.layout.card_about_atarashii);
        ((Card) findViewById(R.id.contributors_card)).setContent(R.layout.card_about_contributors);
        ((Card) findViewById(R.id.community_card)).setContent(R.layout.card_about_community);
        ((Card) findViewById(R.id.acknowledgements_card)).setContent(R.layout.card_about_acknowledgements);
        TextView animaMalContent = (TextView) findViewById(R.id.contributor_anima_name);
        TextView motokochanMalContent = (TextView) findViewById(R.id.contributor_motokochan_name);
        TextView apkawaMalContent = (TextView) findViewById(R.id.contributor_apkawa_name);
        TextView dskoMalContent = (TextView) findViewById(R.id.contributor_dsko_name);
        TextView acknowledgementsContent = (TextView) findViewById(R.id.acknowledgements_card_content);
        TextView communityContent = (TextView) findViewById(R.id.community_card_content);

        animaMalContent.setMovementMethod(LinkMovementMethod.getInstance());
        motokochanMalContent.setMovementMethod(LinkMovementMethod.getInstance());
        apkawaMalContent.setMovementMethod(LinkMovementMethod.getInstance());
        dskoMalContent.setMovementMethod(LinkMovementMethod.getInstance());
        communityContent.setMovementMethod(LinkMovementMethod.getInstance());
        acknowledgementsContent.setMovementMethod(LinkMovementMethod.getInstance());

        NfcHelper.disableBeam(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
        }
        return true;
    }
}
