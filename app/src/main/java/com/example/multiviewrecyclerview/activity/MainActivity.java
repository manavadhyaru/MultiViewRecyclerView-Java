package com.example.multiviewrecyclerview.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.multiviewrecyclerview.R;
import com.example.multiviewrecyclerview.adapter.MultiViewAdapter;
import com.example.multiviewrecyclerview.model.Image;
import com.example.multiviewrecyclerview.model.Profile;
import com.example.multiviewrecyclerview.model.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView multiViewRecycler = findViewById(R.id.multiViewRecycler);
        ArrayList<Object> list = new ArrayList<>();
        // Adding some static data to the list..

        // Adding text to list..
        Text text = new Text();
        text.setTitle("This is a random title 1");
        text.setDescription("Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown " +
                "printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and" +
                " more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        list.add(text);

        // Adding image to list..
        Image image = new Image();
        image.setImageRes(ContextCompat.getDrawable(this, R.drawable.tom_rdj));
        image.setUserName("Tom Holland & Robert Downey Jr.");
        list.add(image);

        // Adding profile to list..
        Profile profile = new Profile();
        profile.setName("Robert Downey Jr.");
        profile.setAbout("Robert John Downey Jr. (born April 4, 1965)[1] is an American actor and producer. " +
                "His career has been characterized by critical and popular success in his youth, followed by a period of substance abuse and legal troubles, " +
                "before a resurgence of commercial success later in his career. " +
                "In 2008, Downey was named by Time magazine among the 100 most influential people in the world,[2][3] and from 2013 to 2015, he was listed by Forbes as Hollywood's highest-paid actor");
        profile.setProfileRes(ContextCompat.getDrawable(this,R.drawable.rdj));
        list.add(profile);

        // Adding profile to list..
        profile = new Profile();
        profile.setName("Tom Holland");
        profile.setAbout("Thomas Stanley Holland (born 1 June 1996)[1] is an English actor." +
                " A graduate of the BRIT School for Performing Arts and Technology in London, he had begun his acting career on the West End stage in the title role of Billy Elliot the Musical at the Victoria Palace Theatre from 2008 to 2010." +
                " He then starred in the disaster film The Impossible (2012), for which he received a London Film Critics Circle Award for Young British Performer of the Year.");
        profile.setProfileRes(ContextCompat.getDrawable(this,R.drawable.tom_holland));
        list.add(profile);

        // Adding text to list..
        text = new Text();
        text.setTitle("This is a random title 1");
        text.setDescription("Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown " +
                "printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and" +
                " more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        list.add(text);

        // Adding image to list..
        image = new Image();
        image.setImageRes(ContextCompat.getDrawable(this, R.drawable.rdj_and_lexi));
        image.setUserName("Robert Downey Jr. & Lexi Rabe");
        list.add(image);

        // Adding profile to list..
        profile = new Profile();
        profile.setName("Lexi Rabe");
        profile.setAbout("Alexandra Rachael Rabe is a young  Actress who is Known For Her Role as Morgan Stark In Avengers End Game. Heading into first grade she lives a normal life, church, chores, public school, playing with friends but every couple of months she takes off a couple of weeks or after school and makes a movie.");
        profile.setProfileRes(ContextCompat.getDrawable(this,R.drawable.lexi_rabe));
        list.add(profile);

        multiViewRecycler.setLayoutManager(new LinearLayoutManager(this));
        MultiViewAdapter multiViewAdapter = new MultiViewAdapter(this, list);
        multiViewRecycler.setAdapter(multiViewAdapter);
    }
}