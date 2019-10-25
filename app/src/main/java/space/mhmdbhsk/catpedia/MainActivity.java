package space.mhmdbhsk.catpedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String title = "CatPedia";
    private RecyclerView rvCats;
    private ArrayList<Cat> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvCats = findViewById(R.id.rv_heroes);
        rvCats.setHasFixedSize(true);

        list.addAll(CatsData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvCats.setLayoutManager(new LinearLayoutManager(this));
        ListAdapter listCatAdapter = new ListAdapter(list);
        rvCats.setAdapter(listCatAdapter);

        listCatAdapter.setOnItemClickCallback(new ListAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Cat data) {
                showSelected(data);
            }
        });
    }

    private void showRecyclerGrid() {
        rvCats.setLayoutManager(new GridLayoutManager(this, 2));
        GridAdapter gridAdapter = new GridAdapter(list);
        rvCats.setAdapter(gridAdapter);

        gridAdapter.setOnItemClickCallback(new GridAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Cat data) {
                showSelected(data);
            }
        });
    }

    private void showRecyclerCardView() {
        rvCats.setLayoutManager(new LinearLayoutManager(this));
        CardViewAdapter cardViewAdapter = new CardViewAdapter(list);
        rvCats.setAdapter(cardViewAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = "CatPedia";
                showRecyclerList();
                break;

            case R.id.action_grid:
                title = "CatPedia";
                showRecyclerGrid();
                break;

            case R.id.action_cardview:
                title = "CatPedia";
                showRecyclerCardView();
                break;

            case R.id.action_about:
                title = "About Me";
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                MainActivity.this.startActivity(intent);
                break;
        }
        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelected(Cat cat) {
        Toast.makeText(this, cat.getName(), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("image", cat.getPhoto());

        intent.putExtra("name", cat.getName());
        intent.putExtra("detail", cat.getDetail());
        MainActivity.this.startActivity(intent);
    }
}
