package com.example.testfullapp;

import android.location.Address;
import android.location.Geocoder;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class Map extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    SupportMapFragment mapFragment;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        searchView = findViewById( R.id.search );
        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById( R.id.map);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        searchView.setOnQueryTextListener( new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                String location = searchView.getQuery().toString();
                List<Address> addressList = null;

                if (location != null || !location.equals("")){
                    Geocoder geocoder = new Geocoder( Map.this );
                    try {
                        addressList = geocoder.getFromLocationName(location,1  );
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Address address = addressList.get( 0 );
                    LatLng latLng = new LatLng( address.getLatitude(), address.getLongitude() );
                    mMap.addMarker( new MarkerOptions().position( latLng ).title( location ) );
                    mMap.animateCamera( CameraUpdateFactory.newLatLngZoom( latLng, 10 ) );

                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        } );
        mapFragment.getMapAsync( this );
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
//        LatLng tdc = new LatLng(10.856051, 106.758690);
//        mMap.addMarker(new MarkerOptions().position(tdc).title("Marker in TDC"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(tdc));

        LatLng tdc = new LatLng( 10.852204, 106.758541 );
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom( tdc, 18 ) );
        mMap.addMarker( new MarkerOptions()
                .title( "Trường Cao Đẳng Công nghệ Thủ Đức" )
                .snippet( "53 Võ Văn Ngân, Linh Chiểu, Thủ Đức, Hồ Chí Minh, Việt Nam" )
                .position( tdc ));

    }

    public void onZoom (View view){
        if(view.getId() == R.id.zoomin)
        {
            mMap.animateCamera( CameraUpdateFactory.zoomIn());
        }
        if (view.getId() == R.id.zoomout)
        {
            mMap.animateCamera( CameraUpdateFactory.zoomOut());
        }
    }
    public void changeType (View view)
    {
        if (mMap.getMapType() == GoogleMap.MAP_TYPE_NORMAL)
        {
            mMap.setMapType( GoogleMap.MAP_TYPE_SATELLITE );
        }
        else if (mMap.getMapType() == GoogleMap.MAP_TYPE_SATELLITE)
        {
            mMap.setMapType( GoogleMap.MAP_TYPE_HYBRID);
        }
        else if (mMap.getMapType() == GoogleMap.MAP_TYPE_HYBRID)
        {
            mMap.setMapType( GoogleMap.MAP_TYPE_TERRAIN);
        }
        else if (mMap.getMapType() == GoogleMap.MAP_TYPE_TERRAIN)
        {
            mMap.setMapType( GoogleMap.MAP_TYPE_NORMAL);
        }
    }
}
