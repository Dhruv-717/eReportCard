package com.dhruv717.android.ereportcard;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class GradeAdapter extends ArrayAdapter<Grade> {

    public GradeAdapter(@NonNull Context context, @NonNull List<Grade> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;
        if(convertView == null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Grade grade = getItem(position);
        TextView subject = listView.findViewById(R.id.text_view_1);
        subject.setText(grade.getmSub());
        TextView slot = listView.findViewById(R.id.text_view_2);
        slot.setText(grade.getmSlot());
        TextView overlay = listView.findViewById(R.id.overlay_text_view);
        overlay.setText(grade.getmGrade());
        ImageView imageView = listView.findViewById(R.id.image_view);
        GradientDrawable shapeDrawable = (GradientDrawable) imageView.getDrawable();
        String str_1 = grade.getmGrade();
        switch (str_1){
            case "O":{
                shapeDrawable.setColor(getContext().getResources().getColor(R.color.green_color));
            }break;
            case "A+":{
                shapeDrawable.setColor(getContext().getResources().getColor(R.color.dull_green));
            }break;
            case "A-":{
                shapeDrawable.setColor(getContext().getResources().getColor(R.color.yellow_color));
            }break;
            case "B+":{
                shapeDrawable.setColor(getContext().getResources().getColor(R.color.orange_color));
            }break;
            case "B-":
            default:
                shapeDrawable.setColor(getContext().getResources().getColor(R.color.red_color));
        }
        imageView.setImageDrawable(shapeDrawable);
        return listView;
    }
}

