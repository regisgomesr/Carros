package com.cursoandroid.carros.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cursoandroid.carros.R;
import com.cursoandroid.carros.entities.Car;
import com.cursoandroid.carros.listener.OnListClickInteractionListener;


public class CarViewHolder extends RecyclerView.ViewHolder {


    private ImageView mImgCarPicture;

    private TextView mTextCarModel;

    private TextView mTextViewDetails;


    public CarViewHolder(@NonNull View itemView) {
        super(itemView);

        this.mImgCarPicture = (ImageView) itemView.findViewById(R.id.img_car_pic);
        this.mTextCarModel = (TextView) itemView.findViewById(R.id.text_car_model);
        this.mTextViewDetails = (TextView) itemView.findViewById(R.id.text_view_details);
    }

    public void bindData(final Car car, final OnListClickInteractionListener listener){

        this.mImgCarPicture.setImageDrawable(car.pictures);
        this.mTextCarModel.setText(car.model);

        this.mTextViewDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                listener.onClick(car.id);
            }
        });



    }

}
