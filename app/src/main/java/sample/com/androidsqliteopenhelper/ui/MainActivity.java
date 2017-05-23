package sample.com.androidsqliteopenhelper.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import sample.com.androidsqliteopenhelper.R;
import sample.com.androidsqliteopenhelper.models.SaveUserModel;
import sample.com.androidsqliteopenhelper.sqlitedb.DatabaseHandler;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.text)
    TextView text;
    DatabaseHandler db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        db = new DatabaseHandler(this);
        SaveUserModel userModel = db.getAllContacts().get(0);
        text.setText(userModel.getName()+"");
    }

}
