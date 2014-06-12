package com.example.fivescrolls;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.glass.app.Card;
import com.google.android.glass.widget.CardScrollAdapter;
import com.google.android.glass.widget.CardScrollView;


public class MainActivity extends Activity {

    private List<Card> mCards;
    private CardScrollView mCardScrollView;
  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createCards();

        mCardScrollView = new CardScrollView(this);
        ExampleCardScrollAdapter adapter = new ExampleCardScrollAdapter();
   
        mCardScrollView.setAdapter(adapter);
        mCardScrollView.activate(); //wink here
        setContentView(mCardScrollView);
    }

    private void createCards() {
    	Log.i("Grace","MainActivity Live Cards Test");
        mCards = new ArrayList<Card>();

        Card card;

        card = new Card(this);
        card.setText("livecards");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("LB Broth");
        mCards.add(card);

        card = new Card(this);
        card.setText("Obtain bottle of LB Broth media powder");
        card.setFootnote("LB Broth 1/10");
        mCards.add(card);
        
        
        card = new Card(this);
        card.setText("Obtain clean glass bottle with screw cap\n" + 
        		"NOTE: bottle volume must be at least twice the volume you intend to make");
        card.setFootnote("LB Broth 2/10");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Label bottle with lab tape: name of media, date and your initials");
        card.setFootnote("LB Broth 3/10");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Weigh out media:\n20g/1L = 0.02 g per 1mL of water\n__ mLs water x 0.02 g = __ g to weigh");
        card.setFootnote("LB Broth 4/10");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Volume of water: _________");
        card.setFootnote("LB Broth 5/10");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Amount of LB Broth powder: __________");
        card.setFootnote("LB Broth 6/10");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Mix powder with water in bottle until fully dissolved.\nClose bottle securely and shake to mix");
        card.setFootnote("LB Broth 7/10");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Loosen cap - DO NOT SKIP THIS STEP");
        card.setFootnote("LB Broth 8/10");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Autoclave on liquid setting (setting 1 for <500mL, setting 2 for >500mL)");
        card.setFootnote("LB Broth 9/10");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Close cap and store on bench until use");
        card.setFootnote("LB Broth 10/10");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("LB Agar");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Obtain bottle of LB Agar media powder");
        card.setFootnote("LB Agar 1/20");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Obtain clean glass flask\nNOTE: flask volume must be 300mLs or more the volume you intend to make");
        card.setFootnote("LB Agar 2/20");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Label flask with lab tape: name of media, date and your initials");
        card.setFootnote("LB Agar 3/20");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Obtain stir bar and place in flask - DO NOT SKIP THIS STEP");
        card.setFootnote("LB Agar 4/20");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Weigh out media as described below\n35g/1L = 0.035 g per 1mL of water\n____mLs water x 0.035 g = ____ g to weigh");
        card.setFootnote("LB Agar 5/20");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Volume of water: _________");
        card.setFootnote("LB Agar 6/20");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Amount of LB Agar powder: __________");
        card.setFootnote("LB Agar 7/20");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Cover flask top with tin foil and stick autoclave tape on top");
        card.setFootnote("LB Agar 8/20");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Mix powder with water in flask until fully dissolved\nPlace flask on stir plate and stir on medium speed until dissolved");
        card.setFootnote("LB Agar 9/20");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Autoclave on liquid setting (setting 1 for <500mL, setting 2 for >500mL)");
        card.setFootnote("LB Agar 10/20");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Spin on medium speed until temperature is safe to the touch (~30-45mins)");
        card.setFootnote("LB Agar 11/20");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("If making antibiotic plates:");
        card.setFootnote("LB Agar 12/20");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Pull out 30-35 plates per 700mLs media and label side with black stripes\n"
        		+ "1 stripe = plain LB\n2 stripes = LB + Kanamycin\n3 stripes = LB + Ampicillin\n4 stripes = LB + Chloramphenicol");
        card.setFootnote("LB Agar 13/20");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("While media cools, thaw 1000x stock of antibiotic on bench");
        card.setFootnote("LB Agar 14/20");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Add antibiotic once cool as follows:");
        card.setFootnote("LB Agar 15/20");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Add \"x\"uL of antibiotic to \"x\"mL of agar to get 1x concentration\n"
        		+ "Ex: 700uL of 1000x antibiotic to 700mLs of agar");
        card.setFootnote("LB Agar 16/20");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Once media is cooled and antibiotics added (if applicable), pour plates\n"
        		+ "using aseptic technique - pour agar into plates until bottom of plate"
        		+ "is completely covered");
        card.setFootnote("LB Agar 17/20");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Let plates sit on bench to harden (~1 hour)");
        card.setFootnote("LB Agar 18/20");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Once hardened, flip plates upsidedown and slide bag over the stack");
        card.setFootnote("LB Agar 19/20");
        mCards.add(card);
        
        card = new Card(this);
        card.setText("Label the bag and store at 4 degrees Celsius until use\nLabel includes: your initials, date, type of plate (ex: LB + Amp)");
        card.setFootnote("LB Agar 20/20");
        mCards.add(card);
    }

    private class ExampleCardScrollAdapter extends CardScrollAdapter {

        @Override
        public int getPosition(Object item) {
            return mCards.indexOf(item);
        }

        @Override
        public int getCount() {
            return mCards.size();
        }

        @Override
        public Object getItem(int position) {
            return mCards.get(position);
        }

        @Override
        public int getViewTypeCount() {
            return Card.getViewTypeCount();
        }

        @Override
        public int getItemViewType(int position){
            return mCards.get(position).getItemViewType();
        }

        @Override
        public View getView(int position, View convertView,
                ViewGroup parent) {
            return  mCards.get(position).getView(convertView, parent);
        }
    }
}