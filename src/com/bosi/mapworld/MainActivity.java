package com.bosi.mapworld;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public class MainActivity extends FragmentActivity implements
		OnMapClickListener {

	private GoogleMap mMap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mMap = ((SupportMapFragment) getSupportFragmentManager()
				.findFragmentById(R.id.map)).getMap();
		mMap.setOnMapClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void onMapClick(final LatLng point) {
		// TODO Auto-generated method stub

	/*	AlertDialog alert = new AlertDialog.Builder(MainActivity.this).create();
		alert.setTitle("Choose The Item");
		alert.setMessage("you can select option");
		alert.setButton("stay", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				mMap.addMarker(new MarkerOptions().position(point).icon(
						BitmapDescriptorFactory
								.fromResource(R.drawable.ic_launcher)));
			}
		});
		alert.setButton("food", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				mMap.addMarker(new MarkerOptions().position(point).icon(
						BitmapDescriptorFactory
								.fromResource(R.drawable.ic_launcher)));
			}
		});
		alert.setButton("Place", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				mMap.addMarker(new MarkerOptions().position(point).icon(
						BitmapDescriptorFactory
								.fromResource(R.drawable.ic_launcher)));
			}
		});
		alert.setButton("Toilet", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				mMap.addMarker(new MarkerOptions().position(point).icon(
						BitmapDescriptorFactory
								.fromResource(R.drawable.ic_launcher)));
			}
		});

		alert.show();
*/
		
		// mMap.addMarker(new MarkerOptions().position(point).icon(
		// BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher)));
		
		//mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mMap.addMarker(new MarkerOptions()
		        .position(point)
		        .title("Hello world"));

	}

}
