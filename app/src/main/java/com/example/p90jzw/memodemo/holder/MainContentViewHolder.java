package com.example.p90jzw.memodemo.holder;

import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.p90jzw.memodemo.R;
import com.example.p90jzw.memodemo.data.MemoData;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainContentViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.item_checkbox)
    CheckBox checkBox;
    @BindView(R.id.item_tv_text_header)
    TextView textTitle;
    @BindView(R.id.item_tv_edited_time)
    TextView textEditTime;
    @BindView(R.id.item_tv_contents)
    TextView textContent;
    @BindView(R.id.item_cl_all)
    ConstraintLayout constraintLayout;

    public MainContentViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(MemoData memoData) {
        textTitle.setText(memoData.getHeader());
        textEditTime.setText(memoData.getEditedTime().toString());
        textContent.setText(memoData.getText());
    }
}