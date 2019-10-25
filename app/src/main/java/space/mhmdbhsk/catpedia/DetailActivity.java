package space.mhmdbhsk.catpedia;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = "DetailActivity";

    public static final String EXTRA_PHOTO = "image";
    public static final String name2 = "name";
    public static final String detail2 = "detail";

    private ArrayList<Cat> list = new ArrayList<>();

    ImageView imgPhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Log.d(TAG, "onCreate: started");

        ImageView imgLogoReceived = findViewById(R.id.img_item_photo);

        int photoKampus = getIntent().getIntExtra(EXTRA_PHOTO,0);
        Glide.with(this).load(photoKampus).into(imgLogoReceived);

        String name2 = getIntent().getStringExtra("name");
        TextView nameView = findViewById(R.id.tv_item_name);
        nameView.setText(name2);

        String detail2 = getIntent().getStringExtra("detail");
        TextView detailView = findViewById(R.id.tv_item_detail);
        detailView.setText(detail2);

    }
}


