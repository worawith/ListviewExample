package rmu.mtlab.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public ListView lvmenu;
    public ArrayAdapter<String> adapter;

    // ตั้งตัวแปร array เพื่อเก็บข้อความเมนู
    String menu[]={"Android","iOS","Window Phone","Blackberry"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // อ้างไปยัง id ของ listview
        lvmenu=(ListView)findViewById(R.id.lv);
        // สร้าง adapter
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menu);
        // กำหนด adapter ให้กับ listview
        lvmenu.setAdapter(adapter);

        // คลิก item ใน listview
        lvmenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // เช็คการคลิกเมนูแต่ละ item
                if(menu[i].equals("Android")){
                    Toast.makeText(getApplicationContext(),"Android",Toast.LENGTH_SHORT).show();
                }else if(menu[i].equals("iOS")){
                    Toast.makeText(getApplicationContext(),"iOS",Toast.LENGTH_SHORT).show();
                }else if(menu[i].equals("Window Phone")){
                    Toast.makeText(getApplicationContext(),"Window Phone",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Blackberry",Toast.LENGTH_SHORT).show();
                }// end if
            }
        });

    }//end onCreate
}//end class
