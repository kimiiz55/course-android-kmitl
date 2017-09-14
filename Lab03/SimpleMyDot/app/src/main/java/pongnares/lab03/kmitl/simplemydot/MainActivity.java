package pongnares.lab03.kmitl.simplemydot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

import pongnares.lab03.kmitl.simplemydot.model.Dot;
import pongnares.lab03.kmitl.simplemydot.view.DotView;

public class MainActivity extends AppCompatActivity implements Dot.DotChangedListener {

    private Dot dot;
    private DotView dotView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dot = new Dot(0, 0, 50);
        dot.setDotChangedListener(this);

        dotView = (DotView) findViewById(R.id.dotViewLayout);
    }

    public void onRandomDot(View view){
        Random random = new Random();
        dot.setCenterX(random.nextInt(this.dotView.getWidth()));
        dot.setCenterY(random.nextInt(this.dotView.getHeight()));

    }
    public void onDotChanged(Dot dot){
        dotView.setDot(dot);
    }
}
