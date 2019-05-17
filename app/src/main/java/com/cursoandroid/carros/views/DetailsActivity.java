package com.cursoandroid.carros.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.cursoandroid.carros.R;
import com.cursoandroid.carros.constants.CarrosConstants;
import com.cursoandroid.carros.data.CarMock;
import com.cursoandroid.carros.entities.Car;

public class DetailsActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();
    private CarMock mCarMock;
    private Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher_carrro);

        // Instancia variaveis
        this.mCarMock = new CarMock(this);


        // Instancia elementos de Interface
        this.mViewHolder.textModel          = (TextView) findViewById(R.id.text_model);
        this.mViewHolder.textHorsePower     = (TextView) findViewById(R.id.text_horse_power);
        this.mViewHolder.textPrice          = (TextView) findViewById(R.id.text_price);
        this.mViewHolder.textManuFacture    = (TextView) findViewById(R.id.text_manufacture);
        this.mViewHolder.imgCarPiture       = (ImageView) findViewById(R.id.img_car_pic);


        this.getDataFromActivity();

        this.setData();
    }

    private void setData(){

        this.mViewHolder.textModel.setText(this.mCar.model);
        this.mViewHolder.textHorsePower.setText(String.valueOf(this.mCar.horsePower));
        this.mViewHolder.textPrice.setText(String.valueOf("R$ " + this.mCar.price));
        this.mViewHolder.textManuFacture.setText(this.mCar.manufacture);

        this.mViewHolder.imgCarPiture.setImageDrawable(this.mCar.pictures);

    }

    private void getDataFromActivity(){

        Bundle extras = getIntent().getExtras();
        if (extras != null){

            this.mCar = this.mCarMock.getCar(extras.getInt(CarrosConstants.CARRO_ID));
        }

    }

    private static class ViewHolder{

        ImageView imgCarPiture;

        TextView textModel;
        TextView textHorsePower;
        TextView textPrice;
        TextView textManuFacture;
    }
}
