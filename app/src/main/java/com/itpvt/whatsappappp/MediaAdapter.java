package com.itpvt.whatsappappp;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by Hassan on 10/17/2018.
 */

public class MediaAdapter  extends RecyclerView.Adapter<MediaAdapter.MediaViewHolder>{
    ArrayList<String> mediaList;
    Context context;

    public MediaAdapter(Context context, ArrayList<String> mediaList){
        this.context = context;
        this.mediaList = mediaList;
    }

    @Override
    public MediaAdapter.MediaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_media,null, false);
        MediaViewHolder mediaViewHolder = new MediaViewHolder(layoutView);

        return mediaViewHolder;
    }

    @Override
    public void onBindViewHolder(MediaAdapter.MediaViewHolder holder, int position) {
        Glide.with(context).load(Uri.parse(mediaList.get(position))).into(holder.mMedia);
    }

    @Override
    public int getItemCount() {
        return mediaList.size();
    }

    public class MediaViewHolder extends RecyclerView.ViewHolder {

        ImageView mMedia;

        public MediaViewHolder(View itemView) {
            super(itemView);
            mMedia = itemView.findViewById(R.id.media);
        }
    }
}
