package loftschool.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class AddItemActivity extends AppCompatActivity {




    private static final String TAG = "AddItemActivity";
    
    private  EditText name;
    private  EditText price;
    private Button addBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        setTitle(R.string.add_item_title);

         name = findViewById(R.id.name);
         price = findViewById(R.id.price);
         addBtn = findViewById(R.id.add_btn);



         name.addTextChangedListener(new TextWatcher() {
             @Override
             public void beforeTextChanged(CharSequence s, int start, int count, int after) {

             }

             @Override
             public void onTextChanged(CharSequence s, int start, int before, int count) {

             }

             @Override
             public void afterTextChanged(Editable s) {

                 Log.i(TAG, "afterTextChanged: " + s);
                 addBtn.setEnabled(!TextUtils.isEmpty(s));


             }
         });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemName = name.getText().toString();
                String itemPrice = price.getText().toString();

            }
        });
    }
}