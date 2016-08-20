package com.example.zeon.recyclerviewexamples;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Zeon on 15/8/2559.
 */
public class ViewItemGroup extends FrameLayout {

    private View view;
    private ImageView ivImg;
    private TextView tvName;
    private int position;

    public ViewItemGroup(Context context) {
        super(context);
        initInflate();
    }

    public ViewItemGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        initInflate();
    }

    public ViewItemGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initInflate();
    }

    @TargetApi(21)
    public ViewItemGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initInflate();
    }

    private void initInflate(){
        View view = inflate(getContext(), R.layout.item_view_group, this);
        initInstance(view);
    }

    private void initInstance(View view) {
        ivImg = (ImageView) view.findViewById(R.id.thumbnail);
        tvName = (TextView) view.findViewById(R.id.title);
        this.view = view.findViewById(R.id.view_item);
    }

    public void setTextGroup(String s){
        tvName.setText(s);
    }

    public void setTextWithListener(String s, final int position){
        this.position = position;
        tvName.setText(s);

        tvName.setOnClickListener(clickListener);
        view.setOnClickListener(clickListener);
    }

    OnClickListener clickListener = new OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getContext(), "clicked from position : "
                    + position, Toast.LENGTH_SHORT).show();
        }
    };
}
