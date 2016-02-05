package androidpart2.finalproject.coursera.rifat.com.dailyselfiesattempt2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;


/**
 * Created by Rifat on 10/4/2015.
 */
public class ShowImageActivity extends ActionBarActivity {

    private ImageView mImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image);


        mImageView = (ImageView) findViewById(R.id.large_photo_view);

        Bundle bundle = getIntent().getExtras();
        String path = bundle.getString("PHOTO_PATH");

        // Get the dimensions of the View
        int targetW = mImageView.getLayoutParams().width;
        int targetH = mImageView.getLayoutParams().height;

        mImageView.setImageBitmap(PhotoDescriptor.setPic(targetW, targetH, path));

    }
}
