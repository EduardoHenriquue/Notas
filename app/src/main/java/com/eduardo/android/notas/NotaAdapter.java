package com.eduardo.android.notas;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

/**
 * Created by Eduardo on 29/09/2016.
 */
public class NotaAdapter extends BaseAdapter {

    private Context mContext;
    private TextView mText;

    public NotaAdapter(Context context) {
        this.mContext = context;
//        this.mText = textView;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        CardView cardView;
        if(view == null){
            cardView = new CardView(mContext);
//            cardView.setContentDescription(mText.getContentDescription());
        } else {
            cardView = (CardView)view.findViewById(R.id.card);
        }
        cardView.findViewById(R.id.card);

        return cardView;
    }

    private Integer[] mCards = {R.id.card, R.id.card};
}
