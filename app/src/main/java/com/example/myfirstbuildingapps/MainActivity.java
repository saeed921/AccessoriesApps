package com.example.myfirstbuildingapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    //int details;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    // Staggered View Part
    RecyclerView staggeredView;
    StagAdapter adapter;
    StaggeredGridLayoutManager manager;
    //MainActivity main=new MainActivity();
    NavigationActivity navigation= new NavigationActivity();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Navigation Drawer Work
        drawerLayout=findViewById(R.id.drawerID);
        navigationView = findViewById(R.id.navigationID);
        toggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.off);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(this);
        //End Here Navigatin Drawer Work

        staggeredView=findViewById(R.id.staggeredID);
        manager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        staggeredView.setLayoutManager(manager);
        List<Row> list=new ArrayList<>();
        list.add(new Row(R.drawable.gazipur,R.drawable.gazipur," \"Gazipur Branch Opening Offer\"\n" +
                "স্টার টেক এর গাজীপুর শাখায় চলছে উদ্বোধনী অফার। গাজীপুর শাখা থেকে যে কোনো ল্যাপটপ বা ডেস্কটপ পিসি কিনলেই সাথে থাকছে ১০০০টাকার ফ্রি গিফট ভাউচার। আজই চলে আসুন স্টার টেক গাজীপুর শাখায় এবং আপনার পছন্দের ল্যাপটপ বা ডেস্কটপ পিসি কিনে বুঝে নিন আকর্ষনীয় গিফট ভাউচার। অফার চলবে ১৫ই অক্টোবর পর্যন্ত।\n" +
                "\n" +
                "\n" +
                "\n" +
                "ভিজিট করুন -\n" +
                "\n" +
                " গাজীপুর শাখা - নাজমা শহিদুল্লাহ কমপ্লেক্স, রওশন সড়ক, জয়দেবপুর রোড, গাজীপুর চৌরাস্তা।\n" +
                " তথ্য জানতে - ০১৭০৯৯৯৫৪০০"));
        list.add(new Row (R.drawable.eset,R.drawable.eset ,"ESET Internet Security One User with Free Backpack\n" +
                "Price"+"                "+"1,099৳\n"
                 +
                "Regular Price" +"     "+"1,099৳\n"
                 +
                "Status" +"              "+"In Stock\n"
                +
                "Product Code" +"      "+"8074\n"
                 +
                "Brand" +"                "+"Eset\n"
                 +
                "Features\n" +
                "*Model: Eset Internet Security One User\n" +
                "*Award-winning antivirus\n" +
                "*Secures your financial transactions\n" +
                "*Prevents malware\n" +
                "*View More Info\n" +
                "*2 Customer Review     \n" +
                "*Avail EMI Offer\n" +
                "*0% EMI AVAILABLE FOR 6 MONTHS\n" +
                "\n" +
                "1,099৳"));





        //details=R.array.details;
        adapter=new StagAdapter(getApplicationContext(),list);
        staggeredView.setAdapter(adapter);
        //recyclerview End here
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return  true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch(menuItem.getItemId()){
            case R.id.applemacID:
                Intent intent=new Intent(this,NavigationActivity.class);
                //navigation.mac();
                startActivity(intent);
                break;

            case R.id.appleimacID:
                navigation.mac();
            break;

        }

        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
