package ezshop.blumix.com.ezshop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class stPage extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st_page);
        Thread t=new Thread(){
            public void run(){
                try {
                    sleep(5000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally{
                    Intent ij=new Intent("com.blumix.pgtwo");
                    startActivity(ij);
                }
            }
        };t.start();
    }
}