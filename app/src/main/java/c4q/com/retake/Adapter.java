package c4q.com.retake;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by D on 1/16/18.
 */

public class Adapter extends RecyclerView.Adapter<ModelHolder> {


    public Adapter(List<Integer> modelList){
        this.modelList = modelList;
    }

    @Override
    public ModelHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext())
                .inflate(R. layout.model_layout,parent,false);
        return new Holder(childView);

    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {

        Integer integer = numberList.get(position);
        holder.onBind(integer);

    }

    @Override
    public int getItemCount() {
        return numberList.size();
    }
}
