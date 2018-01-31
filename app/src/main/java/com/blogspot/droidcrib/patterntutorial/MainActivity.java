package com.blogspot.droidcrib.patterntutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.blogspot.droidcrib.patterntutorial.adapter.Adaptee;
import com.blogspot.droidcrib.patterntutorial.adapter.ObjectAdapter;
import com.blogspot.droidcrib.patterntutorial.creational.builder.Account;
import com.blogspot.droidcrib.patterntutorial.creational.builder.AccountBuilderClassic;
import com.blogspot.droidcrib.patterntutorial.creational.factory.AbstractDateTimeProvider;
import com.blogspot.droidcrib.patterntutorial.creational.factory.Factory;
import com.blogspot.droidcrib.patterntutorial.creational.factoryabstract.Archer;
import com.blogspot.droidcrib.patterntutorial.creational.factoryabstract.ElfSquadronFactory;
import com.blogspot.droidcrib.patterntutorial.creational.factoryabstract.Mag;
import com.blogspot.droidcrib.patterntutorial.creational.factoryabstract.SquadronFactory;
import com.blogspot.droidcrib.patterntutorial.creational.factoryabstract.Warrior;
import com.blogspot.droidcrib.patterntutorial.creational.prototype.SportCar;
import com.blogspot.droidcrib.patterntutorial.creational.staticfactorymethod.Movie;
import com.blogspot.droidcrib.patterntutorial.strategy.DESAlgorithm;
import com.blogspot.droidcrib.patterntutorial.strategy.Encryption;
import com.blogspot.droidcrib.patterntutorial.strategy.RSAAlgorythm;

import java.sql.Time;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "patterns";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Builder
        AccountBuilderClassic accountBuilderClassic = new AccountBuilderClassic.Builder().setUserId("user id classic").setToken("token classic").build();
        Log.d(TAG, "onCreate: accountBuilderClassic = " + accountBuilderClassic);

        Account account = Account.newBuilder().setUserId("user id").setToken("token").build();
        Log.d(TAG, "onCreate: Account = " + account);

        // Factory
        AbstractDateTimeProvider w1 = new Factory().getProvider(new Time(1));
        w1.getValue();

        AbstractDateTimeProvider w2 = new Factory().getProvider(new Date());
        w2.getValue();

        // Abstract Factory
        SquadronFactory factory = new ElfSquadronFactory();
        Mag mag = factory.createMag();
        Archer archer = factory.createArcher();
        Warrior warrior = factory.createWarrior();
        mag.cast();
        archer.shoot();
        warrior.attack();

        // Prototype
        SportCar yellowCar = new SportCar();
        SportCar redCar = (SportCar) yellowCar.copy();
        redCar.setColor("Red");

        Log.d(TAG, "onCreate: yellowCar = " + yellowCar);
        Log.d(TAG, "onCreate: redCar = " + redCar);

        // Static factory method
        Movie movie = Movie.create("movie title");
        Log.d(TAG, "onCreate: Movie 1 = " + movie);
        movie = Movie.create("another movie title");
        Log.d(TAG, "onCreate: Movie 2 = " + movie);


        // Adapter
        // Object adapter
        ObjectAdapter adapter = new ObjectAdapter(new Adaptee());
        adapter.onEvent();

        // Strategy
        Encryption encryption = new Encryption(new RSAAlgorythm());
        encryption.crypt("text", "key");
        // some condition
        if (true) {
            encryption.setAlgorythm(new DESAlgorithm());
        }
        encryption.crypt("new text", "new key");


    }
}
