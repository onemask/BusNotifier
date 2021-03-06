package com.onemask.busalime.Station;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import com.onemask.busalime.Activity.StationActivity;

public class StationClickListener implements AdapterView.OnItemClickListener {

    Context currentContext;
    Station currentStation;

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        currentContext = parent.getContext();
        currentStation = (Station)( parent.getAdapter().getItem(position) );

        Intent intent = new Intent(currentContext, StationActivity.class);
        intent.putExtra("station", currentStation);
        currentContext.startActivity(intent);

    }
}
