package c4q.com.retake;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by D on 1/16/18.
 */

public class ModelHolder extends RecyclerView.ViewHolder {

    private EditText email;


    public Holder(View itemView) {
        super(itemView);

        email = (EditText) itemView.findViewById(R.id.login_text1);


    }

    public void onBind(String holder) {
        final Model thisModel = model;
        email.setText(" Email :" + thisModel.getThing1());
    }

}

