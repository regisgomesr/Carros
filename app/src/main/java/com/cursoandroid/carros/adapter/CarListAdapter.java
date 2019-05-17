package com.cursoandroid.carros.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cursoandroid.carros.R;
import com.cursoandroid.carros.entities.Car;
import com.cursoandroid.carros.listener.OnListClickInteractionListener;
import com.cursoandroid.carros.viewholder.CarViewHolder;

import java.util.List;

public class CarListAdapter extends RecyclerView.Adapter<CarViewHolder>{


    private List<Car> mListCars;
    private OnListClickInteractionListener mOnListClickInteractionListener;

    public CarListAdapter(List<Car> cars, OnListClickInteractionListener listener){

        this.mListCars = cars;
        this.mOnListClickInteractionListener = listener;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View carView = inflater.inflate(R.layout.row_car_list, parent, false);

        return new CarViewHolder(carView);
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder carViewHolder, int position) {

        Car car = this.mListCars.get(position);

        carViewHolder.bindData(car, this.mOnListClickInteractionListener);

    }

    @Override
    public int getItemCount() {
        return this.mListCars.size();
    }
}
