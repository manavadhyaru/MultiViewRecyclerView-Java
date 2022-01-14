package com.example.multiviewrecyclerview.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.multiviewrecyclerview.R;
import com.example.multiviewrecyclerview.model.Image;
import com.example.multiviewrecyclerview.model.Profile;
import com.example.multiviewrecyclerview.model.Text;

import java.util.ArrayList;

public class MultiViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final int TEXT = 1;
    private final int IMAGE = 2;
    private final int PROFILE = 3;

    private final Context context;
    private final ArrayList<Object> list;

    public MultiViewAdapter(Context context, ArrayList<Object> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public long getItemId(int position) {
        Object object = list.get(position);
        if (object instanceof Text) {
            return TEXT;
        } else if (object instanceof Image) {
            return IMAGE;
        } else {
            return PROFILE;
        }
    }

    @Override
    public int getItemViewType(int position) {
        Object object = list.get(position);
        if (object instanceof Text) {
            return TEXT;
        } else if (object instanceof Image) {
            return IMAGE;
        } else {
            return PROFILE;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case TEXT:
                return new TextViewHolder(LayoutInflater.from(context).inflate(R.layout.text_recycler_item, parent, false));
            case IMAGE:
                return new ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.image_recycler_item, parent, false));
            default:
                return new ProfileViewHolder(LayoutInflater.from(context).inflate(R.layout.profile_recycler_item, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case TEXT:
                TextViewHolder textViewHolder = (TextViewHolder) holder;
                Text text = (Text) list.get(position);

                String title = text.getTitle();
                textViewHolder.textTitle.setText(title);

                String description = text.getDescription();
                textViewHolder.textDescription.setText(description);
                break;

            case IMAGE:
                ImageViewHolder imageViewHolder = (ImageViewHolder) holder;
                Image image = (Image) list.get(position);

                Drawable drawable = image.getImageRes();
                imageViewHolder.imageImageView.setImageDrawable(drawable);

                String name = image.getUserName();
                imageViewHolder.imageImageName.setText(name);
                break;

            case PROFILE:
                ProfileViewHolder profileViewHolder = (ProfileViewHolder) holder;
                Profile profile = (Profile) list.get(position);

                Drawable drawable1 = profile.getProfileRes();
                profileViewHolder.profileImageView.setImageDrawable(drawable1);

                String userName = profile.getName();
                profileViewHolder.profileName.setText(userName);

                String about = profile.getAbout();
                profileViewHolder.profileAbout.setText(about);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class TextViewHolder extends RecyclerView.ViewHolder {

        public final TextView textTitle, textDescription;

        public TextViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.title);
            textDescription = itemView.findViewById(R.id.description);
        }

    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {

        public final ImageView imageImageView;
        public final TextView imageImageName;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            imageImageView = itemView.findViewById(R.id.imageImageView);
            imageImageName = itemView.findViewById(R.id.imageImageName);
        }

    }

    public static class ProfileViewHolder extends RecyclerView.ViewHolder {

        public final ImageView profileImageView;
        public final TextView profileName, profileAbout;

        public ProfileViewHolder(@NonNull View itemView) {
            super(itemView);
            profileImageView = itemView.findViewById(R.id.profileImage);
            profileName = itemView.findViewById(R.id.profileName);
            profileAbout = itemView.findViewById(R.id.profileAbout);
        }
    }
}
