package com.example.longdang.monhocdaicuong4.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.longdang.monhocdaicuong4.Adapter.DetailAdapter;
import com.example.longdang.monhocdaicuong4.R;

public class DetailActivity extends AppCompatActivity {

    private static final String[] IMAGE_LINKS = {
            "https://lh3.googleusercontent.com/-5C00XtAbLLw/WGQdQMwiJ7I/AAAAAAAAAD8/g6BGJ1UhXpYi2CMUjAD28muMJHpmw6BJQCL0B/w540-h545-no/img8.PNG",
            "https://lh5.googleusercontent.com/-ElPG47laC7k/WGQdQe06yUI/AAAAAAAAAEA/u-7z0HPXzaIhxOzbiq4YnjGeLHBmVi24gCL0B/w957-h464-no/img7.PNG",
            "https://lh5.googleusercontent.com/-TwZJVZuOFLc/WGQdP7tntmI/AAAAAAAAAD4/Iw0M4PcJ20YnVv59eRwCyFXqnoMd5cvQQCL0B/w958-h539-no/img5.jpg"
    };

    private ListView mListView;
    private DetailAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mListView = (ListView) findViewById(R.id.lv_LoiGiai);

        mAdapter = new DetailAdapter(this, R.layout.image_item_layout, IMAGE_LINKS);

        mListView.setAdapter(mAdapter);
    }
}
